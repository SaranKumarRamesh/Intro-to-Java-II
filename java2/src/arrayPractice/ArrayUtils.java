package arrayPractice;

public class ArrayUtils {
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5,6,7,8,9,50};
        int a = max(arr);
        System.out.println(a);
    }
    //Create method max to return max value in an array
    public static int max(int[]arr){
        int maxNum = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    //Create method min to return min value in an array
    public static int min(int[]arr){
        int minNum = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]<minNum){
                minNum = arr[i];
            }
        }
        return minNum;
    }

    //Create method total to return the sum of values in an array
    public static int total(int[]arr) {
        int iSum = 0;
        for(int i = 0; i< arr.length; i++){
            iSum += arr[i];
        }
        return iSum;
    }

    //Create method countOdd to return the count of odd values in an array
    public static int countOdd(int[]value){
        int countOdd = 0;
        for(int i = 0; i< value.length; i++){
            if(value[i]%2==1){
                countOdd++;
            }
        }
        return countOdd;
    }

    //Create method toString to return the string of values in an array
    public static String toString(int[]strVal) {
        String result = "[";
        int counter = 0;
        for(int i = 0; i< strVal.length; i++){
            result += strVal[i] + ", ";
            counter++;
            if(counter % 10 == 0){
                result += "\n";
            }
        }
        result = (result.substring(0, result.length()-2)) + "]";
        return result;
    }

    //Create method reverseToString to reverse a string of values in an array
    public static String reverseToString(int[]strVal) {
        String result = "[";
        int counter = 0;
        for(int i = strVal.length-1; i>=0 ; i--){
            result += strVal[i] + ", ";
            counter++;
            if(counter % 10 == 0){
                result += "\n";
            }
        }
        result = (result.substring(0, result.length()-2)) + "]";
        return result;
    }

    //Create method timesOccur to count the number of occurrence in an array
    public static int timesOccur(int[]value, int key) {
        int countTimes= 0;
        for(int i=0;i < value.length;i++){
            if(value[i]== key){
                countTimes++;
            }
        }
        return countTimes;
    }

    //Create method reverse to reverse the values in an array
    public static int[] reverse(int[]arr) {
        int[] returnArr = new int[arr.length];
        int counter = 0;
        for(int i = arr.length-1; i>=0; i--){
            returnArr[counter] = arr[i];
            counter++;
        }
        return returnArr;
    }

    //Create method isOdd to return true for odd values
    public static boolean isOdd(int num){
        return num % 2 == 1;
    }

    //Create method isEven to return true for even values
    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    //Create method oddValues to return an array of odd values in an array
    public static int[] oddValues(int[] arr){
        int[] returnArr = new int[countOdd(arr)];
        int counter = 0;
        for(int i=0;i < arr.length;i++){
           if( isOdd(arr[i]) ){
               returnArr[counter] = arr[i];
               counter++;
           }
        }
        return returnArr;
    }

    //Create method copyArr to copy the values in an array
    public static int[] copyArr(int[] arrVal){
        int[] returnArr = new int[arrVal.length];
        int counter = 0;
        for(int i=0;i < arrVal.length;i++){
            returnArr[counter] = arrVal[i];
            counter++;
        }
        return returnArr;
    }

    //Create method copy to copy the values of an array
    public static boolean copy(int[] arrSrc, int[] arrDest, int sizeCpy){
        int minArraySize = Math.min(arrSrc.length, arrDest.length);
        int copySize = Math.min(minArraySize, sizeCpy);
        for (int i=0; i < copySize; i++){
            arrDest[i] = arrSrc[i];
        }
        return true;
    }

    //Create method reduce to return a reduced array
    public static int[] reduce(int[] arrVal, int val){
        int size = Math.min(arrVal.length, val);
        int[] returnArr = new int[size];
        copy(arrVal, returnArr, size);
        return returnArr;
    }

    //Create method grow to add values to an existing array
    public static int[] grow(int[] arrVal, int val){
        int newSize = arrVal.length + val;
        int[] returnArr = new int[newSize];
        copy(arrVal, returnArr, newSize);
        return returnArr;
    }
}
