/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mato
 */
@WebServlet(name = "Submit", urlPatterns = {"/Submit"})
public class ServletSubmit extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OrderServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OrderServlet at " + request.getContextPath() + "</h1>");
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
        
        ArrayList<Description> arrayPro= new ArrayList<>();
        String description= request.getParameter("description");
        
       
        Description cust= new Description(description);
        
             
        request.setAttribute("Description", description);
        
        arrayPro.add(cust);
        FileHandler.saveDescription(arrayPro, "testFile.txt");
       
        
    
   
        RequestDispatcher dispatcher = request.getRequestDispatcher("OrderJSP.jsp");
        dispatcher.forward(request, response);//actual forwarding, transfer request responded object
            
    
    
    
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
//        processRequest(request, response);
//        
//        ArrayList<Customer> arrayPro= new ArrayList<>();
//        String velkost= request.getParameter("size");
//        
//       
//        Customer cust= new Customer(velkost);
//        
//             
//        request.setAttribute("size", velkost);
//        
//        arrayPro.add(cust);
//        FileHandler.saveCust(arrayPro, "testFile.txt");
//       
//        
//    
//   
//        RequestDispatcher dispatcher = request.getRequestDispatcher("OrderJSP.jsp");
//        dispatcher.forward(request, response);//actual forwarding, transfer request responded object
//            
//    
//    
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
