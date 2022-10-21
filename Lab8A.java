import java.util.Scanner;
public class Lab8A {
    public static void main(String[] args) {
        int num;
        int[] arr1;
        int[] arr2;
        arr1 = new int [5];
        arr2 = new int [5];
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 5 integers for the first array:");
        for(int i = 1;i <= 5; i++)
        {
            System.out.print("Integer " + i +": ");
            num = input.nextInt();
            arr1 [i-1] = num;
        }

        System.out.println("Please enter 5 integers for the second array:");
        for(int a = 1;a <= 5; a++)
        {
            System.out.print("Integer " + a +": ");
            num = input.nextInt();
            arr2 [a-1] = num;
        }

        System.out.println("The resulting sums are " + (arr1[0] + arr2[0]) + "|" + (arr1[1] + arr2[1]) + "|" + (arr1[2]
                + arr2[2]) + "|" + (arr1[3] + arr2[3]) + "|" + (arr1[4] + arr2[4]) + "|");

    }
}
