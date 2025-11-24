import java.util.*;

//  Input : 8
//  Output : 2  4   6   8   10  12  14  16

class Pattern
{
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description :   It is used to print given pattern on screen
//  Input :         Integer
//  Output :        void
//  Auther :        Diksha Kadu Vispute
//  Date :          20/11/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 2; iCnt <= iNo*2; iCnt += 2)
        {
            System.out.print(iCnt+"\t");
        }
    }
}

class program26_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number of elements :\n");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}