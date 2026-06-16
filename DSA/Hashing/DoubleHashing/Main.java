package DSA.Hashing.DoubleHashing;

public class Main {
    public static void main(String[] args) {
        DoubleHashing table = new DoubleHashing(10);
            table.insert(15);
            table.insert(25);
            table.insert(5);
            table.insert(35);
            table.insert(22);
            table.insert(45);
            table.displayTable();
            System.out.println(table.search(22));
            System.out.println(table.search(3222));
            table.delete(25);
            table.displayTable();

        }
}
