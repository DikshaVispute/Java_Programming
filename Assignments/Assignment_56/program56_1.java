// program to accept file name and open that file

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

class program56_1
{
    public static void main(String A[])throws Exception
    {
        String FileName = null;
        boolean  bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File is present");
        }
        else
        {
            System.out.println("File not exists");
            if(bRet = fobj.createNewFile())
            {
                System.out.println("File gets created successfully");
            }
        }

        FileReader frobj = new FileReader(FileName);
        System.out.println("File gets open successfully");

        frobj.close();
    }
}