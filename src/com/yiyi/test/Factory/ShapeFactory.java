package com.yiyi.test.Factory;

/**
 * 一个工厂类，用来产生Shape对象
 * Created by liuzhe on 2016/6/29.
 */
public class ShapeFactory {

    public Shape getShape(String shape){

        if(shape == null){
            return null;
        }

        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Reactangle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
