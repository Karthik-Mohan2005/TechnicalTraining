package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int add(int a,int b){
        return a+b;
    }
    public static int diff(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        System.out.println(add(5,6));
        System.out.println(diff(5,6));
    }
}