// program to accept file name and open that file display content on screen

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

class program56_1
{
    public static void main(String A[])throws Exception
    {
        String FileName = null;
        Scanner sobj = new Scanner(System.in);
        FileReader frobj = null;

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File is present");

            char Buffer[] = new char[50];

            frobj = new FileReader(FileName);
            System.out.println("File gets open successfully");

            frobj.read(Buffer,0,10);
            System.out.println("Data from file is : "+new String(Buffer));
        }
        else
        {
            System.out.println("File not exists");
        }

        frobj.close();
        sobj.close();
    }
}