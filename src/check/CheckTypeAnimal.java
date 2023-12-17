package check;

import data.AnimalTypeData;

import java.util.Locale;
import java.util.Scanner;

public class CheckTypeAnimal {

    public static String checkStrTypeAnimal(Scanner scanner, String message) {
        while (true) {
            System.out.println("Ввидите одно из животных (CAT(кошка)/ DOG(собака)/ DUCK(утка)");
            String animalStr = scanner.next().trim().toUpperCase(Locale.ROOT);
            // защита от дурака
            boolean isAndExist = false;
            for (AnimalTypeData animalTypeData : AnimalTypeData.values()) {
                if (animalTypeData.name().equals(animalStr)) {
                    isAndExist = true;
                    return animalStr;
                }
            }
            if (!isAndExist) {
                System.out.println(String.format("Введенный тип животного %s не поддерживается", animalStr));
                continue;
            }
            break;
        }
        return message;
    }

}
