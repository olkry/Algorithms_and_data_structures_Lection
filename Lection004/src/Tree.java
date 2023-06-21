import java.util.ArrayList;
import java.util.List;

public class Tree {
      // Создание дерева в данных примерах работаем только с числами
      Node root;

      public class Node {
            int value;
            List<Node> children;
      }

      // Обход дерева

      // в глубину (существуетли значение, в данном примере)
      // Поиск ноды по значению

      public boolean exist(int value) {
            if (root != null) {
                  Node node = find(root, value);
                  if (node != null) {
                        return true;
                  }
            }
            return false;
      }

      private Node find(Node node, int value) {
            if (node.value == value) {
                  return node;
            } else {
                  for (Node child : node.children) {
                        Node result = find(child, value);
                        if (result != null) {
                              return result;
                        }
                  }

            }
            return null;
      }

      // Метод для обхода в ширину, горизонтально проверяем слои
      // Подходит для отрисовки дерева
      private Node find(int value) {
            List<Node> line = new ArrayList<>();
            line.add(root);
            while (line.size() > 0) {
                  List<Node> nextLine = new ArrayList<>();
                  for (Node node : line) {
                        if (node.value == value) {
                              return node;
                        }
                        nextLine.addAll(node.children);
                  }
                  line = nextLine;
            }
            return null;
      }

      // Бинарное дерево. Левый ребенок всегда меньше, правый - больше родителя.

}
