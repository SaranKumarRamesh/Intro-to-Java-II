package arrayPractice;

public class arrayUtils4 {

        //random array generation method
        public static int[] randomArr(int size){
            int [] arr = new int[size];
            for(int i = 0 ; i<arr.length; i++){
                arr[i] = (int)(Math.random()*100+1);
            }
            return arr;
        }

        // swap methods for doubles
        public static void swapDoubles(double[] arr, int i, int j) {
            double temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // swap methods for chars
        public static void swapChars(char[] arr, int i, int j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // swap methods for strings
        public static void swapStrings(String[] arr, int i, int j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // create a binary search method for doubles
        public static int binarySearchDoubles(double[] arr, double target) {
            int low = 0;
            int high = arr.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }

        // create a binary search method for strings
        public static int binarySearchStrings(String[] arr, String target) {
            int low = 0;
            int high = arr.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                int comp = arr[mid].compareTo(target);
                if (comp == 0) {
                    return mid;
                } else if (comp < 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }

        // create a selection sort method for doubles
        public static void selectionSortDoubles(double[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                swapDoubles(arr, i, minIndex);
            }
        }

        // create a selection sort method for chars
        public static void selectionSortChars(char[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                swapChars(arr, minIndex, i);
            }
        }

        // create a selection sort method for strings
        public static void selectionSortStrings(String[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    int comp = arr[j].compareTo(arr[minIndex]);
                    if (comp < 0) {
                        minIndex = j;
                    }
                }
                swapStrings(arr, minIndex, i);
            }
        }

        // create an insertion sort method for doubles
        public static void insertionSortDoubles(double[] arr) {
            for (int i = 1; i < arr.length; i++) {
                double key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }

        // create an insertion sort method for chars
        public static void insertionSortChars(char[] arr) {
            for (int i = 1; i < arr.length; i++) {
                char key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }

        // create an insertion sort method for strings
        public static void insertionSortStrings(String[] arr) {
            for (int i = 1; i < arr.length; i++) {
                String key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j].compareTo(key) > 0) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }
}



