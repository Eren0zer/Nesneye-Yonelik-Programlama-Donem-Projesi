
import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.security.sasl.SaslException;
import javax.swing.event.SwingPropertyChangeSupport;
//  EREN ÖZER 22360859030 



class Kisi{

    protected int tcKimlikNo ;
    private String ad;
    private String soyad;
    private String email;
    private int telefonNumarasi;

    public Kisi() {
    }

    public Kisi(String ad, String soyad , String email , int telefonNumarasi){
       this.ad= ad ;
       this.soyad= soyad;
       this.email= email;
       this.telefonNumarasi= telefonNumarasi;
     
    }   
       
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getTCKimlikNo() {

        return tcKimlikNo;
    }

    public void setTCKimlikNo(int tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public int getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(int telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   
      
   
   


    public String toString() {
        return ad+ " " +soyad +" " +email +" " +telefonNumarasi  ; 
    }

}







class BankaPersonel extends Kisi{

    private int personelID;
    private ArrayList<Musteri> musteriler;

   // Parametresiz yapılandırıcı metot.
    public BankaPersonel() {

    }

    public BankaPersonel(int tcKimlikNo, String ad , String soyad , String email , int telefonNumarasi){
        // Kisi sınıfının parametreli yapılandırıcı metodu çağırılıyor.
        super(ad,soyad,email,telefonNumarasi);
        this.tcKimlikNo= rastgelePersonelTcsi();
        this.personelID = rastgelePersonelIDsi();
        this.musteriler = new ArrayList<Musteri>();
        // musteriler adında bir ArrayList oluşturuluyor.

    



    }
     // Personel ID'si oluşturma metodu.
    private int rastgelePersonelTcsi(){
        Random sayi = new Random();
        int tcKimlikNo = 0;
        tcKimlikNo = sayi.nextInt(999999999) + 1000000000;
    
        return tcKimlikNo;
    }

    private int rastgelePersonelIDsi(){
        Random sayi = new Random();
        int personelID = 0;
        personelID = sayi.nextInt(999999999) + 1000000000;
    
        return personelID;
    }
     // Yeni müşteri ekleme metodu.
    public void musteriEkle(Musteri musteri) {
        musteriler.add(musteri);
        
    }
    // Müşteri listesini getirme metodu.
    public ArrayList<Musteri> getMusteriler() {
        return musteriler;
    }

    

    


    public String toString() {
        String musteribilgileri = "";
        
        for(int i=0; i<musteriler.size(); i++) {
            musteribilgileri += "\n" + (i+1) + ". Musterisi:\n" + musteriler.get(i).toString() + "\n------------------" +  "\n------------------" ;
            
        }
        
        return  "Banka Personeli\n" + "TC Kimlik No: " + tcKimlikNo +
        "\nAd: " + super.getAd() +
        "\nSoyad: " + super.getSoyad() +
        "\nEmail: " + super.getEmail() +
        "\nTelefon Numarasi: " + super.getTelefonNumarasi() +
        "\n " + musteribilgileri ;
       
    }


}









class Musteri extends Kisi{
    
    private int musteriNumarasi;
    private ArrayList<BankaHesap> hesaplar;
    private ArrayList<KrediKarti> krediKartlari;
    private ArrayList<Krediler> krediEklentisi;
    private ArrayList<VadeliHesap> Vadelihesaplar;
    private ArrayList<VadesizHesap> vadesizhesaplar;
    private ArrayList<YatirimHesap> yatirimhesaplar;
    


    public Musteri(){

    }

    public Musteri(int tcKimlikNo, int musteriNumarasi, String ad, String soyad, String email, int telefonNumarasi ){
        super(ad, soyad, email, telefonNumarasi);
        this.tcKimlikNo=rastgeleMusteriTcsi();
        this.musteriNumarasi= rastgeleMusteriNumarasi();
      
        this.hesaplar = new ArrayList<BankaHesap>();
        this.krediKartlari = new ArrayList<KrediKarti>();
        this.krediEklentisi = new ArrayList<Krediler>();
        this.Vadelihesaplar = new ArrayList<VadeliHesap>();
        this.vadesizhesaplar = new ArrayList<VadesizHesap>();
        this.yatirimhesaplar = new ArrayList<YatirimHesap>();
        
    }
    

    private  int rastgeleMusteriNumarasi(){
        Random sayi = new Random();
        int  musteriNumarasi = 0;
        musteriNumarasi=sayi.nextInt(999999999) + 1000000000;
        
        return musteriNumarasi;

    }

    private int rastgeleMusteriTcsi(){
        Random sayi = new Random();
        int tcKimlikNo = 0;
        tcKimlikNo = sayi.nextInt(999999999) + 1000000000;
    
        return tcKimlikNo;
    }
    
    public ArrayList<VadeliHesap> getvadeliHesaplar() {
        return Vadelihesaplar;
    }

    public void setvadeliHesaplar(ArrayList<VadeliHesap> Vadelihesaplar) {
        this.Vadelihesaplar = Vadelihesaplar;

    }

    public void vadelihesapEkle(VadeliHesap vadeli) {
        Vadelihesaplar.add(vadeli);
        
    }

    public ArrayList<VadesizHesap> getvadesizHesaplar() {
        return vadesizhesaplar;
    }

    public void setvadesizHesaplar(ArrayList<VadesizHesap>vadesizhesaplar) {
        this.vadesizhesaplar = vadesizhesaplar;

    }

    public void vadesizhesapEkle(VadesizHesap vadesiz) {
        vadesizhesaplar.add(vadesiz);
        
    }

    public ArrayList<YatirimHesap> getyatirimHesaplar() {
        return yatirimhesaplar;
    }

    public void setyatirimHesaplar(ArrayList<YatirimHesap> yatirimhesaplar) {
        this.yatirimhesaplar = yatirimhesaplar;

    }

    public void yatirimhesapEkle(YatirimHesap yatirim) {
        yatirimhesaplar.add(yatirim);
        
    }

    public ArrayList<BankaHesap> getHesaplar() {
        return hesaplar;
    }

    public void setHesaplar(ArrayList<BankaHesap> hesaplar) {
        this.hesaplar = hesaplar;
    }
    public ArrayList<KrediKarti> getKrediKarti() {
        return krediKartlari;
    }

    public void setKrediKarti(ArrayList<KrediKarti> krediKartlari) {
        this.krediKartlari = krediKartlari;
    }

    public ArrayList<Krediler> getKrediler() {
        return krediEklentisi;
    }

    public void setKrediler(ArrayList<Krediler> krediEklentisi) {
        this.krediEklentisi = krediEklentisi; 
    }

    public int getmusteriNumarasi() {
        return musteriNumarasi;
    }

    public void setmusteriNumarasi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }

    public void hesapEkle(BankaHesap hesap) {
        hesaplar.add(hesap);
        
    }

    public void krediKartiEkle(KrediKarti kart) {
        krediKartlari.add(kart);
        
    }
    public void krediEkle(Krediler kredi) {
        krediEklentisi.add(kredi);
        
    }


    
    



    

    public void hesapEkle(int tcKimlikNo, int musteriNumarasi, String ad, String soyad){
        if (hesapBilgisi.equals("1")) {   
            if(hesapTuru.equals("VadeliHesap")){
                Vadelihesap hesap = new VadeliHesap(42436, "1");
                vadelihesapEkle(hesap);
            }
            if(hesapTuru.equals("VadesizHesap")){
                Vadesizhesap hesap = new VadesizHesap(12314);
                vadesizhesapEkle(hesap);
            }
            if(hesapTuru.equals("yatirimHesap")){
                Yatirimhesap hesap = new YatirimHesap("1", 3623342 ,"Dolar", 3.14f);
                yatirimhesapEkle(hesap);
            }
        } 
        if (hesapBilgisi.equals("2")) {   
            if(hesapTuru.equals("VadeliHesap")){
                Vadelihesap hesap = new VadeliHesap(42436, "2");
                vadelihesapEkle(hesap);
            }
            if(hesapTuru.equals("VadesizHesap")){
                Vadesizhesap hesap = new VadesizHesap(12314);
                vadesizhesapEkle(hesap);
            }
            if(hesapTuru.equals("yatirimHesap")){
                Yatirimhesap hesap = new YatirimHesap("2", 3623342 ,"Dolar", 3.14f);
                yatirimhesapEkle(hesap);
            }
        } 
    }



    public void hesapSil(int tcKimlikNo, int musteriNumarasi, String ad, String soyad ){
        Musteri musteri = null;
        for (Musteri m : musteriler) {
            if (m.getTcKimlikNo() == tcKimlikNo && m.getMusteriNumarasi() == musteriNumarasi && 
                m.getAd().equals(ad) && m.getSoyad().equals(soyad)) {
                musteri = m;
                break;
            }
        }
        if (musteri != null) {
            // müşterinin hesaplarını döngüye sok
            for (BankaHesap hesap : musteri.getHesaplar()) {
                // hesap bakiyesi 0'dan büyükse uyarı göster
                if (hesap.gettoplamBakiye() > 0) {
                    System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız.");
                } else {
                    // hesap bakiyesi 0'a eşitse hesabı sil
                    musteri.getHesaplar().remove(hesap);
                    System.out.println("Hesap başariyla silindi.");
                }
            }
        } else {
            System.out.println("Müşteri bulunamadi.");
        }
    
    
        
    }
          
    


     

    public String toString(){
        
        String hesapbilgi = "";
        String krediKartlariStr = "";
        String krediStr = "";
        String vadeliStr = "";
        String vadesizStr = "";
        String yatirimStr = "";

        for(int i=0; i<hesaplar.size();i++)
        hesapbilgi += "\n" + (i+1) + ". Hesap Bilgisi:\n" + hesaplar.get(i).toString() + "\n------------------";
            for(int k=0; k<Vadelihesaplar.size() ;k++)
              vadeliStr += Vadelihesaplar.get(k).toString() + "\n------------------";
               for(int r=0;r<vadesizhesaplar.size() ;r++)
                vadesizStr += vadesizhesaplar.get(r).toString() + "\n------------------";
                for(int r=0;r<yatirimhesaplar.size() ;r++)
                 yatirimStr  += yatirimhesaplar.get(r).toString() + "\n------------------";
                  for(int y=0; y<krediKartlari.size() ;y++)
                   krediKartlariStr += "\n" + (y+1) + ". Kredi Karti bilgisi:\n" + krediKartlari.get(y).toString() + "\n";
                    for(int z=0; z<krediEklentisi.size() ;z++)
                      krediStr += "\n" + (z+1) + ". KREDİ bilgisi:\n" + krediEklentisi.get(z).toString() + "\n------------------";
        
            
 
        return  "TC Kimlik No: " + super.getTCKimlikNo() +
                "\nmuşterinumarasi:" +musteriNumarasi +
                "\nAd: " + super.getAd() +
                "\nSoyad: " + super.getSoyad() +
                "\nEmail: " + super.getEmail() +
                "\nTelefon Numarasi: " + super.getTelefonNumarasi() +
                "\n " + hesapbilgi +
                " " + vadeliStr +
                " " + vadesizStr +
                " " + yatirimStr +
                "\n " + krediKartlariStr +
                "\n " + krediStr;
                
    
    }

}














class Krediler{
    
