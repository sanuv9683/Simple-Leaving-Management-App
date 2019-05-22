/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.controller;

import java.util.ArrayList;
import lk.ijse.lms.dto.BranchManagerDTO;
import lk.ijse.lms.dto.ManagerDTO;

/**
 *
 * @author Sanu
 */
public class ManagerLoginPoolController {

    private  ArrayList<ManagerDTO> list;

    public ManagerLoginPoolController() {
    }

    public ManagerLoginPoolController(ArrayList<ManagerDTO> list) {
        this.list = list;
    }

    public boolean addManagerToPool(ManagerDTO dto) {
        return list.add(dto);
    }

    public ManagerDTO searchLog(String id) {
        for (ManagerDTO manager : list) {
            if (manager.getId().equals(id)) {
                return manager;

            }
        }
        return null;
    }

    public boolean removeLog(String id) {
        ManagerDTO searchLog = searchLog(id);
        if (searchLog != null) {
            return list.remove(searchLog);
        }
        return false;
    }

}
