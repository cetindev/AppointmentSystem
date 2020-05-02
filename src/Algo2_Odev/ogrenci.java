package Algo2_Odev;
//Öğrencinin numara, ad, soyad, bölüm, kayıt yılı, e-posta, telefon bilgileri tutulacaktır.

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ogrenci extends kisi {

    int numara;
    int kayityili;
    String bolum;

    public ogrenci() {
        super(null, null, null, null);
    }

    public ogrenci(int numara, int kayityili, String bolum, String ad, String soyad, String eposta, String telefon)
            throws FileNotFoundException {
        super(ad, soyad, eposta, telefon);
        this.numara = numara;
        this.kayityili = kayityili;
        this.bolum = bolum;
    }

    /*
    public String ogrBul(String numara) throws IOException {
        //Burada dosyaya girilen bilgileri değişkenlere atıyor
        //ogrenci metodundan nesne oluşturarak değişkenleri alıyoruz
        ogrenci ogr = new ogrenci();
        String ogrString = "";
        File dosya = new File("ogrenci.txt");
        ogrenci o = new ogrenci();
        if (!dosya.exists()) {
            System.out.println("Dosya Yok");
        } else {
            Scanner oku = new Scanner(dosya);
            while (oku.hasNextLine()) {
                String okunan = oku.nextLine();
                String s[] = okunan.split(" ");
                //Girilen ogrenci numarasıyla dosyanın içindeki ogrenci numarası aynıysa ogrencinin bilgilerini geri döndür
                if (numara == s[0]) {
                    for (int i = 0; i < s.length; i++) {
                        System.out.println("Burdada ekrana yazdırıyor");
                        System.out.print(s[i] + " ");
                    }
                    o.numara = Integer.parseInt(s[0]);//Benzersiz Olacak
                    o.ad = s[1];
                    o.soyad = s[2];
                    o.bolum = s[3];
                     o.kayityili = Integer.parseInt(s[4]);
                    o.eposta = s[5];
                    o.telefon = s[6];
                    ogrString = Integer.toString(ogr.numara) + " " + ogr.ad + " " + ogr.soyad + " " + ogr.bolum + " "+
                             " "+ ogr.eposta + " " +  + ogr.telefon + " ";
                }
            }
            oku.close();
        }
        return ogrString;
    }
     */
    //Dosyaya ogrenci Ekleme fonsiyonu
    public void ogrEkle() throws IOException {
        //Burada ogrenci Bilgilerini Alacagız ve bu bilgileri ogrenci.txt ye yazdıracağiz 
        Scanner scn = new Scanner(System.in);
        ogrenci ogr = new ogrenci();
        System.out.println("********************************");
        System.out.println("Aralarınada Hiç Boşluk Olmadan Giriniz!!!!");
        System.out.println("Lüften Numaranızı Giriniz: ");
        ogr.numara = scn.nextInt();
        System.out.println("Lüften İsminizi Giriniz: ");
        ogr.ad = scn.next();
        System.out.println("Lütfen Soyisminizi Girinizi Giriniz: ");
        ogr.soyad = scn.next();
        System.out.println("Lüften Bölümünüzü  Giriniz: ");
        ogr.bolum = scn.next();
        System.out.println("Kayıt Yılınızı Giriniz: ");
        ogr.kayityili = scn.nextInt();
        System.out.println("Lüften e-posta adresinizi  Giriniz: ");
        ogr.eposta = scn.next();
        System.out.println("Lüften Telefon Numaranızı Giriniz: ");
        ogr.telefon = scn.next();
        System.out.println("*********************************");
        //Ogrencinin bütün bilgilerini toplam bir Stringde tutup dosyaya yazmak daha mantıklı
        String ogrnci = Integer.toString(ogr.numara) + " " + ogr.ad + " " + ogr.soyad + " " + ogr.bolum + " " + ogr.kayityili + " " + ogr.eposta + " " + ogr.telefon + " ";
        //Şimdi dosyaya yazma işlemi 
        File dosya = new File("ogrenci.txt");
        if (!dosya.exists()) {
            System.out.println("Dosya Yokk !!!");
        } else {
            PrintStream yaz = new PrintStream(new FileOutputStream(dosya, true));
            //dosyaya yazma işlemi
            yaz.print(ogrnci);
            yaz.println("");
            yaz.close();
        }
    }

    //Burda Randevu Alıyoruz
    //parametre önemli
    //Burda girilen ogrencinin numarası  ile girilen hocanın sicil nosuna bakılarak saat uyuşmazlığına bakıcağız
    public void randevual() throws IOException, ParseException {
        Scanner scn = new Scanner(System.in);

        File dosya = new File("randevu.txt");
        akademisyen hoca = new akademisyen();
        Scanner oku = new Scanner(dosya);
        String hocaSicil2[] = null, okunan, yeni = "";
        String sicil = null;
        if (!dosya.exists()) {
            System.out.println("Dosya Yok");
        } else {

            while (oku.hasNextLine()) {
                okunan = oku.nextLine();
                yeni += okunan;
            }
            oku.close();
            //Girilen sicil numarasında bir akademisyen var mı
            File dosya2 = new File("akademisyen.txt");
            Scanner oku2 = new Scanner(dosya2);
            String okunan2;
            String sicilTest[];
            String yeni2 = "";
            int ss = 0;
            boolean yok = false;
            if (!dosya2.exists()) {
                System.out.println("Boyle Bir Dosya Yok");
            } else {
                while (oku2.hasNextLine()) {
                    okunan2 = oku2.nextLine();
                    yeni2 += okunan2;
                }
                oku2.close();
                //System.out.println(yeni2);
                String deger[][] = new String[5][7];
                sicilTest = yeni2.split(" ");
                int akademisyenSayisi = sicilTest.length / 7;
                String dizi[][] = new String[akademisyenSayisi][7];
                for (int i = 0; i < akademisyenSayisi; i++) {
                    for (int j = 0; j < 7; j++) {
                        dizi[i][j] = sicilTest[ss];
                        ss++;
                    }
                }
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                System.out.println("Akademisyenlerimiz..................");
                for (int i = 0; i < akademisyenSayisi; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print(dizi[i][j] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-"
                        + "\n");
                //Başta akademisyenleri göstersin ki numaralar gözüksün diye

                System.out.println("İstediğiniz Akademisyene Ait Sicil Numarasını Yazınız: ");
                System.out.println("GİRDİĞİNİZ SİCİL NUMARASINA AİT BİR AKADEMİSYEN YOKSA PROGRAM KAPANACAKTIR!!!");
                System.out.println("GİRDİĞİNİZ SİCİL NUMARASINA AİT BİR AKADEMİSYEN YOKSA PROGRAM KAPANACAKTIR!!!\n");
                System.out.print("---------------->>>>>>>>");
                sicil = scn.next();

                for (int i = 0; i < akademisyenSayisi; i++) {
                    if (dizi[i][0].equals(sicil)) {
                        yok = true;
                    }
                }
                if (yok == false) {
                    System.exit(0);
                }

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

            System.out.println("Bütün Randevular.....................");
            for (int i = 0; i < hocaSayısı; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(belliHoca[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("Bütün Randevular.....................\n");
            String s = "";
            String belliRandevular[] = null;
            int belliransay = 0;
            System.out.println("-------------------------------------");
            System.out.println("İstenilen Akademisyenin Randevuları ");
            System.out.println("-------------------------------------");
            for (int i = 0; i < hocaSayısı; i++) {
                for (int j = 0; j < 5; j++) {
                    if (belliHoca[i][1].equals(sicil)) {
                        System.out.print(belliHoca[i][j] + " ");
                        s += belliHoca[i][j] + " ";
                    }
                }
                System.out.println("");
            }
            System.out.println("-------------------------------------");
            System.out.println("İstenilen Akademisyenin Randevuları ");
            System.out.println("-------------------------------------\n\n\n");
            //Aynı hocanın randevularını alıp yeni bir s stringine ordanda yeni bir  diziye attık 
            //System.out.println(s);
            belliRandevular = s.split(" ");
            belliransay = belliRandevular.length / 5;
            System.out.println("Sicil Numarası Girilen Akademisyenin  Randevu Sayısı  :" + belliransay + "\n");
            int count = 0;
            String ogrRanBilgi[][] = new String[belliransay][5];
            for (int i = 0; i < belliransay; i++) {
                for (int j = 0; j < 5; j++) {
                    ogrRanBilgi[i][j] = belliRandevular[count];
                    count++;
                }
            }
            System.out.println("İstenilen Sicil Numarasına Ait Akademisyenin Toplam Randevuları");
            for (int i = 0; i < belliransay; i++) {
                for (int j = 0; j < 5; j++) {

                    System.out.print(ogrRanBilgi[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("İstnilen Sicil Numarasına Ait Akademisyenin Toplam Randevuları\n");

            Date objDate = new Date(); // Current System Date and time is assigned to objDate
            String strDateFormat = "dd.M.yyyy HH:mm"; //Date format is Specified
            String saatFormat="HH:mm";
            SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
            DateFormat df = new SimpleDateFormat(strDateFormat);
            DateFormat saatForm=new SimpleDateFormat(saatFormat);

            //Günleri kıyaslıyoruz
            System.out.println("(\n12.05.2000) TARİHİN ARASINDA NOTKA(.)\n(12:00) SAATİN ARASINDA İKİ NOKTA(:)OLACAK\n");
            System.out.println("Randevuyu Almak İstediğiniz Tarihi Giriniz (Aralarında nokta olacak Şekilde orn:12.05.2000"
                    + "\nYanlış Yazılırsa Programda Hata Oluşacak.....................)");
            System.out.println("Yukarıdaki Örnek Gibi Giriniz Aksi Taktirde İşleminiz Gerçekleşmeyebilir");
            String gunAyYıl = scn.next();
            System.out.println("Randevu Almak İstediğiniz Başlangıç Saatini Giriniz:     orn:15:30 (Aralarında ':' işareti olacak))");
            String bassaat = scn.next();
           // Date basSaat=new Date(bassaat);
            String basTarih = gunAyYıl + " " + bassaat;
            System.out.println("Randevu Almak İstediğiniz Bitiş Saatini Giriniz:     orn:15:30 (Aralarında ':' işareti olacak))");
            String bitsaat = scn.next();
            //Date bitSaat=new Date(bitsaat);
            String bitTarih = gunAyYıl + " " + bitsaat;
            //kıyaslama işlemi
            char girisSaati[]=bassaat.toCharArray();
            char bitisSaati[]=bassaat.toCharArray();
            

            //Date basTar = df.parse(basTarih);// Tarihi başlangıç saati olan 
            //System.out.println(basTar);
            //Date bitTar = df.parse(bitTarih);   //şu formdalar   12.25.2000 12:45      gibi
            //System.out.println(bitTar);

            //şimdi önceki randevuların tarihlerini alacağım 
            //başlangıç ve bitiş şeklinde
            String Basdizi[] = new String[belliransay];

            String basHour[] = new String[belliransay];
            String bitHour[] = new String[belliransay];
            
            for (int i = 0; i < belliransay; i++) {
                Basdizi[i] = ogrRanBilgi[i][2];//+ " " + ogrRanBilgi[i][3];
                basHour[i] = ogrRanBilgi[i][3];//önceki randevuların başlangıç saati
                bitHour[i] = ogrRanBilgi[i][4];//önceki randevuların bitiş saati
            }
            int kont = 0;
            boolean kont2 = false;
            String basStr = "";
            String bitStr = "";
            Date basString;
            Date bitString;
            Date basDate;
               // Dosyadan okunan randevunun baslangici
            // Dosyadan okunan randevunun bitişi
            for (int i = 0; i < belliransay; i++) {
                basStr = Basdizi[i];
                basStr = basHour[i];
                bitStr = bitHour[i]; 
            
                if (Basdizi[i].equals(gunAyYıl)) {
                    System.out.println("Girdiğiniz Günde Randevu Var...");
                    if (basStr.equals(bassaat) && bitStr.equals(bitsaat)) {
                        System.out.println("Bu Saat Aralığında Randevu Vardır");
                        System.exit(0);
                    }
                int bas  = (Character.getNumericValue(girisSaati[0]) * 60) + Character.getNumericValue(girisSaati[1]); // İstenen randevu saatinin başlangıcı
                int bitis  = (Character.getNumericValue(bitisSaati[0]) * 60) + Character.getNumericValue(bitisSaati[1]); // İstenen randevu saatinin bitişi
                 int compbas=(Character.getNumericValue(basHour[i].charAt(0))*60+Character.getNumericValue(basHour[i].charAt(1)));
                 int compbitis=(Character.getNumericValue(bitHour[i].charAt(0))*60+Character.getNumericValue(bitHour[i].charAt(1)));
                    if ((bas >= compbas) && (bitis <= compbitis)) {
                        kont=0;
                    }
                    else kont=1;
                }
                else{
                    kont=1;
                    //
                }
            }
            if (kont == 1) {
                System.out.println("Girdiğiniz Tarihte Randevu Yok..");
                ogrenci ogren = new ogrenci();
                System.out.println("Lütfen Numaranızı Giriniz...");
                ogren.numara = scn.nextInt();
                System.out.println("Girdiğiniz Gün ve Saat Aralığında Randevu Bulunmuyor Randevunuz Kaydediliyor...");
                //burda istenilen sicil numarsına gore değişkenlere atama yapmamız gerekiyor
                PrintStream yaz = new PrintStream(new FileOutputStream(dosya, true));
                yaz.print(ogren.numara + " " + sicil + " " + gunAyYıl + " " + bassaat + " " + bitsaat + " ");
                yaz.println();
                yaz.close();
            } else {
                System.out.println("Girdiğiniz Gün ve Saat Aralığında Randevu Bulunuyor\nLütfen Farklı Bir Tarihe Alınız...");
                System.out.println("Çakışan RAndevular Var Lütfen BAşka Bir Tarihe Alınız..."
                        + "Randevu Alnınamıyor");
                System.exit(0);
            }
        }

    }

    public void ogrGoster() throws IOException {
        File dosya = new File("ogrenci.txt");
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
            int ogrSayisi = bilgiler.length / 7;
            System.out.println("Ögrenci Sayısı: " + ogrSayisi);
            String ogrDizi[][] = new String[ogrSayisi][7];
            int say = 0;
            for (int i = 0; i < ogrSayisi; i++) {
                for (int j = 0; j < 7; j++) {
                    ogrDizi[i][j] = bilgiler[say];
                    say++;
                }
            }
            for (int i = 0; i < ogrSayisi; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(ogrDizi[i][j] + " ");
                }
                System.out.println("");
            }
            oku.close();
        }
    }

    //istenilen ogrencinin randevularına bakacağız
    public void Ogrrandevularim() throws IOException {
        //Bunu dene 
        //Burda Randevu Alıyoruz
        Scanner scn = new Scanner(System.in);
        File dosya = new File("randevu.txt");
        Scanner oku = new Scanner(dosya);
        String ogrenciSicil2[] = null, okunan, yeni = "";
        if (!dosya.exists()) {
            System.out.println("Dosya Yok");
        } else {
            System.out.println("İstediğin Ögrencinin Numarasını Yaz: ");
            String sicil = scn.next();
            while (oku.hasNextLine()) {
                okunan = oku.nextLine();
                yeni += okunan;
            }
            oku.close();
            ogrenciSicil2 = yeni.split(" ");
            //5 bilgi var  kişi sayısını bulduk
            int hocaSayısı = ogrenciSicil2.length / 5;
            String belliOgr[][] = new String[hocaSayısı][5];
            int say = 0;
            for (int i = 0; i < hocaSayısı; i++) {
                //5 bilgi var
                for (int j = 0; j < 5; j++) {
                    belliOgr[i][j] = ogrenciSicil2[say];
                    say++;
                }
            }
            boolean varmi = true;
            System.out.println("\n\n");
            System.out.println("-------------------------------------");
            System.out.println("İstenilen Ögrencinin Randevuları ");
            System.out.println("-------------------------------------");
            for (int i = 0; i < hocaSayısı; i++) {
                for (int j = 0; j < 5; j++) {
                    if (belliOgr[i][0].equals(sicil)) {
                        System.out.print(belliOgr[i][j] + " ");
                    } else {
                        varmi = false;
                    }
                }
                System.out.println("");
            }
            if (varmi == false) {
                System.out.println("Girdiğiniz Numaraya Ait Öğrenci Yoktur");
            }
        }
    }
}