    private int krediID;
    private double krediMiktari;
    private double taksitMiktari;
    private int yillikmaas;

    private Musteri musteri;
    

    public Krediler(){

    }

    public Krediler(int krediID, int yillikmaas, int krediMiktari){
        this.krediID = rastgeleKredID();
        this.yillikmaas = yillikmaas ;
        this.krediMiktari = (yillikmaas/2) ;

    }

    private  int rastgeleKredID(){
        Random sayi = new Random();
        int  krediID = 0;
        krediID=sayi.nextInt(999999999) + 1000000000;
        
        return krediID;

    }
    
    
    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public Musteri getMusteri() {
        return musteri;
    }
    public int getyillikmaas() {
        return  yillikmaas;
    }

    public void setyillikmaas(int yillikmaas) {
        this. yillikmaas =  yillikmaas;
    }

    

   

    public void kampanya(){

    }
        
    
    public String toString() {
        return "KrediID: " + this.krediID +
        "\nYillik maas:" +this.yillikmaas +
        "\nVerilebilecek Kredi Miktari: " + this.krediMiktari;
    }

}




class KrediKarti{

    private int kartNumarasi;
    private double limit;
    private int guncelBorc;
    private Musteri musteri;

    public KrediKarti(){

    }

    public KrediKarti(int kartNumarasi, double limit, int guncelBorc ){
        this.kartNumarasi= rastgelekartNumarasi();
        this.limit= limit;
        this.guncelBorc= guncelBorc;
        
    }

