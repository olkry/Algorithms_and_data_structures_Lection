import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) throws Exception {
    //     final RedBlackTree tree = new RedBlackTree();
    //     try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
    //         while (true) {
    //             try {
    //                 int value = Integer.parseInt(reader.readLine());
    //                 tree.add(value);
    //                 System.out.println("finish");
    //             } catch (Exception ignored) {
                
    //             }
    //         }
    //     } catch (IOException e) {
    //         throw new RuntimeException(e);
    //     }
        RedBlackTree tree = new RedBlackTree();
        int[] values = {5, 3, 8, 2, 4, 7, 10, 1, 6, 9, 12, 15, 11, 14, 17, 16, 18, 13, 19, 20};
        
        for (int value : values) {
            tree.add(value);
        }
        
        tree.printTree(tree.root, "", true);
    }
    

    

    
}
