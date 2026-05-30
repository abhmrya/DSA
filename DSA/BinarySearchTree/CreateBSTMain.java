package DSA.BinarySearchTree;

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

        // Construct BST Using PreOrder  M-2
        System.out.println("************ Construct BST Using PreOrder  ***********");
        ConstructBSTPreOrderM2 constr = new ConstructBSTPreOrderM2();
        int[] preorder = {10,5,4,7,11,15,12,20,17};
        Node root1 = constr.constructBstPre(preorder,0,preorder.length-1);
        tree.displayTree(root1,0);
        tree.inOrder(root1);
        System.out.println();

        // Construct BST Using PreOrder  M-3
        System.out.println("************ Construct BST Using PreOrder Method 3 ***********");
        ConstructBSTPreOrderM3 constrm3 = new ConstructBSTPreOrderM3();
        int[] preorder3 = {10,5,4,7,11,15,12,20,17};
        int[] i = {0};
        Node root3 = constrm3.constructBstPre(preorder3,i,Integer.MAX_VALUE);
        tree.displayTree(root3,0);
        tree.inOrder(root3);
        System.out.println();
    }
}