    private  int rastgelekartNumarasi(){
        Random sayi = new Random();
        int  kartNumarasi = 0;
        kartNumarasi=sayi.nextInt(999999999) + 1000000000;
        
        return kartNumarasi;

    }
    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public Musteri getMusteri() {
        return musteri;
    }
    public int getKartNumarasi() {
        return kartNumarasi;
    }
    
    public void setKartNumarasi(int kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }
    
    public double getLimit() {
        return limit;
    }
    
    public void setLimit(double limit) {
        this.limit = limit;
    }
    
    public double getGuncelBorc() {
        return guncelBorc;
    }
    
    public void setGuncelBorc(int guncelBorc) {
        this.guncelBorc = guncelBorc;
    }



    public void krediKartiSil(int kartNumarasi, double limit, int guncelBorc){
            for(KrediKarti kart : krediKartlari){ // kredikartları arrayi içinde arama yapıyor 
                if(kart.getKartNumarasi() == kartNumarasi){
                    if(kart.getGuncelBorc() == 0){
                        krediKartlari.remove(kart);
                        System.out.println("Kredi karti başariyla silindi.");
                    } else {
                        System.out.println("Lütfen öncelikle borç ödemesi yapiniz.");
                    }
                    break;
                }
            }
        }
        

    

    public double kullanilabilirLimit(int kartNumarasi, int guncelBorc){
        double toplamBorc = 0;
        for(KrediKarti kart : krediKartlari){
            toplamBorc += kart.getGuncelBorc();
        }
        double kullanilabilirLimit = limit - toplamBorc;
        System.out.println("Kullanilabilir limit: " + kullanilabilirLimit);
    }

    

    
   



