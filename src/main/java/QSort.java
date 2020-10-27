public class QSort {


    public int[] quicksort(final int... arraySize) {
        int t;
        for (int i = 0; i < arraySize.length; i++) {
            for (int i1 = i; i1 > 0; i1--) {
                if (arraySize[i1] < arraySize[i1 - 1]) {
                    t = arraySize[i1];
                    arraySize[i1] = arraySize[i1 - 1];
                    arraySize[i1 - 1] = t;
                }
            }
        }
        return arraySize;
    }


}
