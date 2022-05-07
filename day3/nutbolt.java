import java.util.*;
class nutbolt{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int bolt,nut,washers;
double cost;
System.out.println("no.of bolts want");
bolt=sc.nextInt();
System.out.println("no.of nuts want");
nut=sc.nextInt();
System.out.println("no.of washers want");
washers=sc.nextInt();
if  (bolt>nut){
System.out.println("order");
System.out.println("total amount not calculated");
}else{
cost=(bolt* .05)+(nut*.03)+(washers*.01);
System.out.println(" order ok");
System.out.println("total cost is : " +cost);
}}}