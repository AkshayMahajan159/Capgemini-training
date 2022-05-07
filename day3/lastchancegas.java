import java.util.*;
class lastchancegas{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int tank,gage,mgallon;
int gasleft=0;
int milesleft=0;
System.out.println("tank capacity");
tank=sc.nextInt();
System.out.println("gage reading");
gage=sc.nextInt();
System.out.println("miles");
mgallon=sc.nextInt();
gasleft=(tank*gage)/100;
milesleft=gasleft*mgallon;
if  (milesleft<200){
System.out.println("get gas");
}else{
System.out.println(" safe procced");
}}}