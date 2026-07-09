// write a program which accept matrix and check whether the matrix is
// identity matrix or not.
// Identity matrix is a square matrix with 1's along the diagonal from upper left to
// lower right and 0's in all other positions.
// If it satisfies the structure as explained before then the matrix is called as
// identity matrix.
// Input:
// 1 0 0 0
// 0 1 0 0
// 0 0 1 0
// 0 0 0 1
// Output: True

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

    public Boolean ChkSparse()
    {
        int i = 0, j = 0;
        int Cnt1 = 0, Cnt2 = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    Cnt1++;
                }
                else
                {
                    Cnt2++;
                }
            }
        }

        if(Cnt1 > Cnt2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program73_5
{
    public static void main(String A[])
    {
        ArrayX aobj = new ArrayX(4,4,1);

        aobj.Accept();
        aobj.Display();

        boolean Ret = aobj.ChkSparse();
        if(Ret == true)
        {
            System.out.println("It is Sparse matrix");
        }
        else
        {
            System.out.println("It is not sparse matrix");
        }
    }
}