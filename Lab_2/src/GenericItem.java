public class GenericItem {
    public int ID;
    public String name;
    public float price;

    public Category category = Category.General;

    public void PrintAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , category: %s\n", ID, name, price, category);
    }
}