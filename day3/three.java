import java.util.*;
class three{
public static void main(String args[]){
int a,b,c,max,temp;
Scanner sc= new Scanner (System.in);
System.out.println("enter no 1:");
a=sc.nextInt();
System.out.println("enter no 2:");
b=sc.nextInt();
System.out.println("enter no 3:");
c=sc.nextInt();
temp=a>b?a:b;
max=c>temp?c:temp;
System.out.println(" max no: "+max);
}}
