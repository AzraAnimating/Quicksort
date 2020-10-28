import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Quicksort quicksort = new Quicksort();

        int[] integerArray = {16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19, 2154, 3242, 12331, 422421, 1241353, 2};

        quicksort.quickSort(integerArray);

        System.out.println(Arrays.toString(integerArray));
    }

}
