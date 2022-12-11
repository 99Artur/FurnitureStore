package MyFurniture;

public abstract class Furniture implements Priceable{

    private final String nameFur;
    private final double lengthFur;
    private final double widthFur;
    private final double heightFur;
    private final String colorFur;
    private final double priceFur;

    Furniture(String nameFur, double lengthFur, double widthFur, double heightFur, String colorFur, double priceFur) {
        this.nameFur = nameFur;
        this.lengthFur = lengthFur;
        this.widthFur = widthFur;
        this.heightFur = heightFur;
        this.colorFur = colorFur;
        this.priceFur = priceFur;

    }
    public double getPriceFur() {
        return priceFur;
    }

    @Override
    public String toString() {
        return nameFur +
                "\n Длина: " + lengthFur +
                "\n Ширина: " + widthFur +
                "\n Высота: " + heightFur +
                "\n Цвет: " + colorFur +
                "\n Цена: " + priceFur ;
    }

    public abstract double getPrice();
}
