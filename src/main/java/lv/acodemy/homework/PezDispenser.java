package lv.acodemy.homework;

public class PezDispenser {

    private String color;
    private String pezName;
    private String seriesName;
    private int candyCount;
    private final int MAX_CANDIES = 12;
    private final int MIN_CANDIES = 1;

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

    // - отдавать по одной конфетке
    public void eatCandy() {
        if (candyCount < MIN_CANDIES) {
            System.out.println("Empty Pez Dispenser.");
        } else {
            System.out.println("Give me one candy!");
            candyCount--;
        }
    }

    // - отдавать любое количество нам нужных конфет
    public void eatCandies(int enterCandyCount) {
        if (enterCandyCount > MAX_CANDIES) {
            System.out.println("You asking too much candies.");
            System.out.println("Max is: " + MAX_CANDIES + ". Current: " + candyCount);
        } else if (enterCandyCount < MIN_CANDIES) {
            System.out.println("Impossible to take the candies.");
            System.out.println("Max is: " + MAX_CANDIES + ". Current: " + candyCount);
        } else if (enterCandyCount > candyCount) {
            System.out.println("Pez Dispenser does not have candies.");
            System.out.println("Max is: " + MAX_CANDIES + ". Current: " + candyCount);
        } else {
            candyCount -= enterCandyCount;
            System.out.println("Take your candies.");
            System.out.println("Max is: " + MAX_CANDIES + ". Current: " + candyCount);
        }
    }

    // - загружать по одной конфетке
    public void fillOneCandy() {
        if (candyCount == MAX_CANDIES) {
            System.out.println("You can't load more candies in Pez Dispenser.");
            System.out.println("Max is: " + MAX_CANDIES + ". Current: " + candyCount);
        } else {
            System.out.println("Upload one candy!");
            System.out.println("Max is: " + MAX_CANDIES + ". Current: " + candyCount);
            candyCount++;
        }
    }

    // - загружать любое количество конфет
    public void fillDispenser(int enterCandyCount) {
        if (enterCandyCount > MAX_CANDIES) {
            System.out.println("You upload too much candies.");
            System.out.println("Max is: " + MAX_CANDIES + ". Current: " + candyCount);
        } else if (enterCandyCount < MIN_CANDIES) {
            System.out.println("Impossible.");
            System.out.println("Max is: " + MAX_CANDIES + ". Current: " + candyCount);
        } else if (enterCandyCount > (MAX_CANDIES - candyCount)) {
            System.out.println("Your Pez Dispenser don't have that much space.");
            System.out.println("Max is: " + MAX_CANDIES + ". Current: " + candyCount);
        } else {
            candyCount += enterCandyCount;
            System.out.println("Upload your candies.");
            System.out.println("Max is: " + MAX_CANDIES + ". Current: " + candyCount);
        }
    }

    // - загружать целиком недостающие конфеты
    public void loadOfMissingCandies() {
        System.out.println("I will add " + (MAX_CANDIES - candyCount) + " candies to fill dispenser fully.");
        candyCount = MAX_CANDIES;
        System.out.println("Pez Dispenser is full.");
        System.out.println("Max is: " + MAX_CANDIES + ". Current: " + candyCount);
        }
    }