import java.util.ArrayList;
class Custmor implements Cloneable{
ArrayList<String>custmors;
Custmor(){
custmors=new ArrayList<>();
}
Custmor(ArrayList<String>custmors){
this.custmors=custmors;
}
void loadData(){
custmors.add("A");
custmors.add("B");
custmors.add("C");
custmors.add("D");
custmors.add("E");
custmors.add("F");
}
void showData(){
for (String s:custmors){
System.out.println(s);
}
}
protected Object clone()throws CloneNotSupportedException{
ArrayList<String>temp=new ArrayList<String>();
for (String s:this.custmors){
temp.add(s);
}
return new Custmor(temp);
}}
public class CustPattern{
public static void main (String[]args)throws CloneNotSupportedException{
Custmor st1=new Custmor();
st1.loadData();
Custmor st2=(Custmor )st1.clone();
st1.showData();
st2.showData();
}}
 