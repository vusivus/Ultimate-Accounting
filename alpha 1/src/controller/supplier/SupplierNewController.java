/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.supplier;

import java.net.URL;
import java.util.ResourceBundle;
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
public class SupplierNewController implements Initializable {

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
    @FXML
    private TextField supplierNameTF;
    @FXML
    private TextField supplierOrgTF;
    @FXML
    private TextField PhoneNumberTF;
    @FXML
    private TextField emailTF;
    @FXML
    private TextField addressTF;
    @FXML
    private TextArea commentsTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void accountTypeCBAction(ActionEvent event) {
    }

    @FXML
    private void accountCategoryCBAction(ActionEvent event) {
    }

    @FXML
    private void okayButtonAction(ActionEvent event) {
    }

    @FXML
    private void cancelButtonAction(ActionEvent event) {
    }
    
}
