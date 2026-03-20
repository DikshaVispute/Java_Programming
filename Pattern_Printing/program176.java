/*
    Input : 5 
    
    Output : A  B   C   D   E
    Index :  1  2   2   2   2
    ASCII : 65  66  67  68  69
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        //int i = 65;
        char ch = 'A';

        for(iCnt = 1;iCnt <= iNo; iCnt++,ch++)
        {
            System.out.printf("%c\t",ch);
        }

        System.out.println();
    }
}

class program176
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the frequency :");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}