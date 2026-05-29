package DSA.BinarySearchTree;

public class CreateBSTMain {
    public static void main(String[] args) throws Exception{
        CreateBST tree = new CreateBST();
        int[] arr = {50,40,10,20,60,70,65};
        // int[] arr = {10,20,30,40,50,60,70,80,90};
        for(int i : arr){
            tree.root = tree.insert(tree.root,i);
        }
        tree.displayTree(tree.root,0);
        tree.inOrder(tree.root);

        // search element section 
        BSTSearch search = new BSTSearch();
        int element = 700;
        boolean searchElement = search.searchBst(tree.root,element);
        System.out.println("If Element found then True otherwise False : "+searchElement);

        // insert element section
        BSTInsert insert = new BSTInsert();
        int elemInsert = 55;
        insert.insertBST(tree.root,elemInsert);
        tree.displayTree(tree.root,0);
        tree.inOrder(tree.root);
    }
}
