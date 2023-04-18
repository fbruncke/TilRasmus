package com.example.tilrasmus;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testMagicNo() {
        //tripple A test add method

        //arrange
        TheAsnwerToEverything tate = new TheAsnwerToEverything();
        int result = 0;

        //act
        result = tate.getNumber();

        //assert
        assertEquals(result, 42, 0);
    }
}