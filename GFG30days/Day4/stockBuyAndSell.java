package GFG30days.Day4;

public class stockBuyAndSell {

    public void stockBuySell(int price[], int n) {

        int buy = -1, sell = -1;
        int i = 0;

        while(i < n-1) {
            if(price[i] < price[i+1]) {
                buy = i;
                while(i < n-1 && (price[i] < price[i+1])) {
                    i++;
                }
                sell = i;
                if(sell - buy > 0) {
                    System.out.print("("+ buy + " " + sell + ")" + " ");
                }
            }
            else {
                i++;
            }
        }
        if(buy == -1 || sell == -1) System.out.print("No Profit");
        System.out.println();
    }
    
}
