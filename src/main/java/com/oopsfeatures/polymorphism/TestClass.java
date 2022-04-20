package com.oopsfeatures.polymorphism;

import java.util.HashMap;
import java.util.Map;

public class TestClass implements TestInterface{


    @Override
    public void testMethod(Integer a) {

    }

    public void overloading(Integer a) {
        overloading(null, null);
    }

    public void overloading(Integer a, Integer abc) {
        try {
            System.out.println(a + abc);
            Map<String, String> hashMap = new HashMap<>();
            hashMap.put("key1", "Value1");
        }
        catch (Exception e) {

        }
        finally {
            System.out.println("Block ends");
        }
    }

}
