package arrayPractice;

import java.util.Arrays;
import java.util.Iterator;

public class arrayPracticeBasic {
    public static void main(String[] args) {

        int[] naTest1 = {17, 4, 12, 11, 3, 14, 7};
        System.out.println("Sorted Descending");
        sortDescending(naTest1);
        System.out.println(Arrays.toString(naTest1));

        // Test 1
        System.out.println("Test 1");
        System.out.println(arrayMedium(naTest1));

        // Test 2
        System.out.println("Test 2");
        int[] oddArray = getOddValues(naTest1);
        System.out.println(Arrays.toString(oddArray));

        // Test 3
        System.out.println("Test 3");
        int[] joinedArray = joinArray(naTest1, oddArray);
        System.out.println(Arrays.toString(joinedArray));

        // Test 4
        System.out.println("Test 4");
        int[] naOne = {3, 19, 22, 14, 7, 8, 9};
        int[] naTwo = {12, 7, 2, 8, 4};
        int[] resultantArray = arrayDiff(naOne, naTwo);
        System.out.println(Arrays.toString(resultantArray));

        // Test 5
        System.out.println("Test 5");
        int[][] naOne1 = {{5, 5, 5, 5}, {5, 5, 5}};
        int[][] naOne2 = {{3, 3, 3, 3}, {3, 3, 3}};

        int[][] substractArray = subtractMatrices(naOne1, naOne2);
        for (int[] ints : substractArray) {
            System.out.println(Arrays.toString(ints));
        }

        // Test 6
        System.out.println("Test 6");
        int primepally[] = pallPrimeInt();
        System.out.println(Arrays.toString(primepally));

        // Test 7
        System.out.println("Test 7");
        int rowSum[] = sumArrayRows(naOne2);
        System.out.println(Arrays.toString(rowSum));

        // Test 8
        System.out.println("Test 8");
        char[][] sample = {
                {'A', 'B', 'C', 'A', 'C'},
                {'F', 'G', 'A', 'A', 'H'},
                {'I', 'J', 'A', 'A', 'L'},
                {'M', 'A', 'O', 'P', 'Q'},
                {'R', 'S', 'T', 'U', 'A'}
        };
        boolean result = isCons4(sample);
        System.out.println("Has 4 consecutive identical characters: " + result);
    }

