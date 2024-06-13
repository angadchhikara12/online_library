package com.company;
class Phone{
    public void greet(){System.out.println("Good Morning");}
    public void on(){System.out.println("Truning on Phone...");}
}

class SmartPhone extends Phone{
    public void welcome(){System.out.println("Welcome");}
    @Override
    public void on(){System.out.println("Turning on Smart Phone...");}
}
public class CWH_49_Dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone smobj = new SmartPhone();
//        obj.on();
        Phone obj = new SmartPhone();
//        SmartPhone obj2 = new Phone();

        obj.greet();
        obj.on();
    }
}
