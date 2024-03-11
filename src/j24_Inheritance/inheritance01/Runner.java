package j24_Inheritance.inheritance01;

public class Runner {
    /*
1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları için kullanılır.
5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
  denir.
8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
    public static void main(String[] args) {
        Hayvanlar h1=new Hayvanlar();//grandparent classtan obj create edildi
        h1.hareket();
        h1.beslenme();
        h1.icme();

        Balık b1=new Balık();//child classtan obj create edildi
        b1.izgaraTava();//child class kendi meth call edildi.
        b1.hareket();//parent class tan meth call edildi
        b1.beslenme();//parent class tan meth call edildi
        b1.icme();//parent class tan meth call edildi

        Memeliler m1=new Memeliler();//parent class tan obj create edildi
        m1.sutBeslen();//parent class tan meth call edildi.
        m1.dogum();//parent class tan meth call edildi.
        m1.beslenme();//grandparent class tan meth call edildi.
        m1.icme();//grandparent class tan meth call edildi.
        m1.hareket();//grandparent class tan meth call edildi.

        Koyun k1=new Koyun();
        k1.meler();//child class kendi meth call edildi
        k1.sutBeslen();
        k1.dogum();
        k1.icme();
        k1.hareket();
        k1.beslenme();

        Kedi p1=new Kedi();
        p1.cirmalama();
        p1.hareket();
        p1.beslenme();
        p1.icme();
        p1.sutBeslen();
        p1.dogum();

    }
}
