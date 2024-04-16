/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package IT_Admin;

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
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class ManageAccountController implements Initializable {

    @FXML
    private TableColumn<UserAccount, String> userIDTC;
    @FXML
    private TableColumn<UserAccount, String> nameTC;
    @FXML
    private TableColumn<UserAccount, String> roleTC;
    @FXML
    private TableColumn<UserAccount, String> deptTC;
    @FXML
    private TableColumn<UserAccount, String> mobileTC;
    @FXML
    private TextField userIDTextField;
    @FXML
    private TextField userNameTextField;
    @FXML
    private TextField userRoleTextField;
    @FXML
    private TextField deptTextField;
    @FXML
    private TextField mobileNumberTextField;
    @FXML
    private TableView<UserAccount> userInfoTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //load dummy data
        userInfoTableView.setItems(getUserInfo());
        
        //Select Multiple Methods 
        userInfoTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        

        //set the columns in the table 
        userIDTC.setCellValueFactory(new PropertyValueFactory<UserAccount,String>("id"));
        nameTC.setCellValueFactory(new PropertyValueFactory<UserAccount,String>("name"));
        roleTC.setCellValueFactory(new PropertyValueFactory<UserAccount,String>("role"));
        deptTC.setCellValueFactory(new PropertyValueFactory<UserAccount,String>("dept"));
        mobileTC.setCellValueFactory(new PropertyValueFactory<UserAccount,String>("number"));
        
        //Update the table to allow for the role to be editable
        userInfoTableView.setEditable(true);
        roleTC.setCellFactory(TextFieldTableCell.forTableColumn());
        
    }    

    @FXML
     public void changeRoleCellEvent(TableColumn.CellEditEvent edittedCell){
        UserAccount userSelected = userInfoTableView.getSelectionModel().getSelectedItem();
        userSelected.setRole(edittedCell.getNewValue().toString());
    }    
    
    public ObservableList<UserAccount> getUserInfo(){
        ObservableList<UserAccount> UserInfo = FXCollections.observableArrayList();
        
        UserInfo.add(new UserAccount("20343", "Ahsan Habib", "Joint Secretary","Board Member","01654236542"));
        UserInfo.add(new UserAccount("20452", "Luna Ahmed", "Executive","Finance","01654244322"));
        
        return UserInfo;
        
    };
     
    

    @FXML
    private void goToNavigationBarOnClick(ActionEvent event) throws IOException {
        Parent NavigationMenu2Parent = FXMLLoader.load(getClass().getResource("Navigation.fxml"));
 
        Scene NavigationMenu2Scene = new Scene(NavigationMenu2Parent);
       
        //This line gets the Stage Information
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(NavigationMenu2Scene);
        stg2.show();
    }

    @FXML
    private void addUserOnClick(ActionEvent event) {
        
         UserAccount newUser = new UserAccount(userIDTextField.getText(),
                userNameTextField.getText(),
                userRoleTextField.getText(),
                deptTextField.getText(),
               mobileNumberTextField.getText());
        
       userInfoTableView.getItems().add(newUser);
        
    }

    @FXML
    private void deleteUserOnClick(ActionEvent event) {
        
          ObservableList<UserAccount>selectedRows, allUsers;
        allUsers = userInfoTableView.getItems();
        
        selectedRows = userInfoTableView.getSelectionModel().getSelectedItems();
        //loop over selected rows and removing the objects
        for (UserAccount users : selectedRows)
        {
            allUsers.remove(users);
        }
    }
    
}
