package Algo2_Odev;

import java.awt.FlowLayout;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Odev1 {

    public static void main(String[] args) throws IOException, ParseException {
        ogrenci og = new ogrenci();
        akademisyen aka = new akademisyen();
        //og.randevulistele();
        //arayuz();
        //Burda konsolu yapacagız
        Scanner scn = new Scanner(System.in);
        System.out.println("**********************************************************************************");
        System.out.println("Randevu Sistemi");
        System.out.println("1-Randevu Eklemek (Ögrenci için)");
        System.out.println("2-Bütün Randevuları Göster");//tamam
        System.out.println("3-İstenilen Akademisyenin Randevuları");//tamam
        System.out.println("4-İstenilen Ögrencinin Randevuları");//tamam
        System.out.println("5-Ögrencilerin Bilgilerini Göster");//tamam
        System.out.println("6-Akademisyenlerin Bilgilerini Göster");//tamam
        System.out.println("7-Ögrenci Eklemek ");//tamam
        System.out.println("8-Akademisyen Eklemek");
        System.out.println("0-Programdan Çıkmak ");//tamam
        System.out.println("Yapmak İstediğiniz İşlemin Önündeki Numarayı Yazınız!!!");
        System.out.println("**********************************************************************************");
        int secim = scn.nextInt();

        //secimler
        //girdikden sonra tekrar bi girdi girmesini sağla belki başka bir işlem yapar 
        while (true) {

            if (secim == 1) {
                System.out.println("Randevu Ekleme İşlemeni Seçtiniz...\n");
                og.randevual();
                System.out.println("**********************************************************************************************");
                System.out.println("Başka bir İşlem Yapmak İstiyorsanız Lütfen Tuşlayın, Yapmak İstemiyorsanız 0 (sıfır)'a Basınız");
                System.out.print("----------------->");
                secim = scn.nextInt();
                System.out.println("**********************************************************************************************");
            } else if (secim == 2) {
                System.out.println("Bütün Randevuları Gösterme İslemini Seçtiniz...\n");
                aka.Butunrandevular();
                System.out.println("**********************************************************************************************");
                System.out.println("Başka bir İşlem Yapmak İstiyorsanız Lütfen Tuşlayın, Yapmak İstemioyrsanız 0 (sıfır)'a Basınız");
                System.out.print("----------------->");
                secim = scn.nextInt();
                System.out.println("**********************************************************************************************");
            } else if (secim == 3) {
                System.out.println("İstenilen Akademisyenin Randevularını Gösterme İşlemini Seçtiniz...\n");
                aka.randevularim();
                System.out.println("**********************************************************************************************");
                System.out.println("Başka bir İşlem Yapmak İstiyorsanız Lütfen Tuşlayın, Yapmak İstemioyrsanız 0 (sıfır)'a Basınız");
                System.out.print("----------------->");
                secim = scn.nextInt();
                System.out.println("**********************************************************************************************");
            } else if (secim == 4) {
                System.out.println("İstenilen Öğrencinin Randevularını Gösterme İşlemini Seçtiniz...\n");
                og.Ogrrandevularim();
                System.out.println("**********************************************************************************************");
                System.out.println("Başka bir İşlem Yapmak İstiyorsanız Lütfen Tuşlayın, Yapmak İstemioyrsanız 0 (sıfır)'a Basınız");
                System.out.print("----------------->");
                secim = scn.nextInt();
                System.out.println("**********************************************************************************************");

            } else if (secim == 5) {
                System.out.println("Bütün Ögrencilerin Bilgilerini Gösterme İşlemini Seçtiniz...\n");
                og.ogrGoster();
                System.out.println("**********************************************************************************************");
                System.out.println("Başka bir İşlem Yapmak İstiyorsanız Lütfen Tuşlayın, Yapmak İstemioyrsanız 0 (sıfır)'a Basınız");
                System.out.print("----------------->");
                secim = scn.nextInt();
                System.out.println("**********************************************************************************************");
            } else if (secim == 6) {
                System.out.println("Bütün Akademisyenlerin Bilgilerini Gösterme İşlemini Seçtiniz...\n");
                aka.akaGoster();
                System.out.println("**********************************************************************************************");
                System.out.println("Başka bir İşlem Yapmak İstiyorsanız Lütfen Tuşlayın Yapmak İstemioyrsanız 0 (sıfır)'a Basınız");
                System.out.print("----------------->");
                secim = scn.nextInt();
                System.out.println("**********************************************************************************************");
            } else if (secim == 7) {
                System.out.println("Ögrenci Ekleme İşlemini Seçtiniz...\n");
                og.ogrEkle();
                System.out.println("Güncel Hali");
                og.ogrGoster();
                System.out.println("**********************************************************************************************");
                System.out.println("Başka bir İşlem Yapmak İstiyorsanız Lütfen Tuşlayın, Yapmak İstemioyrsanız 0 (sıfır)'a Basınız");
                System.out.print("----------------->");
                secim = scn.nextInt();
                System.out.println("**********************************************************************************************");
            } else if (secim == 8) {
                System.out.println("Akademisyen Ekleme İşlemini Seçtiniz...\n");
                aka.akaEkle();
                System.out.println("Güncel Hali");
                aka.akaGoster();
                System.out.println("**********************************************************************************************");
                System.out.println("Başka bir İşlem Yapmak İstiyorsanız Lütfen Tuşlayın, Yapmak İstemioyrsanız 0 (sıfır)'a Basınız");
                System.out.print("----------------->");
                secim = scn.nextInt();
                System.out.println("**********************************************************************************************");
            } else if (secim == 0) {
                System.out.println("Programdan Çıkma İşlemini Seçtiniz...\n");
                System.out.println("İyi Günler Dilerizzz......");
                System.out.println("Programdan Çıkılıyor");
                System.exit(0);
            } else {
                System.out.println("Böyle Bir Komut Yok");
                System.exit(0);
            }
        }
    }
}
