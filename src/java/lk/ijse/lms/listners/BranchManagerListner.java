/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.listners;

import lk.ijse.lms.controller.BranchManagerController;
import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import lk.ijse.lms.dto.BranchManagerDTO;

/**
 *
 * @author Sanu
 */
public class BranchManagerListner implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ArrayList<BranchManagerDTO> bmList = new ArrayList<BranchManagerDTO>();
        String initParameter = (String) sce.getServletContext().getInitParameter("bmanager");
        String[] line = initParameter.split("\n");
        for (String sline : line) {
            String[] split = sline.split("[,]");
            String id = split[0].trim();
            String fName = split[1].trim();
            String lName = split[2].trim();
            String address = split[3].trim();
            String department = split[4].trim();
            String email = split[5].trim();
            String pass = split[6].trim();

            BranchManagerDTO dto = new BranchManagerDTO(id, fName, lName, address, department, email, pass);
            bmList.add(dto);
        }
        BranchManagerController ctrl = new BranchManagerController(bmList);
        sce.getServletContext().setAttribute("branchm", bmList);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
