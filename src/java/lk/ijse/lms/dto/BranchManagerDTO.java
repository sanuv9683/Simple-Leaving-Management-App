/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.dto;

/**
 *
 * @author Sanu
 */
public class BranchManagerDTO extends SuperDTO {
    private String id;
    private String firstName;
    private String lastSName;
    private String address;
    private String departmet;
    private String email;
    private String pass;
   

    public BranchManagerDTO() {
    }

    public BranchManagerDTO(String id, String firstName, String lastSName, String address, String departmet, String email, String pass) {
        this.id = id;
        this.firstName = firstName;
        this.lastSName = lastSName;
        this.address = address;
        this.departmet = departmet;
        this.email = email;
        this.pass = pass;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastSName
     */
    public String getLastSName() {
        return lastSName;
    }

    /**
     * @param lastSName the lastSName to set
     */
    public void setLastSName(String lastSName) {
        this.lastSName = lastSName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the departmet
     */
    public String getDepartmet() {
        return departmet;
    }

    /**
     * @param departmet the departmet to set
     */
    public void setDepartmet(String departmet) {
        this.departmet = departmet;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    

}
