package in.assingment7;
import java.util.*;

public class Program {    
    private static Scanner sc = new Scanner(System.in);

    public static void acceptRecord(int[] arr) {
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int[] mergeArrys(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            mergedArray[k++] = arr1[i++];
            mergedArray[k++] = arr2[j++];
        }
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        System.out.println("Enter size of the first array:");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("Enter elements for the first array:");
        acceptRecord(arr1);

        System.out.println("Enter size of the second array:");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Enter elements for the second array:");
        acceptRecord(arr2);

        int[] mergedArray = mergeArrys(arr1, arr2);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
