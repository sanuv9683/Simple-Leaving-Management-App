/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.dto;

import java.util.ArrayList;

/**
 *
 * @author Sanu
 */
public class DepartmentDTO extends SuperDTO{
    private String id;
    private String name;
    private String bmID;

    public DepartmentDTO() {
    }

    public DepartmentDTO(String id, String name, String bmID) {
        this.id = id;
        this.name = name;
        this.bmID = bmID;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the bmID
     */
    public String getBmID() {
        return bmID;
    }

    /**
     * @param bmID the bmID to set
     */
    public void setBmID(String bmID) {
        this.bmID = bmID;
    }
    
     
}
