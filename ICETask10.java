/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask10;

/**
 *
 * @author Mbali's macbookpro
 */
public class ICETask10 {

        public static void main(String[] args) {
        // Define the price and item arrays
        int[] prices = {200, 350, 700, 400};
        String[] items = {"Shirt", "Pants", "Sneakers", "Jacket"};

        // Calculate the sum of all elements in prices
        int sum = calculateSum(prices);
        System.out.println("Sum of prices: " + sum);

        // Calculate the average of the prices
        double average = calculateAverage(prices);
        System.out.println("Average price: " + average);

        // Get the maximum and minimum price
        int maxPrice = getMaxPrice(prices);
        int minPrice = getMinPrice(prices);
        System.out.println("Maximum price: " + maxPrice);
        System.out.println("Minimum price: " + minPrice);

        // Get the item with the highest price
        String itemWithHighestPrice = getItemWithHighestPrice(prices, items, maxPrice);
        System.out.println("Item with the highest price: " + itemWithHighestPrice);
    }

    // Method to calculate the sum of prices
    public static int calculateSum(int[] prices) {
        int sum = 0;
        for (int price : prices) {
            sum += price;
        }
        return sum;
    }

    // Method to calculate the average of prices
    public static double calculateAverage(int[] prices) {
        int sum = calculateSum(prices);
        return (double) sum / prices.length;
    }

    // Method to find the maximum price
    public static int getMaxPrice(int[] prices) {
        int maxPrice = prices[0];
        for (int price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to find the minimum price
    public static int getMinPrice(int[] prices) {
        int minPrice = prices[0];
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }

    // Method to get the item with the highest price
    public static String getItemWithHighestPrice(int[] prices, String[] items, int maxPrice) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == maxPrice) {
                return items[i];
            }
        }
        return null; // In case no item found (should not happen here)
    }
}

