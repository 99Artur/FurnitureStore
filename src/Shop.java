import MyFurniture.Furniture;
import MyFurniture.Sofas;
import MyFurniture.Tables;
import MyFurniture.Wardrobe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shop {

    Shop(Wardrobe[] wardrobes, Sofas[] sofas, Tables[] tables1) {

        Scanner scanner = new Scanner(System.in);

        String[] myMenu = {"Шкафы", "Диваны", "Столы"};
        String myWardrobe = "шкаф";
        String mySofas = "диван";
        String myTables = "стол";
        String choiceWardrobe = "Вы выбрали шкаф ";
        String choiceSofas = "Вы выбрали диван ";
        String choiceTables = "Вы выбрали стол ";

        System.out.println("Здравствуете! \n Какую мебель хотите выбрать?");

        try {
            while (true) {

                printMenu(myMenu);
                System.out.println("0 - Выход");

                int command = scanner.nextInt();
                if (command == 1) {

                    printMenuOne(wardrobes);
                    System.out.println("Какой шкаф выберите?");
                    printMenuTwo(scanner, choiceWardrobe, wardrobes, myWardrobe);

                } else if (command == 2) {

                    printMenuOne(sofas);
                    System.out.println("Какой диван выберите?");
                    printMenuTwo(scanner, choiceSofas, sofas, mySofas);

                } else if (command == 3) {

                    printMenuOne(tables1);
                    System.out.println("Какой стол выберите?");
                    printMenuTwo(scanner, choiceTables, tables1, myTables);

                } else if (command == 0) {
                    System.out.println("Выход");
                    break;
                } else {
                    System.out.println("Извините, такой команды пока нет.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Что то пошло не так!!!");

        }
    }

    public static void printMenu(String[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println((i + 1) +" - " + e[i]);
        }
    }

    public static void printMenuOne(Furniture[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println((i + 1) +" - " + e[i]);

        }
    }

    public static void printMenuTwo(Scanner scanner, String choice, Furniture[] furniture, String furnitur) {

        int command1 = scanner.nextInt();
        if (command1 == 1) {
            System.out.println(choice + furniture[0].toString());
            purchase(scanner, furniture, furnitur);
        } else if (command1 == 2) {
            System.out.println(choice + furniture[1].toString());
            purchaseOne(scanner, furniture, furnitur);
        } else if (command1 == 3) {
            System.out.println(choice + furniture[2].toString());
            purchaseTwo(scanner, furniture, furnitur);
        }
    }

    public static void purchase(Scanner scanner, Furniture[] e, String furnitur) {

        System.out.println("Хотите купить мебель! \n 1 - Да : 2 - Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            System.out.println("Сколько у вас денег?");
            double myMoney = scanner.nextInt();
            if (myMoney > e[0].getPriceFur()) {
                myMoney =myMoney - (e[0].getPriceFur() +(e[0].getPriceFur() * e[0].getPrice()));
                double result = Math.ceil(myMoney);
                System.out.println("Купили "+ furnitur +" осталось средств "+ result);
            } else if (myMoney < e[0].getPriceFur()) {
                System.out.println("Недостаточна средств!");
            }
        } else if (command == 2) {
            System.out.println("Нет так нет");
        }
    }

    public static void purchaseOne(Scanner scanner, Furniture[] e, String furnitur) {

        System.out.println("Хотите купить мебель! \n 1 - Да : 2 - Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            System.out.println("Сколько у вас денег?");
            double myMoney = scanner.nextInt();
            if (myMoney > e[1].getPriceFur()) {
                myMoney =myMoney - (e[1].getPriceFur() +(e[1].getPriceFur() * e[1].getPrice()));
                double result = Math.ceil(myMoney);
                System.out.println("Купили "+ furnitur +" осталось средств "+ result);
            } else if (myMoney < e[1].getPriceFur()) {
                System.out.println("Недостаточна средств!");
            }
        } else if (command == 2) {
            System.out.println("Нет так нет");
        }

    }

    public static void purchaseTwo(Scanner scanner, Furniture[] e, String furnitur) {

        System.out.println("Хотите купить мебель! \n 1 - Да : 2 - Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            System.out.println("Сколько у вас денег?");
            double myMoney = scanner.nextInt();
            if (myMoney > e[2].getPriceFur()) {
                myMoney =myMoney - (e[2].getPriceFur() +(e[2].getPriceFur() * e[2].getPrice()));
                double result = Math.ceil(myMoney);
                System.out.println("Купили "+ furnitur +" осталось средств "+ result);
            } else if (myMoney < e[2].getPriceFur()) {
                System.out.println("Недостаточна средств!");
            }
        } else if (command == 2) {
            System.out.println("Нет так нет");
        }

    }
}
