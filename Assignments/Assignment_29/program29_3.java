import java.util.*;

/*
    Input : iRow = 5    iCol = 5

    Output :    a   b   c   d   e
                1   2   3   4   5
                a   b   c   d   e
                1   2   3   4   5
                a   b   c   d   e
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
        int i = 0, j = 0;
        char ch = '\0';

        for(i = 1; i <= iRow; i++)
        {
            for( j = 1, ch = 97; j <= iCol; j++,ch++)
            {
                if((i % 2) == 0)
                {
                    System.out.print(j+"\t");
                }
                else
                {
                    System.out.print(ch+"\t");
                }
            }

            System.out.println();
        }
    }
}

class program29_3
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