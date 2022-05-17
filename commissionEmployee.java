
package com.mycompany.activity.java;

public class commissionEmployee extends Employee implements Displayable{
    double gross_salary;
    double commission_rate;
    
    public commissionEmployee(){}
    public commissionEmployee(String Name,String Address, int SSN,double gross_salary,double commission_rate,gender sex)
    {   
        super(Name,Address,SSN,sex);
        this.commission_rate=commission_rate;
        this.gross_salary=gross_salary;
    }
    @Override
    public void Earning()
    {System.out.println("Earning= "+( gross_salary * commission_rate ));}

    public void setGross_salary(double gross_salary)
    {
        this.gross_salary=gross_salary;
    }
    
    public void setCommission_rate(double commission_rate)
    {
        this.commission_rate=commission_rate;
    }
    
    @Override
    public void Display_all_details()
    {
        System.out.println(" name: "+super.name+"\n address: "+super.address+"\n SSN= "+super.ssn+"\n sex: "
                +super.sex+"\n commission_rate= "+commission_rate+"\n gross_salary= "+gross_salary);
    }
    @Override 
    public void Display_Earning()
    {
        Earning();
    }
    
}