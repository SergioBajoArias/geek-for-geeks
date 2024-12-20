package com.sergio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://www.geeksforgeeks.org/problems/check-for-bst/1">Link to problem</a>
 */
public class BTLeftView {
    Node buildTree(String str) {

        if (str.isEmpty() || str.charAt(0) == 'N') {
            return null;
        }

        String[] ip = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (!queue.isEmpty() && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> leftView = new ArrayList<>();
        List<Node> nodesInLevel = new ArrayList<>();
        nodesInLevel.add(root);
        while(!nodesInLevel.isEmpty()) {
            leftView.add(Integer.valueOf(nodesInLevel.get(0).data));
            nodesInLevel = getChildrenFromNodes(nodesInLevel);
        }

        return leftView;
    }

    List<Node> getChildrenFromNodes(List<Node> nodes) {
        List<Node> children = new ArrayList<>();
        for(Node node : nodes) {
            if(node.left != null) {
                children.add(node.left);
            }
            if(node.right != null) {
                children.add(node.right);
            }
        }
        return children;
    }

}
