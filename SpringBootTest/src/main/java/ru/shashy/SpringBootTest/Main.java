package ru.shashy.SpringBootTest;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        List<Integer> buyDays = new ArrayList<>();
        List<Integer> sellDays = new ArrayList<>();
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            int buy1 = prices[i];
            int sell1 = sellOne(prices, i);
            int buy2 = buyOne(prices, i, sell1);
            int sell2 = sellOne(prices, buy2);

            int profit = getProfit(prices, buy1, sell1, buy2, sell2);
            if (profit > maxProfit) {
                maxProfit = profit;
                buyDays.clear();
                sellDays.clear();
                buyDays.add(i+1);
                sellDays.add(sell1+1);
                if (buy2 != -1) {
                    buyDays.add(buy2+1);
                    sellDays.add(sell2+1);
                }
            }
        }

        System.out.println(buyDays.size());
        for (int i = 0; i < buyDays.size(); i++) {
            System.out.println(buyDays.get(i) + " " + sellDays.get(i));
        }
    }

    private static int sellOne(int[] prices, int start) {
        int n = prices.length;
        int maxIndex = start;
        for (int i = start+1; i < n; i++) {
            if (prices[i] > prices[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int buyOne(int[] prices, int start, int end) {
        int n = prices.length;
        int minIndex = start;
        for (int i = start+1; i < end; i++) {
            if (prices[i] < prices[minIndex]) {
                minIndex = i;
            }
        }
        if (prices[minIndex] >= prices[end]) {
            return -1;
        }
        return minIndex;
    }

    private static int getProfit(int[] prices, int buy1, int sell1, int buy2, int sell2) {
        int profit = (sell1 > buy1 ? prices[sell1] - prices[buy1] : 0) +
                     (sell2 > buy2 ? prices[sell2] - prices[buy2] : 0);
        return profit;
    }
}
