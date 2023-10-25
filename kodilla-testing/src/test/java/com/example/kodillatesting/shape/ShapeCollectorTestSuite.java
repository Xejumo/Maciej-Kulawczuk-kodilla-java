package com.example.kodillatesting.shape;


import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests for ShapeCollector")
public class ShapeCollectorTestSuite {
        @Nested
        @DisplayName("Tests for adding and removing shapes")
        class AddingAndRemovingShapes {

            @Test
            @DisplayName("should add shape to collection")
            public void testAddShape() {
                // Given
                ShapeCollector shapeCollector = new ShapeCollector();
                Shape circle = new Circle(5);

                // When
                shapeCollector.addFigure(circle);

                // Then
                assertEquals("Circle", shapeCollector.showFigures());
            }

            @Test
            @DisplayName("should remove shape from collection")
            public void testRemoveShape() {
                // Given
                ShapeCollector shapeCollector = new ShapeCollector();
                Shape square = new Square(4);
                shapeCollector.addFigure(square);

                // When
                boolean result = shapeCollector.removeFigure(square);

                // Then
                assertTrue(result);
                assertEquals("", shapeCollector.showFigures());
            }
        }

        @Nested
        @DisplayName("Tests for getting shapes")
        class GettingShapes {

            @Test
            @DisplayName("should get shape by index")
            public void testGetShapeByIndex() {
                // Given
                ShapeCollector shapeCollector = new ShapeCollector();
                Shape triangle = new Triangle(3, 4, 5);
                shapeCollector.addFigure(triangle);

                // When
                Shape result = shapeCollector.getFigure(0);

                // Then
                assertEquals("Triangle", result.getShapeName());
            }

            @Test
            @DisplayName("should return null when getting shape by invalid index")
            public void testGetShapeByInvalidIndex() {
                // Given
                ShapeCollector shapeCollector = new ShapeCollector();
                Shape circle = new Circle(7);
                shapeCollector.addFigure(circle);

                // When
                Shape result = shapeCollector.getFigure(1);

                // Then
                assertNull(result);
            }
        }
}