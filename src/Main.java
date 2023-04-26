
public class Main {
    public static void main(String[] args) {


        int x = 200; // денег на счету клиента
        int y = 1300; // клиент положил на счёт
        int v = y / 100;
        System.out.printf("Итоговый баланс =" + " " + (v + y + x) + " " + "рублей." + " ");

        if (y > 1000) {

            System.out.printf("Начислено бонусных рублей" + " " + v + ".");

        }


    }
}