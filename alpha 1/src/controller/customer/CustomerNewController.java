/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.customer;

import accounting.account.Account;
import accounting.account.AccountCategory;
import accounting.account.AccountUtil;
import accounting.customer.Customer;
import classes.Util;
import com.thoughtworks.xstream.XStream;
import io.file.XAlias;
import io.file.XmlFile;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Electronics
 */
public class CustomerNewController implements Initializable {

    @FXML
    private TextField customerNameTF;
    @FXML
    private TextField customerOrgTF;
    @FXML
    private TextField PhoneNumberTF;
    @FXML
    private TextField emailTF;
    @FXML
    private TextField addressTF;
    @FXML
    private TextArea commentsTF;
    @FXML
    private ComboBox<?> accountTypeCB;
    @FXML
    private ComboBox<?> accountCategoryCB;
    @FXML
    private TextField accountNameTF;
    @FXML
    private TextField accountNumberTF;
    @FXML
    private TextField balanceTF;
    @FXML
    private Button okayButton;
    @FXML
    private Button cancelButton;
    XStream xstream, newCustomer;
    private ObservableList catList;
    ArrayList<Customer> cList;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList accTypes = AccountUtil.accountTypeList();
        this.accountTypeCB.setItems(accTypes);

        xstream = XAlias.accountCategorySet();
        URL xml = getClass().getResource(XmlFile.accountCategories);
        ArrayList<AccountCategory> fromXML = (ArrayList<AccountCategory>) xstream.fromXML(xml);
        catList = FXCollections.observableArrayList(fromXML);
        this.accountCategoryCB.setItems(catList);
    }

    @FXML
    private void accountTypeCBAction(ActionEvent event) {
    }

    @FXML
    private void accountCategoryCBAction(ActionEvent event) {
    }

    @FXML
    private void okayButtonAction(ActionEvent event) {
        createNewCustomer();
    }

    @FXML
    private void cancelButtonAction(ActionEvent event) {
    }

    public void readCList() {
        xstream = XAlias.customerSet();
        URL xml = getClass().getResource(XmlFile.customerList);
        try {
            cList = (ArrayList<Customer>) xstream.fromXML(xml);
        } catch (NullPointerException ex) {

        }
    }

    public void createNewCustomer() {
        Customer customer = new Customer();
        customer.setAdress(addressTF.getText());
        customer.setEmail(emailTF.getText());
        customer.setPhoneNumber(PhoneNumberTF.getText());
        customer.setName(customerNameTF.getText());
        customer.setComments(commentsTF.getText());
        customer.setOrganization(customerOrgTF.getText());
        Account dA = new Account();
        dA.setAccountName(accountNameTF.getText());
        dA.setAccountNumber(Integer.valueOf(accountNumberTF.getText()));
        dA.setBalance(Float.valueOf(balanceTF.getText()));
        dA.setAccountType(accountTypeCB.getSelectionModel().getSelectedItem().toString());
        int indx = accountCategoryCB.getSelectionModel().getSelectedIndex();
        AccountCategory ac = (AccountCategory) accountCategoryCB.getItems().get(indx);
        dA.setAccountCategory(ac.getName());
        accounting.company.Date cd = Util.getCurrentDate();
        dA.setCreationDate(cd);
        customer.setDebitAccount(dA);

        newCustomer = XAlias.customerSet();
        readCList();
        if (cList == null) {
            cList = new ArrayList<Customer>();
        }
        cList.add(customer);
        String f = XmlFile.customerList;
        String content = newCustomer.toXML(cList);
        try {
            XmlFile.saveFile(content, new File(f));
        } catch (IOException ex) {
            Logger.getLogger(CustomerNewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
