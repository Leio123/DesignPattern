package AbstractFactoryPattern;

import colorFactoryPattern.Color;
import colorFactoryPattern.EnumColor;
import shapeFactoryPattern.EnumShape;
import shapeFactoryPattern.Shape;

public abstract class AbstractFactory {
	
	public abstract Color getColor(EnumColor color);
	public abstract Shape getShape(EnumShape shape);
	
}
