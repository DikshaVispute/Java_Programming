// write a program in Java which accepts file name and one string from user and append that string at the
// end of file.

import java.util.*;
import java.io.*;

class program61_3
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        String str = null;

        FileOutputStream foobj = null;

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        System.out.println("Enter the string : ");
        str = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isFile())
        {
            foobj = new FileOutputStream(FileName,true);

            byte bstr[] = str.getBytes();
            foobj.write(bstr);

            System.out.println("File appended successfully");
        }

        sobj.close();
        foobj.close();
    }
}