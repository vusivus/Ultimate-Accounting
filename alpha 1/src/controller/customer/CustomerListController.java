/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.customer;

import accounting.account.Account;
import accounting.account.AccountCategory;
import accounting.customer.Customer;
import com.thoughtworks.xstream.XStream;
import io.file.XmlFile;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Electronics
 */
public class CustomerListController implements Initializable {

    @FXML
    private TableColumn<?, ?> nameColumn;
    @FXML
    private TableColumn<?, ?> creationDateColumn;
    @FXML
    private TableColumn<?, ?> activityColumn;
    @FXML
    private TableColumn<?, ?> emailColumn;
    @FXML
    private TableColumn<?, ?> phoneColumn;
    @FXML
    private TableColumn<?, ?> debitAccountColumn;
    @FXML
    private TableView<Customer> table;
XStream xstream;
    private ObservableList<Customer> tableData;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      xstream = new XStream();
            xstream.alias("Customer", Customer.class);
            xstream.alias("Account", Account.class);
            URL xml;
        xml = getClass().getResource(XmlFile.customerList);
            ArrayList <Customer> accountList = (ArrayList <Customer>) xstream.fromXML(xml);
            tableData= FXCollections.observableArrayList(accountList);
            nameColumn.setCellValueFactory(new PropertyValueFactory<>("customerName"));
            creationDateColumn.setCellValueFactory(new PropertyValueFactory<>("creationDate"));
            activityColumn.setCellValueFactory(new PropertyValueFactory<>("latestActivity"));
            emailColumn.setCellValueFactory(new PropertyValueFactory<>("customerEmail"));
            phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
            debitAccountColumn.setCellValueFactory(new PropertyValueFactory<>("accountNumber"));
            table.setItems(tableData);
    }    
    
}
