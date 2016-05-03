/*
 * Copyright (c) 2016, Vusumuzi Tshabangu
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

import accounting.company.Tax;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Vusumuzi Tshabangu
 */
public class Transaction {
    private ArrayList<Credit> creditList;
    private ArrayList<Debit> debitList;
    private String transactionID;
    String description;
    Tax tax;
    Account transactionAccount;
    Calendar creationDate;
    Calendar latestActivity;

    /**
     *
     */
    public Transaction() {
    }

    /**
     *
     * @param transactionID
     * @param transactionAccount
     */
    public Transaction(String transactionID, Account transactionAccount) {
        this.transactionID = transactionID;
        this.transactionAccount = transactionAccount;
    }

    /**
     *
     * @return
     */
    public ArrayList<Credit> getCreditList() {
        return creditList;
    }

    /**
     *
     * @param creditList
     */
    public void setCreditList(ArrayList<Credit> creditList) {
        this.creditList = creditList;
    }

    /**
     *
     * @param credit
     */
    public void addCredit(Credit credit) {
        if (creditList != null) {
            creditList.add(credit);
        } else {
            creditList = new ArrayList<>();
            creditList.add(credit);
        }
    }
 
    /**
     *
     * @param credit
     * @return
     */
    public boolean removeCredit(Credit credit) {
        boolean successful = false;
        if (creditList != null) {
            try {
                String name = credit.getName();
                String test = "";
                int index = 0;
                do {
                    test = creditList.get(index).getName();
                    ++index;
                } while (test != name);
                if (test == name) {
                    creditList.remove(index - 1);
                    successful = true;
                }
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return successful;
    }

    /**
     *
     * @return
     */
    public ArrayList<Debit> getDebitList() {
        return debitList;
    }

    /**
     *
     * @param debitList
     */
    public void setDebitList(ArrayList<Debit> debitList) {
        this.debitList = debitList;
    }

    /**
     *
     * @param debit
     */
    public void addDebit(Debit debit) {
        if (debitList != null) {
            debitList.add(debit);
        } else {
            debitList = new ArrayList<>();
            debitList.add(debit);
        }
    }

    /**
     *
     * @param debit
     * @return
     * @throws NullPointerException
     */
    public boolean removeDebit(Debit debit) throws NullPointerException{
        boolean successful = false;
        if (creditList != null) {
                String name = debit.getName();
                String test = "";
                int index = 0;
                do {
                    test = debitList.get(index).getName();
                    ++index;
                } while (test != name);
                if (test == name) {
                    debitList.remove(index - 1);
                    successful = true;
                }
        }
        return successful;
    }

    /**
     *
     * @return
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     *
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public Tax getTax() {
        return tax;
    }

    /**
     *
     * @param tax
     */
    public void setTax(Tax tax) {
        this.tax = tax;
    }

    /**
     *
     * @return
     */
    public Account getTransactionAccount() {
        return transactionAccount;
    }

    /**
     *
     * @param transactionAccount
     */
    public void setTransactionAccount(Account transactionAccount) {
        this.transactionAccount = transactionAccount;
    }

    /**
     *
     * @return
     */
    public Calendar getCreationDate() {
        return creationDate;
    }

    /**
     *
     * @param creationDate
     */
    public void setCreationDate(Calendar creationDate) {
        this.creationDate = creationDate;
    }

    /**
     *
     * @return
     */
    public Calendar getLatestActivity() {
        return latestActivity;
    }

    /**
     *
     * @param latestActivity
     */
    public void setLatestActivity(Calendar latestActivity) {
        this.latestActivity = latestActivity;
    }
    
}
