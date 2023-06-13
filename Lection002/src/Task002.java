public class Task002 {

      public static void main(String[] args) {
            int[] arrey = new int[]{5,2,7,9,1,0,3,6,4,8};
            directSort(arrey);
            for (int i = 0; i < arrey.length; i++) {
                  System.out.print(arrey[i] + " ");
            }


      }

      public static void directSort(int[] array) {  // O(n^2)
            for (int i = 0; i < array.length - 1; i++) {
                  int minPosition = i;
                  for (int j = i + 1; j < array.length; j++) {
                        if (array[j] < array[minPosition]) {
                              minPosition = j;
                        }
                  }
                  if (i != minPosition) {
                        int temp = array[i];
                        array[i] = array[minPosition];
                        array[minPosition] = temp;
                  }
            }
      }

}
