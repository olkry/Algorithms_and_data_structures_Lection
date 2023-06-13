public class Task001 {

      public static void main(String[] args) {
            int[] arrey = new int[]{5,2,7,9,1,0,3,6,4,8};
            bubbleSort(arrey);
            for (int i = 0; i < arrey.length; i++) {
                  System.out.print(arrey[i] + " ");
            }


      }

      public static void bubbleSort(int[] array) { // O(n^2)
            boolean finish = true;
            do {
                  finish = true;
                  for (int i = 0; i < array.length - 1; i++) {
                        if (array[i] > array[i + 1]) {
                              int temp = array[i];
                              array[i] = array[i + 1];
                              array[i + 1] = temp;
                              finish = false;
                        }
                  }

            } while (!finish);

      }

}
