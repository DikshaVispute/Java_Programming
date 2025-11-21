import java.util.*;

class Digit
{
    public int SumDigit(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo !=0)
        {

            iDigit = iNo %10;
            iSum = iSum + iDigit;
            System.out.println(iDigit);
            iNo = iNo/10;
        }

        return iSum;

    }
}

class program91
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number :");
        iValue = sobj.nextInt();

        Digit dobj = new Digit();
        iRet = dobj.SumDigit(iValue);

        System.out.println("addition of digits :"+iRet);

        //imp for interview
        sobj = null;     
        dobj = null;

        System.gc();     
    }
}