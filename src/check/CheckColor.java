package check;

import data.AnimalColorData;

import java.util.Locale;
import java.util.Scanner;

public class CheckColor {

    public static String checkStrColor(Scanner scanner, String message){
        while (true) {
            System.out.println(message);
            String colorStr = scanner.next().trim().toUpperCase(Locale.ROOT);
            boolean isColorExist = false;
            for (AnimalColorData animalColorData : AnimalColorData.values()) {
                if (animalColorData.name().equals(colorStr)) {
                    isColorExist = true;
                    return colorStr;
                }
            }
            if (!isColorExist) {
                System.out.println(String.format("Введенный цвет %s не поддерживается", colorStr));
                continue;
            }
            break;
        }
        return message;
    }

}
