import java.util.Scanner;

public class Userinput{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);

System.out.println("Enter user name");
String username = scanner.nextLine();

System.out.println("Enter password");
String password = scanner.nextLine();

System.out.println("Your user name is "+username+"\nPassword is "+password);
}
}
