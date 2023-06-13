public class Task006 {

      public static void main(String[] args) {
            int[] arrey = new int[]{5,2,7,9,4,0,3,6,1,8};
            quickSort(arrey, 0, 9);
            for (int i = 0; i < arrey.length; i++) {
                  System.out.print(arrey[i] + " ");
            }


      }

      public static void quickSort(int[] array, int startPosition, int endPosition) {
            int leftPosition = startPosition;
            int rightPosition = endPosition;
            int pivot = array[(startPosition + endPosition) / 2];
            do {
                  while (array[leftPosition] < pivot) {
                        leftPosition++;
                  }
                  while (array[rightPosition] > pivot) {
                        rightPosition--;
                  }
                  if (leftPosition <= rightPosition) {
                        if (leftPosition < rightPosition) {
                              int temp = array[leftPosition];
                              array[leftPosition] = array[rightPosition];
                              array[rightPosition] = temp;
                        }
                        leftPosition++;
                        rightPosition--;
                  }
            } while (leftPosition<=rightPosition);
            if (leftPosition<endPosition) {
                  quickSort(array, leftPosition, endPosition);
            }
            if (startPosition<rightPosition) {
                  quickSort(array, startPosition, rightPosition);
            }
      }

}
