// accept file name from user and calculate checksum of that file

import java.util.*;
import java.io.*;

class program57_4
{
    public static void main(String A[])throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        FileInputStream fiobj = null;
        String FileName = null;

        System.out.println("Enter name of the file : ");
        FileName = sobj.nextLine();

        fiobj = new FileInputStream(FileName);

        int i = 0;
        int CheckSum = 0;
        
        while((i = fiobj.read()) != -1)
        {
            CheckSum = CheckSum + i;
        }

        System.out.println("Checksum is : "+ CheckSum);

        sobj.close();
    }
}