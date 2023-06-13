public class Task005 {

      public static void main(String[] args) {
            int[] arrey = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            System.out.println(binarySerch(arrey, 1)); 
      }

      public static int binarySerch(int[] array, int value, int min, int max) {
            int midPoint;
            if (max < min) {
                  return -1;
            } else {
                  midPoint = (max - min) / 2 + min;
            }
            if (array[midPoint] < value) {
                  return binarySerch(array, value, midPoint + 1, max);
            } else {
                  if (array[midPoint] > value) {
                        return binarySerch(array, value, min, midPoint - 1);
                  } else {
                        return midPoint;
                  }
            }

      }

      public static int binarySerch(int[] array, int value) {
            return binarySerch(array, value, 0, array.length - 1);
      }

}
