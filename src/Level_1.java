import java.util.Arrays;

public class Level_1 {
    // Selection Sort tăng dần

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

    public static void main(String[] args){

        int[] arr = {4, 2, 6, 8, 1};
        selectionSortAscending(arr);

    }
}
