package com.company;

class oneClass{
    int a;

    public oneClass(int a){
        this.a = a;
    }

    public int getA(){
        return a;
    }

    public int retrunone(){
        return 1;
    }
}

class twoClass extends oneClass{
    public twoClass(int c){
        super(c);
        System.out.println("I am a Constructor");
    }
}

public class java_learning_this_super_keyword {
    public static void main(String[] args) {
        oneClass oc = new oneClass(5);
        twoClass tc = new twoClass(10);
    }
}
