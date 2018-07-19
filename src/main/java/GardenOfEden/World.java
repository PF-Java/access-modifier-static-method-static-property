package GardenOfEden;

public class World {
    private static final boolean MALE = true;
    private static final boolean FEMALE = false;

    public static void main(String[] args) {
        System.out.println("--------At Garden of eden:---------");
        System.out.println("1.Adam was born");
        Human adam = new Human("Adam", MALE);
        System.out.printf("Name: " + adam.getName() + "\nGender: " + adam.getGender());

        System.out.println("\n2.Eva was born");
        Human eva = new Human("Eva", FEMALE);
        System.out.printf("Name: " + eva.getName() + "\nGender: " + eva.getGender());

        System.out.println("\n3.God said: ");
        God god = new God();
        god.say("Do not eat apple! You gonna die.");

        System.out.println("4.Snake said: ");
        Snake snake = new Snake();
        snake.say("Just take that apple. Very Nice. You will alive");

        System.out.print("5.They begin eat apple: >");
        Apple food = new Apple();
        do {
            eva.eat(food);
            adam.eat(food);
            System.out.print("---");
        } while (!food.isEmpty());
        if (food.isEmpty()) System.out.println("---> out of apple");

        System.out.println("6.They sleep");
        adam.sleep();
        eva.sleep();

        System.out.println("God said:");
        god.say("7.Eva! You must obey your husband and you gonna get hurt when you born your child.");
        god.say("Adam! You ate the apple which I told you not to eat. So now you will have to work hard all your life to make it produce enough food for you! ");
        System.out.println("8.End!");
    }
}
