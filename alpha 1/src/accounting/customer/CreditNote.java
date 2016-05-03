/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting.customer;

import java.util.Calendar;

/**
 *
 * @author Electronics
 */
public class CreditNote {
   private int creditNoteNumber;
   private Calendar creationDate;
   private Customer customer;
   private String comments;

    public int getCreditNoteNumber() {
        return creditNoteNumber;
    }

    public void setCreditNoteNumber(int creditNoteNumber) {
        this.creditNoteNumber = creditNoteNumber;
    }

    public Calendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Calendar creationDate) {
        this.creationDate = creationDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
   
}
