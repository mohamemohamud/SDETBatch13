package com.syntax.class15;

public class Task4 {
    //create a method that will say hello in different
    // languages based on the country that will passed when method is executed

    void sayHello(String country) {

        String hello;
        switch (country){
            case "USA":
            hello="Hola";
            break;
            case "Russia":
                hello="Privet" ;
                break;
            case "France":
                hello="bonjour";
                break;
            case "Pakistan":
                hello="Assalam o Alykum";
                break;
            case "India":
                hello="Namastay";
                break;
            case "Turkiye":
            hello="Merhabe";
            break;
            default:
                hello="Country not found";


        }
        System.out.println(hello);
    }
    public static void main(String[] args) {
        Task4 task4=new Task4();

    }
}
