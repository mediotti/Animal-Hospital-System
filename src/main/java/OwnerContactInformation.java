public class OwnerContactInformation {
    private String ownerFirstName;
    private String ownerLastName;
    private String ownerPhoneNumber;
    private String ownerIDNumber;

    public OwnerContactInformation(String ownerFirstName, String ownerLastName, String ownerPhoneNumber, String ownerIDNumber) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.ownerPhoneNumber = ownerPhoneNumber;
        this.ownerIDNumber = ownerIDNumber;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public String getOwnerIDNumber() {
        return ownerIDNumber;
    }

    public void setOwnerIDNumber(String ownerIDNumber) {
        this.ownerIDNumber = ownerIDNumber;
    }

    @Override
    public String toString() {
        return "OwnerContactInformation{" +
                "ownerFirstName='" + ownerFirstName + '\'' +
                ", ownerLastName='" + ownerLastName + '\'' +
                ", ownerPhoneNumber='" + ownerPhoneNumber + '\'' +
                ", ownerIDNumber='" + ownerIDNumber + '\'' +
                '}';
    }
}
