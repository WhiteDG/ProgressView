package com.white.progressview;

import android.content.Context;

/**
 * Author White
 * Date 2017/4/23
 * Time 14:27
 */

public class Utils {

  public static int dp2px(Context context, int dpVal) {
    final float scale = context.getResources().getDisplayMetrics().density;
    return (int) (dpVal * scale + 0.5f);
  }

  public static int sp2px(Context context, int spVal) {
    final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
    return (int) (spVal * fontScale + 0.5f);
  }
}
