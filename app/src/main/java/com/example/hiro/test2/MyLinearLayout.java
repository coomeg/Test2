package com.example.hiro.test2;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Hiro on 2016/07/10.
 */
// 適用するレイアウトxmlのトップレベルViewがLinearLayoutなので、ここでもLinearLayoutを継承する
public class MyLinearLayout extends LinearLayout implements View.OnClickListener {
    private Context mAppContext;
    public MyLinearLayout(Context context) {

        super(context);
        mAppContext = context;
    }

    public MyLinearLayout(Context context, AttributeSet att) {
        super(context, att);
        mAppContext = context;

        // 行追加ボタン
        Button addRow = new Button(context);
        addRow.setText(R.string.dokuji);
        addRow.setOnClickListener(this);
        addView(addRow);

        // ページタイトルCSSクラス
        TextView pageTitleCssClass = new TextView(context);
        pageTitleCssClass.setText(R.string.pageTitleCssClass);
        addView(pageTitleCssClass);

        // タイトルCSSクラスspinner
        Spinner pageTitleCssClassSpinner = new Spinner(context);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(context, R.array.titleCssClassList,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pageTitleCssClassSpinner.setAdapter(adapter);
        addView(pageTitleCssClassSpinner);

        // 項目名
        EditText editText = new EditText(context);
        // エディットテキストのテキストを設定します
//        editText.setText("テスト");
        // エディットテキストのテキストを全選択します
//        editText.selectAll();
        addView(editText);

        // 項目説明
        EditText editText2 = new EditText(context);
        // エディットテキストのテキストを設定します
//        editText.setText("テスト");
        // エディットテキストのテキストを全選択します
//        editText.selectAll();
        addView(editText2);
    }

    public void onClick(View v) {
        // 項目名
        EditText editText = new EditText(mAppContext);
        // エディットテキストのテキストを設定します
//        editText.setText("テスト");
        // エディットテキストのテキストを全選択します
//        editText.selectAll();
        this.addView(editText);

        // 項目説明
        EditText editText2 = new EditText(mAppContext);
        // エディットテキストのテキストを設定します
//        editText.setText("テスト");
        // エディットテキストのテキストを全選択します
//        editText.selectAll();
        this.addView(editText2);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event)  {
        // タッチされたらまずonInterceptTouchEventが呼ばれる
        // ここでtrueを返せば親ViewのonTouchEvent
        // ここでfalseを返せば子ViewのonClickやらonLongClickやら

        Log.v("tag", "message");
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)  {
        // ここでtrueを返すとイベントはここで終了
        // ここでfalseを返すと子ViewのonClickやらonLongClickやら

        return false;
    }
}