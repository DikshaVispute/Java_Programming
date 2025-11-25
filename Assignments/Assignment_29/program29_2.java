import java.util.*;

/*
    Input : iRow = 4    iCol = 5

    Output :    2   4   6   8   10
                1   3   5   7   9
                2   4   6   8   10
                1   3   5   7   9
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
        int i = 0, j1 = 0, j2 = 0;

        for(i = 1; i <= iRow; i++)
        {
            for( j1 = 1, j2 = 2; j1 <= iCol*2; j1+=2, j2+=2)
            {
                if((i % 2) == 0)
                {
                    System.out.print(j1+"\t");
                }
                else
                {
                    System.out.print(j2+"\t");
                }
            }

            System.out.println();
        }
    }
}

class program29_2
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