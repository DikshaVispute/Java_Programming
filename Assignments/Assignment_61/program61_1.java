// Write a program in Java which accepts source file name and destination file name from user and copy data
//from source to destination (byte by byte).

import java.util.*;
import java.io.*;

class program61_1
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String SourceFile = null;
        String DestFile = null;

        int data = 0;

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        System.out.println("Enter the name of source file : ");
        SourceFile = sobj.nextLine();

        System.out.println("Enter the name of destination file : ");
        DestFile = sobj.nextLine();

        File SourceObj = new File(SourceFile);

        if(SourceObj.exists() && SourceObj.isFile())
        {
            File DestObj = new File(DestFile);
            DestObj.createNewFile();

            fiobj = new FileInputStream(SourceFile);
            foobj = new FileOutputStream(DestFile);

            while((data = fiobj.read()) != -1)
            {
                foobj.write(data);
            }

            System.out.println("File copied successfully");
        }

        sobj.close();
        foobj.close();
        fiobj.close();
    }
}