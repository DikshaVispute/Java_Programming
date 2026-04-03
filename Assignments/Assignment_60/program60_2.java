//Write a program in Java which accepts a directory name from user and display the name of the largest file (by size).

import java.util.*;
import java.io.*;

class program60_2
{
    public static void main(String A[])
    {
        long Max = 0;
        String MaxFile = null;
        int i = 0;

        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of Directory : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();

            for(i = 0, Max = fArr[i].length(); i < fArr.length; i++)
            {
                if(fArr[i].length() > Max)
                {
                    Max = fArr[i].length();
                    MaxFile = fArr[i].getName();
                }
            }

            System.out.println("File with maximum size is : "+MaxFile);
        }

        sobj.close();
    }
}