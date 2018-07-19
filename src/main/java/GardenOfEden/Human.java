package GardenOfEden;

public class Human {
    private String name;
    private boolean gender;
    private int age;

    public Human(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGender() {
        if (isGender())
            return "Male";
        else return "Felame";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say(String words) {
        System.out.println(words);
    }

    public void eat(Apple food) {
        food.weight--;
    }

    public void sleep() {
        System.out.println(name + " is sleep");
    }
}
