package Main;

import Builder.Present;
import Builder.PresentBuilder;
import Sweets.Sweet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Present present = PresentBuilder.createPresent();

        while (true) {
            printMenu();
            int choose = scn.nextInt();
            scn.nextLine();
            switch (choose) {
                case 1: {
                    //добавление конфет
                    System.out.println("Конфеты добавлены в подарок");
                    break;
                }
                case 2: {
                    for (Sweet sweet : present) {
                        System.out.println(sweet);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Вес всего подарка составляет " + present.getPresentWeight() + " грамм");
                    break;
                }
                case 4: {
                    System.out.println("Список конфет отсортирован по возрастанию веса, для просмотра нажмите '2'");
                    present.sortByWeight();
                    break;
                }
                case 5: {
                    System.out.print("Введите диапозон содержания сахара [a;b] : \na : ");
                    int a = scn.nextInt();
                    System.out.print("b : ");
                    int b = scn.nextInt();
                    for (Sweet sweet : present.getSweetsWithShugarAmountInRange(a, b)) {
                        System.out.println(sweet + " Sugar amount:" + sweet.getSugarAmount());
                    }
                    break;
                }
                case 0: {
                    return;
                }
                default: {
                    System.out.println("Нету такого пункта, выберите ещё раз...");
                }
            }
        }
    }
    static void printMenu() {
        System.out.println("""
                
                Меню:
                1 - Добавить конфеты в подарок
                2 - Посмотреть, какие конфеты есть в подарке 
                3 - Подсчетать вес подарка
                4 - Сортировка конфеты в подарке
                5 - Найти конфету в подарке, соответствующую заданному диапазону содержания сахара
                0 - Завершить работу\s""");
    }
}
