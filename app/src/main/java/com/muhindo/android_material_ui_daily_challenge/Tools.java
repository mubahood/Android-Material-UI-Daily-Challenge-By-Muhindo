package com.muhindo.android_material_ui_daily_challenge;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tools {


    public static String getEmailFromName(String name) {
        if (name != null && !name.equals("")) {
            String email = name.replaceAll(" ", ".").toLowerCase().concat("@mail.com");
            return email;
        }
        return name;
    }

    public static void displayImageRound(final Context ctx, final ImageView img, @DrawableRes int drawable) {
        try {
            Glide.with(ctx).load(drawable).asBitmap().centerCrop().into(new BitmapImageViewTarget(img) {
                @Override
                protected void setResource(Bitmap resource) {
                    RoundedBitmapDrawable circularBitmapDrawable = RoundedBitmapDrawableFactory.create(ctx.getResources(), resource);
                    circularBitmapDrawable.setCircular(true);
                    img.setImageDrawable(circularBitmapDrawable);
                }
            });
        } catch (Exception e) {
        }
    }




    public static void setSystemBarColor(Activity act) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = act.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(act.getResources().getColor(R.color.colorPrimaryDark));
        }
    }

    public static String getFormattedDateShort(long dateTime) {
        SimpleDateFormat newFormat = new SimpleDateFormat("MMM dd, yyyy");
        return newFormat.format(new Date(dateTime));
    }

    public static void setSystemBarColor(Activity act, @ColorRes int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = act.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(act.getResources().getColor(color));
        }
    }


}
