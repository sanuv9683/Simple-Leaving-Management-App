/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.listners;

import lk.ijse.lms.controller.ManagerController;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import lk.ijse.lms.dto.ManagerDTO;
import lk.ijse.lms.dto.RuquestDTO;

/**
 *
 * @author Sanu
 */
public class ManagerListner implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ArrayList<ManagerDTO> mList = new ArrayList<ManagerDTO>();
        ServletContext servletContext = sce.getServletContext();
        String initParameter = (String) servletContext.getInitParameter("manager");
        String[] split = initParameter.split("\n");
        ManagerController ctrl = new ManagerController(mList);
        for (String s : split) {
            String[] split1 = s.split("[,]");
            String id = split1[0].trim();
            String fname = split1[1].trim();
            String lname = split1[2].trim();
            String address = split1[3].trim();
            String email = split1[4].trim();
            String pass = split1[5].trim();
            ManagerDTO temp = new ManagerDTO(id, fname, lname, address, email, pass);
            mList.add(temp);

        }
        servletContext.setAttribute("manager", mList);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
