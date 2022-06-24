package Class18;

public class Cow {
    String breed;
    String color;
    int age;
    double weight;

    Cow(String breed,String color,int age,double weight){
        //When we have same name variables as local and instance inside a class
        //always local variables are preferred over instance by java in block of code


        this.breed=breed;
        this.color=color;
        this.age=age;
        this.weight=weight;

    }

    public Cow(String australian, String black, String s, String s1) {
    }

    String getCowInfo(){
        return "Breed "+breed+" Color "+color+" Age "+age+" Weight "+weight;
    }


}
