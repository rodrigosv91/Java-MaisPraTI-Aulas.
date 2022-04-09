
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


public class InsertStuffServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //response.setContentType("text/html;charset=UTF-8");       
        String nome = request.getParameter("nome");
        String desc = request.getParameter("descricao");       
        Stuff stuff = new Stuff(nome,desc);       
        try{
            inserirStuff(stuff);
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(listaStuffServlet.class.getName()).log(Level.SEVERE, null, ex);
        }          
        request.getRequestDispatcher("lista_stuff").forward(request, response);   
    }
    
    //DAO INSERIR
    public void inserirStuff(Stuff stuff) throws ClassNotFoundException, SQLException{ //inserirStuff(Connection con, Object obj)
        
        //conexao com db 
        Class.forName("com.mysql.cj.jdbc.Driver"); // registra o DRIVER        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psmsdb", "root", "");                 
        
        //insert into db preventing SQL Injection 
        String SQL = "INSERT INTO Stuff (Name, Description) VALUES (?, ?)";
        PreparedStatement st = con.prepareStatement(SQL);//(SQL, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, stuff.getNome());
            st.setString(2, stuff.getDescricao());
            st.execute();
    }
    
}
