package de.balvi.gol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {
    Example example;

    @BeforeEach
    void createExample() {
        example = new Example();
    }


    @Test
    public void exampleTextReturnsCorrectText() {
        String text = "Example text.";

        example.setExampleTextString(text);

        assertEquals(example.exampleText(), text);
    }

}