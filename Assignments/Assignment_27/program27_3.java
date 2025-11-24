import java.util.*;

/*
    Input : iRow = 3    iCol = 5

    Output :    5   4   3   2   1
                5   4   3   2   1
                5   4   3   2   1
*/

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
  
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = iCol; j >= 1; j--)
            {
                System.out.print(j+"\t");
            }

            System.out.println();

        }
    }
}

class program27_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter number of rows :\n");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns :\n");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);
    }
}