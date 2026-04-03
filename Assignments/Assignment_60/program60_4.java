// Write a program in Java which accepts a directory name and file extension from user and display only files having that extension.

import java.util.*;
import java.io.*;

class program60_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        String Extension = null;

        System.out.println("Enter name of Directory : ");
        FileName = sobj.nextLine();

        System.out.println("Enter name of file extension : ");
        Extension = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].getName().endsWith(Extension))
                {
                    System.out.println(fArr[i].getName());
                }
            }
        }

        sobj.close();
    }
}