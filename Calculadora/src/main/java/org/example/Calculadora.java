package org.example;

public class Calculadora {
    private int num1;
    private int num2;
    public Calculadora (int a , int b){
        num1=a;
        num2=b;
    }
    public int suma(){
        int res=num1+num2;
        return res;
    }
    public int resta(){
        int res=num1-num2;	//error corregido
        return res;
    }
    public int multiplica(){
        int res=num1*num2;
        return res;
    }
    public int divide(){
        if (num2==0){
            throw new java.lang.ArithmeticException("ERROR por 0");
        }else {
            int res = num1 / num2; //error corregido
            return res;
        }
    }
}