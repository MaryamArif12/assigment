class student{
String name;
int age;
public void getInfo(){
System.out.println("the name of this student is"+this.name);
System.out.println("the age of this student is"+this.age);
}
}
public class demo{
public static void main(String[] args){
student s1=new student();
s1.name= "Nafeesa";
s1.age= 20;
s1.getInfo();
student s2=new student();
s2.name= "Hafsa";
s2.age= 22;
s2.getInfo();
}
}