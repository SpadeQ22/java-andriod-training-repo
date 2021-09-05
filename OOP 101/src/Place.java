public class Place {
    String address;
    String name;
    String ownerId;

    public Place(String ownerID, String address, String name) {
        this.address = address;
        this.name = name;
        this.ownerId = ownerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
