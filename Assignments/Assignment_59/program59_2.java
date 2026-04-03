// accepts a directory name from user and display only regular files (ignore directories).

import java.util.*;
import java.io.*;

class program59_2
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

            System.out.println("Directory includes : ");

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].getName().endsWith(".txt"))
                //if(fArr[i].isFile())
                {
                    System.out.println(fArr[i].getName());
                }
            }
        }

        sobj.close();
    }
}