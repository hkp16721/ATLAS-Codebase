// Task 08

class customer{
void  custcalled(){
System.out.println("Customer called");
}
void display(){
System.out.println("Displaying customer called");
}
}
public class CustomerTask08{
public static void main(String[] args){
customer obj=new customer();
obj.custcalled();
obj.display();
}
}
