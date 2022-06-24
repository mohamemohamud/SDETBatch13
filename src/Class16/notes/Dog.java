package Class16.notes;

public class Dog {

   static String name;
   String color;


    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.name="Tommy";
        dog1.color="Pink";

        Dog dog2=new Dog();
        dog2.name="Fido";
        dog2.color="Black";

        Dog dog3=new Dog();
        dog3.name="Jajaja";
        dog3.color="White";

        System.out.println(dog1.name);
        System.out.println(dog2.name);

    }


}
