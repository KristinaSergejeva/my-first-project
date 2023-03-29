package lv.acodemy.homework;

import scala.collection.parallel.ParIterableLike;

public class PezDispenser {

    private String color;
    private String pezName;
    private String seriesName;
    private int candyCount;
    private final int MAX_CANDIES = 12;

    public PezDispenser(String color, String pezName, String seriesName) {
        this.color = color;
        this.pezName = pezName;
        this.seriesName = seriesName;
        this.candyCount = MAX_CANDIES;
    }
    public String getColor() {
        return color;
    }
    public String getPezName() {
        return pezName;
    }
    public String getSeriesName() {
        return seriesName;
    }
    public int getCandyCount() {
        return candyCount;
    }
    public int getMax_Candies() {
        return MAX_CANDIES;
    }

    // - отдавать по одной конфетке
    public void eatCandy() {
        if (candyCount == 0) {
            System.out.println("Empty Pez Dispenser.");
            System.out.println("Max is: 12. Current: " + candyCount);
        } else {
            System.out.println("Give me one candy!");
            System.out.println("Max is: 12. Current: " + candyCount);
            candyCount--;
        }
    }

    // - отдавать любое количество нам нужных конфет
    public void eatCandies(int enterCandyCount) {
        if (enterCandyCount > MAX_CANDIES) {
            System.out.println("You asking too much candies.");
            System.out.println("Max is: 12. Current: " + candyCount);
        } else if (enterCandyCount < 1) {
            System.out.println("Impossible to take the candies.");
            System.out.println("Max is: 12. Current: " + candyCount);
        } else if (enterCandyCount > candyCount) {
            System.out.println("Pez Dispenser does not have candies.");
            System.out.println("Max is: 12. Current: " + candyCount);
        } else {
            candyCount -= enterCandyCount;
            System.out.println("Take your candies.");
            System.out.println("Max is: 12. Current: " + candyCount);
        }
    }

    // - загружать по одной конфетке
    public void fill() {
        if (candyCount == 0) {
            System.out.println("Empty Pez Dispenser.");
            System.out.println("Max is: 12. Current: " + candyCount);
        } else {
            System.out.println("Upload one candy!");
            System.out.println("Max is: 12. Current: " + candyCount);
            candyCount++;
        }
    }

    // - загружать любое количество конфет
    public void fillDispenser(int enterCandyCount) {
        if (enterCandyCount > MAX_CANDIES) {
            System.out.println("You upload too much candies.");
            System.out.println("Max is: 12. Current: " + candyCount);
        } else if (enterCandyCount > 10) {
            System.out.println("There is too much candies again.");
            System.out.println("Max is: 12. Current: " + candyCount);
        } else {
            candyCount += enterCandyCount;
            System.out.println("Upload your candies.");
            System.out.println("Max is: 12. Current: " + candyCount);
        }
    }

    // - загружать целиком недостающие конфеты
    public void fillDispenserFully() {
        int currentCount = candyCount;
            System.out.println("Now in Pez Dispenser is this amount of candies: " + currentCount);
        int addMissingCandies = MAX_CANDIES - currentCount;
            System.out.println("I will add " + addMissingCandies + " candies to fill dispenser fully.");
        if (addMissingCandies > MAX_CANDIES) {
            System.out.println("Impossible fill Dispenser.");
            System.out.println("Max is: 12. Current: " + candyCount);
        } else {
            candyCount += addMissingCandies;
            System.out.println("You can fill the Pez Dispenser fully.");
            System.out.println("Max is: 12. Current: " + candyCount);
        }
    }
}






