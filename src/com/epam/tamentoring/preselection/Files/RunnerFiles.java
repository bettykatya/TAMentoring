package com.epam.tamentoring.preselection.Files;

import com.epam.tamentoring.preselection.Chief.Ingredients.Vegatables.Tomato;
import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;
import com.epam.tamentoring.preselection.Chief.Salad.Salad;

import java.io.*;

/**
 * Дополнить сценарии, реализованные в задании 2.1 – добавить чтение данных из файла / запись данных в файл, используя I/O Streams.
 */
public class RunnerFiles {
    private static final String PATH = "src/com/epam/tamentoring/preselection/Files/salad.txt";

    public static void main(String[] args) {
        Vegetable veg = new Vegetable("Pepper", 1, 2, 3);
        System.out.print("Written to file: ");
        System.out.println(veg.getName() + " " + veg.getCalories() + " " + veg.getFat() + " " + veg.getCarbs());
        writeToFile(veg);

        System.out.print("Read from file: ");
        Vegetable vegFromFile = readFromFile();
        System.out.println(vegFromFile.getName() + " " + vegFromFile.getCalories() + " " + vegFromFile.getFat() + " " + vegFromFile.getCarbs());
    }
    private static Vegetable readFromFile(){
        Vegetable veg = new Vegetable();

        File file = new File(PATH);
        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (Exception e){
                System.out.println("Error creating file.");
                System.exit(0);
            }
        }
        try {
            FileReader fr = new FileReader(file.getAbsoluteFile());
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            br.close();
            return readVegetableFromLine(line);
        }
        catch (Exception e){
            System.out.println("Error creating file.");
            System.exit(0);
        }

        return veg;
    }
    private static void writeToFile(Vegetable veg){
        File file = new File(PATH);
        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (Exception e){
                System.out.println("Error creating file.");
                System.exit(0);
            }
        }
        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(veg.getName() + " " + veg.getCalories() + " " + veg.getFat() + " " + veg.getCarbs());
            bw.close();
        }
        catch (Exception e){
            System.out.println("Error creating file.");
            System.exit(0);
        }
    }
    private static Vegetable readVegetableFromLine(String line){
        String[] vegParameters = new String[0];
        try {
            vegParameters = line.split("\\s+");
        } catch (Exception e) {
            System.out.println("Error occured. ");
        }
        Vegetable veg = new Vegetable(vegParameters[0],Double.parseDouble(vegParameters[1]),Double.parseDouble(vegParameters[2]),Double.parseDouble(vegParameters[3]));
        return veg;
    }
}
