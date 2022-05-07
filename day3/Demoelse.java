import java.util.*;
class Demoelse{
public static void main(String args[]){
Scanner sc= new Scanner (System.in);
String name;
int age;
System.out.println("enter name and age :");
name=sc.next();
age=sc.nextInt();
if (age>=18)
{System.out.println("vote ");
}
else{System.out.println("no");
System.out.println("not char");
}
}
}