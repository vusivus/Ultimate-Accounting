/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting.company;

import accounting.account.Account;
import accounting.account.AccountCategory;
import accounting.customer.Customer;
import accounting.supplier.Supplier;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Electronics
 */
public class CompanyData {
    private String companyName;
    private String adress;
    private String phoneNumber;
    private String email;
    private String webPage;
    private String faxNumber;
    private Calendar creationDate;
    private ArrayList<Account> accountList;
    private ArrayList<AccountCategory> accountCategoryList;
    private ArrayList<Customer> customerList;
    private ArrayList<Supplier> supplierList; 

    public CompanyData() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public Calendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Calendar creationDate) {
        this.creationDate = creationDate;
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }
    
    public boolean removeAccountByNumber(Account account) {
     boolean successful = false;
        if (accountList != null) {
            try {
                int id=account.getAccountNumber();
                int test;
                int index=0;
                do{
                    test= accountList.get(index).getAccountNumber();
                    ++index;
                }
                while(test != id);
                if(test == id){
                    accountList.remove(index-1);
                    successful=true;
                }
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        } 
        return successful;
    }
   
   public boolean removeAccountByName(Account account) {
     boolean successful = false;
        if (accountList != null) {
            try {
                String name=account.getAccountName();
                String test="";
                int index=0;
                do{
                    test= accountList.get(index).getAccountName();
                    ++index;
                }
                while(test != name);
                if(test.equals(name)){
                    accountList.remove(index-1);
                    successful=true;
                }
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        } 
        return successful;
    }  
    
    public void addAccount(Account account) {
        if (accountList != null) {
            try {
                accountList.add(account);
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            accountList = new ArrayList<>();
            accountList.add(account);
        }
    }
    
    public ArrayList<AccountCategory> getAccountCategoryList() {
        return accountCategoryList;
    }

    public void setAccountCategoryList(ArrayList<AccountCategory> accountCategoryList) {
        this.accountCategoryList = accountCategoryList;
    }

     public void addAccountCategory(AccountCategory accountCategory) {
        if (this.accountCategoryList != null) {
            try {
                accountCategoryList.add(accountCategory);
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            accountCategoryList = new ArrayList<>();
            accountCategoryList.add(accountCategory);
        }
    }
     
      public boolean removeAccountCategory(AccountCategory category) {
     boolean successful = false;
        if (accountCategoryList != null) {
            try {
                String name=category.getName();
                String test="";
                int index=0;
                do{
                    test= accountCategoryList.get(index).getName();
                    ++index;
                }
                while(test != name);
                if(test.equals(name)){
                    accountCategoryList.remove(index-1);
                    successful=true;
                }
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        } 
        return successful;
    }         
    
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public void addCustomer(Customer customer) {
        if (customerList != null) {
            try {
                customerList.add(customer);
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            customerList = new ArrayList<>();
            customerList.add(customer);
        }
    }
    
    public boolean removeCustomer(Customer customer) {
     boolean successful = false;
        if (customerList != null) {
            try {
                String name=customer.getName();
                String test="";
                int index=0;
                do{
                    test = customerList.get(index).getName();
                    ++index;
                }
                while(test != name);
                if(test.equals(name)){
                    customerList.remove(index-1);
                    successful=true;
                }
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        } 
        return successful;
    }
    
    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    
 public void addSupplier(Supplier supplier) {
        if (supplierList != null) {
            try {
                supplierList.add(supplier);
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            supplierList = new ArrayList<>();
            supplierList.add(supplier);
        }
    }  

public boolean removeSupplier(Supplier supplier) {
     boolean successful = false;
        if (supplierList != null) {
            try {
                String name=supplier.getName();
                String test="";
                int index=0;
                do{
                    test= supplierList.get(index).getName();
                    ++index;
                }
                while(test != name);
                if(test.equals(name)){
                    supplierList.remove(index-1);
                    successful=true;
                }
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        } 
        return successful;
    } 
}
