package com.example.hiro.test2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addTableBtn = (Button)findViewById(R.id.addTableBtn);
        addTableBtn.setOnClickListener(this);

        Button btnDisp = (Button)findViewById(R.id.btnDisp);
        btnDisp.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addTableBtn:

                // テーブル追加ボタン押下イベント
                // TableLayoutのグループを取得
                ViewGroup vg = (ViewGroup) findViewById(R.id.table);

                /*
                // ページタイトルCSSクラス
                TextView pageTitleCssClass = new TextView(this);
                pageTitleCssClass.setText(R.string.pageTitleCssClass);
                vg.addView(pageTitleCssClass);
                // タイトルCSSクラスspinner
                Spinner pageTitleCssClassSpinner = new Spinner(this);
                ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.titleCssClassList,
                android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                pageTitleCssClassSpinner.setAdapter(adapter);
                vg.addView(pageTitleCssClassSpinner);
*/
                vg.addView(new MyLinearLayout(this));
//                TableLayout tableLayout = new TableLayout(this);
//
//                tableLayout.addView(new MyLinearLayout(this));
//                // ボタン
//                Button testBtn = new Button(this);
//                testBtn.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        // クリック時の処理
//                    }
//                });
//                // テーブル設定
                getLayoutInflater().inflate(R.layout.table_raw, vg);
                LinearLayout inflater = (LinearLayout)findViewById(R.id.linearLayout);
                getLayoutInflater().inflate(R.layout.my_linear_layout, inflater);


                //                for (int i = 0; i < 3; i++) {
                    // 行を追加
//                    getLayoutInflater().inflate(R.layout.table_raw, vg);
                    // 文字設定
//                    TableRow tr = (TableRow) vg.getChildAt(i);
//                    String str = "abc";// String.format(Locale.getDefault(), "raw%d", i+1);
//                    ((TextView) (tr.getChildAt(0))).setText(str);
//                    ((EditText) (tr.getChildAt(1))).setHint(str);
//                    ((Button) (tr.getChildAt(2))).setText(str);


//                }

//                MyView vg = new MyView(this);
//
//                LayoutInflater inflater = this.getLayoutInflater();
//                RelativeLayout ln = (RelativeLayout) inflater.inflate(R.layout.activity_main, null);
//                ln.setBackgroundColor(Color.GREEN);
//
//                TextView img = new TextView(this);
//                img.setText("test");
//                ln.addView(img);
//
//                vg.addView(ln);
//
//                TextView textView = new TextView(this);
//                textView.setText("android\nandroid\nandroid\nandroid\nandroid");
//                vg.addView(textView);
//
//                setContentView(vg);


                break;

            case R.id.btnDisp:
                Intent intent = new Intent(getApplication(), SubActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
