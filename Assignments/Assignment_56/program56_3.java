// program to accept file name and open that file and write some data at the end of that file

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class program56_1
{
    public static void main(String A[])throws Exception
    {
        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        FileWriter fwobj = null;
        File fobj = null;

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File is present");

            fwobj = new FileWriter(FileName,true);
            fwobj.write("Jay Ganesh...");
        }
        else
        {
            System.out.println("File not exists");
        }

        if(fwobj != null)
        {
            fwobj.close();
        }
        sobj.close();
    }
}