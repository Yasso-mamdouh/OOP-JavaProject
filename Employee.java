package com.mycompany.activity.java;

enum gender{male,female};

public abstract class Employee {
String name;
String address;
int ssn;
gender sex;
//default constructor
public Employee(){}
//parameterized constructor
public Employee(String Name,String Address, int SSN,gender Sex)
{
    this.name=Name;
    this.address=Address;
    this.ssn=SSN;
    this.sex=Sex;
}
public abstract void Earning();
//setter
    public void setName(String name) 
    {this.name = name;}
    public void setAddress(String address) 
    {this.address = address;}
    public void setSsn(int ssn) 
    {this.ssn = ssn;}
   void setSex(gender sex){this.sex=sex;}
//getter
    public String getName() {return name; }
    public String getAddress() {return address;}
    public int getSsn() {return ssn;}
    gender getSex(){return sex;}
    
   

}
