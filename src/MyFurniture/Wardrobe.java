package MyFurniture;

public class Wardrobe extends Furniture implements Priceable{

    private final int doorWar;
    public Wardrobe(String nameFur, double lengthFur, double widthFur, double heightFur, String colorFur,double priceFur, int doorWar) {
        super(nameFur, lengthFur, widthFur, heightFur, colorFur, priceFur);
        this.doorWar = doorWar;

    }

    @Override
    public String toString() {

        return super.toString()
                +"\n Количество дверей: " + doorWar;
    }

    @Override
    public double getPrice() {
        System.out.println("Сумма НДС 15%");
        return 0.15;
    }
}
