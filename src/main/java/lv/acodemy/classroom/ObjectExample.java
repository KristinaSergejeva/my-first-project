package lv.acodemy.classroom;

public class ObjectExample {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik");
        System.out.println(barsik.getAge());
        System.out.println(barsik);

        barsik.setAge(4);
        System.out.println(barsik.getAge());

        System.out.println(barsik.getWeight());

        barsik.speak();
        barsik.feed();

        barsik.setWeight(6.4);
        System.out.println(barsik.getWeight());
        System.out.println(barsik);

        Cat sheba = new Cat("Sheba", "White", "Persian", "Female", true);
        sheba.setAge(2);
        sheba.setWeight(3.5);
        System.out.println(sheba);

        System.out.printf("My cat's name is: %s. My cat is %d years old.\n", sheba.getName(), sheba.getAge());

        sheba.walk();
        sheba.walk();
        sheba.walk();
        sheba.walk();
        sheba.walk();
        sheba.walk();
        System.out.println(sheba.getEnergy());

        sheba.feed();
        sheba.feed();
        sheba.feed();
        sheba.feed();
        sheba.feed();
        sheba.feed();












    }
}
