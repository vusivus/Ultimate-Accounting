/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.company;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import classes.ContentNavigator;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

/**
 * FXML Controller class
 *
 * @author Electronics
 */
public class CompanySetupController implements Initializable {

    @FXML
    private StackPane stackPane;
    @FXML
    private Button cancelButton;
    @FXML
    private Button backButton;
    @FXML
    private Button nextButton;

    private String welcomeScreen="/view/company/CoSetupWelcome.fxml";
    
private String[] screenNames=new String[]{
        welcomeScreen,ContentNavigator.CompanyInfo,
    ContentNavigator.CompanySettings,ContentNavigator.ChartOfAccounts
        };
int screenIndex,maxIndex=screenNames.length;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     loadContent(screenNames[screenIndex]);
    }    

    @FXML
    private void cancelButtonAction(ActionEvent event) {
    }

    @FXML
    private void backButtonAction(ActionEvent event) {    
       if(screenIndex>0 && screenIndex<maxIndex){
           --screenIndex;
           loadContent(screenNames[screenIndex]);
       }
        
    }

    @FXML
    private void nextButtonAction(ActionEvent event) {      
       if(screenIndex>=0 && screenIndex<maxIndex-1){
          ++screenIndex; 
           loadContent(screenNames[screenIndex]);     
       }
        
    }
 public void loadContent(String fxml) {
        try {
           setContent(
                FXMLLoader.load(
                    CompanySetupController.class.getResource(
                        fxml
                    )
                )
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   

   private void setContent(Node node) {
       stackPane.getChildren().setAll(node);
    }
}
