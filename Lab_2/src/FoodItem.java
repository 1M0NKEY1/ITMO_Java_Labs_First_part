import java.util.Date;
public class FoodItem extends GenericItem {
    Date dateOfIncome;
    short expires;

    @Override
    public void PrintAll() {
        super.PrintAll();
        System.out.printf(String.valueOf(dateOfIncome), expires);
    }
}
