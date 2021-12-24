package com.example.mycalculator;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity  {
    private EditText editTextTextPersonName;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName.setShowSoftInputOnFocus(false);//Helps us not to show the original mobile app keyboard


    }
    public void updateText(String s)
    {
        String s1=editTextTextPersonName.getText().toString();//For the first time the string s1 is empty
        int cursorPos=editTextTextPersonName.getSelectionStart();
        String leftString=s1.substring(0,cursorPos);
        String rightString=s1.substring(cursorPos);
        editTextTextPersonName.setText(String.format("%s%s%s",leftString,s,rightString));
        editTextTextPersonName.setSelection(cursorPos+s.length());
    }

    public void zeroClick(View view)
    {
        updateText(getResources().getString(R.string.ZeroValue));
    }
    public void oneClick(View view)
    {
        updateText(getResources().getString(R.string.Value1));
    }
    public void twoClick(View view)
    {
        updateText(getResources().getString(R.string.Value2));
    }

    public void threeClick(View view)
    {
        updateText(getResources().getString(R.string.Value3));
    }
    public void fourClick(View view)
    {
        updateText(getResources().getString(R.string.Value4));
    }
    public void fiveClick(View view)
    {
        updateText(getResources().getString(R.string.Value5));
    }
    public void sixClick(View view)
    {
        updateText(getResources().getString(R.string.Value6));
    }
    public void sevenClick(View view)
    {
        updateText(getResources().getString(R.string.Value7));
    }
    public void eightClick(View view)
    {
        updateText(getResources().getString(R.string.Value8));
    }
    public void nineClick(View view)
    {
        updateText(getResources().getString(R.string.Value9));
    }
    public void clearClick(View view)
    {
        editTextTextPersonName.setText("");
    }
    public void multiplyClick(View view)
    {
        updateText(getResources().getString(R.string.Multiplication));
    }
    public void divideClick(View view)
    {
        updateText(getResources().getString(R.string.Division));
    }
    public void pointClick(View view)
    {
        updateText(getResources().getString(R.string.fraction));
    }
    public void additionClick(View view)
    {
        updateText(getResources().getString(R.string.addition));
    }
    public void minusClick(View view)
    {
        updateText(getResources().getString(R.string.Substraction));
    }
    public void deleteClick(View view)
    {
        int cursorPos=editTextTextPersonName.getSelectionStart();
        int textLength=editTextTextPersonName.getText().length();
        if(cursorPos!=0 && textLength!=0)
        {
            SpannableStringBuilder select=(SpannableStringBuilder) editTextTextPersonName.getText();
            select.replace(cursorPos-1,cursorPos,"");
            editTextTextPersonName.setText(select);
            editTextTextPersonName.setSelection(cursorPos-1);

        }
    }
    public void equalsClick(View view)
    {
        String userExp=editTextTextPersonName.getText().toString();
        Expression exp =new Expression(userExp);
        String outcome=String.valueOf(exp.calculate());
        editTextTextPersonName.setText(outcome);
        int textLength=editTextTextPersonName.getText().length();
        editTextTextPersonName.setSelection(textLength);
    }
    public void bracket_openClick(View view)
    {
        updateText(getResources().getString(R.string.Bracket_open));
    }
    public void bracket_closeClick(View view)
    {
        updateText(getResources().getString(R.string.Bracket_close));
    }
    public void sinFunction(View view)
    {
        updateText("sin(");
    }
    public void cosFunction(View view)
    {
        updateText("cos(");
    }
    public void tanFunction(View view)
    {
        updateText("tan(");
    }
    public void sinInverseFunction(View view)
    {
        updateText("asin(");
    }
    public void cosInverseFunction(View view)
    {
        updateText("acos(");
    }
    public void tanInverseFunction(View view)
    {
        updateText("atan(");
    }
    public void ApowerBdivideCFunction(View view)
    {
        updateText("^(");
    }
    public void logFunction(View view)
    {
        updateText("log10(");
    }
    public void lnFunction(View view)
    {
        updateText("ln(");
    }
    public void permutationFunction(View view)
    {


    }
    public void combinationFunction(View view)
    {
        updateText("cUni(x,n,r");
    }
    public void XpowerYFunction(View view)
    {
        updateText("^");
    }
    static int factorial(int n) {
        int fact = 1;
        int i = 1;
        while(i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }
    public void n_r()
    {
        int cursorPos=editTextTextPersonName.getSelectionStart();
        if(cursorPos!=0)
        {
            
        }
    }


}