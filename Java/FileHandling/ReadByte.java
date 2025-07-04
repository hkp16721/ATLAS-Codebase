package FileHandling;

import java.io.*;
public class ReadByte
{
    public static void main(String args[])
    {
        FileInputStream infile = null;
        int b;
        try
        {
            infile = new FileInputStream("FileName01.txt");
//            byte Text[] = {'I',' ','L','O','V','E',' ','I','N','D','I', 'A'};
//            infile.write(Text);
//            System.out.println("No connection with file till here");
            while((b = infile.read()) != -1)
            {
//                System.out.println("Error here");
                System.out.print((char)b);
            }
            infile.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("Sorry..!! File Not Found...!!!"+e);
        }
    }
}
