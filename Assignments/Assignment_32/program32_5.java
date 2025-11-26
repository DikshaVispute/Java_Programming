import java.util.*;

import javax.swing.Icon;

/*
    Input : iRow = 5    iCol = 5

    Output :    1   2   3   4   5
                1   2           5
                1       3       5
                1           4   5
                1   2   3   4   5
               
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

        for(i = 1; i <= iRow; i++)
        {
            for( j = 1; j <= iCol; j++)
            {     
                if((i == j) || (i == 1) || (i == iRow) || (j == 1) || (j == iCol))  
                {
                    System.out.print(j+"\t");  
                }
                else
                {
                    System.out.print(" \t");  
                }        
            }

            System.out.println();
        }
    }
}

class program32_5
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