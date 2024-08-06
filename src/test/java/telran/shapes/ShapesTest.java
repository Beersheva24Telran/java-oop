package telran.shapes;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class ShapesTest {
    Rectangle rectangle = new Rectangle(3, 4);
    Square square = new Square(2);
    Rectangle rectangle1 = new Rectangle(4, 3);
    Rectangle rectangle2 = new Rectangle(4, 8);

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
    Canvas canvas = getCanvas(new Shape[]{rectangle, square});
    assertEquals(22, canvas.perimeter());
    assertEquals(16, canvas.square());
 }
private Canvas getCanvas(Shape[] shapes) {
   Canvas canvas = new Canvas();
    for(int i = 0; i < shapes.length; i++) {
      canvas.addShape(shapes[i]);
    }
   return canvas;
}
 @Test
 void countTest() {
    Canvas canvas = getCanvas(new Shape[]{rectangle, square,
       getCanvas(new Shape[]{rectangle1, rectangle2})});
       assertEquals(5, canvas.count());
 }
}
