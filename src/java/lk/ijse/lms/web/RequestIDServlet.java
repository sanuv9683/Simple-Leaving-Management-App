/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.web;

import com.google.gson.Gson;
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
public class RequestIDServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        from we we genarate the latest id for request
        ServletContext applicatoion = getServletContext();
        ArrayList<RuquestDTO> attribute = (ArrayList<RuquestDTO>) applicatoion.getAttribute("reqPool");
        if (attribute == null) {
            attribute = new ArrayList<RuquestDTO>();
            applicatoion.setAttribute("reqPool", attribute);
        }
        PrintWriter out = resp.getWriter();
        RequestPoolController ePool = new RequestPoolController(attribute);
        String lastID = ePool.getLastID();
        out.print(lastID);
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        search request fro the manager
        resp.setContentType("application/json");
        ServletContext applicatoion = getServletContext();
        ArrayList<RuquestDTO> attribute = (ArrayList<RuquestDTO>) applicatoion.getAttribute("reqPool");
        if (attribute == null) {
            attribute = new ArrayList<RuquestDTO>();
            applicatoion.setAttribute("reqPool", attribute);
        }
        RequestPoolController ctrl = new RequestPoolController(attribute);
        ArrayList<RuquestDTO> searchRequestForManager = ctrl.searchRequestForManager();
        String temo = new Gson().toJson(searchRequestForManager);
        resp.getWriter().write(temo);
    }

}
