package com.example.dell_pc.kikoo;

import android.content.Context;
import android.graphics.Typeface;

import java.lang.reflect.Field;

public class replacefont {

    public static void replacedefault (Context context, String oldfont, String newfont){
        Typeface customtypeface = Typeface.createFromAsset(context.getAssets(),newfont);
        replaceFont(oldfont, customtypeface);

    }

    private static void replaceFont(String oldfont, Typeface customtypeface) {
        try {
            Field myfield = Typeface.class.getDeclaredField(oldfont);
            myfield.setAccessible(true);
            myfield.set(null,customtypeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
