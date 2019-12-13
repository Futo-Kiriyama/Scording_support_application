package com.example.Scoring_support;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GridAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private int layoutId;
    private List<String> imageList = new ArrayList<>();
    private int item;
    private String dir;

    GridAdapter(Context context, int layoutId, String[] iList, int item, String dir) {
        super();
        this.context = context;
        this.inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.layoutId = layoutId;
        this.item = item;
        this.dir = dir;

        Collections.addAll(imageList, iList);

    }


    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            view = inflater.inflate(layoutId, parent, false);
        } else {
            view = convertView;
        }

        ImageView img = view.findViewById(R.id.image_view);
        img.setScaleType(ImageView.ScaleType.CENTER_CROP);

        Picasso.with(context)
                .load(addUrl(position))
                .fit()
                .centerCrop()
//                .resize(ScreenWHalf, ScreenWHalf)
//                .placeholder(R.drawable.error)
                .error(R.drawable.error)
                .into(img);

        return view;
    }

    private String addUrl(int number) {

        if (item == 0) {

            return String.format(
                    "file://" + dir + "/Regular_test/version_0/test_0/%s",// 自分のサーバーに上げて見ましょう
                    imageList.get(number));
        } else {
            if (item == 1) {

                return String.format(
                        "file://" + dir + "/Regular_test/version_0/test_1/%s",// 自分のサーバーに上げて見ましょう
                        imageList.get(number));
            } else {
                if (item == 2) {

                    return String.format(
                            "file://" + dir + "/Regular_test/version_0/test_2/%s",// 自分のサーバーに上げて見ましょう
                            imageList.get(number));
                } else {
                    if (item == 3) {

                        return String.format(
                                "file://" + dir + "/Regular_test/version_0/test_3/%s",// 自分のサーバーに上げて見ましょう
                                imageList.get(number));
                    } else {
                        if (item == 4) {

                            return String.format(
                                    "file://" + dir + "/Regular_test/version_0/test_4/%s",// 自分のサーバーに上げて見ましょう
                                    imageList.get(number));
                        } else {
                            if (item == 5) {

                                return String.format(
                                        "file://" + dir + "/Regular_test/version_0/test_5/%s",// 自分のサーバーに上げて見ましょう
                                        imageList.get(number));
                            } else {
                                if (item == 6) {

                                    return String.format(
                                            "file://" + dir + "/Regular_test/version_0/test_6/%s",// 自分のサーバーに上げて見ましょう
                                            imageList.get(number));
                                } else {
                                    if (item == 7) {

                                        return String.format(
                                                "file://" + dir + "/Regular_test/version_0/test_7/%s",// 自分のサーバーに上げて見ましょう
                                                imageList.get(number));
                                    } else {
                                        if (item == 8) {

                                            return String.format(
                                                    "file://" + dir + "/Regular_test/version_0/test_8/%s",// 自分のサーバーに上げて見ましょう
                                                    imageList.get(number));
                                        } else {
                                            if (item == 9) {

                                                return String.format(
                                                        "file://" + dir + "/Regular_test/version_0/test_9/%s",// 自分のサーバーに上げて見ましょう
                                                        imageList.get(number));
                                            } else {
                                                if (item == 10) {

                                                    return String.format(
                                                            "file://" + dir + "/Regular_test/version_0/test_10/%s",// 自分のサーバーに上げて見ましょう
                                                            imageList.get(number));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        // 全要素数を返す
        return imageList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}