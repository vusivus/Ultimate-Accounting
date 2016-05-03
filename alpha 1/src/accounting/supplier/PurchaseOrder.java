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
public class PurchaseOrder {
    private String number;
    private Calendar creationDate;
    private Supplier supplier;
    private ArrayList<StockItem> itemList;
    private float balance;
    private String comments;

    /**
     *
     */
    public PurchaseOrder() {
    }

    /**
     *
     * @param number
     * @param supplier
     * @param items
     */
    public PurchaseOrder(String number, Supplier supplier, ArrayList<StockItem> items) {
        this.number = number;
        this.supplier = supplier;
        this.itemList = items;
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
    public ArrayList<StockItem> getItemList() {
        return itemList;
    }

    /**
     *
     * @param items
     */
    public void setItemList(ArrayList<StockItem> items) {
        this.itemList = items;
    }
 /**
     *
     * @param item
     * @return 
     */
    public boolean removeItemByName(StockItem item) {
       boolean successful = false;
        if (itemList != null) {
            try {
                String name=item.getName();
                String test="";
                int index=0;
                do{
                    test= itemList.get(index).getName();
                    ++index;
                }
                while(test != name);
                if(test.equals(name)){
                    itemList.remove(index-1);
                    successful=true;
                }
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        } 
        return successful;
    }
    /**
     *
     * @param item
     * @return 
     */
    public boolean removeItemByCode(StockItem item) {
       boolean successful = false;
        if (itemList != null) {
            try {
                int name=item.getCode();
                int test;
                int index=0;
                do{
                    test= itemList.get(index).getCode();
                    ++index;
                }
                while(test != name);
                if(test ==name){
                    itemList.remove(index-1);
                    successful=true;
                }
            } catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        } 
        return successful;
    }
    /**
     *
     * @param item
     * @return 
     */
    public boolean addItem(StockItem item) {
       boolean successful = false;
        if (itemList != null) {
            try {
                itemList.add(item);
                }
            catch (NullPointerException ex) {
                System.out.println(ex.getMessage());
            }
        }
        else{
            itemList=new ArrayList();
            itemList.add(item);
        }
        return successful;
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
    
}
