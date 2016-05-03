/*
 * Copyright (c) 2016, Electronics
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

import accounting.company.Date;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Electronics
 */
public class AccountCategory {
    private String categoryName;
    private String description;
    private String accountType;
    private float runningBalance;
    private Date creationDate;
    private ArrayList<Account> accounts;

    /**
     *
     */
    public AccountCategory() {
    }

    /**
     *
     * @param name
     * @param accountType
     */
    public AccountCategory(String name,String accountType) {
        this.categoryName = name;
        this.accountType = accountType;
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return this.categoryName;
    }

    /**
     *
     * @param categoryName
     */
    public void setName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return this.description;
    }

    /**
     *
     * @param categoryDescription
     */
    public void setDescription(String categoryDescription) {
        this.description = categoryDescription;
    }

    /**
     *
     * @return
     */
    public Date getCreationDate() {
        return this.creationDate;
    }

    /**
     *
     * @param creationDate
     */
    public void setCreation(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     *
     * @return
     */
    public float getRunningBalance() {
        return this.runningBalance;
    }

    /**
     *
     * @param runningBalance
     */
    public void setRunning(float runningBalance) {
        this.runningBalance = runningBalance;
    }

    /**
     *
     * @return
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     *
     * @param accountType
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     *
     * @return
     */
    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }

    /**
     *
     * @param accounts
     */
    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    } 
    /**
     *
     * @param account
     */
    public void addAccount(Account account) {
        if(accounts != null){
            accounts.add(account);
        }
        else{
            accounts=new ArrayList<>();
            accounts.add(account);
        }
    } 

    @Override
    public String toString() {
        return  categoryName ;
    }
    
}
