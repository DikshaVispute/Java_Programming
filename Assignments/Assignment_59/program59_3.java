// accepts a directory name from user and display only sub-directories from that directory

import java.util.*;
import java.io.*;

class program59_3
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
                if(fArr[i].isDirectory())
                {
                    System.out.println(fArr[i].getName());
                }
            }
        }

        sobj.close();
    }
}