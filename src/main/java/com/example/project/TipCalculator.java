package com.example.project;
public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

        // calculates each value to be printed
        double tip = cost * (percent / 100.0); // divides percent by 100 so it can be used as a decimal, then multiplies by cost
        double fullCost = cost + tip;  // calculates the cost including tip
        double costPer = cost / people; // each of the next 3 divide previous results by the # of people to split the cost
        double tipPer = tip / people;
        double fullCostPer = fullCost / people;

        // rounds all values to 2 decimal places (after all the math so the math is still accurate)
        // I found an explanation for Math.round here: https://www.educative.io/answers/how-to-use-the-java-mathround-method
        tip = Math.round(tip * 100) / 100.0;
        fullCost = Math.round(fullCost * 100) / 100.0;
        costPer = Math.round(costPer * 100) / 100.0;
        tipPer = Math.round(tipPer * 100) / 100.0;
        fullCostPer = Math.round(fullCostPer * 100) / 100.0;

        // adds all values (concatenated to their respective strings) to the result
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); // dollar signs are added to all strings except percentage
        result.append("Total percentage: " + percent + "%\n"); // percent symbol is added after the percent value
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
