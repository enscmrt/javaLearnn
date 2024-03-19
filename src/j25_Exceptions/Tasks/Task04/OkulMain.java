package j25_Exceptions.Tasks.Task04;

import java.util.Scanner;

import static j25_Exceptions.Tasks.Task04.Okul.okulList;


public class OkulMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Okul school = new Okul("Fatih Lisesi",5);

               Ogrenci ogr1 = new Ogrenci("Enes","Cömert",14);
               school.ogrenciEkle(ogr1);
               Ogrenci ogr2 = new Ogrenci("Mehmet","Ekinci",11);
               school.ogrenciEkle(ogr2);
               Ogrenci ogr3 = new Ogrenci("Fatma","Cömert",22);
               school.ogrenciEkle(ogr3);
               Ogrenci ogr4 = new Ogrenci("Tarık Ziya","Cömert",14);
               school.ogrenciEkle(ogr4);

            }
        }










