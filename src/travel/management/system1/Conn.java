package travel.management.system1;


import java.sql.*;

  public class Conn{
      Connection c;
      Statement s;
      Conn(){
          try{
              Class.forName("com.mysql.cj.jdbc.Driver");
               c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem1","root","Mrun@123");
               s = c.createStatement();
          }catch(Exception e){
              e.printStackTrace();
          }
      }

    ResultSet executeQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    class s {

        public s() {
        }
    }
  }
    
          
