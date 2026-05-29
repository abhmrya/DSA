package DSA.BinarySearchTree;
// M-2
// this is *** Method 2 *** 
// Methos 1 is already see by CreateBST 

public class CreateBSTMain {
    public static void main(String[] args) throws Exception{
        System.out.println("*************   Create BST Using Array *************");
        CreateBST tree = new CreateBST();
        int[] arr = {50,40,10,20,60,70,65};
        // int[] arr = {10,20,30,40,50,60,70,80,90};
        for(int i : arr){
            tree.root = tree.insert(tree.root,i);
        }
        tree.displayTree(tree.root,0);
        tree.inOrder(tree.root);
        System.out.println();

        // search element section 
        System.out.println("************  Search Element of 70 *************");
        BSTSearch search = new BSTSearch();
        int element = 70;
        boolean searchElement = search.searchBst(tree.root,element);
        System.out.println("If Element found then True otherwise False : "+searchElement);

        // insert element section
        System.out.println("*************  Insert Element of 55  ************");
        BSTInsert insert = new BSTInsert();
        int elemInsert = 55;
        insert.insertBST(tree.root,elemInsert);
        tree.displayTree(tree.root,0);
        tree.inOrder(tree.root);
        System.out.println();

        // delete section
        System.out.println("*************  Delete Element of 40  ************");
        BSTDelete delete = new BSTDelete();
        int elemDelete = 40;
        delete.deleteBst(tree.root,elemDelete);
        tree.displayTree(tree.root,0);
        tree.inOrder(tree.root);
        System.out.println();

        // Construct BST Using PreOrder 
        System.out.println("************ Construct BST Using PreOrder  ***********");
        ConstructBSTPreOrder constr = new ConstructBSTPreOrder();
        int[] preorder = {10,5,4,7,11,15,12,20,17};
        Node root1 = constr.constructBstPre(preorder,0,preorder.length-1);
        tree.displayTree(root1,0);
        tree.inOrder(root1);
        System.out.println();
    }
}