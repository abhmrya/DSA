package DSA.Hashing.SeperateChaining;

public class ChainingMain {
    public static void main(String[] args){
        HashTable table = new HashTable(10);
        table.insert(12);
        table.insert(1);
        table.insert(22);
        table.insert(15);
        table.insert(17);
        table.printTable();
        System.out.println(table.search(12));
        table.delete(12);
        System.out.println(table.search(12));
        table.printTable();
    } 
}