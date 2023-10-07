import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(" выбор напитка по цене или температуре   ");
        TorgoviyAvtomatHotDrinks taHotDrinks = new TorgoviyAvtomatHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Kakako", 57.5, 0.5, 75),
                new HotDrinks("Kofe", 56.0, 56.0, 95),
                new HotDrinks("Cacao", 55.6, 2.5, 80)));
        taHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + taHotDrinks.getProduct("Cacao"));
        System.out.println("Поиск по температуре <=: " + taHotDrinks.getProduct(85));
    }

    
}
