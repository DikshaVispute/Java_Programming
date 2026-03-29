// accept directory name and print name of all files in that directory which are regular

import java.util.*;
import java.io.*;

class program58_1
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        File fobj = null;
        String DirName = null;

        System.out.println("Enter name of the directory : ");
        DirName = sobj.nextLine();

        fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                System.out.println(fArr[i].getName() + " is regular file");
                }
            }
        }
        else
        {
            System.out.println("There is no such directory");
        }

        sobj.close();
    }
}