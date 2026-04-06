// write a program in Java which accepts two input file names and one output file name and merge both files
// into the output file.

import java.util.*;
import java.io.*;

class program61_4
{
    public static void main(String A[])throws Exception
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        String SourceFile1 = null;
        String SourceFile2 = null;
        String DestFile = null;

        byte Bufffer[] = new byte[1024];

        FileInputStream fiobj1 = null;
        FileInputStream fiobj2 = null;
        FileOutputStream foobj = null;

        System.out.println("Enter the name of first source file : ");
        SourceFile1 = sobj.nextLine();

        System.out.println("Enter the name of second source file : ");
        SourceFile2 = sobj.nextLine();

        System.out.println("Enter the name of destination file : ");
        DestFile = sobj.nextLine();

        File SourceObj1 = new File(SourceFile1);
        File SourceObj2 = new File(SourceFile2);

        if((SourceObj1.exists() && SourceObj1.isFile())&& (SourceObj2.exists() && SourceObj2.isFile()))
        {
            File DestObj = new File(DestFile);
            DestObj.createNewFile();

            fiobj1 = new FileInputStream(SourceFile1);
            fiobj2 = new FileInputStream(SourceFile2);
            foobj = new FileOutputStream(DestFile,true);

            while((iRet = fiobj1.read(Bufffer)) != -1)
            {
                foobj.write(Bufffer,0,iRet);
            }

            while((iRet = fiobj2.read(Bufffer)) != -1)
            {
                foobj.write(Bufffer,0,iRet);
            }

            System.out.println("File merged successfully");
        }

        sobj.close();
        foobj.close();
        fiobj1.close();
        fiobj2.close();
    }
}