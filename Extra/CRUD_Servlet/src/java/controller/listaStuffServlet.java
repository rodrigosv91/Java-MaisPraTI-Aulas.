
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Stuff;


public class listaStuffServlet  extends HttpServlet{
    
    //move dao to dao and list servlet to controller
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        //response.setContentType("text/html;charset=UTF-8");
        try {           
            //this.inserirStuff();
            request.setAttribute("stuff_list", this.buscarStuff());
            request.getRequestDispatcher("listarStuff.jsp").forward(request, response);           
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(listaStuffServlet.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

    //REAL DAO
    public ArrayList<Stuff> buscarStuff() throws ClassNotFoundException, SQLException {
        //ConnectionFactory db = new ConnectionFactory();
        //Connection con = ConnectionFactory.getConnection();
        
        ArrayList<Stuff> stuffList = new ArrayList();
        //conexao com db
        //Class.forName("com.mysql.jdbc.Driver"); // old | deprecated  
        Class.forName("com.mysql.cj.jdbc.Driver"); // registra o DRIVER        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psmsdb", "root", "");
    
        //faz uma busca (select) no db
        Statement s = con.createStatement();        
        String SQL = "SELECT stuff_id, Name, Description FROM Stuff";
        s.executeQuery(SQL);
        ResultSet res = s.getResultSet();
        
        //adiciona resultados em sutffList
        while (res.next()) {
            Stuff stuff = new Stuff( 
                    res.getInt("stuff_id"),
                    res.getString("Name"),
                    res.getString("Description")
            );         
            stuffList.add(stuff);
        }
        return stuffList;
    }
    
    //insert local
    public void inserirStuff() throws ClassNotFoundException, SQLException{ //inserirStuff(Connection con, Object obj)
        //conexao com db 
        Class.forName("com.mysql.cj.jdbc.Driver"); // registra o DRIVER        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psmsdb", "root", "");
        
        //recebe parametros
        //if (obj instanceof Usuario) {
            //Stuff usu = (Stuff) obj;              
        
        //insert into db preventing SQL Injection 
        String SQL = "INSERT INTO Stuff (Name, Description) VALUES (?, ?)";
        PreparedStatement st = con.prepareStatement(SQL);//(SQL, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, "Item 6");
            st.setString(2, "Item novo 6");
            st.execute();
            //System.out.println(st.getGeneratedKeys());
            
        //}
    }
}
