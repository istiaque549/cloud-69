/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Istiaque;

import java.io.BufferedReader;
import java.io.FileReader;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class MeetingController implements Initializable {

    @FXML
    private Label outputLabel;
    @FXML
    private TextField updateScheduleTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent registerpage = FXMLLoader.load(getClass().getResource("CantonmentBoardMemberDashboard.fxml"));
        Scene homepageScene = new Scene(registerpage);
        Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(homepageScene);
        appStage.show();
    }

    @FXML
    private void checkScheduleButtonOnClick(ActionEvent event) {
        try {
            // Change the file path to the location of your text file
            String filePath = "meeting.txt";
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
    private void updateScheduleOnClick(ActionEvent event) {
        String text = updateScheduleTextField.getText();
        try {
            FileWriter writer = new FileWriter("meeting.txt", true); // Open file in append mode
            writer.write( "\n"+text); // Write text to file
            writer.close();
            updateScheduleTextField.setText("\n"); // Clear the text field
        } catch (IOException ex) {
            ex.printStackTrace();
        
        }
    }

    @FXML
    private void checkUpdateOnClick(ActionEvent event) {
        try {
            // Change the file path to the location of your text file
            String filePath = "meeting.txt";
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
    
}
