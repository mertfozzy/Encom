
package database;


public class Dbdatacenter extends DbConnection {
    
    protected int userid = 0;
    protected String name_surnname,phone,tcno,customer_no;
    protected double balance;
    protected double electricity_bill, water_bill, naturelgas_bill, internet_bill;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName_surnname() {
        return name_surnname;
    }

    public void setName_surnname(String name_surnname) {
        this.name_surnname = name_surnname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTcno() {
        return tcno;
    }

    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getElectricity_bill() {
        return electricity_bill;
    }

    public void setElectricity_bill(double electricity_bill) {
        this.electricity_bill = electricity_bill;
    }

    public double getWater_bill() {
        return water_bill;
    }

    public void setWater_bill(double water_bill) {
        this.water_bill = water_bill;
    }

    public double getNaturelgas_bill() {
        return naturelgas_bill;
    }

    public void setNaturelgas_bill(double naturelgas_bill) {
        this.naturelgas_bill = naturelgas_bill;
    }

    public double getInternet_bill() {
        return internet_bill;
    }

    public void setInternet_bill(double internet_bill) {
        this.internet_bill = internet_bill;
    }
    
    
}
