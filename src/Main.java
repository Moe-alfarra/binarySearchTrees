import java.util.Random;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree tree1 = new BinarySearchTree();
        fillArray(tree1);

        // Testing the binary tree implementation
        System.out.println("Displaying the binary tree: ");
        tree1.display();
        System.out.println("If it contains 20: " + tree1.contains(20));
        System.out.println("If it contains 15: " + tree1.contains(15));
        System.out.println("If it is empty: " + tree1.isEmpty());
        System.out.println("Minimum: " + tree1.getMin());
        System.out.println(tree1);
    }

    public static void fillArray(BinarySearchTree tree1) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int num = rnd.nextInt(20);
            tree1.add(num);
        }
    }
}
