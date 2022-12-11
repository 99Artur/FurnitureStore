import MyFurniture.Sofas;
import MyFurniture.Tables;
import MyFurniture.Wardrobe;

public class Main {
    public static void main(String[] args) {


        Wardrobe[] wardrobes = new Wardrobe[3];
        wardrobes[0] = new Wardrobe("Шерлок",70.3, 34.3, 239.5, "шоколадный", 20288.0, 2);
        wardrobes[1] = new Wardrobe("Лофт",120, 57.5, 202, "тёмный", 32855.0, 2);
        wardrobes[2] = new Wardrobe("Линда",90.8, 38.2, 220, "белый", 15070.0, 2);

        Sofas[] sofas = new Sofas[3];
        sofas[0] = new Sofas("Атланта",226, 79, 87, "серый", 21067.0, 132, 194);
        sofas[1] = new Sofas("Парма",195, 78, 80, "бирюзовый", 12598.0, 160, 200);
        sofas[2] = new Sofas("Солана",250, 121, 90, "горчичный", 36120.0, 144, 196);

        Tables[] tables1 = new Tables[3];
        tables1[0] = new Tables("Промо",110, 67, 75, "шоколадный", 5917.0, 4);
        tables1[1] = new Tables("Модерн",80, 80, 75, "бирюзовый", 4596.5, 3);
        tables1[2] = new Tables("Модекс2",120, 62, 75, "тёмный", 7927.0, 2);

        new Shop(wardrobes, sofas, tables1);

    }
}