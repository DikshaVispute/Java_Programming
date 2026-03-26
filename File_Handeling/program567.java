import java.io.*;
import java.util.*;

class program567
{
    public static void main(String A[]) throws Exception
    {
        FileReader frobj = null;
        boolean bRet = false;
        File fobj = null;

        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the neame of file");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            frobj = new FileReader(FileName);

            char Buffer[] =  new char[50];

            frobj.read(Buffer,0,10);

            System.out.println("Data from file : "+ new String(Buffer));   
        }


        else
        {
            System.out.println("There is no such file");
        }

        if(frobj != null)
        {
            frobj.close();
        }
        
        sobj.close();
    }
}