import java.util.Scanner;

public class Task12Whileing {
    public static void main(String[] args){
        String myUsername="Hemant";
        String myPassword="12345";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name");
        String login = sc.nextLine();
        System.out.println("Enter password");
        String pass = sc.nextLine();

//        while (true){
//            if(myUsername.equals(login) && myPassword.equals(pass)) {
//                System.out.println("login successful");
//                break;
//            }
//            else{
//                System.out.println("Wrong id or password, try again");
//                System.out.println("Enter the user name");
//                login = sc.nextLine();
//                System.out.println("Enter password");
//                pass = sc.nextLine();
//            }
//            }

        do{
            if(myUsername.equals(login) && myPassword.equals(pass)) {
                System.out.println("login successful");
                break;
            }
            else {
                System.out.println("Wrong id or password, try again");
                System.out.println("Enter the user name");
                login = sc.nextLine();
                System.out.println("Enter password");
                pass = sc.nextLine();
            }
        }
        while(true);
        }
    }

