/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.web;

import com.google.gson.Gson;
import lk.ijse.lms.controller.ResponsePoolController;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lk.ijse.lms.dto.ResponseDTO;

/**
 *
 * @author Sanu
 */
public class ManagerResponseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        String reid = req.getParameter("rid");
        ServletContext ctx = getServletContext();
        ArrayList<ResponseDTO> responseL = (ArrayList<ResponseDTO>) ctx.getAttribute("responsePool");
        if (responseL==null) {
            responseL= new ArrayList<ResponseDTO>();
            ctx.setAttribute("responsePool", responseL);
        }
        ResponsePoolController ctrl = new ResponsePoolController(responseL);
        ArrayList<ResponseDTO> allResoponseForUser = ctrl.getAllResoponseForUser(reid);
        String gson = new Gson().toJson(allResoponseForUser);
        resp.getWriter().write(gson);
    }

}
