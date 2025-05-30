package DSA;

import java.util.Scanner;

public class BinaryTrees {

    public BinaryTrees() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // insert elements for root
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }

    }

    public void display() {
        display(root, "");
    }

    public void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void preetyDisplay() {
        preetyDisplay(root, 0);
    }

    private void preetyDisplay(Node node, int level) {

        if (node == null) {
            return;
        }

        preetyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|---------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        preetyDisplay(node.left, level + 1);
    }


    // Traversals

    //PreOrder 
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
        if(node==null){
            return;
        }

        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }


     //InOrder 
     public void inOrder(){
        preOrder(root);
    }
    public void inOrder(Node node){
        if(node==null){
            return;
        }

        preOrder(node.left);
        System.out.println(node.value + " ");
        preOrder(node.right);
    }



     //PostOrder 
     public void postOrder(){
        preOrder(root);
    }
    public void postOrder(Node node){
        if(node==null){
            return;
        }

        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value + " ");
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BinaryTrees tree = new BinaryTrees();
        tree.populate(scanner);
        tree.preetyDisplay();

    }

}
