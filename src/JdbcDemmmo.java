import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemmmo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1.loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.Creating a connection
        String username="root";
        String password="root";
        String url="jdbc:mysql://localhost:3306/eveningbatch";
        Connection con= DriverManager.getConnection(url,username,password);
        // 3.Creating statement
        Statement st=con.createStatement();
        //4.Executing Query
        String sql="insert into student2 values(6,'prakash','python',75);";
        st.executeUpdate(sql);
        System.out.println("query executed");




    }
}
