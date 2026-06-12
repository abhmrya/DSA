package DSA.Hashing.SeperateChaining;


public class HashTable {
    private  Node[] hashTable;
    private int size;

    public HashTable(int size){
        this.size = size;
        hashTable = new Node[size];
    }

    private int hash(int key){
        return key%size;
    }

    void insert(int key){
        int index = hash(key);
        Node newNode = new Node(key);

        //  insert key into hash table(insert at head-->o(1))
        newNode.next = hashTable[index];
        hashTable[index]=newNode;
    }


    boolean search(int key){
        int index = hash(key);
        Node curr = hashTable[index];
        while(curr != null){
            if(curr.data == key) return true;
            curr = curr.next;
        }
        return false;
    }

    void delete(int key){
        int index =  hash(key);
        Node curr = hashTable[index];
        Node prev = null;
        while(curr != null){
            if(curr.data==key){
                if(prev==null){
                    hashTable[index] = curr.next;
                }else{
                    prev.next=curr.next;
                }
                return ;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    void printTable(){
        for(int i=0;i<size;i++){
            System.out.println(i+"-->");
            Node curr = hashTable[i];
            while(curr != null){
                System.out.println(curr.data +"-->");
                curr = curr.next;                
            }
        }
        System.out.println("null");
    }

}
