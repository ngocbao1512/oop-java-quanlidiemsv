/*
 
        public void hienallsv(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("||         ho va ten        |      ma sinh vien      |         dia chi         |          diem tong ket       |     hanhkiem  ||");
        System.out.println("||=========================================================================================================================||");
    }
 */
package nhom12_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Cao
 */
public class managerstudent {
    ArrayList<student> stdlist = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public void add(){
        int n;
        System.out.println("nhap so sinh vien ban muon them vao ");
        n = Integer.parseInt(scan.nextLine());
        for(int i=0;i<n;i++){
            student std = new student();
            std.nhap();
            stdlist.add(std);
        }
    }
    public void xuatbangdiemrieng(){
        String k;
        System.out.println("nhap ten cua ban :");
        k = scan.nextLine();
        for(int i=0;i<stdlist.size();i++){
             if(stdlist.get(i).getTen().equals(k)){
                stdlist.get(i).timsinhvien();
            }
        }
        
    }
    public void bdc(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("||         ho va ten        |      ma sinh vien      |         dia chi         |          diem tong ket       |     hanhkiem  ||");
        System.out.println("||=========================================================================================================================||");
        for(int i=0;i<stdlist.size();i++){
            stdlist.get(i).hien1sv();
        }
    }
    public void edit(){
        System.out.println("id sinh vien can sua :");
        String k = scan.nextLine();
        for(int i=0;i<stdlist.size();i++){
            if(stdlist.get(i).getMsv().equals(k)){
                stdlist.get(i).edit();
            }
        }
    }
    public void sortmsv(){
        Collections.sort(stdlist, new Comparator<student>() {
            @Override
            public int compare(student t, student t1) {
                if(t.msv.compareToIgnoreCase(t1.msv)==0){
                    return 1;                    
                }
                return -1;
            }
        });
        bdc();
    }
    public void sortname(){
             Collections.sort(stdlist, new Comparator<student>() {
            @Override
            public int compare(student t, student t1) {
                if(t.ten.compareToIgnoreCase(t1.ten)==0){
                    return 1;                    
                }
                return -1;
            }
        });
        bdc();
    }
    public void hb(){
        for(int i=0;i<stdlist.size();i++){
            if(stdlist.get(i).hocbong()){
               stdlist.get(i).hien1sv();               
            }
        }
    }
    public void deletesv(){
        System.err.println(" hay chac chan truoc khi xoa tai lieu !!!!");
        System.out.println("nhap id sinh vien ban muon xoa ");
        String deleteid  = scan.nextLine();
        for(int i=0;i<stdlist.size();i++){
            if(stdlist.get(i).getMsv().equals(deleteid)){
                stdlist.remove(i);
            }
        }
    }
    public void readfile() throws IOException{
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try {
            fis = new FileInputStream("students.dat");
            ois = new ObjectInputStream(fis);
            
            stdlist = (ArrayList<student>) ois.readObject();
        } catch (Exception e) {
        }finally{
           try{ if(fis != null){
                fis.close();
            }
            if(ois != null){
                ois.close();
            }}catch(Exception e){
                
            }
        }
    }
    public void savefile(){
          FileOutputStream fos=null;
          ObjectOutput oos=null;
        try {
            fos = new FileOutputStream("students.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(stdlist);
        } catch (Exception e) {
        }finally{
           try{ if(fos != null){
                fos.close();
            }
            if(oos != null){
                oos.close();
            }}catch(Exception e){
                
            }
        }
    }

}