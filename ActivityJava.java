
package com.mycompany.activity.java;

public class ActivityJava {

    public static void main(String[] args) {
        System.out.println("Hellow Final_Activity \n");
        
        salariedEmployee obj1=new salariedEmployee("yosry","Luxor",212,2000,220,86,gender.male);
        obj1.Display_all_details();
        obj1.Earning();
        obj1.Display_Earning();
        System.out.println("\n");
        
        HourlyEmployee obj2=new HourlyEmployee("Menna","Mansoura",112,700,6,gender.female);
        obj2.Display_all_details();
        obj2.Earning();
        obj2.Display_Earning();
        System.out.println("\n");
        
        commissionEmployee obj3=new commissionEmployee("Ahmed","Cairo",321,5300,23,gender.male);
        obj3.Display_all_details();
        obj3.Earning();
        obj3.Display_Earning();
    }
}
