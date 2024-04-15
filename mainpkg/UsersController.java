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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class UsersController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToITNavigationBarOnClick(ActionEvent event)throws IOException {
        
       Parent ManageAccountParent = FXMLLoader.load(getClass().getResource("/IT_Admin/Navigation.fxml"));
 
        Scene ManageAccountScene = new Scene(ManageAccountParent);
       
        //This line gets the Stage Information
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(ManageAccountScene);
        stg2.show();
        
    }

    @FXML
    private void goToConstructionNavigationBarOnClick(ActionEvent event) throws IOException {
        
         Parent ManageAccountParent = FXMLLoader.load(getClass().getResource("/ConstructionServiceProvider/ConstructionServiceNavigationBar.fxml"));
 
        Scene ManageAccountScene = new Scene(ManageAccountParent);
       
        //This line gets the Stage Information
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(ManageAccountScene);
        stg2.show();
    }
    
}
