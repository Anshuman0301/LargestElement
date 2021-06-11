package JavaCodes;

import java.util.Scanner;

public class LargestElement
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:-");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Array elements are:- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                
            }
        }
        System.out.println();
        System.out.println("Largest element is " + largest);
    }
}
