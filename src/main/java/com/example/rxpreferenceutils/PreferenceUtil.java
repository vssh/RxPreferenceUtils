package com.example.rxpreferenceutils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;

import java.util.Set;

/**
 * Created by varun on 24.01.16.
 */
public class PreferenceUtil {
    SharedPreferences mPrefs;
    SharedPreferences.Editor mEditor;

    public PreferenceUtil(Context context, @Nullable String name) {
        if (name == null) {
            this.mPrefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        } else {
            this. mPrefs = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        }
        this.mEditor = mPrefs.edit();
    }

    public boolean contains(String key) {
        return mPrefs.contains(key);
    }

    public void setBool(String key, boolean value) {
        mEditor.putBoolean(key, value);
    }

    public void setString(String key, String value) {
        mEditor.putString(key, value);
    }

    public void setInt(String key, int value) {
        mEditor.putInt(key, value);
    }

    public void setLong(String key, long value) {
        mEditor.putLong(key, value);
    }

    public void setFloat(String key, float value) {
        mEditor.putFloat(key, value);
    }

    public void setStringSet(String key, Set<String> value) {
        mEditor.putStringSet(key, value);
    }

    public void removePreference(String key) {
        mEditor.remove(key);
    }

    public void save() {
        mEditor.apply();
    }

    public void clear() {
        mEditor.clear();
    }

    public boolean getBool(String key, boolean defValue) {
        return mPrefs.getBoolean(key, defValue);
    }

    public String getString(String key, String  defValue) {
        return mPrefs.getString(key, defValue);
    }

    public int getInt(String key, int defValue) {
        return mPrefs.getInt(key, defValue);
    }

    public  long getLong(String key, long defValue) {
        return mPrefs.getLong(key, defValue);
    }

    public float getFloat(String key, float defValue) {
        return mPrefs.getFloat(key, defValue);
    }

    public Set<String> getStringSet(String key, Set<String > defValue) {
        return mPrefs.getStringSet(key, defValue);
    }


    public static boolean contains(Context context, String key) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return prefs.contains(key);
    }

    public static void setBool(Context context, String key, boolean value) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }
    public static void setString(Context context, String key, String value) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static void setInt(Context context, String key, int value) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static void setLong(Context context, String key, long value) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = prefs.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    public static void setFloat(Context context, String key, float value) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = prefs.edit();
        editor.putFloat(key, value);
        editor.apply();
    }

    public static void setStringSet(Context context, String key, Set<String> value) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = prefs.edit();
        editor.putStringSet(key, value);
        editor.apply();
    }


    public static boolean getBool(Context context, String key, boolean defValue) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return prefs.getBoolean(key, defValue);
    }

    public static String getString(Context context, String key, String  defValue) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return prefs.getString(key, defValue);
    }

    public static int getInt(Context context, String key, int defValue) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return prefs.getInt(key, defValue);
    }

    public static long getLong(Context context, String key, long defValue) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return prefs.getLong(key, defValue);
    }

    public static float getFloat(Context context, String key, float defValue) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return prefs.getFloat(key, defValue);
    }

    public static Set<String> getStringSet(Context context, String key, Set<String > defValue) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        return prefs.getStringSet(key, defValue);
    }

    public static void removePreference(Context context, String key) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove(key);
        editor.apply();
    }
}