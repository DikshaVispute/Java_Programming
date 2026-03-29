// program to accept directory name and display nnames of files from that directory

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

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Folder is present");
            System.out.println("Files from the folder are : ");

            File fArr[] = fobj.listFiles();

            for(int i = 0; i < fArr.length; i++)
            {
                System.out.println(fArr[i].getName());
            }
        }
        else
        {
            System.out.println("Folder is not present");
        }

        sobj.close();
    }
}