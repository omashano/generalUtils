package com.omashano.generalutils;

import android.util.Log;

public class Print {

    private static boolean LOG_ENABLED;
    private static String TAG;

    public static void init () {

        LOG_ENABLED = true;
        TAG = "";
    }

    public static void init (String tag) {

        LOG_ENABLED = true;
        TAG = tag;
    }

    public static void setLogEnabled (boolean log) {
        LOG_ENABLED = log;
    }

    public static void setTAG (String tag) {
        TAG = tag;
    }

    public static void v (String tag, String message) {
        if (LOG_ENABLED) {
            Log.v(tag, message);
        }
    }

    public static void v (String message) {
        if (LOG_ENABLED) {
            Log.v(TAG, message);
        }
    }

    public static void v (String... messages) {
        if (LOG_ENABLED) {
            for (String message : messages) {
                Log.v(TAG, message);
            }
        }
    }

    public static void i (String tag, String message) {
        if (LOG_ENABLED) {
            Log.i(tag, message);
        }
    }

    public static void i (String message) {
        if (LOG_ENABLED) {
            Log.i(TAG, message);
        }
    }

    public static void i (String... messages) {
        if (LOG_ENABLED) {
            for (String message : messages) {
                Log.i(TAG, message);
            }
        }
    }

    public static void d (String tag, String message) {
        if (LOG_ENABLED) {
            Log.d(tag, message);
        }
    }

    public static void d (String message) {
        if (LOG_ENABLED) {
            Log.d(TAG, message);
        }
    }

    public static void d (String... messages) {
        if (LOG_ENABLED) {
            for (String message : messages) {
                Log.d(TAG, message);
            }
        }
    }

    public static void w (String tag, String message) {
        if (LOG_ENABLED) {
            Log.w(tag, message);
        }
    }

    public static void w (String message) {
        if (LOG_ENABLED) {
            Log.w(TAG, message);
        }
    }

    public static void w (String... messages) {
        if (LOG_ENABLED) {
            for (String message : messages) {
                Log.w(TAG, message);
            }
        }
    }

    public static void e (String tag, String message) {
        if (LOG_ENABLED) {
            Log.e(tag, message);
        }
    }

    public static void e (String message) {
        if (LOG_ENABLED) {
            Log.e(TAG, message);
        }
    }

    public static void e (String... messages) {
        if (LOG_ENABLED) {
            for (String message : messages) {
                Log.e(TAG, message);
            }
        }
    }

    public static void wtf (String tag, String message) {
        if (LOG_ENABLED) {
            Log.wtf(tag, message);
        }
    }

    public static void wtf (String message) {
        if (LOG_ENABLED) {
            Log.wtf(TAG, message);
        }
    }

    public static void wtf (String... messages) {
        if (LOG_ENABLED) {
            for (String message : messages) {
                Log.wtf(TAG, message);
            }
        }
    }

}
