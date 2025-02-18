public class FunctionJS1 {
    public static void main(String[] args) {
        int[] prices = {75000, 50000, 60000, 10000};
        int[][] stock = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        int[] stockLoss = {-1, -2, 0, -5};

        int[] incomes = branchIncome(stock, prices);
        for (int i = 0; i < incomes.length; i++) {
            System.out.println("RoyalGarden " + (i + 1) + " : " + incomes[i]);
        }
        
        int[] updatedStock = updateStock(stock[3], stockLoss);
        System.out.print("Updated stock for RoyalGarden 4 branch is : ");
        for (int num : updatedStock) {
            System.out.print(num + " ");
        }
    }

    static int[] branchIncome(int[][] stock, int[] prices) {
        int[] incomes = new int[stock.length];
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                incomes[i] += stock[i][j] * prices[j];
            }
        }
        return incomes;
    }

    static int[] updateStock(int[] stock, int[] stockLoss) {
        int[] newStock = new int[stock.length];
        for (int i = 0; i < stock.length; i++) {
            newStock[i] = stock[i] + stockLoss[i];
        }
        return newStock;
    }
}
