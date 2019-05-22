/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.web;

import com.google.gson.Gson;
import lk.ijse.lms.controller.BranchController;
import lk.ijse.lms.controller.RequestPoolController;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lk.ijse.lms.dto.DepartmentDTO;
import lk.ijse.lms.dto.RuquestDTO;

/**
 *
 * @author Sanu
 */
public class RequestManageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        try {
            String select = req.getParameter("select");
            String personid = req.getParameter("id");
            String depart = req.getParameter("department");
            ServletContext applicatoion = getServletContext();
            ArrayList<RuquestDTO> attribute = (ArrayList<RuquestDTO>) applicatoion.getAttribute("reqPool");
            if (attribute == null) {
                attribute = new ArrayList<RuquestDTO>();
                applicatoion.setAttribute("reqPool", attribute);
            }
            RequestPoolController rCtrl = new RequestPoolController(attribute);
            switch (select) {
                //search for send requsets
                case "my":
                    ArrayList<RuquestDTO> searchRequest = rCtrl.searchRequest(personid);
                    String toJson = new Gson().toJson(searchRequest);
                    out.write(toJson);
                    return;
//                    search for brach manager requsets
                case "branch":
                    String to = req.getParameter("bm");
                    ArrayList<RuquestDTO> res = rCtrl.searchRequestForBranch(to, depart);
                    String toJsons = new Gson().toJson(res);
                    out.write(toJsons);
                    return;
            }

        } finally {
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        this is where employees request are aded to the pool
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

        ArrayList<DepartmentDTO> deparment = (ArrayList<DepartmentDTO>) applicatoion.getAttribute("branch");
        BranchController cc = new BranchController(deparment);
        DepartmentDTO searchDeparment = cc.searchDeparment(depart);
        String bmID = searchDeparment.getBmID();
        RequestPoolController ctrl = new RequestPoolController(attribute);
        applicatoion.setAttribute("reqPool", attribute);
        RuquestDTO newR = new RuquestDTO(reqID, fullName, depart, bmID, personid, message);
        boolean addRuquest = ctrl.addRuquest(newR);
        resp.getWriter().print(addRuquest);
    }

}
