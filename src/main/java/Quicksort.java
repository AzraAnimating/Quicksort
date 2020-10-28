public class Quicksort {

    private int[] aInternalIntegerArray;//Array mit dem die Methoden arbeiten

    /**
     * Wrappermethode zur simplifizierung der benutzung
     * @param pIntegerArray  Das Array was zu sortieren ist
     * @return Das sortierte Array wird zurückgegeben
     */
    public int[] quickSort(int[] pIntegerArray) {
        this.aInternalIntegerArray = pIntegerArray;
        return this.internalQuickSort(0, pIntegerArray.length - 1);
    }

    /**
     * Rekursive Implementation von Quicksort
     * @param pBeginIndex Der Index des 1. Elementes des Arrays
     * @param pEndIndex Der Index des letzten Elementes des Arrays
     * @return Rückgabe des sortierten Arrays, an die obere "quickSort" Methode
     */
    private int[] internalQuickSort(int pBeginIndex, int pEndIndex) {//Tatsächliche Suchmethode
        int lPivot;
        if (pBeginIndex < pEndIndex) {
            //Piviot auswählen
            lPivot = this.partition(pBeginIndex, pEndIndex);
            //Rekursive Aufrufe der Sortiermethode um immer weiter zu unterteilen
            this.internalQuickSort(pBeginIndex, lPivot);
            this.internalQuickSort(lPivot + 1, pEndIndex);
        }
        return aInternalIntegerArray;
    }

    int partition(int pBeginIndex, int pEndIndex) { //Partitionieren / Aufteilen des Arrays

        int i; //Counter
        int j;
        int x = aInternalIntegerArray[(pBeginIndex + pEndIndex) / 2];
        i = pBeginIndex - 1;
        j = pEndIndex + 1;

        boolean returned = false;

        while (true) {
            do {
                i++;
            } while (aInternalIntegerArray[i] < x);

            do {
                j--;
            } while (aInternalIntegerArray[j] > x);

            if (i < j) {
                int k = aInternalIntegerArray[i];
                aInternalIntegerArray[i] = aInternalIntegerArray[j];
                aInternalIntegerArray[j] = k;
            } else {
                return j;
            }
        }
    }
}
