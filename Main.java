import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Farm farm1= new Farm("adress1",5,2,3,"name1");
        Farm farm2 = new Farm("adress2",1,1,1,"name2");
        Farm [] farm3 = new Farm[] {farm1, farm2};
        Cow cow1 = new Cow(12,23,"W","white","cow1");
        Cow cow2 = new Cow(10,25,"W","white","cow2");
        Cow cow3 = new Cow(4,20,"W","Black","cow3");
        Animal [] animals = new Animal[]{cow1,cow2,cow3};


        System.out.println(isThin(cow1));
        System.out.println(Arrays.toString(getWhiteAnimals(animals)));
        System.out.println(Arrays.toString(getCows(animals)));
        System.out.println(Arrays.toString(getAnimalByGender("W", animals)));

    }

    public static boolean isThin(Animal animal){
        boolean a = false;
        if (animal.getWeight()<5){
            return !a;
        }
        return a;
    }

    public static Animal [] getWhiteAnimals(Animal [] animal){
        Animal [] animals = new Animal[animal.length];
        int counter=0;
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].getColour().equalsIgnoreCase("White")) {
                animals[counter]=animal[i];
                counter++;

            }
        }
        return animals;
    }
    public static Cow [] getCows (Animal[] animal){
        Cow [] cows = new Cow[animal.length];
        int counter = 0;
        for (int i = 0; i < animal.length; i++) {
            if (animal[i] instanceof Cow){
                cows[counter]=(Cow)animal[i];
                counter++;
            }
        }
        cows = Arrays.copyOf(cows, counter);
        return cows;
    }

    public static Animal [] getAnimalByGender (String gender, Animal [] animal){
        Animal [] animals = new Animal[animal.length];
        int counter=0;
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].getGender().equalsIgnoreCase(gender)) {
                animals[counter]=animal[i];
                counter++;

            }
        }
        return animals;
    }
}