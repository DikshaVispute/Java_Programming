import java.util.*;

//  Input : 5
//  Output : 5  #   4   #   3   #   2   #   1   # 

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
        for(iCnt = iNo;iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt+"\t#\t");
        }
    }
}

class program26_2
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