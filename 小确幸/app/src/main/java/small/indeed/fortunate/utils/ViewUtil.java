package small.indeed.fortunate.utils;

import android.content.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.os.*;
import android.support.v4.graphics.*;
import android.util.*;
import android.app.*;
import android.view.*;
import java.io.*;
import android.net.*;

public class ViewUtil {  
	
	public static int dp22px(Context var0, float var1) {
		return (int)(0.5F + var1 * var0.getResources().getDisplayMetrics().density);
	}
	public static float dp2px(Context context, float dp) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, displayMetrics);
    }

    public static float getDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static Drawable getDrawable(Context context, int id) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return context.getResources().getDrawable(id, null);
        } else {
            return context.getResources().getDrawable(id);
        }
    }

	public static int getWindowHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getWindowWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

	public static int getStatusBarHeight(Activity activity) {
        return activity.getResources().getDimensionPixelOffset(activity.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }
	
}
