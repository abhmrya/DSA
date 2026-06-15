public class QuadricProbingMain {
    public static void main(String[] args) {
        QuadricProbing table = new QuadricProbing(10);
        table.insert(22);
        table.insert(12);
        table.insert(32);
        table.insert(15);
        table.insert(25);
        table.insert(7);
        table.displayTable();
        System.out.println(table.search(12));
        table.delete(25);
        table.displayTable();
    }
}
