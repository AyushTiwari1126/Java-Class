import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Write a program that creates integer array of 4 elements, accepts values of
        // arrays and then displays the values.
        int arr[] = new int[4];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Write a program that creates integer array of 4 elements, accepts values of
        // arrays and Print the array in reverse
        int a[] = new int[4];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements in reversed order :");
        for (int i = a.length; i > 0; i--) {
            System.out.println(a[i] + " ");
        }

        // // Write a program that creates integer array of 4 elements, accepts values
        // of arrays and Find Sum, Average, Min, Max.
        int myarr[] = new int[4];
        int sum = 0;
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < myarr.length; i++) {
            myarr[i] = sc.nextInt();
        }
        int min = myarr[0];
        int max = myarr[0];
        for (int i = 0; i < myarr.length; i++) {
            if (min > myarr[i]) {
                min = myarr[i];
            }
            if (max < myarr[i]) {
                max = myarr[i];
            }
            sum = sum + myarr[i];
        }
        double average = (double) sum / myarr.length;
        System.out.println("sum : " + sum + ", Average : " + average + ", Min : " +
                min + ", Max : " + max);

        // Write a program that creates integer array of 4 elements, accepts values of
        // arrays and Find second largest.
        int[] l = new int[4];
        int max1 = l[0];
        int max2 = l[0];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < l.length; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < l.length; i++) {
            if (l[i] > max1) {
                max2 = max1;
                max1 = l[i];
            } else if (l[i] > max2) {
                max2 = l[i];
            }
        }
        System.out.println("The second largest element of the array : " + max2);

        // Write a program that creates integer array of 4 elements, accepts values of
        // arrays and Rotating that array by left.
        int[] arr1 = new int[4];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int temp = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            arr1[i - 1] = arr1[i];
        }
        arr1[arr1.length - 1] = temp;
        System.out.println("The rotated array is : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // Write a program that creates integer array of 4 elements, accepts values of
        // arrays and Rotating that array by right.
        int arr2[] = new int[4];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int tem = arr2[arr2.length - 1];
        for (int i = (arr2.length - 1); i > 0; i--) {
            arr2[i] = arr2[i - 1];
        }
        arr2[0] = tem;
        System.out.println("The result array is : ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // Write a program that creates integer array of 10 elements, accepts values of
        // arrays and Inserting an element at the certain position.
        System.out.print("Put index at which inserting the element : ");
        int index = sc.nextInt();
        System.out.print("Enter the element : ");
        int x = sc.nextInt();
        int n = 6;
        int ar[] = new int[10];
        ar[0] = 5;
        ar[1] = 9;
        ar[2] = 6;
        ar[3] = 10;
        ar[4] = 12;
        ar[5] = 7;
        System.out.println("The array is :");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println();
        for (int i = n; i > index; i--) {
            ar[i] = ar[i - 1];
        }
        ar[index] = x;
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println();

        // Write a program that creates integer array of 10 elements, accepts values of
        // arrays and Deleting an element at the certain position.
        System.out.print("Put index at which the element is deleting : ");
        int Index = sc.nextInt();
        int[] myA = new int[10];
        myA[0] = 5;
        myA[1] = 9;
        myA[2] = 6;
        myA[3] = 10;
        myA[4] = 12;
        myA[5] = 7;
        System.out.println("The array is :");
        for (int i = 0; i < myA.length; i++) {
            System.out.print(myA[i] + ", ");
        }
        System.out.println();
        int t = myA[Index];
        System.out.println();
        for (int i = (Index + 1); i < myA.length; i++) {
            myA[i - 1] = myA[i];
        }
        System.out.println("The resulted array is :");
        for (int i = 0; i < myA.length; i++) {
            System.out.print(myA[i] + ", ");
        }
        System.out.println();

        // Write a program that creates integer array of 10 elements, accepts values of
        // arrays and Copying that array to the different array.
        int[] X = { 8, 6, 14, 2, 3, 7, 1, 9, 10, 5 };
        int[] Y = new int[10];
        for (int i = 0; i < X.length; i++) {
            Y[i] = X[i];
        }
        for (int i = 0; i < Y.length; i++) {
            System.out.print(Y[i] + ", ");
        }

        // Write a program that creates integer array of elements, accepts values of
        // arrays and Increase the size of that array.
        int[] M = { 8, 6, 10, 4, 2 };
        System.out.println("The size of array M : " + M.length);
        int[] N = new int[2 * M.length];
        for (int i = 0; i < M.length; i++) {
            N[i] = M[i];
        }
        M = N;
        N = null;
        System.out.println("The size of array M : " + M.length);

    }
}
