package JDBCNEW24;

import java.sql.*;

public class DdlJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.Creating a connection
        String username="root";
        String password="root";
        String url="jdbc:mysql://localhost:3306/eveningbatch";
        Connection con= DriverManager.getConnection(url,username,password);
        //3.creating statement
        Statement st= con.createStatement();
        //4.Executing Query
        String sql="select * from eveningbatch";
       ResultSet rs= st.executeQuery(sql);
       while (rs.next())
       {
           System.out.print(rs.getInt("rno")+"\t");
           System.out.print(rs.getString("name")+ "\t");
           System.out.print(rs.getInt("age")+ "\t");
           System.out.print(rs.getString("sex")+ "\t");
           System.out.println(rs.getString("birth")+ "\t");

       }

    }
}
