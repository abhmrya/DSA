package DSA.Hashing.SeperateChaining;


public class HashTable {
    private  Node[] hashTable;
    private int size;
    private int count;
    private final double LOAD_FACTOR_THREHOULD=0.75;

    public HashTable(int size){
        this.size = size;
        hashTable = new Node[size];
    }
 
    private int hash(int key){
        return key%size;
    }

    private double loadFactor(){
        return (double) count/size;
    }
 
    void insert(int key){
        int index = hash(key);
        Node newNode = new Node(key);

        //  insert key into hash table(insert at head-->o(1))
        newNode.next = hashTable[index];
        hashTable[index]=newNode;
        count++;
        if(loadFactor()>LOAD_FACTOR_THREHOULD){
            rehash();
        }
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
                count--;
                return ;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    private void rehash(){
        int oldsize = size;
        Node[] oldTable = hashTable;

        size = size*2;
        hashTable = new Node[size];
        count=0;

        for(int i=0;i<oldsize;i++){
            Node curr = oldTable[i];
            while(curr!=null){
                insert(curr.data); // re-insert new table
                curr = curr.next;
            }
        }

    }

    void printTable(){
        for(int i=0;i<size;i++){
            System.out.print(i+"-->");
            Node curr = hashTable[i];
            while(curr != null){
                System.out.print(curr.data +"-->");
                curr = curr.next;                
            }
            System.out.println("null");
        }
        
    }

}
