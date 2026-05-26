import java.util.Arrays;

public class Level_1 {
    // Selection Sort tăng dần
    // Selection Sort giảm dần

    public static void selectionSortAscending(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++){

                if (arr[j] < arr[minIndex]){

                    minIndex = j;

                }

            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSortDescending(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){

            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++){

                if (arr[j] > arr[maxIndex]){

                    maxIndex = j;

                }

            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args){

        int[] arr1 = {4, 2, 6, 8, 1};
        int[] arr2 = {4, 2, 6, 8, 1};

        selectionSortAscending(arr1);
        selectionSortDescending(arr2);

    }
}
