/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting.company;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Electronics
 */
public class CompanySettings {
    
    private String defaultInvoiceCode;
    private String defaultQuoteCode;
    private String defaultCreditNoteCode;
    private String defaultSalesOrderCode;
    private String defaultBillCode;
    private String defaultPurchaseOrderCode;
    private String defaultCustomerAccountCode;
    private String defaultSupplierCode;
    private Calendar endDate;
    private Calendar startDate;
    private ArrayList<Calendar> reportingDatesList;
    private Tax defaultTax;
    private Currency defaultCurrency;
    private ArrayList<Currency> currencyList;

    public String getDefaultInvoiceCode() {
        return defaultInvoiceCode;
    }

    public void setDefaultInvoiceCode(String defaultInvoiceCode) {
        this.defaultInvoiceCode = defaultInvoiceCode;
    }

    public String getDefaultQuoteCode() {
        return defaultQuoteCode;
    }

    public void setDefaultQuoteCode(String defaultQuoteCode) {
        this.defaultQuoteCode = defaultQuoteCode;
    }

    public String getDefaultCreditNoteCode() {
        return defaultCreditNoteCode;
    }

    public void setDefaultCreditNoteCode(String defaultCreditNoteCode) {
        this.defaultCreditNoteCode = defaultCreditNoteCode;
    }

    public String getDefaultSalesOrderCode() {
        return defaultSalesOrderCode;
    }

    public void setDefaultSalesOrderCode(String defaultSalesOrderCode) {
        this.defaultSalesOrderCode = defaultSalesOrderCode;
    }

    public String getDefaultBillCode() {
        return defaultBillCode;
    }

    public void setDefaultBillCode(String defaultBillCode) {
        this.defaultBillCode = defaultBillCode;
    }

    public String getDefaultPurchaseOrderCode() {
        return defaultPurchaseOrderCode;
    }

    public void setDefaultPurchaseOrderCode(String defaultPurchaseOrderCode) {
        this.defaultPurchaseOrderCode = defaultPurchaseOrderCode;
    }

    public String getDefaultCustomerAccountCode() {
        return defaultCustomerAccountCode;
    }

    public void setDefaultCustomerAccountCode(String defaultCustomerAccountCode) {
        this.defaultCustomerAccountCode = defaultCustomerAccountCode;
    }

    public String getDefaultSupplierCode() {
        return defaultSupplierCode;
    }

    public void setDefaultSupplierCode(String defaultSupplierCode) {
        this.defaultSupplierCode = defaultSupplierCode;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public ArrayList<Calendar> getReportingDatesList() {
        return reportingDatesList;
    }

    public void setReportingDatesList(ArrayList<Calendar> reportingDatesList) {
        this.reportingDatesList = reportingDatesList;
    }

    public Tax getDefaultTax() {
        return defaultTax;
    }

    public void setDefaultTax(Tax defaultTax) {
        this.defaultTax = defaultTax;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ArrayList<Currency> getCurrencyList() {
        return currencyList;
    }
public void addCurrency(Currency currency) {
        if (currencyList != null) {
            try {
                currencyList.add(currency);
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            currencyList = new ArrayList<>();
            currencyList.add(currency);
        }
    }
    public void setCurrencyList(ArrayList<Currency> currencyList) {
        this.currencyList = currencyList;
    }
    
}
