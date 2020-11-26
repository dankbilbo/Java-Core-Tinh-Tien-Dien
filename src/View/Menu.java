package View;

import BillController.BillController;
import Entities.Customer;
import Entities.Bill;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillController billController = new BillController();
        while (true) {
            System.out.println("----Menu----");
            System.out.println("1.Nhap thong tin cho ho su dung dien");
            System.out.println("2.Hien thi thong tin bien lai da nhap");
            System.out.println("3.Tinh tien dien phai tra cho moi ho dan");
            int choice = Integer.parseInt(sc.nextLine());
            final int addInfo = 1;
            final int showInfo = 2;
            final int calculateMoney = 3;
            switch (choice) {
                case addInfo:
                    Customer customer = new Customer();
                    System.out.println("Nhap ten");
                    String name = sc.nextLine();
                    customer.setName(name);
                    System.out.println("Nhap ma so cong to");
                    int meterId = Integer.parseInt(sc.nextLine());
                    customer.setMeterId(meterId);
                    System.out.println("Nhap so nha");
                    int houseId = Integer.parseInt(sc.nextLine());
                    customer.setHouseId(houseId);
                    Bill bill = new Bill();
                    System.out.println("Nhap so dien moi");
                    int newNumber = Integer.parseInt(sc.nextLine());
                    bill.setNewNumber(newNumber);
                    bill.setCustomer(customer);
                    billController.addBill(bill);
                    break;
                case showInfo:
                    billController.showBillsInfo();
                    break;
                case calculateMoney:
                    System.out.println("Nhap so nha");
                    int houseCalId = Integer.parseInt(sc.nextLine());
                    int fee = billController.calculateMoney(houseCalId);
                    System.out.println("So tien phai tra la " + fee);
                    break;
            }
        }
    }
}
