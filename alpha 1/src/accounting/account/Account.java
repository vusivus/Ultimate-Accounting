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
package accounting.account;

import accounting.company.Currency;
import accounting.company.Date;
import accounting.company.Tax;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * <p>
 * This class allows you to create an account which will hold all accounting information
 * <p>
 * You will need to specify the following to avoid errors
 * <ul>
 * <li >account type </li>
 * <li >account number </li>
 * <li >account name </li>
 * </ul>
 *
 *
 * @author Vusumuzi Tshabangu
 */
public class Account {

    private String accountName;
    private String accountCategory;
    private Tax defaultTax;
    private String accountType;
    private int accountNumber;
    private float accountBalance;
    private Date creationDate;
    private Currency currency;
    /**
     * Sole constructor. (For invocation by subclass constructors, typically
     * implicit.)
     */
    public Account() {
    }

    /**
     * Constructor with the important initial data.
     *
     * @param accountName   any string with valid unicode parameters
     * @param accountType   refer to AccountUtil class for account types
     * @param accountNumber any integer between 0 and 1 000 000
     */
    public Account(String accountName, String accountType, int accountNumber) {
        this.accountName = accountName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
    }

    /**
     * Returns the name of the account
     * @return name of account
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * sets the name of the account
     * @param accountName any string with valid unicode parameters
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Returns the name of category and null if it doesn't have one
     * @return AccountCategory or null if it doesn't exist
     */
    public String getAccountCategory() {
        return accountCategory;
    }

    /**
     *Sets the Account Category
     * @param accountCategory refer to the AccountCategory class
     */
    public void setAccountCategory(String accountCategory) {
        this.accountCategory = accountCategory;
    }

    /**
     * returns the default tax for this account
     * @return
     */
    public Tax getDefaultTax() {
        return this.defaultTax;
    }

    /**
     * Sets the default tax for this account
     * @param defaultTax
     */
    public void setDefaultTax(Tax defaultTax) {
        this.defaultTax = defaultTax;
    }

    /**
     * Returns the currency used by the account
     * @return
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the currency to be used with the account
     * @param currency
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /**
     * returns the account number
     * @return
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * sets the account number
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Returns the account type.<p>
     * Refer to the AccountUtil class for account types
     * @return
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * Sets the account type. <p>
     * Refer to the AccountUtil class for account types
     * @param accountType
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * returns the balance of the account calculated from debit and credit entries
     * <b> Note every account will have a positive balance depending on whether
     *  it has a debit or credit balance</b>
     * @return
     */
    public float getBalance() {
        return accountBalance;
    }

    /**
     * sets account balance
     * @param accountBalance
     */
    public void setBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * returns creation date of account
     * @return
     */
    public Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * sets the creation date of account
     * @param creationDate
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
