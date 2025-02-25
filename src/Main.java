//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// колличество бонусов за каждые 200 рублей
        int bonusRate = 5;
// порог для начисления бонуса
        int bonusThreshold = 1000;
// начальный баланс на счете
        int initialBalans = 200;
// сумма пополнения
        int depositAmount = 1000;
// условия
        int bonus;
        if (depositAmount >= bonusThreshold) {
            bonus = (depositAmount / initialBalans ) * bonusRate;
        } else {
            bonus = 0;
        }
        // Итоговый баланс
        int finalBalans = initialBalans + depositAmount + bonus;

        // Вывод результатов
        System.out.println("Итоговый баланс: " + finalBalans + " рублей");
        System.out.println("Начислено бонусов: " + bonus + " рублей");
             }
}