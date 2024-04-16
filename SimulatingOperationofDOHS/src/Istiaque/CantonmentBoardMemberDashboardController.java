/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Istiaque;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class CantonmentBoardMemberDashboardController implements Initializable {

    private MenuItem switchMenuItem;

    

   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void employeeMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("Employee.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show(); 
        
    }

    @FXML
    private void projectMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("Project.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show(); 
    }

    @FXML
    private void recruitmentMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("Recruitment.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show();
    }

    @FXML
    private void policyMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("Policy.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show();
    }

    @FXML
    private void meetingMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("Meeting.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show(); 
        
    }

    @FXML
    private void aboutMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("AboutDOHS.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show(); 
        
    }

    @FXML
    private void viewPolicyMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("ViewPolicy.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show();
    }

    @FXML
    private void backMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("Login2.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show();
        
    }
    
}
