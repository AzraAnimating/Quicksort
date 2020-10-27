public class Quicksort {

    private final int[] integerArray = {16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19};

    public void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pivot auswählen
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // links < pivot & rechts > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // rekursiv die beiden unterteile weiter Einteilen und sortieren
        if (low < j)
            this.quickSort(arr, low, j);

        if (high > i)
            this.quickSort(arr, i, high);
    }
}
