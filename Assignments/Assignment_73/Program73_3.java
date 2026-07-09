// Write a program which accept matrix and reverse the contents of each column.
// Input:
// 3 2 5 9
// 4 3 2 2
// 8 4 1 5
// 3 9 7 5
// Output: 
// 3 9 7 5
// 8 4 1 9
// 4 3 2 2
// 3 2 5 9

import java.util.Scanner;

class ArrayX
{
    public int iRow;
    public int iCol;
    public int Arr[][];
    public int Num;

    public ArrayX(int a, int b, int c)
    {
        this.iRow = a;
        this.iCol = b;
        this.Num = c;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        int i = 0, j = 0;

        System.out.println("Enter the element of matrix : ");
        Scanner sobj = new Scanner(System.in);

        for(i = 0; i < iRow; i++)
        {
            System.out.println("Enter the elements of row "+(i+1));

            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }

            System.out.println();
        }
    }

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Elements of matrix are : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }

            System.out.println();
        }
    }

    public void ReverseColumn()
    {
        int Temp = 0;
        int i = 0, j = 0;

        for(j = 0; j < iCol; j++)
        {
            for(i = 0; i < iRow/2; i++)
            {
                Temp = Arr[i][j];
                Arr[i][j] = Arr[iRow - 1 - i][j];
                Arr[iRow - 1 - i][j] = Temp;
            }
        }
    }
}

class Program73_3
{
    public static void main(String A[])
    {
        ArrayX aobj = new ArrayX(4,4,1);

        aobj.Accept();
        aobj.Display();

        aobj.ReverseColumn();
        System.out.println("Matrix after reversing columns : ");
        aobj.Display();
    }
}