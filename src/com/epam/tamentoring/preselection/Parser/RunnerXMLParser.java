package com.epam.tamentoring.preselection.Parser;

import com.epam.tamentoring.preselection.Chief.Ingredients.Vegetable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class RunnerXMLParser {
    private static final String PATH = "src/com/epam/tamentoring/preselection/Parser/Vegetable.xml";
    public static void main(String[] args) {
        ArrayList<Vegetable> vegList = getVegFromXML();
        System.out.println("Vegetables from xml: ");
        for (Vegetable veg: vegList) {
            System.out.println(veg.getName() + " " + veg.getCalories() + " " + veg.getFat() + " " + veg.getCarbs());
        }
    }
    private static ArrayList<Vegetable> getVegFromXML() {
        ArrayList<Vegetable> vegetables = new ArrayList<>();
        try {
            File xmlFile = new File(PATH);
            if (xmlFile.isFile() && xmlFile.canRead()) {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(xmlFile);

                NodeList nList = doc.getElementsByTagName("Vegetable");
                System.out.println(nList.getLength());
                for (int i = 0; i < nList.getLength(); i++) {
                    Node nNode = nList.item(i);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        String name = eElement.getAttribute("Name");
                        double calories = Double.parseDouble(eElement.getElementsByTagName("Calories").item(0).getTextContent());
                        double fat = Double.parseDouble(eElement.getElementsByTagName("Fat").item(0).getTextContent());
                        double carbs = Double.parseDouble(eElement.getElementsByTagName("Carbs").item(0).getTextContent());

                        vegetables.add(new Vegetable(name, calories, fat, carbs));
                    }
                }
            } else {
                System.out.println("File doesn't exist.");
            }
        } catch (Exception e) {
            System.out.println("Error occurred when parsing file. ");
        }

        return vegetables;
    }
}
