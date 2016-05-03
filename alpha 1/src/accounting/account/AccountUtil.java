/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting.account;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Electronics
 */
public class AccountUtil {

    /**
     *
     */
    public static String ACCTYPE_CurrentAsset="current asset";

    /**
     *
     */
    public static String ACCTYPE_NonCurrentAsset="non current asset";

    /**
     *
     */
    public static String ACCTYPE_CurrentLiability="current liability";

    /**
     *
     */
    public static String ACCTYPE_NonCurrentLiability="non current liability";

    /**
     *
     */
    public static String ACCTYPE_Revenue="revenue";

    /**
     *
     */
    public static String ACCTYPE_Expense="expense";

    /**
     *
     */
    public static String ACCTYPE_Proprietorship="proprietorship";
 
    public static ObservableList accountTypeList(){
      return FXCollections.observableArrayList(AccountUtil.ACCTYPE_CurrentAsset,
                AccountUtil.ACCTYPE_CurrentLiability, AccountUtil.ACCTYPE_Expense, AccountUtil.ACCTYPE_NonCurrentAsset,
                AccountUtil.ACCTYPE_NonCurrentLiability, AccountUtil.ACCTYPE_Proprietorship, AccountUtil.ACCTYPE_Revenue);  
    }
}
