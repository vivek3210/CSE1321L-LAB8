import java.util.Scanner;
public class Lab8B {
    public static void main(String[] args) {
        int rowNum;
        int colNum;
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        rowNum = input.nextInt();
        System.out.print("Please enter the number of columns: ");
        colNum = input.nextInt();

        System.out.println("I have " + rowNum + " rows and " + colNum + " columns. I need to fill-up " +
                (rowNum * colNum) + " spaces." );
        System.out.println("The " + rowNum + "x" + colNum + " array: \n");

        int[][] myArray = new int[rowNum][colNum];

        for(int i = 0; i < myArray.length; i++)
        {
            for(int j = 0; j < myArray[i].length; j++)
            {
                myArray[i][j] = num++ + 1;
            }
        }

        for(int i = 0; i < myArray.length; i++)
        {
            for(int j = 0; j < myArray[i].length; j++)
            {
                System.out.print(myArray[i][j] + "|");
            }
            System.out.println();
        }
    }
}
