package a;

public class Rectangle {
	int width;
	int height;
	
	int calculaterArea() {
		return width * height;
	}
	
	int calculaterPerimeter() {
		return 2 * (width + height);
	}
	
	boolean isSquare() {
		return this.width == this.height;
	}
}
