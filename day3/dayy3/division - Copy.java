import java.util.*;
class division{
public static void main(String args[]){
int a;
Scanner sc= new Scanner (System.in);
System.out.println("enter no :");
a=sc.nextInt();
if ((a % 5==0) && (a % 11==0))  ;
{System.out.println("given no" +a+ "is divisble by 5 and 11");
}
else 
{
System.out.println("given no" +a+  " is not divisible by 5 and 11");
}
}
}