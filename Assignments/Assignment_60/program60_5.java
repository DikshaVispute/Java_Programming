// Write a programn in Java which accepts a path from user and display whether it exists or not. If it exists, display
//whether it is a file or directory.

import java.io.File;
import java.util.Scanner;


class program60_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String path = null;

        System.out.println("Enter the path : ");
        path = sobj.nextLine();

        File fobj = new File(path);

        if(fobj.exists())
        {
            System.out.println("Path exixt");

            if(fobj.isDirectory())
            {
                System.out.println("It is a directory");
            }
            else if(fobj.isFile())
            {
                System.out.println("It is a file");
            }
        }

        sobj.close();
    }
}