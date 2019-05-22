/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.listners;

import lk.ijse.lms.controller.BranchController;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import lk.ijse.lms.dto.DepartmentDTO;

/**
 *
 * @author Sanu
 */
public class BranchListner implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ArrayList<DepartmentDTO> dList = new ArrayList<DepartmentDTO>();
        ServletContext servletContext = sce.getServletContext();
        String initParameter = (String) servletContext.getInitParameter("branches");
        String[] split = initParameter.split("\n");
        BranchController ctrl = new BranchController(dList);
        for (String s : split) {
            String[] split1 = s.split("[,]");
            String id = split1[0].trim();
            String name = split1[1].trim();
            String bmID = split1[2].trim();    
            DepartmentDTO temp = new DepartmentDTO(id, name, bmID);
            dList.add(temp);

        }
        servletContext.setAttribute("branch", dList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
