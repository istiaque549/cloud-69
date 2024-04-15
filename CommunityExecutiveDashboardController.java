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
 * @author Jubayer
 */
public class CommunityExecutiveDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void switchToAnnouncement(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/mainpkg/Announcement.fxml"));
        Scene newScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();        
    }

    @FXML
    private void switchToCollaboration(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/mainpkg/Collaboration.fxml"));
        Scene newScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();        
    }

    @FXML
    private void switchToFeedback(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/mainpkg/Feedback.fxml"));
        Scene newScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();        
    }

    @FXML
    private void switchToMeeting(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/mainpkg/Meeting.fxml"));
        Scene newScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();        
    }

    @FXML
    private void switchToMessage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/mainpkg/Message.fxml"));
        Scene newScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();        
    }

    @FXML
    private void switchToReport(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/mainpkg/Report.fxml"));
        Scene newScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();        
    }

    @FXML
    private void switchToPolicyAndGuidline(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/mainpkg/PolicyAndGuidline.fxml"));
        Scene newScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();        
    }
    
}
