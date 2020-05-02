package Algo2_Odev;
//Akademisyenin sicil numarasi, ad, soyad, anabilim dalı, e-posta, telefon, ünvan bilgileri tutulacaktır.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class akademisyen extends kisi {

    public int sicilNo;
    public String anabilim;
    public String unvan;

    public akademisyen() {
        super(null, null, null, null);
    }

    public akademisyen(int sicilNo, String anabilim, String unvan, String ad, String soyad, String eposta, String telefon)
            throws FileNotFoundException {
        super(ad, soyad, eposta, telefon);
        this.sicilNo = sicilNo;
        this.anabilim = anabilim;
        this.unvan = unvan;
    }

    //istenilen akademisyenin randevularına bakacağız
    public void randevularim() throws IOException {
        //Bunu dene 
        //Burda Randevu Alıyoruz
        Scanner scn = new Scanner(System.in);
        File dosya = new File("randevu.txt");
        Scanner oku = new Scanner(dosya);
        String hocaSicil2[] = null, okunan, yeni = "";
        if (!dosya.exists()) {
            System.out.println("Dosya Yok");
        } else {
            System.out.println("İstediğiniz Akdemizyenin Sicil Numarasını Yazınız: ");
            String sicil = scn.next();
            while (oku.hasNextLine()) {
                okunan = oku.nextLine();
                yeni += okunan;
            }
            oku.close();
            hocaSicil2 = yeni.split(" ");
            //5 bilgi var  kişi sayısını bulduk
            int hocaSayısı = hocaSicil2.length / 5;
            String belliHoca[][] = new String[hocaSayısı][5];
            int say = 0;
            for (int i = 0; i < hocaSayısı; i++) {
                //5 bilgi var
                for (int j = 0; j < 5; j++) {
                    belliHoca[i][j] = hocaSicil2[say];
                    say++;
                }
            }
            boolean varmı = true;
            for (int i = 0; i < hocaSayısı; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(belliHoca[i][j] + " ");
                }
                System.out.println("");
            }
            int hocavarmisay = 0;
            System.out.println("-------------------------------------");
            System.out.println("İstenilen Akademisyenin Randevuları ");
            System.out.println("-------------------------------------");
            for (int i = 0; i < hocaSayısı; i++) {
                for (int j = 0; j < 5; j++) {
                    //Girilen akademisyenin numarasıyla dosyanın içindeki akademisyenin numarası 
                    //aynıysa akademisyenin bilgilerini geri döndür  
                    if (belliHoca[i][1].equals(sicil)) {
                        System.out.print(belliHoca[i][j] + " ");
                        hocavarmisay++;
                    } else {

                    }
                }
                System.out.println("");
            }
            System.out.println("-------------------------------------");
            System.out.println("İstenilen Akademisyenin Randevuları ");
            System.out.println("-------------------------------------\n\n\n");
            if (hocavarmisay == 0) {
                System.out.println("Girdiğiniz Sicil Numarasına Ait Bir Akademisyen Yoktur");
            }

        }
    }

    public void Butunrandevular() throws IOException {
        //Bunu dene 
        //Burda Randevu Alıyoruz
        Scanner scn = new Scanner(System.in);
        File dosya = new File("randevu.txt");
        Scanner oku = new Scanner(dosya);
        String hocaSicil2[] = null, okunan, yeni = "";
        if (!dosya.exists()) {
            System.out.println("Dosya Yok");
        } else {
            // System.out.println("İstediğin Hocanin Sicil Numarasını Yaz: ");
            //int sicil = scn.nextInt();
            while (oku.hasNextLine()) {
                okunan = oku.nextLine();
                yeni += okunan;
            }
            hocaSicil2 = yeni.split(" ");
            //5 bilgi var  kişi sayısını bulduk
            int hocaSayısı = hocaSicil2.length / 5;
            String belliHoca[][] = new String[hocaSayısı][5];
            int say = 0;
            for (int i = 0; i < hocaSayısı; i++) {
                //5 bilgi var
                for (int j = 0; j < 5; j++) {
                    belliHoca[i][j] = hocaSicil2[say];
                    say++;
                }
            }
            System.out.println("---------------------------Bütün Randevular------------------------");
            for (int i = 0; i < hocaSayısı; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(belliHoca[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("---------------------------Bütün Randevular------------------------");
            oku.close();
        }
    }

    //Bütün akademisyenlerin bilgileri dönecek
    public void akaGoster() throws IOException {
        File dosya = new File("akademisyen.txt");
        Scanner oku = new Scanner(dosya);
        String bilgiler[] = null, okunan, yeni = "";
        if (!dosya.exists()) {
            System.out.println("Boyle Bİr dosya yokk");
        } else {
            while (oku.hasNextLine()) {
                okunan = oku.nextLine();
                yeni += okunan;
            }
            bilgiler = yeni.split(" ");
            //7 tane bilgi olduğu için ogrenci sayısını çıkardık
            //System.out.println(bilgiler);
            int akaSayisi = bilgiler.length / 7;
            System.out.println("Akademisyen Sayısı: " + akaSayisi);
            String akaDizi[][] = new String[akaSayisi][7];
            int say = 0;
            for (int i = 0; i < akaSayisi; i++) {
                for (int j = 0; j < 7; j++) {
                    akaDizi[i][j] = bilgiler[say];
                    say++;
                }
            }
            for (int i = 0; i < akaSayisi; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(akaDizi[i][j] + " ");
                }
                System.out.println("");
            }
            oku.close();
        }
    }

    //akademisyen ekle
    public void akaEkle() throws IOException {
        //Burada ogrenci Bilgilerini Alacagız ve bu bilgileri ogrenci.txt ye yazdıracağiz 
        Scanner scn = new Scanner(System.in);
        akademisyen aka = new akademisyen();
        System.out.println("********************************");
        System.out.println("Aralarınada Hiç Boşluk Olmadan Giriniz!!!!");
        System.out.println("Lüften Sicil Numaranızı Giriniz: ");
        aka.sicilNo = scn.nextInt();
        System.out.println("Lüften İsminizi Giriniz: ");
        aka.ad = scn.next();
        System.out.println("Lütfen Soyisminizi Girinizi Giriniz: ");
        aka.soyad = scn.next();
        System.out.println("Lüften Bölümünüzü  Giriniz: ");
        aka.anabilim = scn.next();
        System.out.println("Lüften e-posta adresinizi  Giriniz: ");
        aka.eposta = scn.next();
        System.out.println("Lüften Telefon Numaranızı Giriniz: ");
        aka.telefon = scn.next();
        System.out.println("Lütfen Ünvanını Yazınız:");
        aka.unvan = scn.next();
        System.out.println("*********************************");
        //Ogrencinin bütün bilgilerini toplam bir Stringde tutup dosyaya yazmak daha mantıklı
        String akdemisyn = Integer.toString(aka.sicilNo) + " " + aka.ad + " " + aka.soyad
                + " " + aka.anabilim + " " + aka.eposta + " " + aka.telefon + " " + aka.unvan + " ";
        //Şimdi dosyaya yazma işlemi 
        File dosya = new File("akademisyen.txt");
        if (!dosya.exists()) {
            System.out.println("Dosya Yokk !!!");
        } else {
            PrintStream yaz = new PrintStream(new FileOutputStream(dosya, true));
            //dosyaya yazma işlemi
            yaz.print(akdemisyn);
            yaz.println("");
            yaz.close();
        }

    }

    public String toString() {

        return "";
    }

}
