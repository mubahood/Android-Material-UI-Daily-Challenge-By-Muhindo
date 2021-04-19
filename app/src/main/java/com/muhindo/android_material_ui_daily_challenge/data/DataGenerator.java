package com.muhindo.android_material_ui_daily_challenge.data;

import android.content.Context;
import android.content.res.TypedArray;

import com.muhindo.android_material_ui_daily_challenge.R;
import com.muhindo.android_material_ui_daily_challenge.Tools;
import com.muhindo.android_material_ui_daily_challenge.model.People;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataGenerator {

    public static List<People> getPeopleData(Context ctx) {
        List<People> items = new ArrayList<>();
        TypedArray drw_arr = ctx.getResources().obtainTypedArray(R.array.people_images);
        String name_arr[] = ctx.getResources().getStringArray(R.array.people_names);

        for (int i = 0; i < drw_arr.length(); i++) {
            People obj = new People();
            obj.image = drw_arr.getResourceId(i, -1);
            obj.name = name_arr[i];
            obj.email = Tools.getEmailFromName(obj.name);
            obj.imageDrw = ctx.getResources().getDrawable(obj.image);
            items.add(obj);
        }
        Collections.shuffle(items);
        return items;
    }


}
