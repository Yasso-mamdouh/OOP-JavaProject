package com.mycompany.activity.java;

public class HourlyEmployee extends Employee implements Displayable{
double Houre_Rate;
int No_of_Hours;

HourlyEmployee(){}
HourlyEmployee(String Name,String Address, int SSN,double Houre_Rate,int No_of_Hours,gender sex)
{
    super(Name,Address,SSN,sex);
    this.Houre_Rate=Houre_Rate;
    this.No_of_Hours=No_of_Hours;
}
public void setHoure_Rate(double houre_rate){this.Houre_Rate=houre_rate;}
public void setNo_of_Hours(int no_of_hour){this.No_of_Hours=no_of_hour;}


//It's an overriding of the Earning method in parent class Employee
@Override
public void Earning()
{
    System.out.println("Earning= "+Houre_Rate * No_of_Hours);
}
@Override
public void Display_all_details()
{
    System.out.println(" name: "+super.name+"\n address: "+super.address+"\n SSN= "+super.ssn+"\n sex: "
            +super.sex+"\n Houre_Rate= "+Houre_Rate+"\n No_of_Houres= "+No_of_Hours);
}

@Override
public void Display_Earning()
{
    Earning();
}

}

