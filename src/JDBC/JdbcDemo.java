package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("query executed");
        // 1.loading a driver
        Class.forName("com.mysql.cj.jdbc.driver");
        //2.creating a connection
        String ursername="root";
        String password="root";
        String url="jdbc:mysql://localhost:3306/morningbatch";
        Connection con= DriverManager.getConnection(url,ursername,password);
        //3.creating a statement
        Statement st=con.createStatement();
        String sql="insert into patients values(13,'mithun','tumer','tagore',142,6,'neora')";
        st.executeUpdate(sql);



    }
}
