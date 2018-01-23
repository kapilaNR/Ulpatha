package com.ulpatha;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Map<String, String> map = new HashMap<String ,String>();
        map.put("CustomerName","String");
        map.put("Amount","Integer");
        map.put("Time","String");

        Generator generator = new Generator();
        generator.dataGenerator(map);
    }
}
