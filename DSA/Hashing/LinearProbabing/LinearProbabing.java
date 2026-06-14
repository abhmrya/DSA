package DSA.Hashing.LinearProbabing;

import java.util.Hashtable;


public class LinearProbabing {
    private int[] hashTable;
    private int size;
    private final int EMPTY=-1;
    private final int DELETED = -2;

    public LinearProbabing(int size){
        this.size=size;
        hashTable= new int[size];

        for(int i=0;i<size;i++){
            hashTable[i] = EMPTY;
        }
    }
    public int hash(int key){
        return key%size;
    }

    public void insert(int key){
        int index = hash(key);
        while(hashTable[index] != EMPTY && hashTable[index] !=DELETED){
            index = (index+1)%size;
        }
        hashTable[index] = key;
    }

    public boolean search(int key){
        int index = hash(key);
        int start = index ;
        while(hashTable[index] != EMPTY){
            if(hashTable[index]==key){
                return true;
            }
            index = (index+1)%size;

            if(start==index) break;
        }
        return false;
    }

    public void delete(int key){
        int index = hash(key);
        int start = index;
        while(hashTable[index] != EMPTY){
            if(hashTable[index]==key){
                hashTable[index]=DELETED;
                return ;
            }
            index = (index+1)%size;
            if(start==index) break;
        }
    }

    public void displayTable(){
        System.out.println("Hash Table...");
        for(int i=0;i<size;i++){
            System.out.println(i+" -> "+hashTable[i]);
        }
    }

    
}