    public String toString() {
        if(this.limit>10000 ){
            return 
            "Kart Numarasi: " + this.kartNumarasi + "\n" +
            "Limit: " + this.limit + "\n" +
            "Güncel Borc: " + this.guncelBorc + "\n" +
            "yeni kredilermiz mevcuttur başvuru yapmak ister misiniz?"  ; 
        }

        else if(this.limit <5000){
            return 
            "Kart Numarasi: " + this.kartNumarasi + "\n" +
            "Limit: " + this.limit + "\n" +
            "Güncel Borc: " + this.guncelBorc + "\n" + 
            "Limitiniz çok düşütür lütfen borcunuzu kapatiniz" ; 
        } 

        else {
            return 
            "Kart Numarasi: " + this.kartNumarasi + "\n" +
            "Limit: " + this.limit + "\n" +
            "Güncel Borc: " + this.guncelBorc   ; 
        } 

    }

}




class BankaHesap{
    
    
    private int iban;
    private Date hesapAcilisTarih;
    private double toplamBakiye;
    private String hesapBilgisi;
    private double islemMiktar;
    private String hesapTuru;
    private Musteri musteri;
   
    
    
    public BankaHesap(){
      
    }

    public BankaHesap(int iban, int toplamBakiye, String hesapBilgisi, Date hesapAcilisTarih  ){
       
        this.iban = rastgeleiban();
        this.toplamBakiye = toplamBakiye;
        this.hesapBilgisi = hesapBilgisi ;
        this.hesapAcilisTarih = hesapAcilisTarih;
        

    }

    private int rastgeleiban(){
        Random sayi = new Random();
        int iban = 0;
        iban = sayi.nextInt(999999999) + 1000000000;
    
        return iban;
    }


   
    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public Date getAcilisTarihi() {
        return hesapAcilisTarih;
    }

    public void setAcilisTarihi( Date hesapAcilisTarih) {
        this.hesapAcilisTarih = hesapAcilisTarih;
    }

    public double gettoplamBakiye() {
        return toplamBakiye;
    }

    public void settoplamBakiye( double toplamBakiye) {
        this.toplamBakiye = toplamBakiye;
    }



    public String getHesapBilgisi() {
        // hesapBilgisi değişkeninin değerini belirleme
        if (hesapBilgisi.equals("1")) {
            hesapBilgisi = "Maaş Hesabi";

        } else if (hesapBilgisi.equals("2")) {
            hesapBilgisi = "Normal Hesap";
        } else {
            hesapBilgisi = "Bilinmeyen Hesap Türü";
        }
        return hesapBilgisi;
    }
    public void setHesapBilgisi(String hesapBilgisi) {
        this.hesapBilgisi = hesapBilgisi;
    }




