package com.ulpatha;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kapila on 1/21/2018.
 */
public class Generator {

    private String delimiter;

    public void dataGenerator(Map<String ,String> map){

        delimiter = "|";

        for(Map.Entry item:map.entrySet()){
            //System.out.println(item.getKey()+":"+item.getValue());
            if(item.getValue()!= null && item.getValue()!= ""){

                switch ((String)item.getValue()){
                    case "String":
                        RandomString session = new RandomString();
                        System.out.println(session.nextString());
                        break;
                    case "Integer":
                        RandomInt number = new RandomInt(10,1);
                        System.out.println(number.randomInt());
                        break;
                    case "Date":
                        System.out.println("Date");
                        break;
                }

            }
        }
    }
}
