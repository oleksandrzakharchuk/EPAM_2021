package meetPractise_5_Class;

public class CarouselRun {
    int position = 0;
    int number = 0;


    public int next() {
        int count = 0;
        double[] arr = new double[0];
        while (count < arr.length && arr[position %= arr.length] <= 0) {
            position++;
            count++;
        }
        if (count == arr.length) return -1;
        return (int) arr[position++]--;
    }




       /*int[] arr = new int[0];
       if (allNegative(arr)) return -1;

       int capacity = 0;
       if (position >= capacity) position = 0;

       if (arr[position] <= 0) {
           if (position == arr.length - 1) {
               position = 0;
               if (arr[position] == 0) {
                   return arr[++position]--;
               }
               else {return arr[position++]--;}
           }
           else {
               return arr[++position]--;
           }

       }
       return arr[position++]--;
*/
       /*int count = 0;
       double[] arr = new double[0];
       while (count < arr.length && arr[position %= arr.length] <= 0) {
           position++;
           count++;
       }
       if (count == arr.length) return -1;
       return (int) arr[position++]--;*/


    public static int[] removeTheElement(int[] arr, int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

    public static boolean allNegative(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) return false;
        }
        return true;
    }

    public boolean isFinished() {
        int[] arr = new int[0];
        for (int var : arr) {
            if (var > 0) return false;
        }
        return true;

    }
}
