/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package IstiaqueUtility;

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
public class ExpenseController implements Initializable {

    @FXML
    private TextField addMonthlyExpensetextField;
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
    private void viewMonthlyExpenseButtonOnClick(ActionEvent event) {
        try {
            // Change the file path to the location of your text file
            String filePath = "expense.txt";
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
    private void addMonthlyExpenseButtonOnClick(ActionEvent event) {
        String text = addMonthlyExpensetextField.getText();
        try {
            FileWriter writer = new FileWriter("expense.txt", true); // Open file in append mode
            writer.write( "\n"+text); // Write text to file
            writer.close();
            addMonthlyExpensetextField.setText(""); // Clear the text field
        } catch (IOException ex) {
            ex.printStackTrace();
        
        }
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent loginpage = FXMLLoader.load(getClass().getResource("UtilityOfficerDashboard.fxml"));
        Scene loginpageScene = new Scene(loginpage);
        Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(loginpageScene);
        appStage.show();
    }
    
}
