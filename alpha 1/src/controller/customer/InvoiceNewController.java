/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.customer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Electronics
 */
public class InvoiceNewController implements Initializable {

    @FXML
    private TextField invoiceNumberTF;
    @FXML
    private TextField salesOrderNumberTF;
    @FXML
    private DatePicker dateDP;
    @FXML
    private ComboBox<?> cashorCrdeitCB;
    @FXML
    private ComboBox<?> customerCB;
    @FXML
    private TextArea commentsTA;
    @FXML
    private Button okayButton;
    @FXML
    private Button cancelButton;
    @FXML
    private TableView<?> itemsTable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void dateDPAction(ActionEvent event) {
    }

    @FXML
    private void cashorCrdeitCBAction(ActionEvent event) {
    }

    @FXML
    private void customerCBAction(ActionEvent event) {
    }

    @FXML
    private void okayButtonAction(ActionEvent event) {
    }

    @FXML
    private void cancelButtonAction(ActionEvent event) {
    }
    
}
