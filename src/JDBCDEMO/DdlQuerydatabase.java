package JDBCDEMO;

import java.sql.*;

public class DdlQuerydatabase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.print("query executed");
        // loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //creating connection
        String username="root";
        String password="root";
        String url="jdbc:mysql://localhost:3306/college1";
        Connection con= DriverManager.getConnection(url,username,password);
        //3.creating a statement
        Statement st=con.createStatement();

        //Executing a Query(ddl)
        String sql="select * from student";
        ResultSet rs=st.executeQuery(sql);
        while (rs.next())
        {
           System.out.println(rs.getInt("rno"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("branch"));
            System.out.println(rs.getInt("marks"));
        }
    }
}
