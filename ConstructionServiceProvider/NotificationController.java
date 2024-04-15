/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ConstructionServiceProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class NotificationController implements Initializable {

    @FXML
    private TextArea notificationTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
         int[] arr = {11,22,33,44,55};
        //System.out.println(arr[5]);
        //Random r;        int randomVal = r.nextInt();
        //System.out.println(arr[5]);
        try {
            FileInputStream fis = new FileInputStream("abc.bin");
            // TODO
        } catch (FileNotFoundException e) {
            System.out.println(e);
            //e.printStackTrace();
        }
        
    }   
    
     private void showCustomInformationAlert(String str) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(str);
        a.showAndWait(); 
     }

    @FXML
    private void sendNotificationOnClick(ActionEvent event) {
        
         Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Confirmation Alert");
        a.setHeaderText("Confirm your opinion...");
        a.setContentText("Are you sure to Send Notification ?");
                
        Optional<ButtonType> result = a.showAndWait();
        if(result.get() == ButtonType.OK){
            //you need to write the code to perform the actual task 
            showCustomInformationAlert("Notification Sent!");
        }
        else{
            //show appropriate cancellation message
            showCustomInformationAlert("Notification Send Cancelled"); 
        }
    }

    @FXML
    private void goBackToNavigationBar(ActionEvent event) throws IOException {
        
         Parent NavigationMenu2Parent = FXMLLoader.load(getClass().getResource("ConstructionServiceNavigationBar.fxml"));
 
        Scene NavigationMenu2Scene = new Scene(NavigationMenu2Parent);
       
        //This line gets the Stage Information
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(NavigationMenu2Scene);
        stg2.show();
        
    }
    
}
