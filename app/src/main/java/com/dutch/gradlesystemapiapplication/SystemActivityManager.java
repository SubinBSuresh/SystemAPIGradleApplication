package com.dutch.gradlesystemapiapplication;

import android.app.ActivityManager;
import android.content.Context;

public class SystemActivityManager {

    public static int getCurrentUser(ActivityManager am) {
        try {
            // Try the system API directly first
            return am.getCurrentUser();
        } catch (NoSuchMethodError e) {
            // Fallback to reflection if direct call fails
            try {
                java.lang.reflect.Method method =
                        ActivityManager.class.getMethod("getCurrentUser");
                return (int) method.invoke(am);
            } catch (Exception ex) {
                throw new RuntimeException("Failed to get current user", ex);
            }
        }
    }
}