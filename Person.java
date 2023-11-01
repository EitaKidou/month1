public class Person {
    String floor;
    String colorSkin;
    String placeOfBirth;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "floor='" + floor + '\'' +
                ", colorSkin='" + colorSkin + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", age=" + age +
                '}';
    }
}
