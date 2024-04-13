/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class CreateLoginFile {
    public static void main(String[] args){
        File myFile = new File("data1.txt");
        try {
            if (myFile.createNewFile()){
                System.out.println("File created Successfully");
            }
            else{
                System.out.println("File creation Error!");
            }
        } catch (IOException ex) {
            System.out.println("File Error!!");
        }
      
            
    }
    
}
