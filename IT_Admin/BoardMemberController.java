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
public class BoardMemberController implements Initializable {

    @FXML
    private TableView<BoardMember> boardMemberTableView;
    @FXML
    private TableColumn<BoardMember, String> memberRoleTableColumn;
    @FXML
    private TableColumn<BoardMember, LocalDate> joiningDateTableColumn;
    @FXML
    private TextField memberNameTextField;
    @FXML
    private TextField memberRoleTextFIeld;
    @FXML
    private DatePicker joiningDatePicker;
    @FXML
    private TableColumn<BoardMember, String> memberNameTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<BoardMember> getBoardMemberInfo;
        
        
        //load dummy data 
        boardMemberTableView.setItems(getBoardMemberInfo());
        
        //set table columns 
        memberNameTableColumn.setCellValueFactory(new PropertyValueFactory<BoardMember,String>("name"));
        memberRoleTableColumn.setCellValueFactory(new PropertyValueFactory<BoardMember,String>("role"));
        joiningDateTableColumn.setCellValueFactory(new PropertyValueFactory<BoardMember,LocalDate>("joiningDate"));
    }    

    @FXML
    private void addInfoOnClick(ActionEvent event) {
        
        BoardMember newMember = new BoardMember(memberNameTextField.getText(),
                memberRoleTextFIeld.getText(),joiningDatePicker.getValue());
                
        
       boardMemberTableView.getItems().add(newMember);
    }
    
    public ObservableList<BoardMember> getBoardMemberInfo(){
        ObservableList<BoardMember> BoardMemberInfo = FXCollections.observableArrayList();
        
      BoardMemberInfo.add(new BoardMember("Jubayer Ahmed","Treasurer",LocalDate.of(2022, Month.MARCH, 23)));
      BoardMemberInfo.add(new BoardMember("Shahriar Shafin","Secretary",LocalDate.of(2022, Month.JANUARY, 20)));
      return BoardMemberInfo;
    }

    @FXML
    private void goBackOnClick(ActionEvent event)throws IOException {
        
        Parent NavigationMenu2Parent = FXMLLoader.load(getClass().getResource("Navigation.fxml"));
 
        Scene NavigationMenu2Scene = new Scene(NavigationMenu2Parent);
       
        //This line gets the Stage Information
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stg2.setScene(NavigationMenu2Scene);
        stg2.show();
        
    }
    
}
