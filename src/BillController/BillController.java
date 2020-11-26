package BillController;

import Entities.Bill;

import java.io.IOException;
import java.util.LinkedList;

public class BillController {
    LinkedList<Bill> bills = new LinkedList<>();
    public void addBill(Bill bill){
        int houseId = bill.getCustomer().getHouseId();
        int houseMeterId = bill.getCustomer().getMeterId();
        for(Bill billDatabase : bills){
            int houseIdBillDatabase = billDatabase.getCustomer().getHouseId();
            int houseMeterIdBillDatabase = billDatabase.getCustomer().getMeterId();
            if(houseIdBillDatabase == houseId
                    && houseMeterIdBillDatabase != houseMeterId)
            {
                System.out.println("So nha va so cong to khong khop");
                System.out.println();
                return;
            }
            if(houseIdBillDatabase != houseId
                    && houseMeterIdBillDatabase == houseMeterId)
            {
                System.out.println("So nha va so cong to khong khop");
                System.out.println();
                return;
            }
            if (houseIdBillDatabase == houseId
                    && billDatabase.getNewNumber() > bill.getNewNumber()){
                System.out.println("So tien dien moi nho hon so tien dien thang cu nhap lai");
                System.out.println();
                return;
            }
            if(houseIdBillDatabase == houseId
                    && billDatabase.getNewNumber() <= bill.getNewNumber()){
                bill.setOldNumber(billDatabase.getNewNumber());
            }
        }
        bills.add(bill);
    }
    public void showBillsInfo(){
        System.out.printf("\n%-10s%-10s%-10s%-10s%-10s","Name","houseId","meterId","oldNumber","newNumber");
        for (Bill bill : bills){
            bill.showInfoBill();
        }
        System.out.println();
    }
    public int calculateMoney(int houseId){
        int fee = 0;
        for(Bill bill : bills){
            if(bill.getCustomer().getHouseId() == houseId){
                fee = bill.getFee();
            }
        }
        return fee;
    }
}
