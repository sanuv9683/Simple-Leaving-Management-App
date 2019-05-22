/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.listners;

import lk.ijse.lms.controller.EmployController;
import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import lk.ijse.lms.dto.BranchManagerDTO;
import lk.ijse.lms.dto.EmployeeDTO;

/**
 *
 * @author Sanu
 */
public class EmployeeListner implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ArrayList<EmployeeDTO> emList = new ArrayList<EmployeeDTO>();
        String initParameter = (String) sce.getServletContext().getInitParameter("employe");
        String[] split = initParameter.split("\n");
        for (String line : split) {
            String[] tem = line.split("[,]");
            String id = tem[0].trim();
            String fname = tem[1].trim();
            String lname = tem[2].trim();
            String department = tem[4].trim();
            String address = tem[3].trim();
            String email = tem[5].trim();
            String pass = tem[6].trim();
            EmployeeDTO emp = new EmployeeDTO(id, fname, lname, department, address, email, pass);
            emList.add(emp);

        }
        EmployController ctrl = new EmployController(emList);
        sce.getServletContext().setAttribute("emp", emList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
