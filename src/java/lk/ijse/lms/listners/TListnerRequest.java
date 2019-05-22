/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.lms.listners;

import lk.ijse.lms.controller.RequestPoolController;
import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import lk.ijse.lms.dto.RuquestDTO;

/**
 *
 * @author Sanu
 */
public class TListnerRequest implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ArrayList<RuquestDTO> allR= new ArrayList<RuquestDTO>();
        String initParameter = (String) sce.getServletContext().getInitParameter("requset");
        String[] lines = initParameter.split("\n");
        for (String line : lines) {
            String[] split = line.split("[,]");
            String id = split[0].trim();
            String name = split[1].trim();
            String department = split[2].trim();
            String to = split[3].trim();
            String from = split[4].trim();
            String req = split[5].trim();
            RuquestDTO dto= new RuquestDTO(id, name, department, to, from, req);
            allR.add(dto);
        }
        RequestPoolController pool= new RequestPoolController(allR);
        sce.getServletContext().setAttribute("reqPool", allR);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
