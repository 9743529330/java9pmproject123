package JDBCNEW24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.creating a connection
        String username="root";
        String password="root";
        String url="jdbc:mysql://localhost:3306/eveningbatch";
        Connection con= DriverManager.getConnection(url,username,password);
        //3.creating Statement
        Statement st= con.createStatement();
        //4.Executing Query
        String sql="insert into eveningbatch values(4,'mithlesh yadav',25,'M','Daulatpur')";
        st.executeUpdate(sql);
        System.out.println("query executed");



    }
}
