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
// �K�p���郌�C�A�E�gxml�̃g�b�v���x��View��LinearLayout�Ȃ̂ŁA�����ł�LinearLayout���p������
public class MyLinearLayout extends LinearLayout implements View.OnClickListener {
    private Context mAppContext;
    public MyLinearLayout(Context context) {

        super(context);
        mAppContext = context;
    }

    public MyLinearLayout(Context context, AttributeSet att) {
        super(context, att);
        mAppContext = context;

        // �s�ǉ��{�^��
        Button addRow = new Button(context);
        addRow.setText(R.string.dokuji);
        addRow.setOnClickListener(this);
        addView(addRow);

        // �y�[�W�^�C�g��CSS�N���X
        TextView pageTitleCssClass = new TextView(context);
        pageTitleCssClass.setText(R.string.pageTitleCssClass);
        addView(pageTitleCssClass);

        // �^�C�g��CSS�N���Xspinner
        Spinner pageTitleCssClassSpinner = new Spinner(context);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(context, R.array.titleCssClassList,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pageTitleCssClassSpinner.setAdapter(adapter);
        addView(pageTitleCssClassSpinner);

        // ���ږ�
        EditText editText = new EditText(context);
        // �G�f�B�b�g�e�L�X�g�̃e�L�X�g��ݒ肵�܂�
//        editText.setText("�e�X�g");
        // �G�f�B�b�g�e�L�X�g�̃e�L�X�g��S�I�����܂�
//        editText.selectAll();
        addView(editText);

        // ���ڐ���
        EditText editText2 = new EditText(context);
        // �G�f�B�b�g�e�L�X�g�̃e�L�X�g��ݒ肵�܂�
//        editText.setText("�e�X�g");
        // �G�f�B�b�g�e�L�X�g�̃e�L�X�g��S�I�����܂�
//        editText.selectAll();
        addView(editText2);
    }

    public void onClick(View v) {
        // ���ږ�
        EditText editText = new EditText(mAppContext);
        // �G�f�B�b�g�e�L�X�g�̃e�L�X�g��ݒ肵�܂�
//        editText.setText("�e�X�g");
        // �G�f�B�b�g�e�L�X�g�̃e�L�X�g��S�I�����܂�
//        editText.selectAll();
        this.addView(editText);

        // ���ڐ���
        EditText editText2 = new EditText(mAppContext);
        // �G�f�B�b�g�e�L�X�g�̃e�L�X�g��ݒ肵�܂�
//        editText.setText("�e�X�g");
        // �G�f�B�b�g�e�L�X�g�̃e�L�X�g��S�I�����܂�
//        editText.selectAll();
        this.addView(editText2);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event)  {
        // �^�b�`���ꂽ��܂�onInterceptTouchEvent���Ă΂��
        // ������true��Ԃ��ΐeView��onTouchEvent
        // ������false��Ԃ��ΎqView��onClick���onLongClick���

        Log.v("tag", "message");
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)  {
        // ������true��Ԃ��ƃC�x���g�͂����ŏI��
        // ������false��Ԃ��ƎqView��onClick���onLongClick���

        return false;
    }
}