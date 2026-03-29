// accept directory name and print name and size of files in that directory

import java.util.*;
import java.io.*;

class program57_5
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
                System.out.println("Name of file is : "+fArr[i].getName()+" size is : "+fArr[i].length());
            }
        }
        else
        {
            System.out.println("There is no such directory");
        }

        sobj.close();
    }
}