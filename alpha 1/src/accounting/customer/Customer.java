/*
 * Copyright (c) 2016, GamerSoft
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package accounting.customer;

import accounting.account.Account;
import accounting.company.Date;
import java.util.Calendar;

/**
 *
 * @author Electronics
 */
public class Customer {
  private String customerName;
  private String customerAddress; 
  private String customerEmail;
  private String customerFaxNumber;
  private String phoneNumber;
  private String organization;
  private String comments;
  private Account debitAccount;
  private Date latestActivity;

    /**
     *
     */
    public Customer() {
    }

    /**
     *
     * @param name
     * @param debitAccount
     */
    public Customer(String name, Account debitAccount) {
        this.customerName = name;
        this.debitAccount = debitAccount;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return customerName;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.customerName = name;
    }

    /**
     *
     * @return
     */
    public String getAdress() {
        return customerAddress;
    }

    /**
     *
     * @param adress
     */
    public void setAdress(String adress) {
        this.customerAddress = adress;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return customerEmail;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.customerEmail = email;
    }

    /**
     *
     * @return
     */
    public String getFaxNumber() {
        return customerFaxNumber;
    }

    /**
     *
     * @param faxNumber
     */
    public void setFaxNumber(String faxNumber) {
        this.customerFaxNumber = faxNumber;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     *
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return
     */
    public Account getDebitAccount() {
        return debitAccount;
    }

    /**
     *
     * @param debitAccount
     */
    public void setDebitAccount(Account debitAccount) {
        this.debitAccount = debitAccount;
    }
    /**
     *
     * @return
     */
    public Date getLatestActivity() {
        return latestActivity;
    }

    /**
     *
     * @param latestActivity
     */
    public void setLatestActivity(Date latestActivity) {
        this.latestActivity = latestActivity;
    }


}
  
