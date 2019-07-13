package factoryPattern;

import shapeFactoryPattern.EnumShape;
import shapeFactoryPattern.Shape;
import shapeFactoryPattern.ShapeFactory;

//使用该工厂，通过传递类型信息来获取实体类的对象。
public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// 获取 Circle 的对象，并调用它的 draw 方法
		Shape shape1 = shapeFactory.getShape(EnumShape.CIRCLE);
		// 调用 Circle 的 draw 方法
		shape1.draw();

		// 获取 Rectangle 的对象，并调用它的 draw 方法
		Shape shape2 = shapeFactory.getShape(EnumShape.RECTANGLE);
		// 调用 Rectangle 的 draw 方法
		shape2.draw();

		// 获取 Square 的对象，并调用它的 draw 方法
		Shape shape3 = shapeFactory.getShape(EnumShape.SQUARE);
		// 调用 Square 的 draw 方法
		shape3.draw();
	}
}
