/**
 * Santosh Mahto
 * ducat.sm@gmail.com
 */
package mycontact.allmethods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import mycontact.entity.Contact;
import mycontact.jdbc.ConnectionProvider;

/**
 * @author santosh
 *
 */
public class MyContactMethods {
public static Connection con;
public 	MyContactMethods(){
	
	try {
		con=ConnectionProvider.getConnectivity();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
public static void checkContact(Contact c) throws SQLException{
	
	String sql="select * from contactbook where mobile=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setLong(1, c.getMobile());
    ResultSet rs=	ps.executeQuery();
    if(rs.next()){
    	
    	updateContact(c);
    }else {
		addContact(c);
	}
}

/**
 * @param c
 * @throws SQLException 
 */
public static void addContact(Contact c) throws SQLException {
	String sql="insert into contactbook(first_name,last_name,email,mobile,state) values(?,?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, c.getFirst_name());
	ps.setString(2, c.getLast_name());
	ps.setString(3, c.getEmail());
	ps.setLong(4, c.getMobile());
	ps.setString(5, c.getState());
	
    ps.executeUpdate();
	
	
}

/**
 * @param c
 * @throws SQLException 
 */
public  static void updateContact(Contact c) throws SQLException {
	String sql="update contactbook set first_name=?,last_name=?,email=?,state=? where mobile=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, c.getFirst_name());
	ps.setString(2, c.getLast_name());
	ps.setString(3, c.getEmail());
	ps.setString(4, c.getState());
	ps.setLong(5, c.getMobile());
    ps.executeUpdate();
	
}	
}
