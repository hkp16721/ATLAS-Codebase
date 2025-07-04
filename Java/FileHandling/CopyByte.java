package FileHandling;

import java.io.*;
public class CopyByte
{
public static void main(String args[])
{
    try
    {
        byte b=0;
        FileInputStream infile = new FileInputStream("FileName01.txt");
        FileOutputStream outfile = new FileOutputStream("FileName03.txt");

        //Initialize byteread here….
        byte[] byteread = infile.readAllBytes();
        int i =0;
        while(byteread.length!=0)
        {
            if(byteread.length-1>=i) {
                b = byteread[i];
                outfile.write(b);
                i++;
            }else{
                break;
            }
        }
        System.out.println("Byte Copied From in.txt to out.txt FIle ");
    }
    catch(FileNotFoundException e)
    {
        System.out.println("Sorry..!! File Not Found...!!!");
    }
    catch(IOException e)
    {
        System.out.println(e.getMessage());
    }
}
}
