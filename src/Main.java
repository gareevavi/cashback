public class Main {
    public static void main(String[] args) {
        int purchaseRegular = 1_000_00;
        int purchaseHigh = 1_000_00;
        int specialOffer = 1_000_00;

        int percentRegular = 1;
        int percentHigh = 5;
        int percentSpecial = 30;

        int limit = 3000;

        int cashbackRegular = purchaseRegular * percentRegular / 100;
        int cashbackHigh = purchaseHigh * percentHigh / 100;
        int cashbackSpecial = specialOffer * percentSpecial / 100;

        int cashbackTotal = cashbackRegular + cashbackHigh + cashbackSpecial;

        if (cashbackTotal > limit) {
            cashbackTotal = limit;
        }
        System.out.println(cashbackTotal);



    }
}
