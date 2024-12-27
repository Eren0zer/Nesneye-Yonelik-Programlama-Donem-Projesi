# Banka Müşteri Yönetim Sistemi

Bu proje, Java dilinde yazılmış bir **Banka Müşteri Yönetim Sistemi** uygulamasıdır. Uygulama, bir bankanın personel, müşteri, kredi kartı ve hesap yönetimi gibi temel işlevlerini simüle eder.

## Özellikler

- **Kişi Yönetimi**:
  - Personel ve müşteri bilgilerini yönetme
  - Müşteri ekleme ve listeleme
- **Hesap Yönetimi**:
  - Vadeli, vadesiz ve yatırım hesapları oluşturma
  - Hesap detaylarını görüntüleme
- **Kredi Kartı Yönetimi**:
  - Kredi kartı oluşturma
  - Borç ödeme ve limit kontrolü
- **Kredi Yönetimi**:
  - Müşteri için kredi oluşturma
  - Kredilerin detaylarını görüntüleme

## Kullanılan Teknolojiler

- **Java**: Uygulamanın temel programlama dili.
- **JDK 8 veya üstü**: Uygulamayı çalıştırmak için gerekli.
- **IDE (Örneğin IntelliJ IDEA veya Eclipse)**: Projenin geliştirilmesi ve çalıştırılması için.

## Proje Yapısı

Proje şu şekilde yapılandırılmıştır:

- **`Kisi`**: Temel sınıf. Personel ve müşteri bilgilerini içerir.
- **`BankaPersonel`**: Banka çalışanlarının bilgilerini yönetir.
- **`Musteri`**: Müşteri detaylarını yönetir ve hesaplarla bağlantılıdır.
- **Hesaplar**:
  - **`VadeliHesap`**: Vadeli mevduat hesapları için.
  - **`VadesizHesap`**: Günlük işlemler için vadesiz hesaplar.
  - **`YatirimHesap`**: Döviz veya yatırım hesapları.
- **`KrediKarti`**: Kredi kartı işlemlerini yönetir.
- **`Krediler`**: Müşteri kredileri ve detayları.

## Teknik Detaylar

### Sınıflar ve Görevleri
- **`Kisi`**:
  - Ortak özellikleri barındıran temel sınıf.
  - Alt sınıflar: `BankaPersonel`, `Musteri`.
  
- **`BankaPersonel`**:
  - Personel detaylarını ve sorumlu olduğu müşterileri yönetir.
  - `musteriEkle()` metodu ile yeni müşteri ekler.

- **`Musteri`**:
  - Müşteri detaylarını yönetir.
  - Vadeli, vadesiz ve yatırım hesaplarını yönetir.
  - Krediler ve kredi kartlarını ekleme/silme yeteneği sağlar.

- **Hesap Türleri**:
  - `VadeliHesap`: Faiz oranı ve vadeli bakiye içerir.
  - `VadesizHesap`: Günlük işlemler için uygundur.
  - `YatirimHesap`: Döviz ve yatırım işlemleri için kullanılır.

- **`KrediKarti`**:
  - Müşteriye atanmış kredi kartlarının limit ve borç detaylarını içerir.

- **`Krediler`**:
  - Kredilerin detaylarını ve limit hesaplamalarını içerir.

### Önemli Metodlar
- `musteriEkle(Musteri musteri)`: Yeni müşteri ekler.
- `hesapEkle(BankaHesap hesap)`: Müşteriye yeni hesap ekler.
- `krediKartiBorcOdeme(double bakiye, double borc)`: Kredi kartı borcunu öder.
- `paraTransfer(String hesapTuru, double miktar)`: Hesaplar arasında para transferi yapar.

## Veri Akışı

1. **Personel ve Müşteri Tanımlaması**:
   - `BankaPersonel` ve `Musteri` sınıfları kullanılarak personel ve müşteriler oluşturulur.

2. **Hesap İşlemleri**:
   - Müşterilere vadeli, vadesiz veya yatırım hesapları eklenir.
   - Hesap detayları `toString()` metodu ile görüntülenir.

3. **Kredi Kartı ve Krediler**:
   - Müşterilere kredi kartları ve krediler atanır.
   - Borç ödeme ve limit kontrol işlemleri yapılır.

4. **Sonuçların Gösterimi**:
   - Tüm bilgiler `System.out.println` ile konsola yazdırılır.

## Mimari Diyagram

Aşağıdaki diyagram, sınıflar arasındaki temel ilişkileri göstermektedir:

```plaintext
Kisi
  ├── BankaPersonel
  │      └── Musteri
  │             ├── VadeliHesap
  │             ├── VadesizHesap
  │             ├── YatirimHesap
  │             ├── KrediKarti
  │             └── Krediler
```

## Kurulum ve Çalıştırma

1. **Proje Dosyalarını Klonlayın**:
   ```bash
   git clone https://github.com/Eren0zer/Nesneye-Yonelik-Programlama-Donem-Projesi
   cd Nesneye-Yonelik-Programlama-Donem-Projesi
