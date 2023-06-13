public class Task004 {
      
      public static void main(String[] args) {
            int[] arrey = new int[]{5,2,7,9,1,0,3,6,4,8};
            System.out.println(find(arrey, 6));
      }

      public static int find(int[] array, int value) { // O(n)
            for (int i = 0; i < array.length; i++) {
                  if (array[i] == value) {
                        return i;
                  }
            }
            return -1; 
      }

}
