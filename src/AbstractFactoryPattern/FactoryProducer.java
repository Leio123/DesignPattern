package AbstractFactoryPattern;

import colorFactoryPattern.ColorFactory;
import shapeFactoryPattern.ShapeFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(EnumFactory factory) {
		switch (factory) {
			case SHAPE:
				return new ShapeFactory();
			case COLOR:
				return new ColorFactory();
			default:
				return null;
		}
	}
	
}
