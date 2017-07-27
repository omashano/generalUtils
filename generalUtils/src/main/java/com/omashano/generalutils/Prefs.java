package com.omashano.generalutils;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {

    private static Prefs instance;
    private static Context mContext;

    private String PREFS_NAME;

    public static Prefs getInstance () {
        return instance;
    }

    public static void init (Context context) {

        if (instance == null) {
            instance = new Prefs();
        }

        mContext = context;

    }

    public SharedPreferences getSharedPrefs () {
        return mContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public String getString (String name, String defVal) {
        return getInstance().getSharedPrefs().getString(name, defVal);
    }

    public int getInt (String name, int defVal) {
        return getInstance().getSharedPrefs().getInt(name, defVal);
    }

    public long getLong (String name, long defVal) {
        return getInstance().getSharedPrefs().getLong(name, defVal);
    }

    public float getFloat (String name, float defVal) {
        return getInstance().getSharedPrefs().getFloat(name, defVal);
    }

    public boolean getBoolean (String name, boolean defVal) {
        return getInstance().getSharedPrefs().getBoolean(name, defVal);
    }

    public SharedPreferences.Editor edit () {
        return getInstance().getSharedPrefs().edit();
    }

    public Prefs setPrefsName (String name) {
        PREFS_NAME = name;
        return this;
    }

}
