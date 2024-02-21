public class Main {
    public static void main(String[] args) {
        GenericItem item = new GenericItem();
        FoodItem foodItem = new FoodItem();
        TechnicalItem technicalItem = new TechnicalItem();

        item.ID = 1;
        item.name = "Товар 1";
        item.price = 100.0f;

        foodItem.ID = 1;
        foodItem.name = "Еда 1";
        foodItem.price = 100.0f;

        technicalItem.ID = 2;
        technicalItem.name = "Техника 1";
        technicalItem.price = 200.0f;

        GenericItem[] items = {item, foodItem, technicalItem};

        for (GenericItem currentItem : items) {
            currentItem.PrintAll();
        }
    }
}
