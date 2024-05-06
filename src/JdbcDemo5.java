import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Creating a connection
        String username="root";
        String password="root";
        String url="jdbc:mysql://localhost:3306/morningbatch";
        Connection con= DriverManager.getConnection(url,username,password);

        //creating statement
        Statement st=con.createStatement();
        //exequiting Query
        String sql="delete from patients where name='roma'";
        st.executeUpdate(sql);
        System.out.println("Query executed");
        }
}
