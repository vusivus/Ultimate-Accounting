/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.account;

import accounting.account.Account;
import accounting.account.AccountCategory;
import accounting.account.AccountUtil;
import accounting.customer.Customer;
import classes.Util;
import com.thoughtworks.xstream.XStream;
import controller.customer.CustomerNewController;
import io.file.XAlias;
import io.file.XmlFile;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Electronics
 */
public class AccountNewController implements Initializable {

    @FXML
    private ComboBox<?> accountTypeCB;
    @FXML
    private ComboBox<?> accountCategoryCB;
    @FXML
    private TextField accountNameTF;
    @FXML
    private TextField accountNumberTF;
    @FXML
    private TextField taxCodeTF;
    @FXML
    private TextField balanceTF;
    @FXML
    private Button okayButton;
    @FXML
    private Button cancelButton;
    XStream xstream;
    ObservableList catList;
    ArrayList<Account> accList;
    /**
     * Initializes the controller class.
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
        createNewAccount();
    }

    @FXML
    private void cancelButtonAction(ActionEvent event) {
    }
   public void readAList() {
        xstream = XAlias.customerSet();
        URL xml = getClass().getResource(XmlFile.chartOfAccounts);
        try {
            accList = (ArrayList<Account>) xstream.fromXML(xml);
        } catch (NullPointerException ex) {

        }
    } 
    public void createNewAccount(){
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
        readAList();
        if (accList == null) {
            accList = new ArrayList<Account>();
        }
        accList.add(dA);        
        xstream = XAlias.accountSet();
        String f = XmlFile.chartOfAccounts;
        String content = xstream.toXML(accList);
        try {
            XmlFile.saveFile(content, new File(f));
        } catch (IOException ex) {
            Logger.getLogger(CustomerNewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
