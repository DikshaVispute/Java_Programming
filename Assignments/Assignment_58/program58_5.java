// accept directory name and write data of all files along with its name and size into new file marvellous.txt

import java.util.*;
import java.io.*;

class program58_5
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;

        int i = 0,j = 0, iRet = 0;
        byte Buffer[] = new byte[1024];

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        String Header = null;
        byte bHeader[] = new byte[100];

        String DirName = null;
        String PackName = null;

        System.out.println("Enter name of the directory : ");
        DirName = sobj.nextLine();

        System.out.println("Enter name of the packed file : ");
        PackName = sobj.nextLine();

        fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File packobj = new File(PackName);
            packobj.createNewFile();

            File fArr[] = fobj.listFiles();
            foobj = new FileOutputStream(packobj);

            System.out.println("Number of files in a folder : "+fArr.length);

            for(i = 0; i < fArr.length; i++)
            { 
                fiobj = new FileInputStream(fArr[i]);

                if(fArr[i].getName().endsWith(".txt"))
                {
                    Header = fArr[i].getName() + " " + fArr[i].length();

                    for(j = Header.length(); j < 100; j++)
                    {
                        Header = Header + " ";
                    }

                    bHeader = Header.getBytes();
                    foobj.write(bHeader,0,100);

                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer,0,iRet);
                    }
                }
            }

            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no such directory");
        }

        sobj.close();
    }
}