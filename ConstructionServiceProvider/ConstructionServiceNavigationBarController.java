/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ConstructionServiceProvider;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class ConstructionServiceNavigationBarController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createBillOnClick(ActionEvent event) throws IOException {
        
        Parent NavigationMenu2Parent = FXMLLoader.load(getClass().getResource("CreateBill.fxml"));
 
        Scene NavigationMenu2Scene = new Scene(NavigationMenu2Parent);
       
        //This line gets the Stage Information
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(NavigationMenu2Scene);
        stg2.show();

    }


    @FXML
    private void sendMaintenanceNotificationOnClick(ActionEvent event) {
    }

    @FXML
    private void operationsHistoryOnClick(ActionEvent event) throws IOException {
        
        Parent NavigationMenu2Parent = FXMLLoader.load(getClass().getResource("OperationHistory.fxml"));
 
        Scene NavigationMenu2Scene = new Scene(NavigationMenu2Parent);
       
        //This line gets the Stage Information
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(NavigationMenu2Scene);
        stg2.show();
    }

    @FXML
    private void sendMaintenanceRequestOnClick(ActionEvent event) throws IOException {
        
        Parent NavigationMenu2Parent = FXMLLoader.load(getClass().getResource("RequestMaintenance.fxml"));
 
        Scene NavigationMenu2Scene = new Scene(NavigationMenu2Parent);
       
        //This line gets the Stage Information
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(NavigationMenu2Scene);
        stg2.show();

    }
    
}
