package ru.gb.lesson.Lesson4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Triangle {
    private int a;
    private int b;
    private int c;

    public int perimeterCalculating(){
        dataCheck();
        return a + b + c ;
    }

    public double triangleAreaCalculation(Triangle triangle){
        triangle.dataCheck();
        double p = (double)perimeterCalculating()/2;
        return Math.sqrt(p*((p-triangle.getA())*(p-triangle.getB())*(p-triangle.getC())));
    }

    public void dataCheck(){
        if ( a <= 0 || b <= 0 || c <= 0 ){
            throw new IllegalArgumentException("At least one side of the triangle is negative! Fix it!");
        }
        int longestSide = Math.max(Math.max(a,b),c);
        if (longestSide >= (a + b + c - longestSide)){
            throw new IllegalArgumentException("The sum of two sides of the triangle is equal or larger then the third side! Fix it!");
        }
    }






}
