// program to accept file name and create that file if not exist

import java.io.*;
import java.util.Scanner;

class program56_1
{
    public static void main(String A[])throws Exception
    {
        File fobj = null;

        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of the file : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File already exists");
        }
        else
        {
            if(fobj.createNewFile())
            {
                System.out.println("File gets created Successfully");
            }
        }

        sobj.close();
    }
}