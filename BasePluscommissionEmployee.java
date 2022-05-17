package com.mycompany.activity.java;

public class BasePluscommissionEmployee extends commissionEmployee{
    double Base;
    
    public BasePluscommissionEmployee(){};
    public BasePluscommissionEmployee(String Name,String Address, int SSN,gender sex,double gross_salary,double commission_rate,double base)
    {
        super(Name,Address,SSN,gross_salary,commission_rate,sex);
        this.Base=base;
    }
    
    @Override
    public void Earning()
    {
        System.out.println(Base);
        super.Earning();
    }
    
    public void setBase(double base)
    {this.Base=base;}
    
    @Override
    public void Display_all_details()
    {
        System.out.println(" name: "+super.name+"\n address: "+super.address+"\n SSN= "+super.ssn+"\n sex: "
                +super.sex+"\n base= "+Base);
    }
    @Override 
    public void Display_Earning()
    {
        Earning();
    }
    
}