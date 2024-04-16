/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package IstiaqueUtility;

import java.io.FileWriter;
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
 * @author ASUS
 */
public class Login3Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event) throws IOException {
        Parent loginpage = FXMLLoader.load(getClass().getResource("Login4.fxml"));
        Scene loginpageScene = new Scene(loginpage);
        Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(loginpageScene);
        appStage.show();
    }

    @FXML
    private void registerButtonOnClick(ActionEvent event) throws IOException {
        Parent registerpage = FXMLLoader.load(getClass().getResource("Login4.fxml"));
        Scene homepageScene = new Scene(registerpage);
        Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(homepageScene);
        appStage.show();
    }
    
}
