import java.io.*;
import java.util.*;

class program577
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        boolean bRet = false;

        File fobjsrc = null;
        File fobjdest = null;

        byte Buffer[] = new byte[1024];

        String FileNameSrc = null;
        String FileNamedest = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of source file : ");
        FileNameSrc = sobj.nextLine();

        System.out.println("Enter the name of destination file : ");
        FileNamedest = sobj.nextLine();

        fobjsrc = new File(FileNameSrc);

        if(fobjsrc.exists())
        {
            fobjdest = new File(FileNamedest);
            
            fobjdest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                //System.out.print(new String(str));
                foobj.write(Buffer,0,iRet);
            }

            System.out.println("File copy successsfully");
            fiobj.close();
            foobj.close();
        }

        else
        {
            System.out.println("There is no source file");
        }
        
        sobj.close();
    }
}