package com.example.kodillatesting.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;



import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    private static OddNumbersExterminator myList;
    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeAll
    public static void beforeAll(){
        myList = new OddNumbersExterminator();
    }
    @DisplayName("Testing Empty list")
    @Test
    public void testOddNumberExterminatorEmptyList(){
        //Given
        ArrayList<Integer>emptyList = new ArrayList<>();
        //When
        List<Integer>resultList = myList.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(emptyList,resultList);
    }
    @DisplayName ("Test expect result with list who create no name person")
    @Test
    public void  testOddNumberExterminatorNormalList(){
        //Given
        ArrayList<Integer>normalList = new ArrayList<>();
        normalList.add(2);
        normalList.add(4);
        normalList.add(22);
        normalList.add(10);

        ArrayList<Integer>expectResultList = new ArrayList<>();
        expectResultList.add(2);
        expectResultList.add(4);
        expectResultList.add(22);
        expectResultList.add(10);
        //When
        List<Integer>resultList = myList.exterminate(normalList);
        System.out.println("Testing normal list ");
        //Then
        Assertions.assertEquals(expectResultList,resultList);



    }
}
