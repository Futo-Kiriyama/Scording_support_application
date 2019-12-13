package com.example.Scoring_support;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String dir = Environment.getExternalStorageDirectory().getPath();
    //private String dir = "/mnt/sdcard";
    File path0 = new File(dir + "/Regular_test/version_0/test_0");
    File path1 = new File(dir + "/Regular_test/version_0/test_1");
    File path2 = new File(dir + "/Regular_test/version_0/test_2");
    File path3 = new File(dir + "/Regular_test/version_0/test_3");
    File path4 = new File(dir + "/Regular_test/version_0/test_4");
    File path5 = new File(dir + "/Regular_test/version_0/test_5");
    File path6 = new File(dir + "/Regular_test/version_0/test_6");
    File path7 = new File(dir + "/Regular_test/version_0/test_7");
    File path8 = new File(dir + "/Regular_test/version_0/test_8");
    File path9 = new File(dir + "/Regular_test/version_0/test_9");
    File path10 = new File(dir + "/Regular_test/version_0/test_10");
    private String[] photos0 = path0.list();
    private String[] photos1 = path1.list();
    private String[] photos2 = path2.list();
    private String[] photos3 = path3.list();
    private String[] photos4 = path4.list();
    private String[] photos5 = path5.list();
    private String[] photos6 = path6.list();
    private String[] photos7 = path7.list();
    private String[] photos8 = path8.list();
    private String[] photos9 = path9.list();
    private String[] photos10 = path10.list();
    private int item;
    private int imgList_flag;
    private List<String> imgList0 = new ArrayList<>();
    private List<String> imgList1 = new ArrayList<>();
    private List<String> imgList2 = new ArrayList<>();
    private List<String> imgList3 = new ArrayList<>();
    private List<String> imgList4 = new ArrayList<>();
    private List<String> imgList5 = new ArrayList<>();
    private List<String> imgList6 = new ArrayList<>();
    private List<String> imgList7 = new ArrayList<>();
    private List<String> imgList8 = new ArrayList<>();
    private List<String> imgList9 = new ArrayList<>();
    private List<String> imgList10 = new ArrayList<>();
    private final int REQUEST_PERMISSION = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Android 6, API 23以上でパーミッシンの確認
        if(Build.VERSION.SDK_INT >= 23){
            checkPermission();
        }
        else{
            supinnerGridview();
        }
    }

    public void supinnerGridview(){

        Spinner spinner = findViewById(R.id.plain_spinnar);
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.plain_array, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Spinner spinner = (Spinner) parent;
                item = (int) spinner.getSelectedItemPosition();

                if (item == 0) {
                    GridView gridview = findViewById(R.id.gridview);
                    GridAdapter adapter = new GridAdapter(
                            MainActivity.this.getApplicationContext(),
                            R.layout.grid_items,
                            photos0,
                            item,
                            dir);
                    gridview.setAdapter(adapter);
                    gridview.setOnItemClickListener(MainActivity.this);
                    imgList_flag = 0;
                } else {
                    if (item == 1) {
                        GridView gridview = findViewById(R.id.gridview);
                        GridAdapter adapter = new GridAdapter(
                                MainActivity.this.getApplicationContext(),
                                R.layout.grid_items,
                                photos1,
                                item,
                                dir);
                        gridview.setAdapter(adapter);
                        gridview.setOnItemClickListener(MainActivity.this);
                        imgList_flag = 1;
                    } else {
                        if (item == 2) {
                            GridView gridview = findViewById(R.id.gridview);
                            GridAdapter adapter = new GridAdapter(
                                    MainActivity.this.getApplicationContext(),
                                    R.layout.grid_items,
                                    photos2,
                                    item,
                                    dir);
                            gridview.setAdapter(adapter);
                            gridview.setOnItemClickListener(MainActivity.this);
                            imgList_flag = 2;
                        } else {
                            if (item == 3) {
                                GridView gridview = findViewById(R.id.gridview);
                                GridAdapter adapter = new GridAdapter(
                                        MainActivity.this.getApplicationContext(),
                                        R.layout.grid_items,
                                        photos3,
                                        item,
                                        dir);
                                gridview.setAdapter(adapter);
                                gridview.setOnItemClickListener(MainActivity.this);
                                imgList_flag = 3;
                            } else {
                                if (item == 4) {
                                    GridView gridview = findViewById(R.id.gridview);
                                    GridAdapter adapter = new GridAdapter(
                                            MainActivity.this.getApplicationContext(),
                                            R.layout.grid_items,
                                            photos4,
                                            item,
                                            dir);
                                    gridview.setAdapter(adapter);
                                    gridview.setOnItemClickListener(MainActivity.this);
                                    imgList_flag = 4;
                                } else {
                                    if (item == 5) {
                                        GridView gridview = findViewById(R.id.gridview);
                                        GridAdapter adapter = new GridAdapter(
                                                MainActivity.this.getApplicationContext(),
                                                R.layout.grid_items,
                                                photos5,
                                                item,
                                                dir);
                                        gridview.setAdapter(adapter);
                                        gridview.setOnItemClickListener(MainActivity.this);
                                        imgList_flag = 5;
                                    } else {
                                        if (item == 6) {
                                            GridView gridview = findViewById(R.id.gridview);
                                            GridAdapter adapter = new GridAdapter(
                                                    MainActivity.this.getApplicationContext(),
                                                    R.layout.grid_items,
                                                    photos6,
                                                    item,
                                                    dir);
                                            gridview.setAdapter(adapter);
                                            gridview.setOnItemClickListener(MainActivity.this);
                                            imgList_flag = 6;
                                        } else {
                                            if (item == 7) {
                                                GridView gridview = findViewById(R.id.gridview);
                                                GridAdapter adapter = new GridAdapter(
                                                        MainActivity.this.getApplicationContext(),
                                                        R.layout.grid_items,
                                                        photos7,
                                                        item,
                                                        dir);
                                                gridview.setAdapter(adapter);
                                                gridview.setOnItemClickListener(MainActivity.this);
                                                imgList_flag = 7;
                                            } else {
                                                if (item == 8) {
                                                    GridView gridview = findViewById(R.id.gridview);
                                                    GridAdapter adapter = new GridAdapter(
                                                            MainActivity.this.getApplicationContext(),
                                                            R.layout.grid_items,
                                                            photos8,
                                                            item,
                                                            dir);
                                                    gridview.setAdapter(adapter);
                                                    gridview.setOnItemClickListener(MainActivity.this);
                                                    imgList_flag = 8;
                                                } else {
                                                    if (item == 9) {
                                                        GridView gridview = findViewById(R.id.gridview);
                                                        GridAdapter adapter = new GridAdapter(
                                                                MainActivity.this.getApplicationContext(),
                                                                R.layout.grid_items,
                                                                photos9,
                                                                item,
                                                                dir);
                                                        gridview.setAdapter(adapter);
                                                        gridview.setOnItemClickListener(MainActivity.this);
                                                        imgList_flag = 9;
                                                    } else {
                                                        if (item == 10) {
                                                            GridView gridview = findViewById(R.id.gridview);
                                                            GridAdapter adapter = new GridAdapter(
                                                                    MainActivity.this.getApplicationContext(),
                                                                    R.layout.grid_items,
                                                                    photos10,
                                                                    item,
                                                                    dir);
                                                            gridview.setAdapter(adapter);
                                                            gridview.setOnItemClickListener(MainActivity.this);
                                                            imgList_flag = 10;
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
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }

    private String imageList0(int number){
        Collections.addAll(imgList0,photos0);
        return String.format(
                "file://" + dir + "/Regular_test/version_0/test_0/%s",// 自分のサーバーに上げて見ましょう
                imgList0.get(number));
    }

    private String imageList1(int number){
        Collections.addAll(imgList1,photos1);
        return String.format(
                "file://" + dir + "/Regular_test/version_0/test_1/%s",// 自分のサーバーに上げて見ましょう
                imgList1.get(number));
    }

    private String imageList2(int number){
        Collections.addAll(imgList2,photos2);
        return String.format(
                "file://" + dir + "/Regular_test/version_0/test_2/%s",// 自分のサーバーに上げて見ましょう
                imgList2.get(number));
    }

    private String imageList3(int number){
        Collections.addAll(imgList3,photos3);
        return String.format(
                "file://" + dir + "/Regular_test/version_0/test_3/%s",// 自分のサーバーに上げて見ましょう
                imgList3.get(number));
    }

    private String imageList4(int number){
        Collections.addAll(imgList4,photos4);
        return String.format(
                "file://" + dir + "/Regular_test/version_0/test_4/%s",// 自分のサーバーに上げて見ましょう
                imgList4.get(number));
    }

    private String imageList5(int number){
        Collections.addAll(imgList5,photos5);
        return String.format(
                "file://" + dir + "/Regular_test/version_0/test_5/%s",// 自分のサーバーに上げて見ましょう
                imgList5.get(number));
    }

    private String imageList6(int number){
        Collections.addAll(imgList6,photos6);
        return String.format(
                "file://" + dir + "/Regular_test/version_0/test_6/%s",// 自分のサーバーに上げて見ましょう
                imgList6.get(number));
    }

    private String imageList7(int number){
        Collections.addAll(imgList7,photos7);
        return String.format(
                "file://" + dir + "/Regular_test/version_0/test_7/%s",// 自分のサーバーに上げて見ましょう
                imgList7.get(number));
    }

    private String imageList8(int number){
        Collections.addAll(imgList8,photos8);
        return String.format(
                "file://" + dir + "/Regular_test/version_0/test_8/%s",// 自分のサーバーに上げて見ましょう
                imgList8.get(number));
    }

    private String imageList9(int number){
        Collections.addAll(imgList9,photos9);
        return String.format(
                "file://" + dir + "/Regular_test/version_0/test_9/%s",// 自分のサーバーに上げて見ましょう
                imgList9.get(number));
    }

    private String imageList10(int number){
        Collections.addAll(imgList10,photos10);
        return String.format(
                "file://" + dir + "/Regular_test/version_0/test_10/%s",// 自分のサーバーに上げて見ましょう
                imgList10.get(number));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if(imgList_flag == 0){
            Intent intent = new Intent(getApplication(), SubActivity.class);
            intent.putExtra("IMAGEID",imageList0(position));
            startActivity(intent);
        }
        if(imgList_flag == 1){
            Intent intent = new Intent(getApplication(), SubActivity.class);
            intent.putExtra("IMAGEID",imageList1(position));
            startActivity(intent);
        }
        if(imgList_flag == 2){
            Intent intent = new Intent(getApplication(), SubActivity.class);
            intent.putExtra("IMAGEID",imageList2(position));
            startActivity(intent);
        }
        if(imgList_flag == 3){
            Intent intent = new Intent(getApplication(), SubActivity.class);
            intent.putExtra("IMAGEID",imageList3(position));
            startActivity(intent);
        }
        if(imgList_flag == 4){
            Intent intent = new Intent(getApplication(), SubActivity.class);
            intent.putExtra("IMAGEID",imageList4(position));
            startActivity(intent);
        }
        if(imgList_flag == 5){
            Intent intent = new Intent(getApplication(), SubActivity.class);
            intent.putExtra("IMAGEID",imageList5(position));
            startActivity(intent);
        }
        if(imgList_flag == 6){
            Intent intent = new Intent(getApplication(), SubActivity.class);
            intent.putExtra("IMAGEID",imageList6(position));
            startActivity(intent);
        }
        if(imgList_flag == 7){
            Intent intent = new Intent(getApplication(), SubActivity.class);
            intent.putExtra("IMAGEID",imageList7(position));
            startActivity(intent);
        }
        if(imgList_flag == 8){
            Intent intent = new Intent(getApplication(), SubActivity.class);
            intent.putExtra("IMAGEID",imageList8(position));
            startActivity(intent);
        }
        if(imgList_flag == 9){
            Intent intent = new Intent(getApplication(), SubActivity.class);
            intent.putExtra("IMAGEID",imageList9(position));
            startActivity(intent);
        }
        if(imgList_flag == 10){
            Intent intent = new Intent(getApplication(), SubActivity.class);
            intent.putExtra("IMAGEID",imageList10(position));
            startActivity(intent);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    // permissionの確認
    public void checkPermission() {
        // 既に許可している
        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
                == PackageManager.PERMISSION_GRANTED){
            supinnerGridview();
        }
        // 拒否していた場合
        else{
            requestLocationPermission();
        }
    }

    // 許可を求める
    private void requestLocationPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            ActivityCompat.requestPermissions(MainActivity.this,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    REQUEST_PERMISSION);
        } else {
            Toast toast = Toast.makeText(this, "許可してください", Toast.LENGTH_SHORT);
            toast.show();

            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,},
                    REQUEST_PERMISSION);
        }
    }

    // 結果の受け取り
    @Override
    public void onRequestPermissionsResult(
            int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_PERMISSION) {
            // 使用が許可された
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                supinnerGridview();
            } else {
                // それでも拒否された時の対応
                Toast toast = Toast.makeText(this, "何もできません", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    }
}
