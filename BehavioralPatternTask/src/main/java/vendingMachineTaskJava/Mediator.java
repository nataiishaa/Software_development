package vendingMachineTaskJava;

public class Mediator {
    private CoinState coins;

    public Mediator(CoinState coins) {
        this.coins = coins;
    }

    public void insertCoin(int value) {
        System.out.println("Customer tries to insert coin...");
        coins.insertCoin(value);
        System.out.println("Coin has been accepted...");
    }

    public boolean buy(int price) {
        boolean hasEnoughCoins = coins.hasEnoughCoins(price);
        if (hasEnoughCoins) {
            System.out.println("Preparing beverage...");
        } else {
            System.out.println("Not enough to buy beverage...");
        }
        return hasEnoughCoins;
    }

    public void returnCoins() {
        if (coins.hasEnoughCoins(1)) {
            System.out.println("Returning all coins...");
        } else {
            System.out.println("Machine has no coins to return...");
        }
}
}

