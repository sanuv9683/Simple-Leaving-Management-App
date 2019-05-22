/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.web;

import com.google.gson.Gson;
import lk.ijse.lms.controller.RequestPoolController;
import lk.ijse.lms.controller.ResponsePoolController;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lk.ijse.lms.dto.ResponseDTO;
import lk.ijse.lms.dto.RuquestDTO;

/**
 *
 * @author Sanu
 */
public class ResponseManageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reqID = req.getParameter("reqID");
        ServletContext application = getServletContext();
        ArrayList<RuquestDTO> attribute = (ArrayList<RuquestDTO>) application.getAttribute("reqPool");
        if (attribute == null) {
            attribute = new ArrayList<RuquestDTO>();
            application.setAttribute("reqPool", attribute);
        }
        RequestPoolController ctrl = new RequestPoolController(attribute);
        RuquestDTO searchRequestFromID = ctrl.searchRequestFromID(reqID);
        String rid = searchRequestFromID.getId();
        String person = searchRequestFromID.getName();
        String to = searchRequestFromID.getTo();
        String from = searchRequestFromID.getFrom();
        String req1 = searchRequestFromID.getReq();
//        make a response object for the request
        ResponseDTO dto = new ResponseDTO(rid, from, to, req1);
        ArrayList<ResponseDTO> reqPool = (ArrayList<ResponseDTO>) application.getAttribute("responsePool");
        if (reqPool == null) {
            reqPool = new ArrayList<ResponseDTO>();
            application.setAttribute("responsePool", reqPool);
        }
        reqPool.add(dto);
        ResponsePoolController resPool = new ResponsePoolController(reqPool);
        boolean removeRequest = ctrl.removeRequest(rid);
        req.getRequestDispatcher("/managerView/managerview.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       get all the responses of employees from there id
        resp.setContentType("application/json");
        String reid = req.getParameter("rid");
        ServletContext application = getServletContext();
        ArrayList<ResponseDTO> reqPool = (ArrayList<ResponseDTO>) application.getAttribute("responsePool");
        if (reqPool == null) {
            reqPool = new ArrayList<ResponseDTO>();
            application.setAttribute("responsePool", reqPool);
        }
        ResponsePoolController ctrl = new ResponsePoolController(reqPool);
        ArrayList<ResponseDTO> allResoponseForUser = ctrl.getAllResoponseForUser(reid);
        String gson = new Gson().toJson(allResoponseForUser);
        resp.getWriter().write(gson);

    }

}
