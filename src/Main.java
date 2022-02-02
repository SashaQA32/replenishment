public class Main {
    public static void main(String[] args) {
        int balance = 250;
        int replenishment = 1200;
        int bonusReplenishment = 100;
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / bonusReplenishment;
        } else {
            bonus = 0;
        }
        int result = balance + replenishment + bonus;
        System.out.println("Итоговый счет в рублях = " + result);
        System.out.println("Начислено количество бонусных рублей = " + bonus);
    }
}