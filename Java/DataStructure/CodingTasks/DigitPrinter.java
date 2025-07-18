package DataStructure.CodingTasks;
import java.util.Scanner;
public class DigitPrinter {
    public static void digintPrinter(String num){
        char[] ch = num.toCharArray();
        System.out.printf("Number of digit is %d",ch.length);
        System.out.println();
        for(int i = ch.length-1; i>=0;i--) System.out.println(ch[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 digit number");
        String num = sc.nextLine();
        if(num.length()!=5) System.out.println("Provided number is of "+num.length()+" digit and is not a 5 digit one");
        else digintPrinter(num);
    }
}
