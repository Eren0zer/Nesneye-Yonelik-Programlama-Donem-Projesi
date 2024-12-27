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

## Kurulum ve Çalıştırma

1. **Proje Dosyalarını Klonlayın**:
   ```bash
   git clone https://github.com/Eren0zer/Nesneye-Yonelik-Programlama-Donem-Projesi
   cd Nesneye-Yonelik-Programlama-Donem-Projesi
