
INSERT INTO Uzytkownik (login, email, haslo_hash, status_konta, data_rejestracji)
VALUES ('student1', 'student1@ati.edu.pl', 'hash123', 'AKTYWNE', CURRENT_DATE);

INSERT INTO Student (id_uzytkownika, nr_indeksu, imie, nazwisko, kierunek, semestr_aktualny)
VALUES (1, 'S12345', 'Jan', 'Kowalski', 'Informatyka', 3);

INSERT INTO Semestr (nazwa, data_od, data_do)
VALUES ('Zima 2025', DATE '2025-10-01', DATE '2026-02-15');

INSERT INTO Przedmiot (kod_przedmiotu, nazwa, opis, ects)
VALUES ('PRG1', 'Programowanie', 'Podstawy programowania', 6);

INSERT INTO GrupaPrzedmiotowa (id_przedmiotu, nazwa_grupy, semestr, limit_miejsc)
VALUES (1, 'Lab A', 3, 30);

INSERT INTO ZapisNaPrzedmiot (id_studenta, id_grupy, data_zapisu, status)
VALUES (1, 1, CURRENT_DATE, 'AKTYWNY');

INSERT INTO Ocena (id_studenta, id_grupy, id_semestru, wartosc, typ_oceny, data_wystawienia)
VALUES (1, 1, 1, 4.5, 'EGZAMIN', CURRENT_DATE);

INSERT INTO Platnosc (id_studenta, id_semestru, kwota, data_wymagalnosci, status)
VALUES (1, 1, 2500.00, DATE '2025-10-10', 'ZAPLACONA');

INSERT INTO KontoBiblioteczne (id_studenta, status, data_utworzenia)
VALUES (1, 'AKTYWNE', CURRENT_DATE);

INSERT INTO Ksiazka (tytul, autor, isbn)
VALUES ('Java Podstawy', 'Jan Nowak', '1234567890');

INSERT INTO Wypozyczenie (id_konta_bibl, id_ksiazki, data_wypozyczenia, termin_zwrotu, status)
VALUES (1, 1, CURRENT_DATE, DATE '2026-01-15', 'WYPOZYCZONE');

INSERT INTO Zajecia (id_grupy, id_semestru, dzien_tygodnia, godzina_od, godzina_do, sala)
VALUES (1, 1, 2, TIME '10:00', TIME '11:30', 'A12');

INSERT INTO Powiadomienie (id_studenta, tresc, data_wyslania)
VALUES (1, 'Zajęcia odwołane', CURRENT_TIMESTAMP);