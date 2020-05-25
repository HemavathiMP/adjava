package in.BinaryTree1.collections;
import in.binaryTree.collection.*;

public class BinaryTree {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
        Node root = new Node(5);
        System.out.println("Binary Tree ");
        System.out.println(" root value " + root.value);
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);
        System.out.println("Traversing tree in order");
        tree.traverseInOrder(Node node);
        tree.traversePreOrder(Node node);
        tree.traversePostOrder(Node node)
        
		
	}

}
