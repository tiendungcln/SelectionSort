import java.util.Arrays;

public class Level_1_1 {
    // - In min sau mỗi vòng
    // Ví dụ:
    // Min hiện tại là: ...
    // - In mảng sau mỗi lần swap

    public static void selectionSortAscending(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++){

                if (arr[j] < arr[minIndex]){

                    minIndex = j;

                }

            }

            System.out.println("Min hiện tại là: " + arr[minIndex]);

            // Nếu minIndex == i rồi thì k cần swap nữa
            if (minIndex != i){

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

            }

            System.out.println(Arrays.toString(arr));

        }

    }

    public static void main(String[] args){

        int[] arr = {4, 2, 6, 8, 1};
        selectionSortAscending(arr);

    }
}
