/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.web;

import com.google.gson.Gson;
import lk.ijse.lms.controller.EmployController;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lk.ijse.lms.controller.BranchController;
import lk.ijse.lms.dto.BranchManagerDTO;
import lk.ijse.lms.dto.DepartmentDTO;
import lk.ijse.lms.dto.EmployeeDTO;

/**
 *
 * @author Sanu
 */
public class EmploysGettingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        search employees for one brach
        resp.setContentType("application/json");
        ArrayList<EmployeeDTO> emList = (ArrayList<EmployeeDTO>) getServletContext().getAttribute("emp");
        EmployController ctrl = new EmployController(emList);
        String branchID = req.getParameter("branch");
        ArrayList<EmployeeDTO> searchEmployFromBranch = ctrl.searchEmployFromBranch(branchID);
        PrintWriter writer = resp.getWriter();
        String gson = new Gson().toJson(searchEmployFromBranch);
        writer.write(gson);
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //employee adding
        PrintWriter out = resp.getWriter();
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String address = req.getParameter("address");
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
        String depart = req.getParameter("department");
        String pos = req.getParameter("pos");
        ServletContext application = getServletContext();
        try {
            switch (pos) {
                case "Employe":
                    ArrayList<EmployeeDTO> emList = (ArrayList<EmployeeDTO>) application.getAttribute("emp");
                    EmployController ctrl = new EmployController(emList);
                    //search the department id
                    ArrayList<DepartmentDTO> deparment = (ArrayList<DepartmentDTO>) application.getAttribute("branch");
                    BranchController cc = new BranchController(deparment);
                    String did = cc.getBrachName(depart);
                    //genarate the  employee id
                    int id = ctrl.getLastID();
                    String ss = Integer.toString(id);
                    String lastID = "E" + ss;
                    EmployeeDTO temp = new EmployeeDTO(lastID, fname, lname, did, address, email, pass);
                    boolean res = ctrl.addEmploy(temp);
                    application.setAttribute("emp", emList);
                    if (res) {
                        out.print(res);
                    }

                    return;

                case "Branch Manager":
                    ArrayList<BranchManagerDTO> bmList = (ArrayList<BranchManagerDTO>) application.getAttribute("branchm");
                    return;
            }

        } finally {
            out.close();
        }

    }

}
