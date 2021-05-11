package edu.xcdq.demo04;

import java.util.List;

/**
 * @Author:hanxuejie
 * @Date:2021/5/11 16:03
 */

public class Canvas {
    //在画布上画一个
    public  void draw(Shape shape){
        shape.xingzhuang();
    }
    //在画布上画多个
    public void drawAll(List<Shape> shapeList){
        for (Shape s : shapeList){
            s.xingzhuang();
        }
    }
}
