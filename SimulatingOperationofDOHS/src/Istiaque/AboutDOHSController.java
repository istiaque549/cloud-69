/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Istiaque;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import Model.AboutDOHS;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class AboutDOHSController implements Initializable {

    @FXML
    private TableView<String> aboutTableView;
    @FXML
    private TableColumn<AboutDOHS, String> aboutTableColum;
    
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadDataFromFile("about.txt");
    }
    private void loadDataFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Add each line from the text file to the TableView
                aboutTableView.getItems().add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
              
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


