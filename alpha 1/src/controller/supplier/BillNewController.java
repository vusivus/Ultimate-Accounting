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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Electronics
 */
public class BillNewController implements Initializable {

    @FXML
    private TableView<?> itemsTable;
    @FXML
    private TextField billNumberTF;
    @FXML
    private TextField purchaseOrderNumberTF;
    @FXML
    private DatePicker dateDP;
    @FXML
    private DatePicker dueDate;
    @FXML
    private ComboBox<?> supplierCB;
    @FXML
    private TextField balanceTF;
    @FXML
    private TextArea termosofPurchaseTA;
    @FXML
    private Button okayButton;
    @FXML
    private Button cancelButton;

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
    private void supplierCBAction(ActionEvent event) {
    }

    @FXML
    private void okayButtonAction(ActionEvent event) {
    }

    @FXML
    private void cancelButtonAction(ActionEvent event) {
    }
    
}
