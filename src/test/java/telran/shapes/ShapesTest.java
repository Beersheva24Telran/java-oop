package telran.shapes;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class ShapesTest {
    Rectangle rectangle = new Rectangle(3, 4);
    Square square = new Square(2);
 @Test
 void rectangleTest() {
    assertEquals(14, rectangle.perimeter());
    assertEquals(12, rectangle.square());
 }
 @Test
 void squareTest() {
    assertEquals(8, square.perimeter());
    assertEquals(4, square.square());
 }
@Test
 void canvasTest() {
    Canvas canvas = new Canvas();
    canvas.addShape(rectangle);
    canvas.addShape(square);
    assertEquals(22, canvas.perimeter());
    assertEquals(16, canvas.square());
 }
 @Test
 void countTest() {
    //TODO
    //test of the method count of the class Canvas
 }
}
