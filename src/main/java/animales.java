



public class animales {

    private String name;
    private String species;
    private int age;
    private String location;

    public animales(String name, String species, int age, String location) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.location = location;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
        
        

    }
}
