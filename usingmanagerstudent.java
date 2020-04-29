/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom12_;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Cao
 */
public class usingmanagerstudent {
    public static void main(String[] args) throws IOException {
        managerstudent mng = new managerstudent();
        int choose;
        Scanner scan = new Scanner(System.in);
        do{
            showmenu();
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:mng.add();
                    break;
                case 2:mng.xuatbangdiemrieng();
                    break;
                case 3:mng.bdc();
                    break;
                case 4:mng.edit();
                    break;
                case 5:mng.sortmsv();
                    break;
                case 6:mng.sortname();
                    break;
                case 7:mng.hb();
                    break;
                case 8:mng.deletesv();
                    break;
                case 9:// luu file
                    mng.savefile();
                    break;
                case 10:// doc du lieu tu file           
                    mng.readfile();
                    break;
                case 11:// doc file
                    System.out.println("tam biet");
                    break;
                default:
                    System.err.println("nhap sai nha be !!!!");
                    break;
            }
            
        }while(choose!=11);
        
    }
    static void showmenu(){
        System.out.println("1. them sinh vien ");
        System.out.println("2. xuat bang diem cua sinh vien theo ten ");
        System.out.println("3. xuat bang diem chung cua tat ca cac ban ");
        System.out.println("4. tim va sua thong tin sinh vien ");// tim theo msv
        System.out.println("5. sap xep theo ma sinh vien ");
        System.out.println("6. sap xep thep ten sinh vien ");
        System.out.println("7. xuat ra tat ca sinh vien co hoc bong ");
        System.out.println("8. tim va delete sinh vien ");// tim theo msv
        System.out.println("9. luu file ");
        System.out.println("10. doc file");
        System.out.println("11. thoat chuong trinh ");
        System.out.println("choose :");
                

    }
    
}
