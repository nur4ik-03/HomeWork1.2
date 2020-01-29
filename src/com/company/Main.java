package com.company;



public class Main {
    public  static String word = "hi";
    public static void  test(){
        System.out.println("Test");
        int a = 22;
        if (1 > 4){
            double b = 2.0;
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        System.out.println();
        printText();
        printText();
        printText();
        arithemiticOperetion(2,7);
        int value = multiply(2,7) + multiply(3,8);


    }

    public static void printText(){
        System.out.println("Hello");
        System.out.println("JAVA");
        System.out.println("GeekTec");
test();
    }

    public static void arithemiticOperetion(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static int multiply(int num1 , int num2) {
        int result = num1 + num2;
        return  result;

    }
}

