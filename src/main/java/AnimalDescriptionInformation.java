public class AnimalDescriptionInformation {
    private String animalName;
    private Character animalGender;
    private String animalSpecies;
    private Float animalWeight;
    private Integer animalAge;

    public AnimalDescriptionInformation(String animalName, Character animalGender, String animalSpecies, Float animalWeight, Integer animalAge) {
        this.animalName = animalName;
        this.animalGender = animalGender;
        this.animalSpecies = animalSpecies;
        this.animalWeight = animalWeight;
        this.animalAge = animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Character getAnimalGender() {
        return animalGender;
    }

    public void setAnimalGender(Character animalGender) {
        this.animalGender = animalGender;
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public void setAnimalSpecies(String animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

    public Float getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(Float animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Integer getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(Integer animalAge) {
        this.animalAge = animalAge;
    }

    @Override
    public String toString() {
        return "AnimalDescriptionInformation{" +
                "animalName='" + animalName + '\'' +
                ", animalGender=" + animalGender +
                ", animalSpecies='" + animalSpecies + '\'' +
                ", animalWeight=" + animalWeight +
                ", animalAge=" + animalAge +
                '}';
    }
}

