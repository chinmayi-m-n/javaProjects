package com.ivoyant.week1.non_primitive_typecasting;
class Animal{
    public void sound(){
        System.out.println("Animal is making sound");
    }
}
class Dog extends com.ivoyant.week1.non_primitive_typecasting.Animal {
    public void sound(){
        System.out.println("Bow Bow .......");
    }
}
class Cat extends com.ivoyant.week1.non_primitive_typecasting.Animal {
    public void sound(){
        System.out.println("meow meow ..........");
    }
}
public class UpCasting {
    public static void main(String[] args) {
        //type of RHS is casted from child class to parent class i.e from Cat to Animal implicitly
        //here we are moving from child towards parent=>upcasting
        //according to dynamic method dispatch the method that gets called depends on runtime object not reference type
        com.ivoyant.week1.non_primitive_typecasting.Animal a1=new com.ivoyant.week1.non_primitive_typecasting.Cat();
        a1.sound();
        com.ivoyant.week1.non_primitive_typecasting.Animal a2=new com.ivoyant.week1.non_primitive_typecasting.Dog();
        a2.sound();

    }
}