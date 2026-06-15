

public class QuadricProbing {
    private int[] hashTable;
    private int size;
    private final int EMPTY=-1;
    private final int DELETED =-2;

    public QuadricProbing(int size){
        this.size = size;
        hashTable = new int[size];

        for(int i=0;i<size;i++){
            hashTable[i]=EMPTY;
        }
    }

    public int hash(int key){
        return key%size;
    }

    public void insert(int key){
        int index = hash(key);

        for(int i=0;i<size;i++){
            int newindex = (index+i*i)%size;
            if(hashTable[newindex]==EMPTY || hashTable[newindex]==DELETED){
                hashTable[newindex] = key;
                return ;
            }
        }
        System.out.println("Hash table is full..can not insert");
        
    }

    public boolean search(int key){
        int index = hash(key);
        for(int i=0;i<size;i++){
            int newindex = (index+i*i)%size;
            if(hashTable[newindex]==EMPTY){
                return false;
            }
            if(hashTable[newindex]==key){
                return true;
            }
        }
        return false;
    }

    public void delete(int key){
        int index = hash(key);
        for(int i=0;i<size;i++){
            int newIndex = (index + i*i)%size;
            if(hashTable[newIndex]==EMPTY){
                return;
            }
            if(hashTable[newIndex]== key){
                hashTable[newIndex] = DELETED;
                return;
            }
        }
    }

    public void displayTable(){
        System.out.println("hash table..");
        for(int i=0;i<size;i++){
            System.out.println(i+"->"+hashTable[i]);
        }
    }

}
