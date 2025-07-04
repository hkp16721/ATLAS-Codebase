package Stream;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter the string you want to get reversed");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
//        char[] ch = s1.toCharArray();
        for(int i=s1.length()-1;i>=0;i--) {
            System.out.print(s1.charAt(i));
        }


    }
}
