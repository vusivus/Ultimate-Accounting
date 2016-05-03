/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.company;

import javafx.scene.Node;
import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Electronics
 */
public class TreeItems {

    private TreeItem<String> company;
    private TreeItem<String> companyInfo;
    private TreeItem<String> companySettings;
    private TreeItem<String> companyCustomer;
    private TreeItem<String> companySupplier;
    private TreeItem<String> companyAccounts;
//------------------------------------------------------------------------------
    public static String companyIndex = "Company";
    public static String companyAccountIndex = "Company Accounts";
    public static String companyAccountCategoryIndex = "Category";
    public static String companyTransactionIndex = "Transaction";
    public static String companyCustomerIndex = "Company Customer";
    public static String creditNoteIndex = "Credit Note";
    public static String invoiceIndex = "Invoice";
    public static String quoteIndex = "Quote";
    public static String salesOrderIndex = "Sales Order";
    public static String companySupplierIdex = "Supplier";
    public static String billIndex = "Bill";
    public static String purchaseOrderIndex = "Purchase Order";
//------------------------------------------------------------------------------
    private ImageView companyIcon = new ImageView(
            new Image(getClass().getResourceAsStream("/view/company/company.png"))
    );
    private ImageView customerIcon = new ImageView(
            new Image(getClass().getResourceAsStream("/view/customer/customer.png"))
    );
    private ImageView creditNoteIcon = new ImageView(
            new Image(getClass().getResourceAsStream("/view/customer/credit-note.png"))
    );
    private ImageView invoiceIcon = new ImageView(
            new Image(getClass().getResourceAsStream("/view/customer/invoice.png"))
    );
    private ImageView quoteIcon = new ImageView(
            new Image(getClass().getResourceAsStream("/view/customer/quote.png"))
    );
    private ImageView salesOrderIcon = new ImageView(
            new Image(getClass().getResourceAsStream("/view/customer/sales-order.png"))
    );
    private ImageView supplierIcon = new ImageView(
            new Image(getClass().getResourceAsStream("/view/supplier/supplier.png"))
    );
    private ImageView billIcon = new ImageView(
            new Image(getClass().getResourceAsStream("/view/supplier/bill.png"))
    );
    private ImageView purchaseOrderIcon = new ImageView(
            new Image(getClass().getResourceAsStream("/view/supplier/purchase-order.png"))
    );

    private ImageView accountIcon = new ImageView(
            new Image(getClass().getResourceAsStream("/view/account/account.png"))
    );

    private ImageView accountCategoryIcon = new ImageView(
            new Image(getClass().getResourceAsStream("/view/account/account-category.png"))
    );
    private ImageView transactionIcon = new ImageView(
            new Image(getClass().getResourceAsStream("/view/account/transaction.png"))
    );

    public TreeItem<String> getCompany() {
        company = new TreeItem<>(TreeItems.companyIndex, companyIcon);
        return company;
    }

    public TreeItem<String> getCompanyCustomer() {
        this.companyCustomer = new TreeItem<>(TreeItems.companyCustomerIndex, this.customerIcon);
        companyCustomer.getChildren().add(new TreeItem<>(TreeItems.creditNoteIndex,this.creditNoteIcon));
        companyCustomer.getChildren().add(new TreeItem<>(TreeItems.invoiceIndex,this.invoiceIcon));
        companyCustomer.getChildren().add(new TreeItem<>(TreeItems.quoteIndex,this.quoteIcon));
        companyCustomer.getChildren().add(new TreeItem<>(TreeItems.salesOrderIndex,this.salesOrderIcon));
        return companyCustomer;
    }

    public TreeItem<String> getCompanySupplier() {
        this.companySupplier = new TreeItem<>(TreeItems.companySupplierIdex, this.supplierIcon);
        companySupplier.getChildren().add(new TreeItem<>(TreeItems.billIndex,this.billIcon));
        companySupplier.getChildren().add(new TreeItem<>(TreeItems.purchaseOrderIndex,this.purchaseOrderIcon));
        return companySupplier;
    }

    public TreeItem<String> getCompanyAccounts() {
        this.companyAccounts = new TreeItem<>(TreeItems.companyAccountIndex, this.accountIcon);
        companyAccounts.getChildren().add(new TreeItem<>(TreeItems.companyAccountCategoryIndex,this.accountCategoryIcon));
        companyAccounts.getChildren().add(new TreeItem<>(TreeItems.companyTransactionIndex,this.transactionIcon));
        return companyAccounts;
    }

}
