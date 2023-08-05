package com.yakisan.demoapifeature.constant;

import org.springframework.beans.factory.annotation.Value;

public class Constants {

    //Security for Auth
    public static class Auth {
        @Value("${secret.com.yakisan.demoapifeature}")
        public static String APP_SECRET;

        @Value("${expires.com.yakisan.demoapifeature}")
        public static Long EXPIRES_IN;
    }

    /*
    Other constant
     */

}
