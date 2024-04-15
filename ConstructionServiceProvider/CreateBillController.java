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
public class CreateBillController implements Initializable {

    @FXML
    private TableView<CreateBill> billTableView;
    @FXML
    private TableColumn<CreateBill, String> nameTableColumn;
    @FXML
    private TableColumn<CreateBill, String> locationTableColumn;
    @FXML
    private DatePicker billingDatePicker;
    @FXML
    private TableColumn<CreateBill, String> statusTableColumn;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField locationTextField;
    @FXML
    private TextField statusTextField;
    @FXML
    private TableColumn<CreateBill, LocalDate> billingDateTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<CreateBill> getBillInfo;
        
        
        //load dummy data 
        billTableView.setItems(getBillInfo());
        
        //set table columns 
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<CreateBill,String>("name"));
        locationTableColumn.setCellValueFactory(new PropertyValueFactory<CreateBill,String>("location"));
        billingDateTableColumn.setCellValueFactory(new PropertyValueFactory<CreateBill,LocalDate>("billDate"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<CreateBill,String>("status"));
        
        
        
    }    

    @FXML
    private void addInfoOnClick(ActionEvent event) {
        
         CreateBill newBill = new CreateBill(nameTextField.getText(),
                locationTextField.getText(),billingDatePicker.getValue(),statusTextField.getText());
                
        
       billTableView.getItems().add(newBill);
    }
    
     public ObservableList<CreateBill> getBillInfo(){
        ObservableList<CreateBill> BillInfo = FXCollections.observableArrayList();
        
      BillInfo.add(new CreateBill("Pipe Installation","Road 2,Block B, South DOHS",LocalDate.of(2023, Month.MARCH, 23),"Paid"));
      BillInfo.add(new CreateBill("Reconstruct Drainage System","Road 6, Block A, North DOHS",LocalDate.of(2023, Month.OCTOBER, 20),"Unpaid"));
      return BillInfo;
    }


    @FXML
    private void goToNavigationBarOnClick(ActionEvent event)throws IOException {
        
         Parent NavigationMenu2Parent = FXMLLoader.load(getClass().getResource("ConstructionServiceNavigationBar.fxml"));
 
        Scene NavigationMenu2Scene = new Scene(NavigationMenu2Parent);
       
        //This line gets the Stage Information
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(NavigationMenu2Scene);
        stg2.show();
        
    }
        
       
    }    

   
