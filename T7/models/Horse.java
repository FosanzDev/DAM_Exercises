package models;

public class Horse {
    private static int count = 0;
    private final int id;
    private final String name;
    private final double height;
    private final String breed;

    public Horse() {
        this("Unknown", 0.0, "Unknown");
    }

    public Horse(String name, double height, String breed) {
        this.id = ++count;
        this.name = name;
        this.height = height;
        this.breed = breed;
    }

    public Horse(String name, double height) {
        this(name, height, "Unknown");
    }

    public String getBreed() {
        return breed;
    }

    public static int getCount() {
        return count;
    }

    public double getHeight() {
        return height;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Horse{" + "id=" + id +
        ", name=" + name +
        ", height=" + height +
        ", breed=" + breed + '}';
    }

}
