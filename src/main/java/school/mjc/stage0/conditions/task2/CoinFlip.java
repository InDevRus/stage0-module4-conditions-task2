package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {
        var LAST_EAGLE = 500;
        var coinFlip = from1UpTo1000 < LAST_EAGLE ? "Eagle" : "Tail";
        System.out.println(coinFlip);
    }
}
