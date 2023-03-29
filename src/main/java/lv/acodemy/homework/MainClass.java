package lv.acodemy.homework;

public class MainClass {
    public static void main(String[] args) {
        PezDispenser bugsBunny = new PezDispenser("grey", "Bugs Bunny", "Looney Tunes");
        System.out.println(bugsBunny.getPezName());
        System.out.println(bugsBunny.getColor());
        System.out.println(bugsBunny.getSeriesName());

        bugsBunny.eatCandy();
        System.out.println(bugsBunny.getCandyCount());

        bugsBunny.eatCandies(7);

        bugsBunny.fill();
        System.out.println(bugsBunny.getCandyCount());

        bugsBunny.fillDispenser(3);

        bugsBunny.fillDispenserFully();







    }



}
