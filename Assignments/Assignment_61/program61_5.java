// Write a program in Java which accepts file name from user and split that file into two separate files (first
// half and second half).


import java.util.*;
import java.io.*;

class program61_5 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String source = sc.nextLine();

        File file = new File(source);

        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        long fileSize = file.length();          // total bytes
        long halfSize = fileSize / 2;           // split point

        try (FileInputStream fis = new FileInputStream(file);
             FileOutputStream fos1 = new FileOutputStream("first_half.txt");
             FileOutputStream fos2 = new FileOutputStream("second_half.txt")) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            long totalRead = 0;

            while ((bytesRead = fis.read(buffer)) != -1) {

                if (totalRead + bytesRead <= halfSize) {
                    // write completely to first file
                    fos1.write(buffer, 0, bytesRead);
                } else {
                    // split buffer between two files
                    int firstPart = (int)(halfSize - totalRead);

                    if (firstPart > 0) {
                        fos1.write(buffer, 0, firstPart);
                    }

                    fos2.write(buffer, firstPart, bytesRead - firstPart);
                }

                totalRead += bytesRead;
            }

            System.out.println("File split successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}