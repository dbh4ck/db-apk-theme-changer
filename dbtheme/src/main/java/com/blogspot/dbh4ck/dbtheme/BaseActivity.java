package com.blogspot.dbh4ck.dbtheme;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

/**
 * Created by DB on 22-04-2017.
 */

public class BaseActivity extends AppCompatActivity {

    private final static int THEME_PINK_1 = 0;
    private final static int THEME_PINK_2 = 1;
    private final static int THEME_PINK_3 = 2;
    private final static int THEME_BLUE_1 = 3;
    private final static int THEME_BLUE_2 = 4;
    private final static int THEME_BLUE_3 = 5;
    private final static int THEME_RED_1 = 6;
    private final static int THEME_RED_2 = 7;
    private final static int THEME_GREEN_1 = 8;
    private final static int THEME_GREEN_2 = 9;
    private final static int THEME_GREEN_3 = 10;
    private final static int THEME_GREEN_4 = 11;
    private final static int THEME_PURPLE_1 = 12;
    private final static int THEME_PURPLE_2 = 13;
    private final static int THEME_BLACK_1 = 14;
    private final static int THEME_YELLOW_1 = 15;
    private final static int THEME_BROWN_1 = 16;
    private final static int THEME_BROWN_2 = 17;
    private final static int THEME_GREEN_SHADE = 18;
    private final static int THEME_GREY_SHADE = 19;
    private final static int THEME_DEFAULT = 20;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        updateTheme();
    }

    public void updateTheme() {
        if (Utility.getTheme(getApplicationContext()) == THEME_PINK_1 ) {
            setTheme(R.style.theme_pink1);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_pink1dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_PINK_2) {
            setTheme(R.style.theme_pink2);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_pink2dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_PINK_3) {
            setTheme(R.style.theme_pink3);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_pink3dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_BLUE_1) {
            setTheme(R.style.theme_blue1);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_blue1dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_BLUE_2) {
            setTheme(R.style.theme_blue2);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_blue2dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_BLUE_3) {
            setTheme(R.style.theme_blue3);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_blue3dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_RED_1) {
            setTheme(R.style.theme_red1);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_red1dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_RED_2) {
            setTheme(R.style.theme_red2);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_red2dark));
            }
        }

        else if (Utility.getTheme(getApplicationContext()) == THEME_GREEN_1) {
            setTheme(R.style.theme_green1);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_green1dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_GREEN_2) {
            setTheme(R.style.theme_green2);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_green2dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_GREEN_3) {
            setTheme(R.style.theme_green3);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_green3dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_GREEN_4) {
            setTheme(R.style.theme_green4);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_green4dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_PURPLE_1) {
            setTheme(R.style.theme_purple1);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_purple1dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_PURPLE_2) {
            setTheme(R.style.theme_purple2);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_purple2dark));
            }
        }

        else if (Utility.getTheme(getApplicationContext()) == THEME_BLACK_1) {
            setTheme(R.style.theme_black1);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_black1dark));
            }
        }

        else if (Utility.getTheme(getApplicationContext()) == THEME_YELLOW_1) {
            setTheme(R.style.theme_yellow1);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_yellow1dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_BROWN_1) {
            setTheme(R.style.theme_brown1);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_brown1dark));
            }
        }
        else if (Utility.getTheme(getApplicationContext()) == THEME_BROWN_2) {
            setTheme(R.style.theme_brown2);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_brown2dark));
            }
        }

        else if (Utility.getTheme(getApplicationContext()) == THEME_GREEN_SHADE) {
            setTheme(R.style.theme_green_shade);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_green_shade_dark));
            }
        }

        else if (Utility.getTheme(getApplicationContext()) == THEME_GREY_SHADE) {
            setTheme(R.style.theme_grey);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.theme_grey_shade_dark));
            }
        }

        else if (Utility.getTheme(getApplicationContext()) == THEME_DEFAULT) {
            setTheme(R.style.NimbuzzTheme);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.app_color_primary_dark));
            }
        }
    }
}
