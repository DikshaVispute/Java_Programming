import java.util.*;

/*
    Input : iRow = 4    iCol = 4

    Output :    *   *   *   *
                *   *   *
                *   *
                *
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
//  Date :          26/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        if(i != j)
        {
            System.out.println("Invalid input");
            System.out.println("number of rows and columns should be same");
            return;
        }

        for(i = iRow; i >= 1; i--)
        {
            for( j = 1; i >= j; j++)
            {                         
                System.out.print("*\t");                 
            }

            System.out.println();
        }
    }
}

class program31_2
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