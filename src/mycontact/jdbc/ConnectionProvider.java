/**
 * Santosh Mahto
 * ducat.sm@gmail.com
 */
package mycontact.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author santosh
 *
 */
public class ConnectionProvider {

	public static String url="jdbc:oracle:thin:@localhost:1521:xe";
	public static String user="myproject";
	public static String password="myproject";
	public static String driver="oracle.jdbc.driver.OracleDriver";
	public static Connection con;
	
	
	public static Connection getConnectivity() throws ClassNotFoundException, SQLException{
			if(con==null){
				Class.forName(driver);
				con=DriverManager.getConnection(url, user, password);
			return con;	
			}
	return con;
	}
	
}
