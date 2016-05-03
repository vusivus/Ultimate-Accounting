package classes;

import controller.company.MainViewController;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import javafx.fxml.Initializable;

/**
 * Utility class for controlling navigation between vistas.
 *
 * All methods on the navigator are static to facilitate
 * simple access from anywhere in the application.
 */
public class ContentNavigator {

    /**
     * Convenience constants for fxml layouts managed by the navigator.
     */
    public static final String MAINVIEW = "/view/company/MainView.fxml";
    public static final String CompanySettings = "/view/company/CompanySettings.fxml";
    public static final String CompanyInfo = "/view/company/CompanyInfo.fxml";
    public static final String CompanySetup = "/view/company/CompanySetup.fxml";
    public static final String AccountNew = "/view/account/AccountNew.fxml";
    public static final String AccountCategoryNew= "/view/account/AccountCategoryNew.fxml";
     public static final String ChartOfAccounts= "/view/account/ChartOfAccounts.fxml";
    public static final String CustomerNew = "/view/customer/CustomerNew.fxml";
    public static final String QuoteNew = "/view/customer/QuoteNew.fxml";
    public static final String SalesOrderNew = "/view/customer/SalesOrder.fxml";
    public static final String CreditNoteNew = "/view/customer/CreditNote.fxml";
    public static final String InvoiceNew = "/view/customer/InvoiceNew.fxml";
    public static final String SupplierNew = "/view/supplier/SupplierNew.fxml";
    public static final String BillNew = "/view/supplier/BillNew.fxml";
    public static final String PurchaseOrderNew = "/view/supplier/PurchaseOrder.fxml";
    
FXMLLoader loader =new FXMLLoader();
    /** The main application layout controller. */
    private static MainViewController mainController;

    /**
     * Stores the main controller for later use in navigation tasks.
     *
     * @param mainController the main application layout controller.
     */
    public void setMainController(MainViewController mainController) {
        ContentNavigator.mainController = mainController;
    }


}