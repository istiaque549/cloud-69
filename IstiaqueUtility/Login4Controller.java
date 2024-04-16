/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package IstiaqueUtility;

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
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class Login4Controller implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private TextField passwordTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event) {
        String userID = idTextField.getText();
        String password = passwordTextField.getText();

        // Check if username and password fields are empty
        if (userID.isEmpty() || password.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Error", "UserID and password cannot be empty.");
            return;
        }

        // Read login data from text file
        try (BufferedReader reader = new BufferedReader(new FileReader("data2.txt"))) {
            String line;
            boolean loggedIn = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(userID) && parts[1].equals(password)) {
                    loggedIn = true; 
                    break;
                }
            }
            if (loggedIn) {
                showAlert(Alert.AlertType.INFORMATION, "Success", "Login successful!");
                Parent loginpage = FXMLLoader.load(getClass().getResource("UtilityOfficerDashboard.fxml"));
                Scene loginpageScene = new Scene(loginpage);
                Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                appStage.setScene(loginpageScene);
                appStage.show();
                

            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Invalid userID or password.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Error", "Error reading login data.");
        }
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent loginpage = FXMLLoader.load(getClass().getResource("Login3.fxml"));
        Scene loginpageScene = new Scene(loginpage);
        Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(loginpageScene);
        appStage.show();
    }
    
}
