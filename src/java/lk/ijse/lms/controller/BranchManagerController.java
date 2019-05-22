/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.controller;

import java.util.ArrayList;
import lk.ijse.lms.dto.BranchManagerDTO;

/**
 *
 * @author Sanu
 */
public class BranchManagerController {
   private   ArrayList<BranchManagerDTO> bmList;

    public BranchManagerController() {
    }

   
    public BranchManagerController(ArrayList<BranchManagerDTO> bmList) {
        this.bmList = bmList;
    }
    
    public boolean addBranch(BranchManagerDTO dto) {
        return bmList.add(dto);
    }

//    remove a baranch manager from the db
    public boolean removeBranchManager(String id) {
        for (BranchManagerDTO branchM : bmList) {
            if (branchM.getId().equals(id)) {
                bmList.remove(branchM);
                return true;
            }
        }
        return false;
    }

//    search about a branch manager
    public BranchManagerDTO searchBranchManager(String id) {
        for (BranchManagerDTO brachManager : bmList) {
            if (brachManager.getId().equals(id)) {
                return brachManager;
            }
        }
        return null;
    }

//    get all branch manager
    public ArrayList<BranchManagerDTO> getAll() {
        ArrayList<BranchManagerDTO> allD = new ArrayList<BranchManagerDTO>();
        for (BranchManagerDTO branchDto : bmList) {
            bmList.add(branchDto);
        }
        return allD;
    }

//    check for branch manager login
    public BranchManagerDTO checkForLogin(String emaill, String pass) {
        for (BranchManagerDTO managerDTO : bmList) {
            if (managerDTO.getEmail().equals(emaill) && managerDTO.getPass().equals(pass)) {
                return managerDTO;
            }
        }
        return null;
    }
    
    
}
