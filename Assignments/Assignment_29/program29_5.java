import java.util.*;

/*
    Input : iRow = 4    iCol = 4

    Output :    1   2   3   4
                2   3   4   5
                3   4   5   6
                4   5   6   7
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
//  Date :          25/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, iCnt = 0;

        for(i = 1; i <= iRow; i++)
        {
            iCnt = i;

            for( j = 1; j <= iCol; j++)
            {          
                System.out.print(iCnt+"\t");
                iCnt++;                 
            }

            System.out.println();
        }
    }
}

class program29_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter number the rows : ");
        iValue1 =  sobj.nextInt();

        System.out.println("Enter number the columns : ");
        iValue2 =  sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

    }
}