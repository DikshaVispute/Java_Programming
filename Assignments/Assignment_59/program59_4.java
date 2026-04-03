// accepts a directory name from user and display count of total files and total folders

import java.util.*;
import java.io.*;

class program59_4
{
    public static void main(String A[])
    {
        int iCntFile = 0, iCntDir = 0;

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
                    iCntDir++;
                }
                else if(fArr[i].isFile())
                {
                    iCntFile++;
                }
            }

            System.out.println("Number of directories in the  folder are : "+iCntDir);
            System.out.println("Number of files in the  folder are : "+iCntFile);
        }

        sobj.close();
    }
}