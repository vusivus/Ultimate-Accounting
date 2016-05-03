/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.company;

import classes.ContentNavigator;
import controller.customer.CustomerNewController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import view.company.TreeItems;

/**
 * FXML Controller class
 *
 * @author Electronics
 */
public class MainViewController implements Initializable {

    @FXML
    private Button addButton;
    @FXML
    private Button openButton;
    @FXML
    private Button saveButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button settingsButton;
    @FXML
    private Button editButton;
    @FXML
    private Button infoButton;
    @FXML
    private Button searchButton;
    @FXML
    private Button helpButton;
    @FXML
    private TreeView<String> treeView;
    @FXML
    private StackPane stackPane;

    TreeItem<String> companyItem;
    ContentNavigator contentNav;
    TreeItems items = new TreeItems();
    Stage popupStage = new Stage();
    URL popupURL = null;
    Parent popupRoot = null;
    Initializable controllerFactory;
    FXMLLoader loader=new FXMLLoader();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        contentNav = new ContentNavigator();
        contentNav.setMainController(this);
        companyItem = items.getCompany();
        companyItem.getChildren().add(items.getCompanyAccounts());
        companyItem.getChildren().add(items.getCompanyCustomer());
        companyItem.getChildren().add(items.getCompanySupplier());
        treeView.setRoot(companyItem);
    }

    @FXML
    private void addButtonAction(ActionEvent event) {
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.companyAccountIndex) {
           loadContent(ContentNavigator.AccountNew);
        }
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.companyCustomerIndex) {
            loadContent(ContentNavigator.CustomerNew);
        }
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.invoiceIndex) {
            loadContent(ContentNavigator.InvoiceNew);
        }
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.creditNoteIndex) {
           loadContent(ContentNavigator.CreditNoteNew);
        }
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.salesOrderIndex) {
            loadContent(ContentNavigator.SalesOrderNew);
        }
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.quoteIndex) {
            loadContent(ContentNavigator.QuoteNew);
        }
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.companySupplierIdex) {
           loadContent(ContentNavigator.SupplierNew);
        }
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.billIndex) {
            loadContent(ContentNavigator.BillNew);
        }
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.purchaseOrderIndex) {
           loadContent(ContentNavigator.PurchaseOrderNew);
        }
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.companyAccountCategoryIndex) {
            loadContent(ContentNavigator.AccountCategoryNew);
        }
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.companyIndex) {
            loadPopup(ContentNavigator.CompanySetup);
        }
    }

    @FXML
    private void openButtonAction(ActionEvent event) {
         if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.companyAccountIndex) {
            loadContent(ContentNavigator.ChartOfAccounts);
        }
    }

    @FXML
    private void saveButtonAction(ActionEvent event) {
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.companyCustomerIndex) {
            CustomerNewController con = (CustomerNewController) loader.getController();
               con.createNewCustomer();    
        }
    }

    @FXML
    private void deleteButtonAction(ActionEvent event) {
    }

    @FXML
    private void settingsButtonAction(ActionEvent event) {
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.companyIndex) {
            loadContent(ContentNavigator.CompanySettings);
        }
    }

    @FXML
    private void editButtonAction(ActionEvent event) {
    }

    @FXML
    private void infoButtonAction(ActionEvent event) {
        if (treeView.getSelectionModel().getSelectedItem().getValue() == TreeItems.companyIndex) {
            loadContent(ContentNavigator.CompanyInfo);
        }
    }

    @FXML
    private void searchButtonAction(ActionEvent event) {
    }

    @FXML
    private void helpButtonAction(ActionEvent event) {
    }

    public void setContent(Node node) {
        stackPane.getChildren().setAll(node);
    }

    public void loadPopup(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader();
            popupURL = getClass().getResource(fxml);
            popupRoot = loader.load(popupURL);
            Scene scr = new Scene(popupRoot);
            popupStage.setScene(scr);
            popupStage.show();
        } catch (IOException ex) {
            Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Loads the vista specified by the fxml file into the
     * vistaHolder pane of the main application layout.
     *
     * Previously loaded vista for the same fxml file are not cached.
     * The fxml is loaded anew and a new vista node hierarchy generated
     * every time this method is invoked.
     *
     * A more sophisticated load function could potentially add some
     * enhancements or optimizations, for example:
     *   cache FXMLLoaders
     *   cache loaded vista nodes, so they can be recalled or reused
     *   allow a user to specify vista node reuse or new creation
     *   allow back and forward history like a browser
     *
     * @param fxml the fxml file to be loaded.
     */
    public void loadContent(String fxml) {
        try {
            
            setContent(
                loader.load(
                    getClass().getResource(
                        fxml
                    )
                )
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
