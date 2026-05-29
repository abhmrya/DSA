package DSA.BinarySearchTree;

public class CreateBSTMain {
    public static void main(String[] args){
        CreateBST tree = new CreateBST();
        int[] arr = {50,40,10,20,60,70,65};
        for(int i : arr){
            tree.root = tree.insert(tree.root,i);
        }
        tree.displayTree(tree.root,0);
        tree.inOrder(tree.root);
    }
}
