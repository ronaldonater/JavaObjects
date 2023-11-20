/*
I will be creating a class based on dogs since I got a new and my first ever puppy last Saturday.
This class will contain the attributes of the dog's age, breed, fur color, eye color, weight, and its name.
 */
public class Dog {
    private int age;
    private String breed;
    private String furColor;
    private String eyeColor;
    private double weight;
    private String name;

    public Dog(int age, String breed, String furColor, String eyeColor, double weight, String name) {
        this.age = age;
        this.breed = breed;
        this.furColor = furColor;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.name = name;
    }

    public int getAge() { return age; }

    public String getBreed() {
        return breed;
    }

    public String getFurColor() {
        return furColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() { return name; }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Dog [" +
                "Name: " + name +
                ", Age: " + age + " year/s old" +
                ", Breed: " + breed +
                ", Fur Color: " + furColor +
                ", Eye Color: " + eyeColor +
                ", Weight: " + weight + " lbs]";
    }

    public static void main(String[] args) {
        // Creating a Dog object
        Dog myDog = new Dog(1, "Golden Doodle", "Chocolate Merle", "Hazel", 5, "Cookie");

        // Displaying information about the dog
        System.out.println(myDog);
    }
}