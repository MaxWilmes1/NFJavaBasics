package JavaBasics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PlayerCharacterTest {
    @BeforeEach
    void resetPosition() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
    }

    @Test
    void givenx0_thenReturnsX0(){
        int expectedX = 0;
        int actualX = PlayerCharacter.getX();
        Assertions.assertEquals(expectedX,actualX);
    }

    @Test
    void givenY0_thenReturnsY0(){
        int expectedY = 0;
        int actualY = PlayerCharacter.getY();
        Assertions.assertEquals(expectedY,actualY);
    }

    @Test
    void givenIllegalArgumentU_thenReturnX0(){
        String input = "u";
        int expectedX = 0;
        int actualX = PlayerCharacter.move(input);
        Assertions.assertEquals(expectedX,actualX);
    }

    @ParameterizedTest
    @CsvSource({
            "'d',1",
            "'a',-1"
    })
    void givenD_thenX1(String input, int expectedX){
        PlayerCharacter.move(input);
        Assertions.assertEquals(expectedX,PlayerCharacter.getX());
    }

    @ParameterizedTest
    @CsvSource({
            "'w',1",
            "'s',-1"
    })
    void givenW_thenY1(String input, int expectedY){
        PlayerCharacter.move(input);
        Assertions.assertEquals(expectedY,PlayerCharacter.getY());
    }


    @Test
    void givenSequenceAWAW_thenXminus2_Y2() {
        PlayerCharacter.move("a"); // x = -1, y = 0
        PlayerCharacter.move("w"); // x = -1, y = 1
        PlayerCharacter.move("a"); // x = -2, y = 1
        PlayerCharacter.move("w"); // x = -2, y = 2

        int expectedX = -2;
        int expectedY = 2;

        Assertions.assertEquals(expectedX, PlayerCharacter.getX());
        Assertions.assertEquals(expectedY, PlayerCharacter.getY());
    }

    @Test
    void givenSequenceAWAWWWWDDD_thenXminus2_Y2() {
        PlayerCharacter.move("a"); // x = -1, y = 0
        PlayerCharacter.move("w"); // x = -1, y = 1
        PlayerCharacter.move("a"); // x = -2, y = 1
        PlayerCharacter.move("w"); // x = -2, y = 2
        PlayerCharacter.move("w"); // x = -2, y = 2
        PlayerCharacter.move("w"); // x = -2, y = 2
        PlayerCharacter.move("w"); // x = -2, y = 2
        PlayerCharacter.move("d"); // x = -2, y = 2
        PlayerCharacter.move("d"); // x = -2, y = 2
        PlayerCharacter.move("d"); // x = -2, y = 2

        int expectedX = 1;
        int expectedY = 5;

        Assertions.assertEquals(expectedX, PlayerCharacter.getX());
        Assertions.assertEquals(expectedY, PlayerCharacter.getY());
    }

}
