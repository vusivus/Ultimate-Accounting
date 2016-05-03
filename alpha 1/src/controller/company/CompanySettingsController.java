/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.company;

import accounting.company.ReportingPeriod;
import com.thoughtworks.xstream.XStream;
import io.file.XmlFile;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Electronics
 */
public class CompanySettingsController implements Initializable {

    @FXML
    private TextField currencyTF;
    @FXML
    private TextField taxTF;
    @FXML
    private TextField invoiceTF;
    @FXML
    private TextField quoteTF;
    @FXML
    private TextField salesOrderTF;
    @FXML
    private TextField billTF;
    @FXML
    private TextField purchaseOrderTF;
    @FXML
    private TextField customerAccountTF;
    @FXML
    private TextField supplierAccountTF;
    @FXML
    private TableColumn monthColumn;
    @FXML
    private TableView<ReportingPeriod> datesTable;
    @FXML
    private TableColumn startDateColumn;
    @FXML
    private TableColumn endDateColumn;
    private ObservableList <ReportingPeriod> tableData;
    XStream xstream;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            xstream = new XStream();
            xstream.alias("ReportingPeriod", ReportingPeriod.class);
            URL xml;
        xml = getClass().getResource(XmlFile.reportingDates);
            ArrayList <ReportingPeriod> periodList =(ArrayList <ReportingPeriod>) xstream.fromXML(xml);
            tableData= FXCollections.observableArrayList(periodList);
            monthColumn.setCellValueFactory(new PropertyValueFactory<>("month"));
            startDateColumn.setCellValueFactory(new PropertyValueFactory<>("startDate"));
            endDateColumn.setCellValueFactory(new PropertyValueFactory<>("endDate"));
            datesTable.setItems(tableData);
            datesTable.setEditable(true);
    }        
}
