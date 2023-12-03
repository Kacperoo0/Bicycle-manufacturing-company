# System Produkcji Rowerów
## Funkcje

- **Tworzenie Roweru:** Umożliwia użytkownikom tworzenie niestandardowych rowerów, podając szczegóły takie jak model, cena, kolor, rozmiar i pojemność baterii dla rowerów elektrycznych.

- **Tworzenie Konta Klienta:** Umożliwia użytkownikom tworzenie kont klientów z podaniem ich imienia, adresu e-mail i hasła.

- **Zarządzanie Inwentarzem:** Śledzi inwentarz rowerów dla każdego producenta, w tym całkowitą liczbę wyprodukowanych rowerów.

- **System Rezerwacji:** Pozwala klientom rezerwować rowery, usuwając je z dostępnego inwentarza.

## Klasy i Struktura

- `Bicycle`: Reprezentuje podstawowy rower z właściwościami takimi jak model, cena, kolor, rozmiar i unikalny numer.

- `ElectricBicycle`: Rozszerza klasę `Bicycle` i zawiera dodatkową właściwość dla pojemności baterii.

- `Manufacturer`: Reprezentuje producenta rowerów z informacjami, takimi jak nazwa, adres, dane kontaktowe i inwentarz rowerów.

- `Customer`: Reprezentuje konto klienta z danymi takimi jak imię, adres e-mail i preferowana metoda kontaktu.
