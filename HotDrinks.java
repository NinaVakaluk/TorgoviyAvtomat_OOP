public class HotDrinks extends Drinkables {
    private int temp;

    
    public HotDrinks(String name, Double price, Double volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
    public String toString() {
        return super.toString() + "температура напитка = " + temp;
    }
}
