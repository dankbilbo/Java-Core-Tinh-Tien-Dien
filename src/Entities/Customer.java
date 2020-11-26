package Entities;

public class Customer {
    private int houseId;
    private int meterId;
    private String name;

    public Customer() {
    }

    public Customer(int houseId, int meterId, String name) {
        this.houseId = houseId;
        this.meterId = meterId;
        this.name = name;
    }
    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public int getMeterId() {
        return meterId;
    }

    public void setMeterId(int meterId) {
        this.meterId = meterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
