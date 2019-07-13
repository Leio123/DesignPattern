package shapeFactoryPattern;

import abstractFactoryPattern.AbstractFactory;
import colorFactoryPattern.Color;
import colorFactoryPattern.EnumColor;

//创建一个工厂，生成基于基于给定信息的实体类的对象
public class ShapeFactory extends AbstractFactory {

	//使用getShape方法获取形状类型的对象
	public Shape getShape(EnumShape shape) {
		switch (shape) {
			case RECTANGLE:
				return new Rectangle();
			case SQUARE:
				return new Square();
			case CIRCLE:
				return new Circle();
			default:
				return null;
		}
	}

	@Override
	public Color getColor(EnumColor color) {
		return null;
	}
	
}
