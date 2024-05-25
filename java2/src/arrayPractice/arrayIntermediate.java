package arrayPractice;

public class arrayIntermediate {
    // Write a method to return the left medium value of array
    public static int arrayMedium(int[] aTest){
        int medium = (aTest.length%2 == 1) ? aTest[aTest.length/2]:aTest[aTest.length/2 - 1];
        return medium;
    }

    //Helper method to sort in descending order
    public static int[] descendSort(int[] arr){
        int[] returnArr = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        return returnArr;
    }

    // Write a method to get the odd values in an array
    public static int[] getOddValues(int[] aTest){
        int countOdd = 0;
        for(int i = 0; i< aTest.length; i++){
            if(aTest[i]%2==1){
                countOdd++;
            }
        }
        int[] returnArr = new int[countOdd];
        int counter = 0;
        for(int i=0;i < aTest.length;i++){
            if(aTest[i] % 2 == 1){
                returnArr[counter] = aTest[i];
                counter++;
            }
        }
        descendSort(returnArr);
        return returnArr;
    }

    // Write a method to join two arrays
    public static int[] joinArray(int[] aOne, int[] aTwo){
        int[] returnArr = new int[aOne.length + aTwo.length];
        int counter = 0;
        while(counter < returnArr.length){
            for(int i = 0; i < aOne.length; i++){
                returnArr[counter] = aOne[i];
                counter++;
            }
            for(int i = 0; i < aTwo.length; i++){
                returnArr[counter] = aTwo[i];
                counter++;
            }
        }
        descendSort(returnArr);
        return returnArr;
    }

    // Write a method to return the values in first array and not in second array
    public static int[] arrayDiff(int[] aOne, int[] aTwo){
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
        int[] finalArray = new int[count];
        int counter = 0;

        for (int i = 0; i < aOne.length; i++) {
            for (int j = 0; j < aTwo.length; j++) {
                if(aOne[i] != aTwo[j]) {
                    if(j == aTwo.length-1) {
                        finalArray[counter] = aOne[i];
                        counter++;
                    }
                }
                else {
                    break;
                }
            }
        }
        return finalArray;
    }

    // Write a method to subtract matrices
    public static int[][] subtractMatrices(int[][] aOne, int[][]aTwo) {
        for (int i = 0; i < aTwo.length; i++) {
            for (int j = 0; j < aTwo[i].length; j++) {
                aOne[i][j] = aOne[i][j] - aTwo[i][j];
            }
        }
        return aOne;
    }

    //Helper method to check Palindrome
    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        //Palindrome has to be at least 3 digits
        if(num<100) {
            return false;
        }

        //Check if the number is a palindrome
        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }
        return originalNumber == reversedNumber;
    }

    //Helper method to check Prime Number
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Write a method to return the first 50 prime palindrome numbers to array
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

    // Write a method to sum the values in each row of an array
    public static int[] sumArrayRows (int[][] aTest){
        int[] returnArr =  new int[aTest.length];
        int counter = 0;
        for(int i = 0; i< aTest.length; i++){
            int rowSum = 0;
            for(int j = 0; j< aTest[i].length; j++){
                rowSum += aTest[i][j];
            }
            returnArr[counter] = rowSum;
            counter++;
        }
        return returnArr;
    }

    // Write a method to check 4 consecutive characters in a square matrix
    public static boolean isCons4(char[][] aSample) {
        int numRows = aSample.length;
        int numCols = aSample[0].length;

        // Check the Rows
        for (int i = 0; i < numRows; i++) {
            if (checkRow(aSample[i])) {
                return true;
            }
        }
        // Check the Column
        for (int j = 0; j < numCols; j++) {
            char[] col = new char[numRows];
            for (int i = 0; i < numRows; i++) {
                col[i] = aSample[i][j];
            }
            if (checkRow(col)) {
                return true;
            }
        }
        // Check forward diagonals
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (checkDiagonal(aSample, i, j)) {
                    return true;
                }
            }
        }
        // Check backward diagonals
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (checkBackDiagonal(aSample, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }
    //Helper method
    public static boolean checkRow(char[] row) {
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
    //Helper method
    public static boolean checkDiagonal(char[][] aSample, int startRow, int startCol) {
        int numRows = aSample.length;
        int numCols = aSample[0].length;
        char cChar = '\0';

        int count = 1;

        for (int i = startRow, j = startCol; i < numRows && j < numCols; i++, j++) {
            if (aSample[i][j] == cChar) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 1;
            }
            cChar = aSample[i][j];
        }
        return false;
    }
    //Helper method
    public static boolean checkBackDiagonal(char[][] aSample, int startRow, int startCol) {
        int numRows = aSample.length;
        int numCols = aSample[0].length;
        char cChar = '\0';

        int count = 1;

        for (int i = startRow, j = startCol;  i < numRows && j >= 0; i++, j--) {
            if (aSample[i][j] == cChar) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 1;
            }
            cChar = aSample[i][j];
        }
        return false;
    }


}
