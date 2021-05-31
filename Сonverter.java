package com.company;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.company.Formulas.*;

public class Сonverter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Float> in_one_meter = new HashMap<>();
        in_one_meter.put("cm", 100F);
        in_one_meter.put("ft", 3.28F);
        in_one_meter.put("in", 39.37F);
        in_one_meter.put("mm", 1000F);
        in_one_meter.put("yd", 1.093F);
        in_one_meter.put("km", 0.001F);

        Map<String, Float> in_one_kilometer = new HashMap<>();
        in_one_kilometer.put("m", 1000F);
        in_one_kilometer.put("ft", 3280.84F);
        in_one_kilometer.put("in", 39370.1F);
        in_one_kilometer.put("mm", 1000000F);
        in_one_kilometer.put("yd", 1093.61F);
        in_one_kilometer.put("cm", 100000F);

        Map<String, Float> in_one_centimeter = new HashMap<>();
        in_one_centimeter.put("m", 0.01F);
        in_one_centimeter.put("ft", 0.032F);
        in_one_centimeter.put("in", 0.393F);
        in_one_centimeter.put("mm", 10F);
        in_one_centimeter.put("yd", 0.01F);
        in_one_centimeter.put("km", 0.00001F);

        Map<String, Float> in_one_millimeter = new HashMap<>();
        in_one_millimeter.put("m", 0.001F);
        in_one_millimeter.put("ft", 0.003F);
        in_one_millimeter.put("in", 0.039F);
        in_one_millimeter.put("cm", 0.1F);
        in_one_millimeter.put("yd", 0.001F);
        in_one_millimeter.put("km", 0.000001F);

        Map<String, Float> in_one_ft = new HashMap<>();
        in_one_ft.put("m", 0.3048F);
        in_one_ft.put("mm", 304.8F);
        in_one_ft.put("in", 12F);
        in_one_ft.put("cm", 30.48F);
        in_one_ft.put("yd", 0.333F);
        in_one_ft.put("km", 0.0003F);

        Map<String, Float> in_one_yard = new HashMap<>();
        in_one_yard.put("m", 0.914F);
        in_one_yard.put("mm", 914.4F);
        in_one_yard.put("in", 36F);
        in_one_yard.put("cm", 91.4F);
        in_one_yard.put("ft", 3F);
        in_one_yard.put("km", 0.0009F);

        Map<String, Float> in_one_inch = new HashMap<>();
        in_one_inch.put("m", 0.025F);
        in_one_inch.put("mm", 25.4F);
        in_one_inch.put("yd", 0.027F);
        in_one_inch.put("cm", 2.54F);
        in_one_inch.put("ft", 0.083F);
        in_one_inch.put("km", 0.000025F);


        System.out.println("С какой единицы конвертировать? ");
        String unit1 = scanner.nextLine();
        System.out.println("Пожалуйста укажите в какую еденицу конвертировать: ");
        String unit2 = scanner.nextLine();
        System.out.println("Пожалуйста укажите значение:");
        float number = scanner.nextFloat();

        switch (unit1) {
            case ("m"):
                System.out.println("Result: " + convert_to_meters(in_one_meter, unit2, number));
                break;

            case ("km"):
                System.out.println("Result: " + convert_to_kilometers(in_one_kilometer, unit2, number));
                break;

            case ("cm"):
                System.out.println("Result: " + convert_to_centimeters(in_one_centimeter, unit2, number));
                break;

            case ("mm"):
                System.out.println("Result: " + in_one_millimeters(in_one_millimeter, unit2, number));
                break;

            case ("ft"):
                System.out.println("Result: " + in_one_fts(in_one_ft, unit2, number));
                break;

            case ("yd"):
                System.out.println("Result: " + in_one_yards(in_one_yard, unit2, number));
                break;

            case ("in"):
                System.out.println("Result: " + in_one_inches(in_one_inch, unit2, number));
                break;

            default:
                System.out.println("Ошибка!");
        }
    }


    }




