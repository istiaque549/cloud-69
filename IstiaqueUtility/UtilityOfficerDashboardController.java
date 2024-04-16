/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package IstiaqueUtility;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class UtilityOfficerDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void utilityMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void budgetMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("Budget.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show();
    }

    @FXML
    private void expenceMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("Expense.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show();
    }

    @FXML
    private void serviceProviderMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("ServiceProvider.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show();
    }

    @FXML
    private void serviceMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void aboutMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("AboutDOHS2.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show();
    }

    @FXML
    private void viewPolicyMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("policy1.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show();
    }

    @FXML
    private void backMenuItemOnClick(ActionEvent event) throws IOException {
        Parent viewPolicyPage = FXMLLoader.load(getClass().getResource("Login4.fxml"));
        Scene viewPolicyScene = new Scene(viewPolicyPage);
        Stage appStage = (Stage) ((Stage) ((MenuItem) event.getSource()).getParentPopup().getOwnerWindow());
        appStage.setScene(viewPolicyScene);
        appStage.show();
    }
    
}
