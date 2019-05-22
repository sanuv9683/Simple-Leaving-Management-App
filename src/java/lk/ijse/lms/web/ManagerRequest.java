/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.web;

import lk.ijse.lms.controller.RequestPoolController;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lk.ijse.lms.dto.RuquestDTO;

/**
 *
 * @author Sanu
 */
public class ManagerRequest extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        this is brach manager request forum for managers
        String personid = req.getParameter("id");
        String fullName = req.getParameter("name");
        String depart = req.getParameter("department");
        String reqID = req.getParameter("rid");
        String date = req.getParameter("date");
        String message = req.getParameter("message");
        ServletContext applicatoion = getServletContext();
        ArrayList<RuquestDTO> attribute = (ArrayList<RuquestDTO>) applicatoion.getAttribute("reqPool");
        if (attribute == null) {
            attribute = new ArrayList<RuquestDTO>();
        }
        RequestPoolController ctrl = new RequestPoolController(attribute);
        applicatoion.setAttribute("reqPool", attribute);
        RuquestDTO newR = new RuquestDTO(reqID, fullName, depart, "M001", personid, message);
        boolean addRuquest = ctrl.addRuquest(newR);
        resp.getWriter().print(addRuquest);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        this is where we convert employees request for brach managers to the manager
        resp.setContentType("text/html");
        ServletContext applicatoion = getServletContext();
        PrintWriter out = resp.getWriter();
        String reqID = req.getParameter("rid");
        ArrayList<RuquestDTO> attribute = (ArrayList<RuquestDTO>) applicatoion.getAttribute("reqPool");
        if (attribute == null) {
            attribute = new ArrayList<RuquestDTO>();
        }
        RequestPoolController ctrl = new RequestPoolController(attribute);
        RuquestDTO searchRequestFromID = ctrl.searchRequestFromID(reqID);
        String id = searchRequestFromID.getId();
        String name = searchRequestFromID.getName();
        String department = searchRequestFromID.getDepartment();
        String from = searchRequestFromID.getFrom();
        String to = searchRequestFromID.getTo();
        String req1 = searchRequestFromID.getReq();

        RuquestDTO dto = new RuquestDTO(id, name, department, "M001", from, req1);
//

        applicatoion.setAttribute("reqPool", attribute);
        boolean removeRequest = ctrl.updateRequest(dto);
        req.getRequestDispatcher("/branchView/branchheadview.jsp").forward(req, resp);
        out.close();
    }

}
