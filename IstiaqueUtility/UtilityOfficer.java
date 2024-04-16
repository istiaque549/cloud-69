/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IstiaqueUtility;

/**
 *
 * @author ASUS
 */
public class UtilityOfficer {
    String id;
    String password;

    public UtilityOfficer(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UtilityOfficer{" + "id=" + id + ", password=" + password + '}';
    }
    
}

