package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();

        PoemDecorator decorator1 = text -> "ABC" + text + "ABC";
        PoemDecorator decorator2 = String::toUpperCase;
        PoemDecorator decorator3 = text -> ">>>" + text + "<<<";
        PoemDecorator decorator4 = text -> text.replace("a", "@");

        System.out.println(beautifier.beautify("Hello, World!", decorator1));
        System.out.println(beautifier.beautify("This is a test.", decorator2));
        System.out.println(beautifier.beautify("Stream processing", decorator3));
        System.out.println(beautifier.beautify("Replace all 'a' with '@'", decorator4));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
