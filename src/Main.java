import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(medot(generateRandomAge(), 4));
        System.out.println(medot(generateRandomAge(), 15 ));
        System.out.println(medot(generateRandomAge(), 23 ));
        System.out.println(medot(generateRandomAge(), 5 ));
        System.out.println(medot(generateRandomAge(), 40 ));
    }

    public static String medot(int age, int temp) {
        if (age >=20 & age <= 45 & temp >=-20 & temp <= 45){
            return "Можно идти гулять";
        } else if (age <= 20 && temp > 0 && temp < 28){
            return "Можно идти гулять";
        }
        else if (age > 45 && temp > -10 && temp < 25){
            return "Можно идти гулять";
        }
        else{
            return "Оставайся дома";
        }
    }
    public static int generateRandomAge() {
        Random random = new Random();
        int generaitrandom = random.nextInt(65)+1;
        System.out.println("случайное число: " + generaitrandom);
    return generaitrandom;
    }
}