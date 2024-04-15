/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package IT_Admin;

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
public class EmployeeReportController implements Initializable {

    @FXML
    private TextField employeeNameTextField;
    @FXML
    private TextField employeeRoleTextField;
    @FXML
    private DatePicker joiningDatePicker;
    @FXML
    private TableView<EmployeeReport> employeeReportTableView;
    @FXML
    private TableColumn<EmployeeReport, String> nameTableColumn;
    @FXML
    private TableColumn<EmployeeReport, String> roleTableColumn;
    @FXML
    private TableColumn<EmployeeReport, LocalDate> joiningTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        
        
        //load dummy data 
        employeeReportTableView.setItems(getEmployeeInfo());
        
        //set table columns 
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<EmployeeReport,String>("name"));
        roleTableColumn.setCellValueFactory(new PropertyValueFactory<EmployeeReport,String>("role"));
        joiningTableColumn.setCellValueFactory(new PropertyValueFactory<EmployeeReport, LocalDate>("joiningDate"));
        
    }    

    @FXML
    private void addInfoOnClick(ActionEvent event) {
        
        EmployeeReport newMember = new EmployeeReport(employeeNameTextField.getText(),
                employeeRoleTextField.getText(),joiningDatePicker.getValue());
                
        
       employeeReportTableView.getItems().add(newMember);
    }
    
    public ObservableList<EmployeeReport> getEmployeeInfo(){
    ObservableList<EmployeeReport> EmployeeInfo = FXCollections.observableArrayList();
        
      EmployeeInfo.add(new EmployeeReport("Rupon Sorkar","Finance",LocalDate.of(2022, Month.MARCH, 23)));
      EmployeeInfo.add(new EmployeeReport("Nishad Shuhrawardi","Manager",LocalDate.of(2020, Month.OCTOBER, 15)));
      return EmployeeInfo;
    }

    @FXML
    private void goBackToNavigationBarOnClick(ActionEvent event) throws IOException {
        Parent NavigationMenu2Parent = FXMLLoader.load(getClass().getResource("Navigation.fxml"));
 
        Scene NavigationMenu2Scene = new Scene(NavigationMenu2Parent);
       
        //This line gets the Stage Information
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(NavigationMenu2Scene);
        stg2.show();
    }
    
}
