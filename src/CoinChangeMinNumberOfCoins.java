public class CoinChangeMinNumberOfCoins {
    public static void main(String[] args) {
        int[] coins = {1,2};
        int amount = 3;

        System.out.println("Answer: " + coinChange(coins, amount, 0));
    }

    public static int coinChange(int[] coins, int amount, int index) {
        if(amount < 0) {
            return 0;
        }

        if(amount == 0) {
            return 1;
        }

        if(amount < 0 && index >= coins.length) {
            return 0;
        }

        for(int i=0; i<coins.length; i++) {

            if(coins[i] > amount) {
                return coinChange(coins, amount, i+1);
            }
            else {
                return Math.min(coinChange(coins, amount-coins[i], i),
                                    coinChange(coins, amount, i+1));
            }
        }

        return -1;
    }

    public static int coinChangeSecondWay(int[] coins, int amount) {

        if(amount < 1) {
            return 0;
        }

        int[] minCoinsDP = new int[amount + 1];

        for(int i=1; i<=amount; i++) {
            minCoinsDP[i] = Integer.MAX_VALUE;

            // Checking each and every coin
            for(int coin : coins) {
                if(coin <= i && minCoinsDP[i-coin] != Integer.MAX_VALUE) {
                    minCoinsDP[i] = Math.min(minCoinsDP[i], 1 + minCoinsDP[i-coin]);
                }
            }
        }

        if(minCoinsDP[amount] == Integer.MAX_VALUE) {
            return -1;
        }

        return minCoinsDP[amount];
    }
}
