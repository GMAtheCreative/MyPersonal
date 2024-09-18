package Hashing;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashTest {
    @Test
    public void test_That_My_Hash_Can_Take_In_A_String_And_Convert_It_To_The_ASCII_Value(){
        int result = HashFunction.hashedDivisionCode("Ball");
        assertEquals(2,result);
    }

    @Test
    public void test_That_My_Hash_Can_Take_In_A_String_And_Convert_It_To_The_ASCII_Value_By_Multiplication(){
        int result = HashFunction.hashedMultipliCode("Ball");
        assertEquals(2,result);
    }
}
