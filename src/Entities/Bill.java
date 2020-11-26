package Entities;

public class Bill {
    private Customer customer;
    private int oldNumber = 0;
    private int newNumber;

    public Bill() {
    }

    public Bill(Customer customer, int oldNumber, int newNumber) {
        this.customer = customer;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
    }
    public void showInfoBill(){
        System.out.printf("\n%-10s%-10d%-10d%-10d%-10d",
                customer.getName(),customer.getHouseId(),customer.getMeterId(),oldNumber,newNumber
        );
    }
    public int getFee(){
        return (newNumber - oldNumber) * 750;
    }
    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }
    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