    public void hesapGoruntuleme(int musteriNumarasi, String ad, String soyad, int iban, double toplamBakiye, String hesapBilgisi){
         // Müşteri numarasına göre müşteriyi bul
    Musteri musteri = null;
    for (Musteri m : musteriler) {
        if (m.getMusteriNumarasi() == musteriNumarasi) {
            musteri = m;
            break;
        }
    }

    // Eğer müşteri bulunamadıysa hata mesajı yazdır ve fonksiyondan çık
    if (musteri == null) {
        System.out.println("Müşteri bulunamadı!");
        return;
    }

    // Hesap bilgilerini ekrana yazdır
    System.out.println("Müşteri adı: " + ad + " " + soyad);
    System.out.println("Müşteri numarası: " + musteriNumarasi);
    System.out.println("Hesap bilgileri:");

    for (BankaHesap hesap : musteri.getHesaplar()) {
        System.out.println("IBAN: " + hesap.getIban());
        System.out.println("Hesap Türü: " + hesap.getHesapBilgisi());
        System.out.println("Toplam Bakiye: " + hesap.getToplamBakiye());
        System.out.println("------------------------");
    }
    }


    public String getHesapTuru() {
        return hesapTuru;
    }

    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }


    public String toString() {
        return "Banka Hesabi Bilgileri:\n" +
        "IBAN: " + this.iban + "\n" +
        "Toplam Bakiye: " + this.toplamBakiye + "\n" +
        "Hesap Türü: " + getHesapBilgisi() + "\n" +
        "Hesap Aciliş tarihi:  " + getAcilisTarihi() ; 

    }


}



class VadeliHesap extends BankaHesap{

    private String hesapTuru;
    private int vadeliBakiye;
    private int faizOrani;
   

    public VadeliHesap(){

    }

    public VadeliHesap(int vadeliBakiye,String hesapTuru ){
        this.hesapTuru= hesapTuru;
        
        this.vadeliBakiye = vadeliBakiye;
        this.faizOrani= faizOrani;

    }
    
    public String getHesapTuru() {
        return hesapTuru;
    }

    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }



    public String toString() {
        if(hesapTuru.equals("1")){
      
            
        return "\nHesap Türü: Vadeli Hesap" +
        "\nFaiz Orani: %2" + faizOrani +
        "\nVadeli Bakiye: " + vadeliBakiye + " TL";
        }

        else if(hesapTuru.equals("2")){
             
        return "\nHesap Türü: Vadeli Hesap" +
        "\nFaiz Orani: %10 "  +
        "\nVadeli Bakiye: " + vadeliBakiye + " TL";
        } 

        else {
           
        return "\nHesap Türü: Vadeli Hesap" +
        "\nFaiz Orani: %" + faizOrani +
        "\nVadeli Bakiye: " + vadeliBakiye + " TL";
        } 
        
     
           
         

}
}



class VadesizHesap extends BankaHesap{

    private String hesapTuru;
    private double vadesizBakiye;
    private double guncelBorc;

    public VadesizHesap(){

    }

    public VadesizHesap( double vadesizBakiye){
        this.vadesizBakiye = vadesizBakiye;

    }

    public double paraTransfer(String hesapTuru, int iban, double vadesizBakiye, int islemMiktar){
      
       double toplamMiktar = islemMiktar ;
       if (getBakiye() < toplamMiktar) {
        System.out.println("Yetersiz bakiye!");
        return 0;
      }
       setBakiye(getBakiye() - toplamMiktar);
       hedefHesap.setBakiye(hedefHesap.getBakiye() + islemMiktar);
       return islemMiktar;
    }


    public double krediKartiBorcOdeme(double vadesizBakiye, double guncelBorc ){
        if (vadesizBakiye < guncelBorc) {
            System.out.println("Yetersiz bakiye. Lütfen daha düşük bir miktar girin.");
            return 0.0;
        } else {
            // hesabın bakiyesinden ödeme miktarı kadar düşülür
            double yeniBakiye = vadesizBakiye - guncelBorc;
            System.out.println("Hesabinizdan " + guncelBorc + " TL ödeme yapildi. Yeni bakiyeniz: " + yeniBakiye);
    
            // kredi kartının güncel borcundan ödeme miktarı kadar düşülür
            double yeniBorc = guncelBorc - guncelBorc;
            System.out.println("Kredi karti borcunuzdan " + guncelBorc + " TL ödeme yapildi. Yeni borcunuz: " + yeniBorc);
            
            return yeniBakiye;
        }
      


    }

    public double krediOdeme(int krediID ){
        double odemeMiktari = kredi.getGuncelBorc();
        double bakiye = this.getVadesizHesap().getBakiye();
        if(bakiye >= odemeMiktari){
            this.getVadesizHesap().paraCek(odemeMiktari);
            kredi.odemeYap(odemeMiktari);
            return odemeMiktari;
        } else {
            System.out.println("Yetersiz bakiye. Ödeme yapilamadi.");
            return 0;
        }
    

    }





