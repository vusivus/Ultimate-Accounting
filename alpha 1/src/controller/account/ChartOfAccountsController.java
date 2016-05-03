/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.account;

import accounting.account.Account;
import accounting.account.AccountCategory;
import accounting.company.ReportingPeriod;
import com.thoughtworks.xstream.XStream;
import io.file.XmlFile;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
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
public class ChartOfAccountsController implements Initializable {

    @FXML
    private TableView<Account> table;
    @FXML
    private TableColumn<?, ?> numberColumn;
    @FXML
    private TableColumn<?, ?> nameColumn;
    @FXML
    private TableColumn<?, ?> typeColumn;
    @FXML
    private TableColumn<?, ?> categoryColumn;

    private ObservableList <Account> tableData;
    XStream xstream;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         xstream = new XStream();
            xstream.alias("Account", Account.class);
            xstream.alias("AccountCategory", AccountCategory.class);
            URL xml;
        xml = getClass().getResource(XmlFile.chartOfAccounts);
            ArrayList <Account> accountList = (ArrayList <Account>) xstream.fromXML(xml);
            tableData= FXCollections.observableArrayList(accountList);
            numberColumn.setCellValueFactory(new PropertyValueFactory<>("accountNumber"));
            nameColumn.setCellValueFactory(new PropertyValueFactory<>("accountName"));
            typeColumn.setCellValueFactory(new PropertyValueFactory<>("accountType"));
            categoryColumn.setCellValueFactory(new PropertyValueFactory<>("accountCategory"));
            
            table.setItems(tableData);
    }    
    
}
