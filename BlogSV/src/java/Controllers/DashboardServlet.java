/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Entities.*;
import Moldels.DAO.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LC
 */
@WebServlet(name = "DashboardServlet", urlPatterns = {"/dashboard"})
public class DashboardServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String action = request.getParameter("action");
        
        //rutas list, create & update
        //list => action = usuarios    list=> action = categorias 
        //create => create-categorias
        //update => update-categorias
        if(action.equals("usuarios")){ 
            UsuarioDAO dao = new UsuarioDAO();
            List<Usuario> result = dao.getAll();
            request.setAttribute("usuarios", result);
            request.getRequestDispatcher("/WEB-INF/views/usuarios.jsp").forward(request, response);                                    
        }
        
        if(action.equals("create-usuarios")){             
            request.getRequestDispatcher("/WEB-INF/views/usuarios-create.jsp").forward(request, response);                                    
        }
        
        if(action.equals("categorias")){      
            CategoriaDAO dao = new CategoriaDAO();
            List<Categoria> result = dao.getAll();
            request.setAttribute("categorias", result);            
            request.getRequestDispatcher("/WEB-INF/views/categorias.jsp").forward(request, response);                        
            
        }
        
        if(action.equals("publicaciones")){                
            request.getRequestDispatcher("/WEB-INF/views/publicaciones.jsp").forward(request, response);                        
            
        }
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        if(request.getParameter("nuevousuario") !=null){
            UsuarioDAO dao = new UsuarioDAO();
            Usuario entity = new Usuario();
            entity.setNickName(request.getParameter("nickname"));
            entity.setNombre(request.getParameter("nombre"));            
            entity.setPwd(request.getParameter("pwd"));
            
            if(dao.create(entity)){                
                List<Usuario> result = dao.getAll();
                request.setAttribute("usuarios", result);
                request.getRequestDispatcher("/WEB-INF/views/usuarios.jsp").forward(request, response);                                    
            }
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
