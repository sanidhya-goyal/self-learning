public class ShapeFactory {
    Shape getShape(String input) {
        switch (input) {
            case "CIRCLE" : return new Circle();
            case "SQUARE" : return new Square();
            case "RECTANGLE" : return new Rectangle();
            default: return null;
        }
    }
}
