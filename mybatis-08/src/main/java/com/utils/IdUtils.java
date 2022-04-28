package com.utils;

import org.junit.Test;

import java.util.UUID;

public class IdUtils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void r() {
        System.out.println(getId());
        System.out.println(getId());
        System.out.println(getId());
        System.out.println(getId());
    }

}
