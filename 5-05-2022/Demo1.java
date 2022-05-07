import java.sql.*;
import java.util.*;

public class Demo1{
public static void main(String args[])throws Exception{

Class.forName("org.postgresql.Driver");
System.out.println("Driver Loaded");

Connection conn;
conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","root");
System.out.println("Connection Done");
System.out.println("Enter a id");
Scanner sc=new Scanner(System.in);
int id = sc.nextInt();
System.out.println("Enter a name");
String name=sc.next();


Statement stmt;
stmt=conn.createStatement();
String sql;
sql="insert into student values ("+id+",'"+name+"')";
stmt.executeUpdate(sql);
System.out.println("record inserted");

conn.close();
}}