import java.io.*;
import java.util.*;

class program563
{
    public static void main(String A[]) throws Exception
    {
        boolean bRet = false;
        File fobj = null;

        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the neame of file");
        FileName = sobj.nextLine();

        FileReader frobj = new FileReader(FileName);

        sobj.close();
        frobj.close();
    }
}