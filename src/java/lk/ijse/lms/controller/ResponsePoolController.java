/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.controller;

import java.util.ArrayList;
import lk.ijse.lms.dto.ResponseDTO;

/**
 *
 * @author Sanu
 */
public class ResponsePoolController {

    private  ArrayList<ResponseDTO> resPool;

    public ResponsePoolController() {
    }
    

    public ResponsePoolController(ArrayList<ResponseDTO> reqPool) {
        this.resPool = reqPool;
    }

    public ArrayList<ResponseDTO> getAll() {
        ArrayList<ResponseDTO> allResponses = new ArrayList<ResponseDTO>();
        for (ResponseDTO responseDTO : resPool) {
            allResponses.add(responseDTO);
        }
        return allResponses;
    }

    public boolean addResponse(ResponseDTO dto) {
        return resPool.add(dto);
    }

//    search response for employyes
    public ArrayList<ResponseDTO> getAllResoponseForUser(String to) {
        ArrayList<ResponseDTO> allRes = new ArrayList<ResponseDTO>();
        for (ResponseDTO responseDTO : resPool) {
            if (responseDTO.getTo().equals(to)) {
                allRes.add(responseDTO);
            }
        }
        return allRes;
    }

//    search response for branch managers
//    delete resoponses
}
