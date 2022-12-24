
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.beans.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class userRequest extends DbConnection implements IBilgiController {
    // başvuru bilgileri
    private String adSoyad = null, tcNo = null, telNo = null;
    private String guvenlikSorusu = null, guvenlikCevap = null;
    
    //sistem tarafından verilecek bilgiler
    
    private String  musteriNo = null;
    private String sifre = null;
    
    public boolean basvuruOnaylandiMi(){
        if(this.bilgilergecerlimi()){
            
            if(this.tcNoTablodaVarMi()){
                return false;
            } else{
                this.basvuruyuOnayla();
                return true;
            }
        } else {
            return false;
        }
            
        }
    
    private boolean tcNoTablodaVarMi(){
        String query = "SELECT tc_number FROM users WHERE tc_number = '" + this.tcNo + "'";
        try{
            super.statement = (Statement) super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query); // executeQuery yok sadece execute var kabul etmiyor onu da
            while (rs.next()){
                return true; // eğer tabloda veri bulunmuşsa true dönecek
            }
        } catch (SQLException ex) {
            Logger.getLogger(userRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
    }
    
    private void basvuruyuOnayla(){
        String query = "INSERT INTO users(customer_no,password,"
                + "name_surname_tc_number,phone,security_question,security_answer)"
                + "VALUES("
                + "'" + this.musteriNo + "',"
                + "'" + this.sifre + "',"
                + "'" + this.adSoyad + "',"
                + "'" + this.tcNo + "',"
                + "'" + this.telNo + "',"
                + "'" + this.guvenlikSorusu + "',"
                + "'" + this.guvenlikCevap + "',"
                + ")";
        
        try {
            super.statement = (Statement) super.connection.createStatement();
            statement.executeUpdate(query); // executeUpdate yok sadece execute var kabul etmiyor onu da
        } catch (SQLException ex) {
            Logger.getLogger(userRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean bilgilergecerlimi() {
        return !(this.adSoyad == null || this.tcNo == null || this.telNo == null
                || this.guvenlikSorusu == null || this.guvenlikCevap == null
                || this.musteriNo == null || this. sifre == null);
    }

    @Override
    public HesapBilgileri gethesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getGuvenlikSorusu() {
        return guvenlikSorusu;
    }

    public void setGuvenlikSorusu(String guvenlikSorusu) {
        this.guvenlikSorusu = guvenlikSorusu;
    }

    public String getGuvenlikCevap() {
        return guvenlikCevap;
    }

    public void setGuvenlikCevap(String guvenlikCevap) {
        this.guvenlikCevap = guvenlikCevap;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
}
