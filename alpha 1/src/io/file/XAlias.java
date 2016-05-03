/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.file;

import accounting.account.Account;
import accounting.account.AccountCategory;
import accounting.company.Date;
import accounting.customer.Customer;
import com.thoughtworks.xstream.XStream;
import controller.customer.CustomerList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Electronics
 */
public class XAlias {

    public static XStream customerSet() {
        XStream xstream;
        xstream = new XStream();
        xstream.alias("customer", Customer.class);
        xstream.alias("account", Account.class);
        xstream.alias("Date", Date.class);
        return xstream;
    }

    public static XStream accountSet() {
        XStream xstream;
        xstream = new XStream();
        xstream.alias("account", Account.class);
        xstream.alias("account-category", AccountCategory.class);
        xstream.alias("Date", Date.class);
        return xstream;
    }

    public static XStream accountCategorySet() {
        XStream xstream;
        xstream = new XStream();
        xstream.alias("account-category", AccountCategory.class);
        xstream.alias("account", Account.class);
        xstream.alias("Date", Date.class);
        return xstream;
    }
}
