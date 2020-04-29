/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom12_;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Cao
 */
public class student implements Serializable{
    String ten;
    String noisong;
    int tuoi;
    String msv;
    Float giaitich1;
    Float tienganh1;
    Float tinhoc1;
    Float oop;
    Scanner scan = new Scanner(System.in);

    public student() {
    }

    public student(String ten, String noisong, int tuoi, String msv, Float giaitich1, Float tienganh1, Float tinhoc1, Float oop) {
        this.ten = ten;
        this.noisong = noisong;
        this.tuoi = tuoi;
        this.msv = msv;
        this.giaitich1 = giaitich1;
        this.tienganh1 = tienganh1;
        this.tinhoc1 = tinhoc1;
        this.oop = oop;
    }
    public void nhap(){
        System.out.println("ma sinh vien :");
        msv=scan.nextLine();
        edit();
        
    }
    // chi hien bang diem mot sinh vien 
    public void timsinhvien(){
        System.out.println("================xin chao "+ten+"====================");
        System.out.println("==================="+msv+"========================");
        System.out.println("|| giai tich 1    ||"+giaitich1+"||      "+checkquamon(giaitich1)+"||");
        System.out.println("|| tieng anh 1    ||"+tienganh1+"||      "+checkquamon(tienganh1)+"||");
        System.out.println("|| tin hoc 1      ||"+tinhoc1+"||      "+checkquamon(tinhoc1)+"||");
        System.out.println("|| lt hdt         ||"+oop+"||      "+checkquamon(oop)+"||");
    }
    public String checkquamon(float k){
        if(k>=4){
            return "quamon";
        }else{
            return "truot";
        }
    }
    public void hien1sv(){
        System.out.println("||    "+ten+"               |      "+msv+"           |         "+noisong+"     |           "+tongdiem());
    }
    public Float tongdiem(){
        return (giaitich1 + tienganh1+tinhoc1+oop)/4;
    }
    public boolean hocbong(){
     if(tongdiem()>=8){
         return true;
     }   
     else
         return false;
    }
    // ham edit theo ma sinh vien
    public void edit(){
        System.out.println("ten :");
        ten=scan.nextLine();
        System.out.println("noi song :");
        noisong = scan.nextLine();
        System.out.println("tuoi :");
        tuoi = Integer.parseInt(scan.nextLine());
        System.out.println("Diem giai tich 1 :");
        giaitich1 = Float.parseFloat(scan.nextLine());
        System.out.println("Tieng anh 1:");
        tienganh1=Float.parseFloat(scan.nextLine());
        System.out.println("tin hoc 1 :");
        tinhoc1 = Float.parseFloat(scan.nextLine());
        System.out.println("ki thuat lap trinh huong doi tuong :");
        oop=Float.parseFloat(scan.nextLine());
        
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNoisong() {
        return noisong;
    }

    public void setNoisong(String noisong) {
        this.noisong = noisong;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public Float getGiaitich1() {
        return giaitich1;
    }

    public void setGiaitich1(Float giaitich1) {
        this.giaitich1 = giaitich1;
    }

    public Float getTienganh1() {
        return tienganh1;
    }

    public void setTienganh1(Float tienganh1) {
        this.tienganh1 = tienganh1;
    }

    public Float getTinhoc1() {
        return tinhoc1;
    }

    public void setTinhoc1(Float tinhoc1) {
        this.tinhoc1 = tinhoc1;
    }

    public Float getOop() {
        return oop;
    }

    public void setOop(Float oop) {
        this.oop = oop;
    }
    public void luufile(){
        
    }
    public void docfile(){
        
    }
    
}
