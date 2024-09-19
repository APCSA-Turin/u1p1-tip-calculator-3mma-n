package com.example.project;
public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        // calculates each value to be printed
        double tip = cost * (percent / 100.0);
        double fullCost = cost + tip; 
        double costPer = cost / people;
        double tipPer = tip / people;
        double fullCostPer = fullCost / people;

        // rounds all values to 2 decimal places (after all the math so the math is still accurate)
        tip = Math.round(tip * 100) / 100.0;
        fullCost = Math.round(fullCost * 100) / 100.0;
        costPer = Math.round(costPer * 100) / 100.0;
        tipPer = Math.round(tipPer * 100) / 100.0;
        fullCostPer = Math.round(fullCostPer * 100) / 100.0;

        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + tip + "\n");
        result.append("Total Bill with tip: $" + fullCost + "\n");
        result.append("Per person cost before tip: $" + costPer + "\n");
        result.append("Tip per person: $" + tipPer + "\n");
        result.append("Total cost per person: $" + fullCostPer + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12;
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
