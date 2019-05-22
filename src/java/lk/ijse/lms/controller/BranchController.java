/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.controller;

import java.util.ArrayList;
import lk.ijse.lms.dto.DepartmentDTO;

/**
 *
 * @author Sanu
 */
public class BranchController {

    private ArrayList<DepartmentDTO> deparment;

    public BranchController() {
    }

    public BranchController(ArrayList<DepartmentDTO> deparment) {
        this.deparment = deparment;
    }

    public boolean addBranch(DepartmentDTO dto) {
        return deparment.add(dto);
    }

    public boolean removeBranch(String id) {
        for (DepartmentDTO departmentDTO : deparment) {
            if (departmentDTO.getId().equals(id)) {
                deparment.remove(departmentDTO);
                return true;
            }
        }
        return false;
    }
//get the department from department id return the manager also

    public DepartmentDTO searchDeparment(String id) {
        for (DepartmentDTO departmentDTO : deparment) {
            if (departmentDTO.getId().equals(id)) {
                return departmentDTO;
            }
        }
        return null;
    }

//    get all breachers
    public ArrayList<DepartmentDTO> getAll() {
        ArrayList<DepartmentDTO> allD = new ArrayList<DepartmentDTO>();
        for (DepartmentDTO departmentDTO : deparment) {
            allD.add(departmentDTO);
        }
        return allD;
    }

//    get the id from branch name
    public String getBrachName(String bname) {
        for (DepartmentDTO departmentDTO : deparment) {
            if (departmentDTO.getName().equals(bname)) {
                return departmentDTO.getId();
            }
        }
        return null;
    }
}
