/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class WriteLoginFile {
    public static void main(String[] args){
        String data = "2230 @549";
                
        try {
            FileWriter output =new FileWriter("data1.txt");
            output.write(data);
            System.out.println("Data is written successfully");
            output.close();
        } catch (IOException ex) {
            System.out.println("File write Error!");
        }
    }
    
    
}
