package TeamWorkProject.Project_09.TestClass;


import TeamWorkProject.Project_09.Lessons.LessonClass;
import TeamWorkProject.Project_09.Lessons.Music;
import TeamWorkProject.Project_09.Student.StudentClass;

public class MainClass3 {

    public static void main(String[] args) {

        StudentClass studentClass = new StudentClass("Gerard", "Captain2005", "France");

        LessonClass lessonClass = new Music(studentClass);

        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);


        /*
        Run the MainClass3
        Enter: Art

            Exception in thread "main" java.lang.RuntimeException: You class name is not a valid class name.
         */
    }
}




