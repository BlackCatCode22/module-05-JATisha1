//Experiment:

//Here is an example of how to use a HashMap to store and retrieve animal information:

import java.util.*;

public class AnimalHashMap {
    public static void main(String[] args) {
        Map<String, Animal> animalMap = new HashMap<>();

        // Add an animal to the map
        Animal hyena = new Animal("Hyena", "Tan", 70, "Female", LocalDate.of(2018, 3, 21));
        animalMap.put("Hy01", hyena);

        // Retrieve an animal from the map
        Animal retrievedHyena = animalMap.get("Hy01");
        System.out.println(retrievedHyena);

        // Remove an animal from the map
        animalMap.remove("Hy01");
    }
}
