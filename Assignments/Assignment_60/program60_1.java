//Write a program in Java which accepts a directory name from user and calculate total size of all files from that directory.

import java.util.*;
import java.io.*;

class program60_1
{
    public static void main(String A[])
    {
        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of Directory : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();

            for(int i = 0; i < fArr.length; i++)
            {
                System.out.println(fArr[i].getName()+" length : "+fArr[i].length());
            }
        }

        sobj.close();
    }
}