public class Task003 {

      public static void main(String[] args) {
            int[] arrey = new int[]{5,2,7,9,1,0,3,6,4,8};
            insertSort(arrey);
            for (int i = 0; i < arrey.length; i++) {
                  System.out.print(arrey[i] + " ");
            }


      }

      public static void insertSort(int[] array) {   // O(n^2)
            for (int i = 0; i < array.length - 1; i++) {
                  for (int j = i + 1; j < array.length; j++) {
                        if (array[i] > array[j]) {
                              int temp = array[i];
                              array[i] = array[j];
                              array[j] = temp;
                        }
                  }
            }
      }

}
