package exam;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    TreeNode root;

    // Insert using Level Order Traversal
    public void insert(int data) {

        TreeNode newNode = new TreeNode(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            TreeNode temp = queue.poll();

            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                queue.add(temp.right);
            }
        }
    }

    // Preorder Traversal
    public void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // Inorder Traversal
    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    // Postorder Traversal
    public void postorder(TreeNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}

public class BST {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);


        System.out.print("Preorder Traversal: ");
        bt.preorder(bt.root);

        System.out.print("\nInorder Traversal: ");
        bt.inorder(bt.root);

        System.out.print("\nPostorder Traversal: ");
        bt.postorder(bt.root);
    }
}