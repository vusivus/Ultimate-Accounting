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
package accounting.supplier;

import accounting.account.Account;
import java.util.Calendar;

/**
 *
 * @author Electronics
 */
public class CreditorPayment {
   private Supplier supplier;
   private Bill bill;
   private float amount;
   private Calendar creationDate;
   private String comments;
   private Account paymentAccount;

    /**
     *
     */
    public CreditorPayment() {
    }

    /**
     *
     * @param supplier
     * @param amount
     * @param paymentAccount
     */
    public CreditorPayment(Supplier supplier, float amount, Account paymentAccount) {
        this.supplier = supplier;
        this.amount = amount;
        this.paymentAccount = paymentAccount;
    }

    /**
     *
     * @return
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     *
     * @param supplier
     */
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    /**
     *
     * @return
     */
    public Bill getBill() {
        return bill;
    }

    /**
     *
     * @param bill
     */
    public void setBill(Bill bill) {
        this.bill = bill;
    }

    /**
     *
     * @return
     */
    public float getAmount() {
        return amount;
    }

    /**
     *
     * @param amount
     */
    public void setAmount(float amount) {
        this.amount = amount;
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
    public String getComments() {
        return comments;
    }

    /**
     *
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     *
     * @return
     */
    public Account getPaymentAccount() {
        return paymentAccount;
    }

    /**
     *
     * @param paymentAccount
     */
    public void setPaymentAccount(Account paymentAccount) {
        this.paymentAccount = paymentAccount;
    }
   
}
