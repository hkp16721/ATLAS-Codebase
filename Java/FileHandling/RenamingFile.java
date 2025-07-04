package FileHandling;

import java.io.*;
import java.util.Scanner;

public class RenamingFile
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name");
        String filename1 = sc.nextLine();
        System.out.println("Enter new name for the file");
        String filename2 = sc.nextLine();

//
        File f1 = new File(filename1);
        File f2 = new File(filename2);
        f1.renameTo(f2);
        System.out.println("Rename File " +f1+" To "+f2+" Sucessfully "); }
}
