// accepts a directory name from user and display file name along with its absolute path
import java.util.*;
import java.io.*;

class program59_5
{
    public static void main(String A[])
    {
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
                System.out.println("FileName : "+fArr[i].getName());
                System.out.println("FilePath : "+fArr[i].getAbsolutePath());
            }
        }
        sobj.close();
    }
}