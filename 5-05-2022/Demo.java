import java.sql.*;
public class Demo{
public static void main(String args[])throws Exception{

Class.forName("org.postgresql.Driver");
System.out.println("Driver Loaded");

Connection conn;
conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","root");
System.out.println("Connection Done");

Statement stmt;
stmt=conn.createStatement();
String sql;
sql="insert into student values (500,'testing')";
stmt.executeUpdate(sql);
System.out.println("record inserted");
 
conn.close();
}}
