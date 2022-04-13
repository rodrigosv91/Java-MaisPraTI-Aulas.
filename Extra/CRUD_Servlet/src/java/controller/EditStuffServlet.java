
package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Stuff;

/**
 *
 * @author Rodrigo
 */
public class EditStuffServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        Integer id_stuff = Integer.parseInt( request.getParameter("stuff_Id"));
        
        try{
            Optional<Stuff> existingStuff =  findStuff(id_stuff);
            RequestDispatcher dispatcher =  request.getRequestDispatcher("formStuff.jsp");  
            existingStuff.ifPresent(s->request.setAttribute("stuff", s));
            dispatcher.forward(request, response); 
            
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(listaStuffServlet.class.getName()).log(Level.SEVERE, null, ex);
        }          
         
    }
    
    //DAO STUFF > Busca
    public Optional<Stuff> findStuff(Integer id_procurado) throws SQLException, ClassNotFoundException{
        Integer id_stuff = 0;
        String nome ="", descricao="";
        
        //conexao com db 
        Class.forName("com.mysql.cj.jdbc.Driver"); // registra o DRIVER        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psmsdb", "root", "");   
        
        //select from db preventing SQL Injection 
        String SQL = "SELECT stuff_id, Name, Description FROM Stuff WHERE stuff_id = ?";
        PreparedStatement st = con.prepareStatement(SQL);
        st.setInt(1, id_procurado.intValue());
        ResultSet res = st.executeQuery();
        
        if(res.next()){
            id_stuff = res.getInt("stuff_id");
            nome = res.getString("Name");
            descricao = res.getString("Description");
        }
         
        return Optional.of(new Stuff(id_stuff, nome, descricao));
        //return new Stuff(id_stuff, nome, descricao); 
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