    // Sorting Descending to Ascending
    public static void sortDescending(int[] arr) {

        if (arr == null || arr.length <= 1) {
            return; // Nothing to sort
        }

        int n = arr.length;
        // Sorting the array
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swapping indexes
            if (maxIndex != i) {
                // Swap arr[i] and arr[maxIndex]
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
            }
        }
    }

    // Ask to check if it needs to be sorted
    // Q1
    public static int arrayMedium(int[] aTest) {
        int medium = 0;

        // Sort the array
        sortDescending(aTest);

        if(aTest.length % 2 == 0) {
            medium = aTest.length / 2 - 1;
        }
        else {
            medium = aTest.length / 2;
        }
        return aTest[medium];

    }

    // Q2
    public static int[] getOddValues(int[] aTest) {

        int count = 0;
        for (int i = 0; i < aTest.length; i++) {
            if(aTest[i] % 2 != 0) {
                count++;
            }
        }

        int[] oddArray = new int[count];

        int oddCounter = 0;
        for (int i = 0; i < aTest.length; i++) {
            if(aTest[i] % 2 != 0) {
                oddArray[oddCounter]= aTest[i];
                oddCounter++;
            }
        }
        sortDescending(oddArray);
        return oddArray;
    }

    // Q3
    public static int[] joinArray(int[] aOne, int[] aTwo) {

        int[] joinedArray = new int[aOne.length + aTwo.length];

        for (int i = 0; i < aOne.length; i++) {
            joinedArray[i] = aOne[i];
        }

        for (int i = 0; i < aTwo.length; i++) {
            joinedArray[ i + aOne.length ] = aTwo[i];
        }

        return joinedArray ;
    }
    // Q4
    public static int[] arrayDiff(int[] aOne, int[] aTwo) {

        int count = 0;

        for (int i = 0; i < aOne.length; i++) {
            for (int j = 0; j < aTwo.length; j++) {
                if(aOne[i] != aTwo[j]) {
                    if(j == aTwo.length-1) {
                        count++;
                    }
                }
                else {
                    break;
                }
            }
        }
//		System.out.println();
        int[] resultantArray = new int[count];
        int resultCounter = 0;

        for (int i = 0; i < aOne.length; i++) {
            for (int j = 0; j < aTwo.length; j++) {
                if(aOne[i] != aTwo[j]) {
                    if(j == aTwo.length-1) {
                        resultantArray[resultCounter] = aOne[i];
                        resultCounter++;
                    }
                }
                else {
                    break;
                }
            }
        }

        return resultantArray ;
    }

    // Q5
    public static int[][] subtractMatrices(int[][] aOne, int[][]aTwo) {
        if((aOne.length == aTwo.length) && (aOne[1].length == aTwo[1].length)) {
            for (int i = 0; i < aTwo.length; i++) {
                for (int j = 0; j < aTwo[i].length; j++) {
                    aOne[i][j] = aOne[i][j] - aTwo[i][j];
                }
            }
            return aOne;
        }
        else {
            return aOne;
        }
    }

    // Q6
    // Ask if you can convert int to string
    public static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        int len = numStr.length();
        for (int i = 0; i < len / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int num) {
        //Exclude 1 because it is not a prime number
        if (num <= 1) {
            return false;
        }

        //Loop to check if nVal is a prime number
        //Divide through from 2 to half of nVal
        for (int i = 2; i <= num / 2; i++) {
            //if the number is divisible by any other number, it is not a prime number
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int[] pallPrimeInt() {
        int count = 0;
        int num = 0;

        System.out.println("First 50 Prime Palindrome Numbers:");

        int[] palPrimeArray = new int[50];

        while (count < 50) {
            if (isPalindrome(num) && isPrime(num)) {
                palPrimeArray[count] = num;
                count++;
            }
            num++;
        }
        return palPrimeArray;
    }

    // Q7
    public static int[] sumArrayRows (int[][] aTest) {
        int[] sumRows = new int[aTest.length];

        int rowArray = 0;
        for (int i = 0; i < aTest.length; i++) {
            int eachRowSum = 0;
            for (int j = 0; j < aTest[i].length; j++) {
                eachRowSum = eachRowSum + aTest[i][j];
            }
            sumRows[rowArray] = eachRowSum;
            rowArray++;
        }
        return sumRows;
    }

    // Q8
    public static boolean isCons4(char[][] aSample) {
        int numRows = aSample.length;
        int numCols = aSample[0].length;

        // Check Rows
        for (int i = 0; i < numRows; i++) {
            if (checkRow(aSample[i])) {
                return true;
            }
        }
        // Check Column
        for (int j = 0; j < numCols; j++) {
            char[] col = new char[numRows];
            for (int i = 0; i < numRows; i++) {
                col[i] = aSample[i][j];
            }
            if (checkRow(col)) {
                return true;
            }
        }
        // Check right-diagonals
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (checkDiagonal(aSample, i, j)) {
                    return true;
                }
            }
        }
        // Check left-diagonals
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (checkLeftDiagonal(aSample, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean checkRow(char[] row) {
        int count = 1;
        for (int i = 1; i < row.length; i++) {
            if (row[i] == row[i - 1]) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 1;
            }
        }
        return false;
    }
    private static boolean checkDiagonal(char[][] aSample, int startRow, int startCol) {
        int numRows = aSample.length;
        int numCols = aSample[0].length;
        char prevChar = '\0'; // Initialize with a dummy character

        int count = 1;

        for (int i = startRow, j = startCol; i < numRows && j < numCols; i++, j++) {
            if (aSample[i][j] == prevChar) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 1;
            }
            prevChar = aSample[i][j];
        }
        return false;
    }

    private static boolean checkLeftDiagonal(char[][] aSample, int startRow, int startCol) {
        int numRows = aSample.length;
        int numCols = aSample[0].length;
        char prevChar = '\0'; // Initialize with a dummy character

        int count = 1;

        for (int i = startRow, j = startCol;  i < numRows && j >= 0; i++, j--) {
            if (aSample[i][j] == prevChar) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 1;
            }
            prevChar = aSample[i][j];
        }
        return false;
    }
}
