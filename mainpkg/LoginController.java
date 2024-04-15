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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class LoginController implements Initializable {

    @FXML
    private TextField userTextField;
    @FXML
    private PasswordField passwordTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginToUserBar(ActionEvent event) throws IOException {
        
        Parent UserParent = FXMLLoader.load(getClass().getResource("Users.fxml"));
 
        Scene UserScene = new Scene(UserParent);
       
        //This line gets the Stage Information
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(UserScene);
        stg2.show();
    }
    
}
