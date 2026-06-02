package DSA.AVL;

public class CreateAVLTree {
    Node root;

    public CreateAVLTree() {
        root=null;
    }
    Node insert(Node node,int value){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(value>node.data){
            node.right=insert(node.right, value);
        }
        else if(value<node.data){
            node.left = insert(node.left, value);
        }
        else{
            return node;
        }
        node.height = 1+Math.max(height(node.left),height(node.right));

        int balance = getBalance(node);
        // LL case
        if(balance>1 && value<node.left.data){
            return rightRotation(node);
        }

        // LR Case
        else if(balance>1 && value>node.left.data){
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }

        // RR Case
        else if(balance<-1 && value>node.right.data){
            return leftRotation(node);
        }

        // RL Case
        else if(balance<-1 && value < node.right.data){
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }
    int height(Node node){
        if(node==null) return 0;
        return node.height;
    }

    int getBalance(Node node){
        if(node==null) return 0;
        return height(node.left)-height(node.right);
    }
    Node leftRotation(Node node){
        Node x = node.right;
        Node y = x.left;

        x.left = node;
        node.right = y;
        node.height = 1+Math.max(height(node.left),height(node.right));
        x.height = 1+Math.max(height(node.left),height(node.right));
        return x;
    }

    Node rightRotation(Node node){
        Node x = node.left;
        Node y = x.right;

        x.right = node;
        node.left = y;
        node.height = 1+Math.max(height(node.left),height(node.right));
        x.height = 1+Math.max(height(node.left),height(node.right));
        return x;
    }

    Node inOrder(Node root){
        if(root==null) return null;
        root.left = inOrder(root.left);
        System.out.print(" "+root.data);
        root.right = inOrder(root.right);
        return root;
    }

    void displayTree(Node node ,int level){
        if(node==null) return;
        displayTree(node.right, level+1);
        for (int i=0;i<level;i++) {
            System.out.print("    ");
        }
        System.out.println(node.data);
        displayTree(node.left, level+1);
    }
}
