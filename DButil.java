

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DButil {
    static final String user = "root";
    static final String pass = "";
    static final String DBname = "greetgo";
    static PreparedStatement ps = null;
 
    Connection connection;
    Statement statement;
    DButil(){
	try{
	    Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DBname, user, pass);
            statement = connection.createStatement();
        }catch(Exception e){
            System.out.println("Cant connect to DB");
            }
        }
    
    public ResultSet getData(String query){
	ResultSet rs = null;
	try{
	    rs = statement.executeQuery(query);
	}catch(Exception e){
	    System.out.println(e);
	}
	return rs;
    }
    
public int check(String param1,String param2){
            ResultSet rs = getData("SELECT * FROM user");
            
          try {
              while(rs.next()){
                  String login = rs.getString("login");
                  String password = rs.getString("password");
                  if(login.equals(param1) && password.equals(param2)){
		      int id = rs.getInt("id");
                      System.out.println("This is your "+id);
		      return id;
                  }
              }
          } catch (SQLException ex) {
              System.out.println(ex);
          }
            
            return 0;
        }
}
    