    public String toString() {
        return  "\nHesap Türü: Vadesiz Hesap" +
        "\nVadesiz Bakiye: " + vadesizBakiye + " TL"; 
    }
}



class YatirimHesap extends BankaHesap{

    private String hesapTuru;
    private int yatirimBakiye;
    private String yatirimTuru;
    private float kur;

    public YatirimHesap(){

    }

    public YatirimHesap(double yatirimBakiye, String yatirimTuru, float kur){
        this.yatirimBakiye = yatirimBakiye;
        this.yatirimTuru = yatirimTuru;
        this.kur = kur; 

        



    }
    public int getYatirimBakiye() {
        return yatirimBakiye;
    }

    public void setHesapTuru(int yatirimBakiye) {
        this.yatirimBakiye = yatirimBakiye;
    }
    public String getyatirimTuru() {
        return yatirimTuru;
    }

    public void setyatirimTuru(String yatirimTuru) {
        this.yatirimTuru=yatirimTuru;
    }

    public float getkur() {
        return kur;
    }

    public void setkur(float kur) {
        this.kur = kur;
    }



    public double paraEkle(int yatirimBakiye, String yatirimTuru, float kur){
       
            if (yatirimTuru.equals("dolar")) {
                yatirimBakiye = yatirimBakiye* kur;
            } else if (yatirimTuru.equals("euro")) {
                yatirimBakiye = yatirimBakiye* kur;
            } else if (yatirimTuru.equals("TL")) {
                yatirimBakiye = yatirimBakiye* kur;
            }
            return yatirimBakiye;
        }

    

    public double paraBoz(int yatirimBakiye, String yatirimTuru, float kur ){
        if (yatirimTuru.equals("dolar")) {
            return yatirimBakiye / kur;
        } else if (yatirimTuru.equals("euro")) {
            return yatirimBakiye / kur;
        } else if (yatirimTuru.equals("TL")) {
            return yatirimBakiye / kur;
        } else {
            return 0;
        }

    }
   

    public String toString() {
        return "\nHesap Türü: Yatirim Hesap" +
        "\nYatirim Bakiye: " + yatirimBakiye + " TL" +
        "\nYatirim turu : " + yatirimTuru ; 
    }

}




















public class proje{
    public static void main (String[] args){
         

        Date date1 = new Date(123, 11, 10);
        Date date2 = new Date(121, 5, 27);

        Musteri musteri1 = new Musteri(1, 1, "eren", "ozer", "eren.oz@gmail.com", 504576158);
        Musteri musteri2 = new Musteri(1, 1, "furkan", "yildiz", "furkan.yil@gmail.com", 504576158);
      
        BankaPersonel personel1 = new BankaPersonel(1, "safak", "bal", "safak.bal@gmail.com", 507392348);
        BankaPersonel personel2 = new BankaPersonel(1, "yasemin", "nur", "yas.nur@gmail.com", 546928471);
        
        BankaHesap hesap1 = new BankaHesap(1, 135234, "2", date1 );
        BankaHesap hesap2 = new BankaHesap(1, 213141, "1", date2);

        KrediKarti kart1 = new KrediKarti(1, 30000, 1000);
        KrediKarti kart2 = new KrediKarti(1, 2000, 200);

        Krediler kredi1 = new Krediler(1, 120000, 1);
        Krediler kredi2 = new Krediler(1, 90000, 1);

        VadeliHesap vadeli1 = new VadeliHesap(40000,"1");
        VadeliHesap vadeli2 = new VadeliHesap(2234000,"2");

        VadesizHesap vadesiz1 = new VadesizHesap(20000);
        VadesizHesap vadesiz2 = new VadesizHesap(213432);





        musteri1.vadelihesapEkle(vadeli1);
       
        musteri2.vadesizhesapEkle(vadesiz2);

        musteri1.krediEkle(kredi1);
        musteri2.krediEkle(kredi2);

        musteri1.krediKartiEkle(kart1);
        musteri2.krediKartiEkle(kart2);
       
        musteri1.hesapEkle(hesap1);
        musteri2.hesapEkle(hesap2);
        
        personel1.musteriEkle(musteri1);
        personel2.musteriEkle(musteri2);
        
        System.out.println(personel1.toString());
        System.out.println(personel2.toString());
        

    }
}

        