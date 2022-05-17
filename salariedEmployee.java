package com.mycompany.activity.java;

public class salariedEmployee extends Employee implements Displayable{
double salary;
double bouns;
double deductions;

salariedEmployee(){}
salariedEmployee(String Name,String Address, int SSN,double Salary, double Bouns, double Deductions,gender sex)
{
    super(Name,Address,SSN,sex);
    this.salary=Salary;
    this.bouns=Bouns;
    this.deductions=Deductions;
    
}
public void setSalary(double Salary){this.salary=Salary;}
public void setBouns(double Bouns){this.bouns=Bouns;}
public void setDedutions(double Deductions){this.deductions=Deductions;}

public double getSalary(){return salary;}
public double getBouns(){return bouns;}
public double getDeductios(){return deductions;}

@Override
public void Earning()
{
    System.out.println("Earning= "+((salary+bouns)-deductions));
}
@Override
public void Display_all_details()
{
    System.out.println(" name: "+super.name+"\n address: "+super.address+"\n SSN= "+super.ssn+"\n sex: "
            +super.sex+"\n salary= "+salary+"\n Bouns= "+bouns+"\n deductions= "+deductions);
}
@Override 
public void Display_Earning()
{
    Earning();
}

}

