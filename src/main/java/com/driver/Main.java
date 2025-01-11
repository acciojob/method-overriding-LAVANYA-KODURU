package com.driver;
public class A {
  public String meth(){
  return "Invoking method from Class A";
  }
}
public class B extends A {
  public String meth(){
    return "Method is ovverridden in Extended class B";
  }
}
public class Main {
  public static void main(String[] args){
    B obj=new B();
    System.out.println(obj.meth());
  }
}
