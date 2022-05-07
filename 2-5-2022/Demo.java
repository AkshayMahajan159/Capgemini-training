import java.util.Scanner;
class Demo{
public static void main (String args[]){
String name;
int age;
Scanner sc=new Scanner (System.in);
System.out.println("Enter name and age:");
name=sc.next();
age=sc.nextInt();
if (age>=18)
{System.out.println("vote");
}else
System.out.println("no");
}}
