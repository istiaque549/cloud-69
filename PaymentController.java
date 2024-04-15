/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jubayer
 */
public class PaymentController implements Initializable {

    @FXML
    private Button goBackToTreasurerDashboard;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void switchToCollection(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/UsesForTreasurer/Collection.fxml"));
        Scene newScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();          
    }

    @FXML
    private void switchToDue(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/UsesForTreasurer/Due.fxml"));
        Scene newScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();          
    }


    @FXML
    private void switchToActiveMembers(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/UsesForTreasurer/ActiveMembers.fxml"));
        Scene newScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();  
    }

    @FXML
    private void switchToTreasurerDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TreasurerDashboard.fxml"));
        Scene newScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();   
    }    
    
}
