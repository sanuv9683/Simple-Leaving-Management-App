/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.controller;

import java.util.ArrayList;
import lk.ijse.lms.dto.EmployeeDTO;

/**
 *
 * @author Sanu
 */
public class EmployeLoginController {

    private  ArrayList<EmployeeDTO> emList;

    public EmployeLoginController() {
    }

    public EmployeLoginController(ArrayList<EmployeeDTO> emList) {
        this.emList = emList;
    }
    
     public boolean addEmployeToPool(EmployeeDTO dto) {
        return emList.add(dto);
    }

    public EmployeeDTO searchLog(String id) {
        for (EmployeeDTO branchManagerDTO : emList) {
            if (branchManagerDTO.getId().equals(id)) {
                return branchManagerDTO;

            }
        }
        return null;
    }
    
    public boolean removeLog(String id){
        EmployeeDTO searchLog = searchLog(id);
        if (searchLog!=null) {
            return emList.remove(searchLog);
        }
        return false;
    }

}
