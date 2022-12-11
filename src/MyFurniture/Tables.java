package MyFurniture;

public class Tables extends Furniture implements Priceable{

    private final int legsTab;
    public Tables(String nameFur, double lengthFur, double widthFur, double heightFur, String colorFur,double priceFur, int legsTab) {
        super(nameFur, lengthFur, widthFur, heightFur, colorFur, priceFur);
        this.legsTab = legsTab;
    }

    @Override
    public String toString() {

        return super.toString()
                +"\n Количество ножек: " + legsTab;
    }

    @Override
    public double getPrice() {
        System.out.println("Сумма НДС 20%");
        return 0.20;
    }
}
