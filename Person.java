public class Person {

    private String name;
    private int age;
    private String eyeColor;

    public Person() {
        this.name = "Mishan Rana";
        this.age = 19;
        this.eyeColor = "Brown";
    }

    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
        }
    public int getAge() {
        return age;
        }
    public String getEyeColor() {
        return eyeColor;
        }

    public void setName(String name) {
        this.name = name;
        }
    public void setAge(int age) {
        this.age = age;
        }
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        }

    public void talk() {
        System.out.println("Welcome, coders! I am " + name);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", eyeColor='" + eyeColor + "'}";
    }
}