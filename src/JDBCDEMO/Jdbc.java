package JDBCDEMO;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("query executed");
        //1.loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.creating a connection
        String ursername="root";
        String password="root";
        String url="jdbc:mysql://localhost:3306/morningbatch";
        Connection con= DriverManager.getConnection(url,ursername,password);

        //creating a statement
        Statement st=con.createStatement();

        //4.executing query(dml)
       // String sql="update student set name='swetty' where branch='mc';";
        String sql="insert into patients values(14,'saroj2','penis2','nisha2',416,5,'digha2');";
        st.executeUpdate(sql);


    }
}
