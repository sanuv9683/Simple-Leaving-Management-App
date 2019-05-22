/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.controller;

import java.util.ArrayList;
import lk.ijse.lms.dto.RuquestDTO;

/**
 *
 * @author Sanu
 */
public class RequestPoolController {

    private  ArrayList<RuquestDTO> reqPool;

    public RequestPoolController() {
    }

    public RequestPoolController(ArrayList<RuquestDTO> reqPool) {
        this.reqPool = reqPool;
    }

//    add request to the pool of requests
    public boolean addRuquest(RuquestDTO dto) {
        return reqPool.add(dto);
    }

//    remove from request pool
    public boolean removeRequest(String id) {
        for (RuquestDTO ruquestDTO : reqPool) {
            if (ruquestDTO.getId().equals(id)) {
                return reqPool.remove(ruquestDTO);
            }
        }
        return false;
    }

    //show the owner which request he send
    public ArrayList<RuquestDTO> searchRequest(String id) {
        ArrayList<RuquestDTO> list = null;
        for (RuquestDTO ruquestDTO : reqPool) {
            if (ruquestDTO.getFrom().equals(id)) {
                RuquestDTO temp = new RuquestDTO(ruquestDTO.getId(), ruquestDTO.getName(), ruquestDTO.getDepartment(), ruquestDTO.getFrom(), ruquestDTO.getTo(), ruquestDTO.getReq());
                if (list == null) {
                    list = new ArrayList<RuquestDTO>();
                }
                list.add(temp);

            }
        }
        return list;
    }

//    convert requset of braachmanagers and employees to the managers
    public boolean updateRequest(RuquestDTO dto) {
        String id = dto.getId();
        boolean removeRequest = removeRequest(id);
        if (removeRequest) {
            return reqPool.add(dto);
        }
        return false;
    }

    //search requst from request id;
    public RuquestDTO searchRequestFromID(String id) {
        for (RuquestDTO ruquestDTO : reqPool) {
            if (ruquestDTO.getId().equals(id)) {
                RuquestDTO temp = new RuquestDTO(ruquestDTO.getId(), ruquestDTO.getName(), ruquestDTO.getDepartment(), ruquestDTO.getTo(), ruquestDTO.getFrom(), ruquestDTO.getReq());
                return temp;
            }
        }
        return null;
    }

//    search request for branch managers from employees with brach and to
    public ArrayList<RuquestDTO> searchRequestForBranch(String to, String department) {
        ArrayList<RuquestDTO> list = null;
        for (RuquestDTO ruquestDTO : reqPool) {
            if (ruquestDTO.getDepartment().equals(department) && ruquestDTO.getTo().equals(to)) {
                RuquestDTO temp = new RuquestDTO(ruquestDTO.getId(), ruquestDTO.getName(), ruquestDTO.getDepartment(), ruquestDTO.getFrom(), ruquestDTO.getTo(), ruquestDTO.getReq());
                if (list == null) {
                    list = new ArrayList<RuquestDTO>();
                }
                list.add(temp);

            }
        }
        return list;
    }

//    genarate the request id automatically
    public String getLastID() {
        String lastID = null;
        for (RuquestDTO ruquestDTO : reqPool) {
            lastID = ruquestDTO.getId();
        }

        if (lastID == null) {
            lastID = "100";
        }
        return lastID;
    }

//   search  req fro manager from branch managers
    public ArrayList<RuquestDTO> searchRequestForManager() {
        ArrayList<RuquestDTO> list = null;
        for (RuquestDTO ruquestDTO : reqPool) {
            if (ruquestDTO.getTo().equals("M001")) {
                RuquestDTO temp = new RuquestDTO(ruquestDTO.getId(), ruquestDTO.getName(), ruquestDTO.getDepartment(), ruquestDTO.getTo(), ruquestDTO.getFrom(), ruquestDTO.getReq());
                if (list == null) {
                    list = new ArrayList<RuquestDTO>();
                }
                list.add(temp);

            }
        }
        return list;
    }
}
