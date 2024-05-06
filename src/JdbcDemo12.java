import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo12 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("query executed");
        //Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.creating a connection
        String Username="root";
        String Password="root";
        String url="jdbc:mysql://localhost:3306/morningbatch";
        Connection con= DriverManager.getConnection(url,Username,Password);
        //3.Creating a statement
        Statement st=con.createStatement();
        String sql="insert into patients values(16,'madhuri1','upsc1','hom',401,8,'digha')";
        st.executeUpdate(sql);

    }
}
