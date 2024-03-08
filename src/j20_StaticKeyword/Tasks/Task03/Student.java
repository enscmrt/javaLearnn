package j20_StaticKeyword.Tasks.Task03;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String studentName;
    int maxCredit;
    List<Lesson>lessons;



    public Student(String studentName, int maxCredit) {
        this.studentName = studentName;
        this.maxCredit = maxCredit;
        this.lessons = new ArrayList<>();

    }
    public  void dersEkle(Lesson lesson){
        if(lesson.getCredit()<=maxCredit){
            lessons.add(lesson);
        }else {
            System.out.println("Ders eklenemedi " + lesson.getLessonName() + ". Max krediye ulaşıldı");
        }


    }


    public int toplamKredisi(){
        int toplam = 0;
        for (Lesson lesson : lessons){
            toplam += lesson.getCredit();
        }
        return toplam;
    }

    public void alınanDersler(){
        System.out.println("Alınabilecek dersler : "+lessons);
        for (Lesson lesson : lessons){
            System.out.println(lesson.getLessonName() + " - " + lesson.getCredit() + " credits");
        }
    }

    @Override
    public String toString() {
        return
                "studentName='" + studentName + '\'' +
                ", maxCredit=" + maxCredit +
                ", lessons=" + lessons;
    }
}

