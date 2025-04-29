package com.ivoyant.week1.non_primitive_typecasting;

class Computer{
    public void code(){
        System.out.println("coding.....");
    }

}

class Laptop extends Computer{
    public void code(){
        System.out.println("coding in laptop...");
    }
}
class Desktop extends Computer{
    public void code(){
        System.out.println("coding in desktop.....");
    }
}
class DownCasting{
    public static void main(String[] args) {
        //moving from parent towards child
        Laptop obj1=(Laptop)new Computer();
        obj1.code();
    }
}