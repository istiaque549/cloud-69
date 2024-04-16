/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Istiaque;

import java.io.BufferedReader;
import java.io.FileReader;
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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ProjectController implements Initializable {

    @FXML
    private Label outputLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void previousProjectButtonOnClick(ActionEvent event) {
       try {
            // Change the file path to the location of your text file
            String filePath = "previousProjects.txt";
            StringBuilder content;
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }

            outputLabel.setText(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
            outputLabel.setText("Error loading file.");
        }
    }

    @FXML
    private void upcomingProjectButonOnClick(ActionEvent event) {
          try {
            // Change the file path to the location of your text file
            String filePath = "upcomingProjects.txt";
            StringBuilder content;
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }

            outputLabel.setText(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
            outputLabel.setText("Error loading file.");
        }
        
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent registerpage = FXMLLoader.load(getClass().getResource("CantonmentBoardMemberDashboard.fxml"));
        Scene homepageScene = new Scene(registerpage);
        Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(homepageScene);
        appStage.show();
    }
    
}
