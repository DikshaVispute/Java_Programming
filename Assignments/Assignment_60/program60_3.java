//Write a program in Java which accepts a directory name from user and display the name of the smallest file (by size).

import java.util.*;
import java.io.*;

class program60_3
{
    public static void main(String A[])
    {
        long Min = 0;
        String MinFile = null;
        int i = 0;

        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of Directory : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();

            for(i = 0, Min = fArr[i].length(); i < fArr.length; i++)
            {
                if(fArr[i].length() < Min)
                {
                    Min = fArr[i].length();
                    MinFile = fArr[i].getName();
                }
            }

            System.out.println("File with minimum size is : "+MinFile);
        }

        sobj.close();
    }
}