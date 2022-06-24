package Reiew6;

import javax.print.Doc;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc= new Doctor("Jane", "Smith");
        doc.printInfo();

        Doctor.hospital="UCSF";
        doc.work();

        System.out.println(" -------------- ");
        //creating another doctor
        Doctor doctor=new Doctor("Joe", "Doe", "cardiologyst", 10);
        doctor.printInfo();
        doctor.work();

        System.out.println(" ------------ ");
        //change value of instance variable
        doc.lastName="Obama";
        doc.printInfo();
        doctor.printInfo();
        doc.hospital="Mayo Clinic";

        System.out.println("                        ");
        doc.work();
        doctor.work();



    }

}
