/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.controller;

import java.util.ArrayList;
import java.util.Arrays;
import lk.ijse.lms.dto.EmployeeDTO;

/**
 *
 * @author Sanu
 */
public class EmployController {

    private  ArrayList<EmployeeDTO> emList;

    public EmployController() {
    }
    

    public EmployController(ArrayList<EmployeeDTO> emList) {
        this.emList = emList;
    }

//    register a emplotyee
    public boolean addEmploy(EmployeeDTO dto) {
        return emList.add(dto);
    }

//    unregister a employee
    public boolean removeEmploy(String id) {
        for (EmployeeDTO employeeDTO : emList) {
            if (employeeDTO.getId().equals(id)) {
                emList.remove(employeeDTO);
                return true;
            }
        }
        return false;
    }

//    get all employees for one branch
    public ArrayList<EmployeeDTO> searchEmployFromBranch(String branchID) {
         ArrayList<EmployeeDTO> allBranchEm= new ArrayList<EmployeeDTO>();
         for (EmployeeDTO employeeDTO : emList) {
             if (employeeDTO.getDepartmet().equals(branchID)) {
                 allBranchEm.add(employeeDTO);
             }
        }
        
        return allBranchEm;
    }
    
//    get all emplyees forom all brachnes
    public ArrayList<EmployeeDTO> getAll() {
         ArrayList<EmployeeDTO> allBranchEm= new ArrayList<EmployeeDTO>();
         for (EmployeeDTO employeeDTO : emList) {
             allBranchEm.add(employeeDTO);
        }
        
        return allBranchEm;
    }
    
//    eployees login controller
     public EmployeeDTO checkForLogin(String emaill, String pass) {
        for (EmployeeDTO managerDTO : emList) {
            if (managerDTO.getEmail().equals(emaill) && managerDTO.getPass().equals(pass)) {
                return managerDTO;
            }
        }
        return null;
    }
     
     //return employee fro employee id
     public EmployeeDTO getEmployee(String id) {
        for (EmployeeDTO managerDTO : emList) {
            if (managerDTO.getId().equals(id)) {
                return managerDTO;
            }
        }
        return null;
    }
     
     //get the employee last id
     public int getLastID(){
         String id=null;
         for (EmployeeDTO employeeDTO : emList) {
            id= employeeDTO.getId();
         }
        String[] split = id.split("E");
        String name = split[1];
        int parseInt = Integer.parseInt(name);
         return parseInt+1;
     }
     

}
