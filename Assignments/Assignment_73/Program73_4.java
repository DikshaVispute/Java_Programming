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

    public Boolean ChkIdentity()
    {
        int i = 0, j = 0;
        
        if(iRow != iCol)
        {
            return false;
        }

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    if(Arr[i][j] != 1)
                    {
                        return false;
                    }
                }
                else
                {
                    if(Arr[i][j] != 0)
                    {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}

class Program73_4
{
    public static void main(String A[])
    {
        ArrayX aobj = new ArrayX(4,4,1);

        aobj.Accept();
        aobj.Display();

        boolean Ret = aobj.ChkIdentity();
        if(Ret == true)
        {
            System.out.println("It is an identity matrix");
        }
        else
        {
            System.out.println("It is not an identity matrix");
        }
    }
}