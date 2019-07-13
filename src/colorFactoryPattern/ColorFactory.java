package colorFactoryPattern;

import abstractFactoryPattern.AbstractFactory;
import shapeFactoryPattern.EnumShape;
import shapeFactoryPattern.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(EnumColor color) {
		switch (color) {
		case RED:
			return new Red();
		case BLUE:
			return new Blue();
		case GREEN:
			return new Green();
		default:
			return null;
		}
	}

	@Override
	public Shape getShape(EnumShape shape) {
		return null;
	}
	
}
