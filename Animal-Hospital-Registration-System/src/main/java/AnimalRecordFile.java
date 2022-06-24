public class AnimalRecordFile {
    @Override
    public String toString(){
        return "Tutor: " + getOwnerName() + " | " + getOwnerCPF() + " | " + getOwnerAddress() + " | " + getOwnerPhoneNumber() + "\n" +
        "Animal: " + getAnimalName() + " | " + getAnimalAge() + " | " + getAnimalSpecies() + " | " + getAnimalRace() + " | " + getAnimalGender() + " | " + getAnimalSize() + " | " + getAnimalDisease();
    }

    void AnimalRecordFile(){
        setOwnerAddress(" ");
        setOwnerCPF(" ");
        setOwnerName(" ");
        setOwnerPhoneNumber(" ");
        setAnimalDisease(" ");
        setAnimalRace(" ");
        setAnimalSize(" ");
        setAnimalSpecies(" ");
        setAnimalGender(' ');
        setAnimalName(" ");
        setAnimalAge(" ");

    }
    String ownerName;
    String ownerAddress;
    String ownerPhoneNumber;
    String ownerCPF;
    String animalName;
    String animalSize;
    String animalRace;
    String animalSpecies;
    Character animalGender;
    String animalDisease;
    String animalAge;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }


    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }
    public String getOwnerAddress() {
        return ownerAddress;
    }


    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }
    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }
    public void setOwnerCPF(String ownerCPF) {
        this.ownerCPF = ownerCPF;
    }
    public String getOwnerCPF() {
        return ownerCPF;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalAge(String animalAge) {
        this.animalAge = animalAge;
    }

    public void setAnimalSize(String animalSize) {
        this.animalSize = animalSize;
    }

    public void setAnimalRace(String animalRace) {
        this.animalRace = animalRace;
    }

    public void setAnimalSpecies(String animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

    public void setAnimalGender(Character animalGender) {
        this.animalGender = animalGender;
    }

    public void setAnimalDisease(String animalDisease) {
        this.animalDisease = animalDisease;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalAge() {
        return animalAge;
    }

    public String getAnimalSize() {
        return animalSize;
    }

    public String getAnimalRace() {
        return animalRace;
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public Character getAnimalGender() {
        return animalGender;
    }

    public String getAnimalDisease() {
        return animalDisease;
    }
}
