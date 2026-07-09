// 1.Write a program which accept matrix from user and return addition of diagonal
// elements.
// Input:
// 3 2 5 9
// 4 3 2 2
// 8 4 1 5
// 3 9 7 5
// Output: 12

import java.util.Scanner;

class ArrayX
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public ArrayX(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;

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

    public int AddDiagonal()
    {
        int Sum = 0;
        int i = 0, j = 0;

        System.out.println("Elements of matrix are : ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    Sum = Sum + Arr[i][j];
                }
            }
        }

        return Sum;
    }
}

class Program72_1
{
    public static void main(String A[])
    {
        ArrayX aobj = new ArrayX(4,4);

        aobj.Accept();
        aobj.Display();

        System.out.println("Addition of diagonal elements of the matrix is : "+aobj.AddDiagonal());
    }
}