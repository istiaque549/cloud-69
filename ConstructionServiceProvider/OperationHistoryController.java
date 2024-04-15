/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ConstructionServiceProvider;

import IT_Admin.BoardMember;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class OperationHistoryController implements Initializable {

    @FXML
    private TableView<OperationHistory> historyTableView;
    @FXML
    private TableColumn<OperationHistory, String> operationNameTableColumn;
    @FXML
    private TableColumn<OperationHistory, LocalDate> startDateTableColumn;
    @FXML
    private TableColumn<OperationHistory, LocalDate> endDateTableColumn;
    @FXML
    private TableColumn<OperationHistory, String> amountTableColumn;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField amountTextField;
    @FXML
    private DatePicker startDatePicker;
    @FXML
    private DatePicker endDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         ObservableList<OperationHistory> getHistoryInfo;
        
        
        //load dummy data 
        historyTableView.setItems(getHistoryInfo());
        
        //set table columns 
        operationNameTableColumn.setCellValueFactory(new PropertyValueFactory<OperationHistory,String>("name"));
        startDateTableColumn.setCellValueFactory(new PropertyValueFactory<OperationHistory,LocalDate>("startDate"));
        endDateTableColumn.setCellValueFactory(new PropertyValueFactory<OperationHistory,LocalDate>("endDate"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<OperationHistory,String>("amount"));
        
        
        
    }    

    @FXML
    private void addOperationOnClick(ActionEvent event) {
        
          OperationHistory newOperation = new OperationHistory(nameTextField.getText(),
                startDatePicker.getValue(),endDatePicker.getValue(),amountTextField.getText());
                
        
                
        
       historyTableView.getItems().add(newOperation);
    }
 public ObservableList<OperationHistory> getHistoryInfo(){
        ObservableList<OperationHistory> HistoryInfo = FXCollections.observableArrayList();
        
      HistoryInfo.add(new OperationHistory("Pipe Installation",LocalDate.of(2024, Month.MARCH, 01),LocalDate.of(2024, Month.MARCH, 07),"20,000BDT"));
      HistoryInfo.add(new OperationHistory("Remove Tree",LocalDate.of(2024, Month.APRIL, 03),LocalDate.of(2024, Month.APRIL, 03),"10,000BDT"));
      return HistoryInfo;
      
 }
 
    @FXML
    private void goBackToNavigationBarOnClick(ActionEvent event) throws IOException {
        Parent NavigationMenu2Parent = FXMLLoader.load(getClass().getResource("ConstructionServiceNavigationBar.fxml"));
 
        Scene NavigationMenu2Scene = new Scene(NavigationMenu2Parent);
       
        //This line gets the Stage Information
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(NavigationMenu2Scene);
        stg2.show();
    }
    
}
