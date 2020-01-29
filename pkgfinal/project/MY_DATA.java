
package pkgfinal.project;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


 
public class MY_DATA {
    private static String servername ="localhost";
    private static String username ="root";
    private static String dbname ="ums";
    private static Integer portnumber = 3306;
    private static String password ="@Sivanu1998";
    private static Object level;

   
    public static Connection getConnection() throws SQLException
    {
        Connection sql =null;
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try{
        sql =datasource.getConnection();
        } catch(SQLException ex){
            Logger.getLogger(" Get Connection -> " + MY_DATA.class.getName()).log(Level.SEVERE,null,ex);
        
        }
        return sql;
    }
    
    
}
