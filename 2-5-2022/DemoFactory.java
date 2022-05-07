import java.util.*;
abstract class Account{
void getCustInfo(){
System.out.println("Get cust information");
}
abstract void calculateInterest();
}
class Saving extends Account {
void calculateInterest(){
System.out.println("calculate Interest of saving");
}}
class Loan extends Account{
void calculateInterest(){
System.out.println("calculate Interest of Loan");
}}
class AccountFactory{
public static Account getAccount(String type){
Account obj=null;
if (type.equalsIgnoreCase("saving")){
obj=new Saving();
}else{
obj=new Loan();
}
return obj;
}}
public class DemoFactory{
public static void main(String[]args){
Account ob1=AccountFactory.getAccount("Loan");
ob1.calculateInterest();
ob1=AccountFactory.getAccount("saving");
ob1.calculateInterest();
}
}