/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.web;

import lk.ijse.lms.controller.BranchManagerController;
import lk.ijse.lms.controller.EmployController;
import lk.ijse.lms.controller.ManagerController;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import lk.ijse.lms.dto.BranchManagerDTO;
import lk.ijse.lms.dto.EmployeeDTO;
import lk.ijse.lms.dto.ManagerDTO;

/**
 *
 * @author Sanu
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //handle all the logings here
        PrintWriter out = resp.getWriter();
        try {
            ServletContext context = getServletContext();
            String email = req.getParameter("email");
            String pass = req.getParameter("password");
            String pos = req.getParameter("pos");
            ArrayList<Object> attribute = (ArrayList<Object>) getServletContext().getAttribute("logpool");
            if (attribute == null) {
                attribute = new ArrayList<Object>();
            }

            //initialize context
            ServletContext appication = getServletContext();
            ArrayList<ManagerDTO> managerList = (ArrayList<ManagerDTO>) context.getAttribute("manager");
            ArrayList<BranchManagerDTO> bmList = (ArrayList<BranchManagerDTO>) context.getAttribute("branchm");
            ArrayList<EmployeeDTO> emList = (ArrayList<EmployeeDTO>) context.getAttribute("emp");
            ManagerController ctrl = new ManagerController(managerList);
            BranchManagerController bCtrl = new BranchManagerController(bmList);
            EmployController eCtrl = new EmployController(emList);

            switch (pos.trim()) {
                case "Manager":
                    ManagerDTO checkForLogin = ctrl.checkForLogin(email, pass);
                    if (checkForLogin != null) {
                        //sesion managenemt fro user
                        HttpSession session = req.getSession();
                        ManagerDTO manager = (ManagerDTO) session.getAttribute("user");
                        ArrayList<ManagerDTO> aManager = (ArrayList<ManagerDTO>) appication.getAttribute("mPool");
                        if (aManager != null) {
                            out.print("in");
                        } else {
                            req.getSession().setAttribute("user", checkForLogin);
                            aManager = new ArrayList<ManagerDTO>();
                            aManager.add(checkForLogin);
                            appication.setAttribute("mPool", aManager);
                            out.print("Manager");
                        }
                    } else {
                        out.print("false");
                    }
                    return;
                //branch manager loging checking
                case "Branch Manager":
                    BranchManagerDTO dto = bCtrl.checkForLogin(email, pass);
                    if (dto != null) {
                        ArrayList<BranchManagerDTO> bmPool = (ArrayList<BranchManagerDTO>) appication.getAttribute("bmLogPool");
                        if (bmPool == null) {
                            bmPool = new ArrayList<BranchManagerDTO>();
                            appication.setAttribute("bmLogPool", bmPool);
                        }
                        BranchManagerController sbm = new BranchManagerController(bmPool);
                        BranchManagerDTO checkForLogin1 = sbm.checkForLogin(email, pass);
                        if (checkForLogin1 != null) {
                            out.print("in");
                        } else {
                            sbm.addBranch(dto);
                            appication.setAttribute("bmLogPool", bmPool);
                            req.getSession().setAttribute("user", dto);
                            out.print("Branch Manager");
                        }

                    } else {
                        out.print("false");
                    }
                    return;

                case "Employe":
                    EmployeeDTO edto = eCtrl.checkForLogin(email, pass);
                    if (edto != null) {
                        ArrayList<EmployeeDTO> empLog = (ArrayList<EmployeeDTO>) appication.getAttribute("emLogPool");
                        if (empLog == null) {
                            empLog = new ArrayList<EmployeeDTO>();
                            appication.setAttribute("emLogPool", empLog);
                        }
                        EmployController emCtrl = new EmployController(empLog);
                        EmployeeDTO checkForLogin1 = emCtrl.checkForLogin(email, pass);
                        if (checkForLogin1 != null) {
                            out.print("in");
                        } else {
                            emCtrl.addEmploy(edto);
                            appication.setAttribute("emLogPool", empLog);
                            req.getSession().setAttribute("user", edto);
                            out.print("Employe");
                        }

                    } else {
                        out.print("false");
                    }
                    return;

            }

        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        this is logout
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String id = req.getParameter("id");
        String position = req.getParameter("pos");
        ServletContext appication = getServletContext();
        try {
            switch (position.trim()) {
                case "m":
                    req.getSession().invalidate();
                    ArrayList<ManagerDTO> alist = (ArrayList<ManagerDTO>) appication.getAttribute("mPool");
                    if (alist != null) {
                        appication.removeAttribute("mPool");
                    }
                    out.print("ok");
                    return;

                case "em":
                    req.getSession().invalidate();
                    ArrayList<EmployeeDTO> empLog = (ArrayList<EmployeeDTO>) appication.getAttribute("emLogPool");
                    EmployController emCtrl = new EmployController(empLog);
                    boolean re = emCtrl.removeEmploy(id);

                    out.print("ok");

                    return;

                case "bm":
                    req.getSession().invalidate();
                    ArrayList<BranchManagerDTO> bmPool = (ArrayList<BranchManagerDTO>) appication.getAttribute("bmLogPool");
                    BranchManagerController sbm = new BranchManagerController(bmPool);
                    boolean i = sbm.removeBranchManager(id);
                    out.print("ok");
                    return;

            }

        } finally {
            out.close();
        }

    }

}
