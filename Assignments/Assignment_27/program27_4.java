import java.util.*;

/*
    Input : iRow = 3    iCol = 4

    Output :    *   #   *   #
                *   #   *   #
                *   #   *   #
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
            for(j = 1; j <= iCol; j++)
            {
                if((j % 2) == 0)
                {
                    System.out.print("#\t");
                }
                else if((j % 2) != 0)
                {
                    System.out.print("*\t");
                }
            }

            System.out.println();

        }
    }
}

class program27_4
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