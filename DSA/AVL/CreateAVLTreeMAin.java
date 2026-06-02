package DSA.AVL;

public class CreateAVLTreeMAin {
    public static void main(String[] args) {
        CreateAVLTree tree = new CreateAVLTree();
        int[] arr = {25,15,40,32,43,76,97,64,32,76,98,54};
        for(int val : arr){
            tree.root = tree.insert(tree.root, val);
        }
        tree.displayTree(tree.root,0);
        tree.inOrder(tree.root);
    }
}
