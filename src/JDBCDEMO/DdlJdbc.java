package JDBCDEMO;

import java.sql.*;

public class DdlJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.creating a connection
        String username="root";
        String password="root";
        String url="jdbc:mysql://localhost:3306/newstudent";
        Connection con= DriverManager.getConnection(url,username,password);
        //3.creating statement
        Statement st=con.createStatement();
        //4.execute query
        String sql="select * from newstudent";
        ResultSet rs=st.executeQuery(sql);
        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+ "\t");
            System.out.print(rs.getString("name")+ "\t");
            System.out.print(rs.getString("name")+ "\t");
            System.out.print(rs.getString("section")+ "\t");
            System.out.print(rs.getString("address")+ "\t");
            System.out.println(rs.getInt("mob"));
        }
    }
}
