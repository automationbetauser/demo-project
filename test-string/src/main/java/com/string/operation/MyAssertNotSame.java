package com.string.operation;

import java.util.HashMap;
import java.util.Map;
//  Test..........
public class MyAssertNotSame {

    public String getPropValue(final String key){
        Map<String, String> appProps = new HashMap<String, String>();
        appProps.get("key1");
        appProps.put("key1", "value 1");
        appProps.put("key2", "value 2");
        appProps.put("key3", "value 3");
        return appProps.get(key);
    }

}
