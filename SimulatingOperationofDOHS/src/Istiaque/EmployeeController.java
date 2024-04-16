/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Istiaque;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import Model.EmployeeTV;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class EmployeeController implements Initializable {

    @FXML
    private TableView<EmployeeTV> tableView;
    @FXML
    private TableColumn<EmployeeTV, String> nameTableColumn;
    @FXML
    private TableColumn<EmployeeTV, String> designationTableColumn;
    @FXML
    private TableColumn<EmployeeTV, String> dateOfJoiningTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    

    @FXML
    private void viewButtonOnClick(ActionEvent event) throws IOException {
        loadDataFromFile("employeeList.txt");
    }

    private void loadDataFromFile(String filePath) throws IOException {
        tableView.getItems().clear();
//        Clear existing data

        try (BufferedReader reader = new BufferedReader(new FileReader("employeeList.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String name = parts[0];
                    String designation = parts[1];
                    String dateOfJoining = parts[2];
                    tableView.getItems().add(new EmployeeTV(name, designation, dateOfJoining));
                }
            }
        }
    }

    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
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