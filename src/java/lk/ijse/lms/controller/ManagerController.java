/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.controller;

import java.util.ArrayList;
import lk.ijse.lms.dto.ManagerDTO;

/**
 *
 * @author Sanu
 */
public class ManagerController {

    private  ArrayList<ManagerDTO> list;

    public ManagerController() {
    }
    
//register a manager
    public ManagerController(ArrayList<ManagerDTO> list) {
        this.list = list;
    }

    public boolean addManager(ManagerDTO dto) {
        return list.add(dto);
    }
//manager loginng 
    public ManagerDTO checkForLogin(String emaill, String pass) {
        for (ManagerDTO managerDTO : list) {
            if (managerDTO.getEmail().equals(emaill) && managerDTO.getPass().equals(pass)) {
                return managerDTO;
            }
        }
        return null;
    }

}
