public class Main {
    public static void main(String[] args) {

        int balance = 89;  // рублей текущий баланс
        int refill = 1000;

        if (refill > 1000) {
            System.out.println((refill / 100) + " рублей бонусами.");
            System.out.printf((refill / 100 + refill + balance) + " рублей - итоговая сумма на балансе.");
        } else {
            System.out.println((0) + " рублей бонусами.");
            System.out.printf((refill + balance) + " рублей - итоговая сумма на балансе.");

        }
    }
}
