package MyFurniture;

public class Sofas extends Furniture implements Priceable{

    private final int lengthSleep;
    private final int widthSleep;

    public Sofas(String nameFur, double lengthFur, double widthFur, double heightFur, String colorFur,double priceFur, int lengthSleep, int widthSleep) {
        super(nameFur, lengthFur, widthFur, heightFur, colorFur, priceFur);
        this.lengthSleep = lengthSleep;
        this.widthSleep = widthSleep;
    }

    @Override
    public String toString() {

         return super.toString()
         +"\n Размеры спального места (ШхГ): " +
                lengthSleep +"x"+ widthSleep;

    }



    @Override
    public double getPrice() {
        System.out.println("Сумма НДС 10%");
        return 0.10;
    }
}
