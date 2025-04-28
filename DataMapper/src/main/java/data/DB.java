package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//=== encapsulates code to get and release a connection
//=== Encapsulates handling of connections and 
//=== SQL-statements
public class DB {

    private Connection con;
    private static DB instance;
    private static PreparedStatement stmt;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/mailorder";
    private static String id = "root";
    private static String pw = "root";

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(URL, id, pw);  // The connection will be released upon program 

        } catch (Exception e) {
            System.out.println("\n*** Remember to insert your  ID and PW in the DBConnector class! ***\n");
            System.out.println("error in DBConnector.getConnection()");
            System.out.println(e);
        }

        return con;
    }

    public void releaseConnection(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    /* The singleton implementation of methods below is not used by ZipcodeMapper in DataMapperDemo2
     neither the preparedStatement */
    /* private DB() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(URL, id, pw);  // The connection will be released upon program 
            // termination by the garbage collector
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error in DB constructor");
            System.out.println(e);
        }
    }

    private static DB getInstance() {
        if (instance == null) {
            instance = new DB();
        }
        return instance;
    }

   public static PreparedStatement prepare(String SQLString) {
        try {
            stmt = getInstance().con.prepareStatement(SQLString);
        } catch (SQLException e) {
            System.out.println("Error in DB.prepare()" + e);
        }
        return stmt;
    }

    public static void cleanUp(PreparedStatement stmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            System.out.println("Error in DB.cleanUp() closing resultSet" + e);
        }
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (Exception e) {
            System.out.println("Error in DB.cleanUp() closing preparedStatement" + e);
        }
        //Don't close con object stored on DB singleton instance
        //GC will take care of it upon program termination
    }
*/

}
