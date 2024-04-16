/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Istiaque;

import Model.EmployeeTV;
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
public class PolicyController implements Initializable {

    @FXML
    private TextField addNewPolicyTextField;
    @FXML
    private Label outPutLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addNewPolicyButtonOnClick(ActionEvent event) {
        String text = addNewPolicyTextField.getText();
        try {
            FileWriter writer = new FileWriter("policy1.txt", true); // Open file in append mode
            writer.write( "\n"+text); // Write text to file
            writer.close();
            addNewPolicyTextField.setText("\n"); // Clear the text field
        } catch (IOException ex) {
            ex.printStackTrace();
        
        }
    }

    @FXML
    private void viewPolicyButtonOnClick(ActionEvent event) throws IOException {
        try {
            // Change the file path to the location of your text file
            String filePath = "policy1.txt";
            StringBuilder content;
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }

            outPutLabel.setText(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
            outPutLabel.setText("Error loading file.");
        }
       
    }
    
    @FXML
    private void checkUpdateButtonOnClick(ActionEvent event) {
        try {
            // Change the file path to the location of your text file
            String filePath = "policy1.txt";
            StringBuilder content;
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }

            outPutLabel.setText(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
            outPutLabel.setText("Error loading file.");
        }
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent loginpage = FXMLLoader.load(getClass().getResource("CantonmentBoardMemberDashboard.fxml"));
        Scene loginpageScene = new Scene(loginpage);
        Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(loginpageScene);
        appStage.show();
    }
    
}
