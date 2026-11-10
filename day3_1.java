// BUY AND SELL STOCK 

import java.util.*;
public class day3_1 {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int minPrice = arr[0];
        int maxProfit = 0;

    for(int i = 1; i<n; i++){
        if(arr[i] < minPrice){
            minPrice = arr[i];
        }
        else{
            int Profit = arr[i] - minPrice;

        
        if(Profit > maxProfit){
            maxProfit = Profit;
        }
        }
    }
    System.out.println(maxProfit);

    }
}
