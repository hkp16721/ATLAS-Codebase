import java.util.Scanner;

import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int[] arrRev = new int[arr.length];
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        char[] nam = name.toCharArray();
        int n =nam.length;

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            arrRev[i] = arr[j];
        }
        for(int num : arrRev){
            System.out.print(num + " ");
        }
        for(int i=0; i<n/2; i++){
            char temp = nam[n-i-1];
            nam[n-i-1]=nam[i];
            nam[i]=temp;
        }
        System.out.println("\nReverse of "+name);
        for(char ch:nam){
            System.out.print(ch);
        }
    }
}
