package j20_StaticKeyword.Tasks.Task03;

public class Lesson {
    String lessonName;
    int credit;


    public Lesson(String lessonName, int credit) {
        this.lessonName = lessonName;
        if (credit >= 1 && credit <= 10) {
            this.credit = credit;
        } else {
            System.out.println("Ders kredisi 1 ile 10 arasında olmalıdır!!!");
        }
    }

    public int getCredit() {
        return credit;
    }

    public String getLessonName() {
        return lessonName;
    }

    @Override
    public String toString() {
        return
                "lessonName='" + lessonName + '\'' +
                ", credit=" + credit;
    }
}
