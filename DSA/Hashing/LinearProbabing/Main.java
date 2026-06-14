package DSA.Hashing.LinearProbabing;

public class Main {
    public static void main(String[] args){
        LinearProbabing table = new LinearProbabing(7);
        table.insert(22);
        table.insert(17);
        table.insert(15);
        table.insert(27);
        table.insert(25);
        table.insert(29);
        table.displayTable();
        System.out.println(table.search(25));
        table.delete(25);
        table.displayTable();
        System.out.println(table.search(29));
        table.insert(3);
        table.displayTable();

    }
}
