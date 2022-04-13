
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Stuff;

/** 
 *
 * @author Rodrigo
 */
public class UpdateStuffServlet extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Integer id_stuff = Integer.parseInt( request.getParameter("stuff_Id"));
        String nome = request.getParameter("nome");
        String desc = request.getParameter("descricao");       
        Stuff stuff = new Stuff(id_stuff, nome, desc);       
        try{
            updateStuff(stuff);
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(listaStuffServlet.class.getName()).log(Level.SEVERE, null, ex);
        }          
        request.getRequestDispatcher("lista_stuff").forward(request, response);   
        
    }
    
    //DAO STUFF > UPDATE
    public void updateStuff(Stuff stuff) throws ClassNotFoundException, SQLException{ //inserirStuff(Connection con, Object obj)
        
        //conexao com db 
        Class.forName("com.mysql.cj.jdbc.Driver"); // registra o DRIVER        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psmsdb", "root", "");                 
        
        //udpate db preventing SQL Injection 
        String SQL = "UPDATE Stuff SET Name = ?, Description = ? WHERE stuff_id = ?";
        PreparedStatement st = con.prepareStatement(SQL);   //(SQL, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, stuff.getNome());
            st.setString(2, stuff.getDescricao());
            st.setInt(3, stuff.getId());                         
            st.executeUpdate(); 
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
