package com.company;

import java.util.HashMap;
import java.util.Map;

public class Formulas {

    public static float convert_to_meters(Map<String, Float> in_one_meter, String a, float b) {
        Map<String, Float> copy = new HashMap<>(in_one_meter);
        float result = 0;

        for (Map.Entry<String, Float> pair : copy.entrySet()) {
            String key = pair.getKey();
            float value = pair.getValue();
            if (a.equals(key)) {
                result = b * value;
            }
        }

        return result;
    }

    public static float convert_to_kilometers(Map<String, Float> in_one_kilometer, String a, float b) {
        Map<String, Float> copy2 = new HashMap<>(in_one_kilometer);
        float result = 0;

        for (Map.Entry<String, Float> pair : copy2.entrySet()) {
            String key = pair.getKey();
            float value = pair.getValue();
            if (a.equals(key)) {
                result = b * value;
            }
        }

        return result;
    }

    public static float convert_to_centimeters(Map<String, Float> in_one_centimeter, String a, float b) {
        Map<String, Float> copy3 = new HashMap<>(in_one_centimeter);
        float result = 0;

        for (Map.Entry<String, Float> pair : copy3.entrySet()) {
            String key = pair.getKey();
            float value = pair.getValue();
            if (a.equals(key)) {
                result = b * value;
            }
        }
        return result;

    }

    public static float in_one_millimeters(Map<String, Float> in_one_millimeter, String a, float b) {
        Map<String, Float> copy4 = new HashMap<>(in_one_millimeter);
        float result = 0;

        for (Map.Entry<String, Float> pair : copy4.entrySet()) {
            String key = pair.getKey();
            float value = pair.getValue();
            if (a.equals(key)) {
                result = b * value;
            }
        }
        return result;

    }

    public static float in_one_fts(Map<String, Float> in_one_ft, String a, float b) {
        Map<String, Float> copy5 = new HashMap<>(in_one_ft);
        float result = 0;

        for (Map.Entry<String, Float> pair : copy5.entrySet()) {
            String key = pair.getKey();
            float value = pair.getValue();
            if (a.equals(key)) {
                result = b * value;
            }
        }
        return result;

    }

    public static float in_one_yards(Map<String, Float> in_one_yard, String a, float b) {
        Map<String, Float> copy6 = new HashMap<>(in_one_yard);
        float result = 0;

        for (Map.Entry<String, Float> pair : copy6.entrySet()) {
            String key = pair.getKey();
            float value = pair.getValue();
            if (a.equals(key)) {
                result = b * value;
            }
        }
        return result;

    }

    public static float in_one_inches(Map<String, Float> in_one_inch, String a, float b) {
        Map<String, Float> copy7 = new HashMap<>(in_one_inch);
        float result = 0;

        for (Map.Entry<String, Float> pair : copy7.entrySet()) {
            String key = pair.getKey();
            float value = pair.getValue();
            if (a.equals(key)) {
                result = b * value;
            }
        }
        return result;

    }
}
