// accept two file name open one file nad create new file and write data from first file to second file

import java.util.*;
import java.io.*;

class program57_1
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        File SrcObj = null;
        File DestObj = null;

        byte Buffer[] = new byte[1024];
        int iRet = 0;

        String SourseFile = null;
        String DestFile = null;

        System.out.println("Enter name of the source file : ");
        SourseFile = sobj.nextLine();

        System.out.println("Enter name of the Destination file : ");
        DestFile = sobj.nextLine();

        SrcObj = new File(SourseFile);

        if(SrcObj.exists())
        {
            DestObj = new File(DestFile);
            DestObj.createNewFile();

            FileInputStream fiobj = new FileInputStream(SrcObj);
            FileOutputStream foobj = new FileOutputStream(DestObj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            System.out.println("File gets copied successfully");

            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("No such file");
        }

        sobj.close();
    }
}