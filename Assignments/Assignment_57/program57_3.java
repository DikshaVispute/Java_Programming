// accept directory name and create that directory

import java.util.*;
import java.io.*;

class program57_3
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        File fobj = null;
        String DirName = null;

        System.out.println("Enter name of the directory : ");
        DirName = sobj.nextLine();

        fobj = new File(DirName);

        if(fobj.exists())
        {
            System.out.println("Directory already exists");
        }
        else
        {
            if(fobj.mkdir())
            {
                System.out.println("Directory created successfully");
            }
            else
            {
                System.out.println("Unable to create directory");
            }
        }

        sobj.close();
    }
}