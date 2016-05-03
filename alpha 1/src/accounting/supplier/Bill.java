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

import accounting.company.StockItem;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Electronics
 */
public class Bill {
   private String number;
   private Supplier supplier;
   private PurchaseOrder order;
   private Calendar creationDate;
   private Calendar dueDate;
   private ArrayList<StockItem> items;
   private float balance;
   private String termsOfPurchase;

    /**
     *
     */
    public Bill() {
    }

    /**
     *
     * @param number
     * @param supplier
     * @param items
     */
    public Bill(String number, Supplier supplier, ArrayList<StockItem> items) {
        this.number = number;
        this.supplier = supplier;
        this.items = items;
    }

    /**
     *
     * @return
     */
    public String getNumber() {
        return number;
    }

    /**
     *
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
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
    public PurchaseOrder getOrder() {
        return order;
    }

    /**
     *
     * @param order
     */
    public void setOrder(PurchaseOrder order) {
        this.order = order;
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
    public Calendar getDueDate() {
        return dueDate;
    }

    /**
     *
     * @param dueDate
     */
    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

    /**
     *
     * @return
     */
    public ArrayList<StockItem> getItems() {
        return items;
    }

    /**
     *
     * @param items
     */
    public void setItems(ArrayList<StockItem> items) {
        this.items = items;
    }

    /**
     *
     * @return
     */
    public float getBalance() {
        return balance;
    }

    /**
     *
     * @param balance
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     *
     * @return
     */
    public String getTermsOfPurchase() {
        return termsOfPurchase;
    }

    /**
     *
     * @param termsOfPurchase
     */
    public void setTermsOfPurchase(String termsOfPurchase) {
        this.termsOfPurchase = termsOfPurchase;
    }
   
}
