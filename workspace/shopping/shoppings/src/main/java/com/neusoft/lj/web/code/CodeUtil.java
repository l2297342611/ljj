package com.neusoft.lj.web.code;

import java.util.UUID;

public class CodeUtil {

    public static String getCode(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }


}
