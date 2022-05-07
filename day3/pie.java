import java.util.*;
class pie{
public static void main(String[]args){
Scanner console=new Scanner(System.in);


System.out.println("enter a wieght");
String temp=console.next();
int weight=Integer.parselnt(temp);
if  (weight>=30 && weight<=250)
{

System.out.println("you are allowed in contest");
}else{

System.out.println("you are not allowed in contest");
}}}