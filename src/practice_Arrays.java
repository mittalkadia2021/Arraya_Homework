import java.util.Arrays;

import java.util.Scanner;

public class practice_Arrays {//Instance method
    //Q-1
    //Java program to test the quality of two arrays

    public void quality_Of_Arrays()
    {

        Scanner s = new Scanner(System.in);
        System.out.println("*******  Ans-1 *******");
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int [] Array1 = new int[length];
        //user able to enter array1 number
        System.out.println("Enter the elements of the array 1:");

        for(int i=0; i<length; i++ ) {//This for loop array1
            Array1[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(Array1));//print array1


//
        int [] Array2 = new int[length];
        System.out.println("Enter the elements of the array 2 :");

        for(int i=0; i<length; i++ ) {//This for loop for array2
            Array2[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(Array2));//print array2

        //int arr1[] = {1, 2, 3};
        //int arr2[] = {1, 2, 3};

        if (Arrays.equals(Array1,Array2)){//check this both array equal

            System.out.println("This Array1 and Array2 are equal");
        }
        else {
            System.out.println("This arr1 and arr2 are not equal");
        }
    }



    //Q-2
//Enter array and sort the values in ascending order
    public static void sort_Value_In_Ascending() {
        //int[] arr = new int[]{3, 9, 6, 1, 7};//initialising array
       // int[]arr={3,6,4,8,2,0};

       //By user enter arrays
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("*******  Ans-2 *******");
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int [] arr = new int[length];
        //user able to enter array1 number
        System.out.println("Enter the elements of the array 1:");

        for(int i=0; i<length; i++ ) {//This for loop array1
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));


//Logic for ascending order
        int temp = 0;

        System.out.println("Elements of original array;");//display elements of original array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        for (int i = 0; i < arr.length; i++) //sort the array in ascending order

        {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    //Q-3
//Enter any String and count the total number of 'a' in that String
    public void count_String_Total_Number() {//instance method
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("//********* Ans- 3   ***********");
        System.out.println("Enter a string value");
        String str = scanner.nextLine();
        System.out.println("Enter '' character value to find");
        char toCheck = scanner.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) //Check all string character
        {
            if (str.charAt(i) == toCheck) //Check with user enter string all character with enter character
            {
                count++;//Store user enter character number
            }
        }
        System.out.println("Total character is " + count);

    }

    //Q-4
    //Printing multiplication table
    public static void multiplication_Table() {
        System.out.println();
        System.out.println("*******  Ans-4 *******");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for multiplication table");
        int num =scanner.nextInt();
        int i = 1;
        do {
            System.out.println(num * i);//multiplication table for 2
            i++;
        } while (i <= 10);
    }

    //Q-5
    //Write java program to find the common elements between two arrays(String value)
    public void common_Elements_Between_Two_Array() {//instance method
        System.out.println( );
        System.out.println("*******  Ans-5 *******");
        String[] array1 = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};//Create array1
        String[] array2 = {"Red", "Blk", "Mon", "Yell", "Sat", "Gre", "Wed"};//Create array2
        System.out.print("Array1 : " + Arrays.toString(array1));//Print array1
        System.out.println();//For space between 2 line
        System.out.print("Array2 : " + Arrays.toString(array2));//Print array2
        System.out.println();//For space between 2 line

        for (int i = 0; i < array1.length; i++)
        {//For array1

            for (int j = 0; j < array2.length; j++)
            {//For array2
                if ( array1[i] == (array2[j]))
                {//Compare array1 and array2

                    //Print common between array1 and array2
                    System.out.println("Common element is :" + (array1[i]));
                }
            }
        }
    }




    public static void main(String[] args) {
        practice_Arrays arrays = new practice_Arrays();//Object create for call to instance method


        //*******  Ans-1 *******
        arrays.quality_Of_Arrays();//Instance method to call

        //*******  Ans-2 *******
        sort_Value_In_Ascending();

        //*******  Ans-3 *******
     arrays.count_String_Total_Number();//instance method to call

        //*******  Ans-4 *******
      multiplication_Table();

        //*******  Ans-5 *******
       arrays.common_Elements_Between_Two_Array();//instance method to call

    }
}
