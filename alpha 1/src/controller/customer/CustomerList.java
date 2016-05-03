/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.customer;

import accounting.customer.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Electronics
 */
public class CustomerList {
    List customerList=new ArrayList();

    public List getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List customerList) {
        this.customerList = customerList;
    }
    
   public void addCustomer(Customer customer){
       customerList.add(customer);
   } 
}
