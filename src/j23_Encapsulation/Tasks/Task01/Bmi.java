package j23_Encapsulation.Tasks.Task01;

public class Bmi {//pojo Class

    private  String name;
    private  int age;
    private  double height;
    private  double weight;

    public double getBmi(){
        return weight/(height*height);

    }

    public String getStatus(){
        if(getBmi()<18.5){
            return "zayıf";
        }else if(getBmi()<25){
            return "normal";
        }else if(getBmi()<30){
            return "kilolu";
        }else return "obez";

        }

    public Bmi(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}//Class sonu