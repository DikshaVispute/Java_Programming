// accept file filename and check whether it is regular file or not

import java.util.*;
import java.io.*;

class program57_2
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        File fobj = null;
        String FileName = null;

        System.out.println("Enter name of the source file : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists() && fobj.getName().endsWith(".txt"))
        {
            System.out.println("File is regular");
        }
        else
        {
            System.out.println("No such file");
        }

        sobj.close();
    }
}