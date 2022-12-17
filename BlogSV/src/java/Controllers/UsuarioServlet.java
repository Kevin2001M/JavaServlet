/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Entities.Publicacion;
import Models.Entities.Usuario;
import Moldels.DAO.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LC
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/usuario"})
public class UsuarioServlet extends HttpServlet {

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
        Publicacion entity = new Publicacion();
        entity.setFecha(new Date("2022,12,11"));
        
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
        
        
        
        
        
        
        String param = request.getParameter("registro");
        
        //Registro usuarios
        if(param != null){
            String nickname = request.getParameter("nickname");
            String nombre = request.getParameter("nombre");
            String pwd = request.getParameter("pwd");
            
            Usuario entity = new Usuario();
            entity.setNickName(nickname);
            entity.setNombre(nombre);
            entity.setPwd(pwd);
            
            
            UsuarioDAO dao = new UsuarioDAO();
            if(dao.create(entity)){
                //request.setAttribute("usuario", result);            
                request.getRequestDispatcher("login.jsp").forward(request, response);                        
            }
        }
        
        param = request.getParameter("login");
        
        //Login
        if(param != null){
            String nickname = request.getParameter("nickname");            
            String pwd = request.getParameter("pwd");
                                               
            UsuarioDAO dao = new UsuarioDAO();
            Usuario entity = dao.login(nickname,pwd);
            
            HttpSession session = request.getSession();
            if(entity != null){
                //request.setAttribute("usuario", result);                  
                session.setAttribute("usuario", entity);
                
                if(entity.getTipoUsuario()==1){
                    request.getRequestDispatcher("/WEB-INF/views/dashboard.jsp").forward(request, response);        
                }else{
                    request.getRequestDispatcher("index.jsp").forward(request, response);       
                }                                                               
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
