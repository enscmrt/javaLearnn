package j20_StaticKeyword.Tasks.Task03;

import java.util.ArrayList;

public class Runner {
    /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */

    public static void main(String[] args) {

        Lesson lesson1 = new Lesson("Math",5);
        Lesson lesson2 = new Lesson("English",15);
        Lesson lesson3 = new Lesson("Science",3);

        Student student= new Student("Enes",10);
        student.lessons.add(lesson1);
        student.lessons.add(lesson2);
        student.lessons.add(lesson3);
        student.alınanDersler();
        System.out.println("student.lessons = " + student.lessons);
        student.toplamKredisi();


    }

}
