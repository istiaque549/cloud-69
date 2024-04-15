/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jubayer
 */
public class FinancialReportAndStatementController implements Initializable {

    @FXML
    private Button goBackToTreasurerDashboard;
    @FXML
    private TableView<Database> table;
    @FXML
    private TableColumn<Database, Integer> id;
    @FXML
    private TableColumn<Database, String> name;
    @FXML
    private TableColumn<Database, String> email;
    @FXML
    private TableColumn<Database, Integer> amount;
    @FXML
    private TableColumn<Database, String> date;
    @FXML
    private TableColumn<Database, String> time;
    @FXML
    private Label totalAmount;

    ObservableList<Database> list = FXCollections.observableArrayList(
        new Database(21231, "Addison", "addison@gmail.com", 100, "12 April 2024", "10.20 pm"),
        new Database(20245, "Adi", "adi@gmail.com", 100, "10 April 2024", "8.27 am"),
        new Database(21231, "John", "john@gmail.com", 100, "7 April 2024", "9.20 am"),
        new Database(21231, "Julia", "julia@gmail.com", 100, "3 April 2024", "10.50 am"),
        new Database(21231, "Mary", "mary@gmail.com", 100, "9 April 2024", "6.40 pm"),
        new Database(21231, "James", "jamesn@gmail.com", 100, "11 April 2024", "3.10 pm"),
        new Database(21231, "Enna", "enna@gmail.com", 100, "6 April 2024", "2.33 pm")
    );
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));
        amount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        date.setCellValueFactory(new PropertyValueFactory<>("date"));
        time.setCellValueFactory(new PropertyValueFactory<>("time"));
        
        table.setItems(list);
        
        
        
               
    }   
    
    

    @FXML
    private void switchToTreasurerDashboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/mainpkg/TreasurerDashboard.fxml"));
        Scene newScene = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();       
    }
    
}
