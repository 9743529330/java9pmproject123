package JDBCDEMO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("query executed");
        // 1.loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.creating a connection
        String ursername="root";
        String password="root";
        String url="jdbc:mysql://localhost:3306/newstudent";
        Connection con= DriverManager.getConnection(url,ursername,password);
        //3.creating a statement
        Statement st=con.createStatement();
        //String sql="insert into patients values(14,'mithun','tumer','tagore',142,6,'neora');";
        String sql="insert into newstudent values(18,'radha','third','b','poon',89);";
        st.executeUpdate(sql);
    }
}
