package praktika1;

public class Nikitin_Mikhail_dog {
    private String breed;
    private int age;
    private double weight;
    private String name;

    public Nikitin_Mikhail_dog(double weight, String name, String breed, int age) {
        this.weight = weight;
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + ", name=" + name + ", weight=" + weight + ", age=" + age + '}';
    }
}
