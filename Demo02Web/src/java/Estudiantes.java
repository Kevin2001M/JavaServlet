/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Kevin
 */
@WebServlet(urlPatterns = {"/Estudiantes"})
public class Estudiantes extends HttpServlet {

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
        
        String[] Listado = {"Estudiante1","Estudiante2","Estudiante3","Estudiante4"};
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Estudiantes</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<section>");
            //if(request.getParameter("id"));
            
            String usuario = request.getParameter("user");
            String clave = request.getParameter("pwd");
            
            if(usuario.equals("admin@gmail.com") && clave.equals("admin123")){
                out.println("<h2> Bienvenido al sistema </h2>");
            }else {
                out.println("<h2> Error de usuario o clave incorrecta </h2>");
            }
            
            out.println("<h2> Informacion de un estudiante </h2>");
            if(request.getParameter("id").equals("")){
                out.println("<h2> Listado de estudiantes </h2>");
                for (int i = 0; i <= 3; i++) {
                out.println("<p>"+ (i+1) +". "+ Listado[i] + " </p>");
            }
            }else{
                int pos = Integer.parseInt(request.getParameter("id"));
                String nombre = request.getParameter("nombre");
                out.println("<p>" + Listado[pos-1] + "</p>");
                out.println("<p>" + nombre + "</p>");
            }
            
            
            
            out.println("</section>");
            out.println("</body>");
            out.println("</html>");
        }
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
