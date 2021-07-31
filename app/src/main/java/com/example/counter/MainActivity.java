package com.example.counter;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.CharArrayWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Stack;

@RequiresApi(api = Build.VERSION_CODES.O)
public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private StringBuilder stringBuilder = new StringBuilder(100);
    private TextView editText;
    private int flag1 = 0;
    private int point = 0;
    private boolean zero = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        getButton();
    }


    private void getButton() {
        Button button_1 = (Button) findViewById(R.id.button_1);
        Button button_2 = (Button) findViewById(R.id.button_2);
        Button button_3 = (Button) findViewById(R.id.button_3);
        Button button_4 = (Button) findViewById(R.id.button_4);
        Button button_5 = (Button) findViewById(R.id.button_5);
        Button button_6 = (Button) findViewById(R.id.button_6);
        Button button_7 = (Button) findViewById(R.id.button_7);
        Button button_8 = (Button) findViewById(R.id.button_8);
        Button button_9 = (Button) findViewById(R.id.button_9);
        Button button_0 = (Button) findViewById(R.id.button_0);
        Button button_equal = (Button) findViewById(R.id.button_equal);
        Button button_delete = (Button) findViewById(R.id.button_delete);
        Button button_clear = (Button) findViewById(R.id.button_clear);
        Button button_add = (Button) findViewById(R.id.button_add);
        Button button_subtraction = (Button) findViewById(R.id.button_subtraction);
        Button button_multiplication = (Button) findViewById(R.id.button_multiplication);
        Button button_division = (Button) findViewById(R.id.button_division);
        Button button_left = (Button) findViewById(R.id.button_left);
        Button button_right = (Button) findViewById(R.id.button_right);
        Button button_point = (Button) findViewById(R.id.button_point);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_0.setOnClickListener(this);
        button_equal.setOnClickListener(this);
        button_delete.setOnClickListener(this);
        button_clear.setOnClickListener(this);
        button_add.setOnClickListener(this);
        button_subtraction.setOnClickListener(this);
        button_multiplication.setOnClickListener(this);
        button_division.setOnClickListener(this);
        button_left.setOnClickListener(this);
        button_right.setOnClickListener(this);
        button_point.setOnClickListener(this);
        editText = (TextView) findViewById(R.id.editText_1);
        editText.setAutoSizeTextTypeWithDefaults(TextView.AUTO_SIZE_TEXT_TYPE_UNIFORM);
        editText.setAutoSizeTextTypeUniformWithConfiguration(40, 100, 2, TypedValue.COMPLEX_UNIT_SP);


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button_1:

                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                }
                if (stringBuilder.length() != 0 && stringBuilder.charAt(stringBuilder.length()-1) == ')') {
                    stringBuilder.append("*");
                }
                if (stringBuilder.length() != 0 && zero == false
                        && stringBuilder.charAt(stringBuilder.length()-1) == '0') {
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
                zero = true;
                stringBuilder.append(1);
                editText.setText(stringBuilder.toString());
                break;
            case R.id.button_2:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                }
                if (stringBuilder.length() != 0 && stringBuilder.charAt(stringBuilder.length()-1) == ')') {
                    stringBuilder.append("*");
                }
                if (stringBuilder.length() != 0 && zero == false
                        && stringBuilder.charAt(stringBuilder.length()-1) == '0') {
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
                zero = true;
                stringBuilder.append(2);
                editText.setText(stringBuilder.toString());
                break;
            case R.id.button_3:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                }
                if (stringBuilder.length() != 0 && stringBuilder.charAt(stringBuilder.length()-1) == ')') {
                    stringBuilder.append("*");
                }
                if (stringBuilder.length() != 0 && zero == false
                        && stringBuilder.charAt(stringBuilder.length()-1) == '0') {
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
                zero = true;
                stringBuilder.append(3);
                editText.setText(stringBuilder.toString());
                break;
            case R.id.button_4:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                }
                if (stringBuilder.length() != 0 && stringBuilder.charAt(stringBuilder.length()-1) == ')') {
                    stringBuilder.append("*");
                }
                if (stringBuilder.length() != 0 && zero == false
                        && stringBuilder.charAt(stringBuilder.length()-1) == '0') {
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
                zero = true;
                stringBuilder.append(4);
                editText.setText(stringBuilder.toString());
                break;
            case R.id.button_5:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                }
                if (stringBuilder.length() != 0 && stringBuilder.charAt(stringBuilder.length()-1) == ')') {
                    stringBuilder.append("*");
                }
                if (stringBuilder.length() != 0 && zero == false
                        && stringBuilder.charAt(stringBuilder.length()-1) == '0') {
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
                zero = true;
                stringBuilder.append(5);
                editText.setText(stringBuilder.toString());
                break;
            case R.id.button_6:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                }
                if (stringBuilder.length() != 0 && stringBuilder.charAt(stringBuilder.length()-1) == ')') {
                    stringBuilder.append("*");
                }
                if (stringBuilder.length() != 0 && zero == false
                        && stringBuilder.charAt(stringBuilder.length()-1) == '0') {
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
                zero = true;
                stringBuilder.append(6);
                editText.setText(stringBuilder.toString());
                break;
            case R.id.button_7:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                }
                if (stringBuilder.length() != 0 && stringBuilder.charAt(stringBuilder.length()-1) == ')') {
                    stringBuilder.append("*");
                }
                if (stringBuilder.length() != 0 && zero == false
                        && stringBuilder.charAt(stringBuilder.length()-1) == '0') {
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
                zero = true;
                stringBuilder.append(7);
                editText.setText(stringBuilder.toString());
                break;
            case R.id.button_8:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                }
                if (stringBuilder.length() != 0 && stringBuilder.charAt(stringBuilder.length()-1) == ')') {
                    stringBuilder.append("*");
                }
                if (stringBuilder.length() != 0 && zero == false
                        && stringBuilder.charAt(stringBuilder.length()-1) == '0') {
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
                zero = true;
                stringBuilder.append(8);
                editText.setText(stringBuilder.toString());
                break;
            case R.id.button_9:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                }
                if (stringBuilder.length() != 0 && stringBuilder.charAt(stringBuilder.length()-1) == ')') {
                    stringBuilder.append("*");
                }
                if (stringBuilder.length() != 0 && zero == false
                        && stringBuilder.charAt(stringBuilder.length()-1) == '0') {
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
                zero = true;
                stringBuilder.append(9);
                editText.setText(stringBuilder.toString());
                break;
            case R.id.button_0:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                }
                if (stringBuilder.length() != 0 && stringBuilder.charAt(stringBuilder.length()-1) == ')') {
                    stringBuilder.append("*");
                }
                if (zero) {
                    stringBuilder.append(0);
                    editText.setText(stringBuilder.toString());
                } else {
                    if (stringBuilder.length() != 0 &&
                            stringBuilder.charAt(stringBuilder.length()-1) == '0') {
                        editText.setText(stringBuilder.toString());
                    } else {
                        stringBuilder.append(0);
                        editText.setText(stringBuilder.toString());
                    }
                }
                break;
            case R.id.button_equal:
                try {
                    if (stringBuilder.length() == 0) {
                        editText.setText(stringBuilder.toString());
                        point = 0;
                        flag1 = 0;
                        break;
                    } else if (stringBuilder.charAt(0) == 'E') {
                        stringBuilder.delete(0, stringBuilder.length());
                        editText.setText(stringBuilder.toString());
                        point = 0;
                        flag1 = 0;
                        break;
                    }
                    String result = countResult(change2(change1()));
                    stringBuilder.delete(0, stringBuilder.length());
                    stringBuilder.append(result);
                    flag1 = 0;
                    /*for (int i = 0; i < stringBuilder.length(); i++) {
                        if (stringBuilder.charAt(i) == '.') {
                            point = 1;
                            break;
                        } else {
                            point = 0;
                        }
                    }*/
                    if (result.matches("^[-\\+]?[\\d+]$")) {
                        point = 0;
                    } else {
                        point = 1;
                    }
                    editText.setText(stringBuilder.toString());
                    if (stringBuilder.toString().equals("0")) {
                        zero = false;
                    } else {
                        zero = true;
                    }
                } catch (Exception e) {
                    stringBuilder.delete(0, stringBuilder.length());
                    stringBuilder.append("Error");
                    editText.setText("Error");
                    point = 0;
                    flag1 = 0;
                }
                break;
            case R.id.button_delete:
                if (stringBuilder.length() == 2 && stringBuilder.charAt(0) == '-') {
                    stringBuilder.delete(0, stringBuilder.length());
                    editText.setText(stringBuilder.toString());
                    break;
                }
                if (stringBuilder.length() > 2
                        && stringBuilder.charAt(stringBuilder.length()-2) == '-'
                        && (stringBuilder.charAt(stringBuilder.length()-3) == '*' ||
                        stringBuilder.charAt(stringBuilder.length()-3) == '/' ||
                        stringBuilder.charAt(stringBuilder.length()-3) == '(')) {
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                    editText.setText(stringBuilder.toString());
                    break;
                }
                if (stringBuilder.length() != 0) {
                    if (stringBuilder.charAt(0) == 'E') {
                        stringBuilder.delete(0, stringBuilder.length());
                        editText.setText(stringBuilder.toString());
                        break;
                    }
                    if (stringBuilder.charAt(stringBuilder.length()-1) == ')') {
                        flag1++;
                    } else if (stringBuilder.charAt(stringBuilder.length() - 1) == '.') {
                        point = 0;
                    } if (stringBuilder.charAt(stringBuilder.length()-1) == '(') {
                        flag1--;
                    }
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                    editText.setText(stringBuilder.toString());

                } else {
                    zero = false;
                }
                break;
            case R.id.button_clear:
                stringBuilder.delete(0, stringBuilder.length());
                editText.setText(stringBuilder.toString());
                flag1 = 0;
                point = 0;
                zero = false;
                break;
            case R.id.button_add:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                    stringBuilder.append("+");
                    editText.setText(stringBuilder.toString());
                    point = 0;
                    zero = false;
                    break;
                }
                String str3 = stringBuilder.toString();
                if (str3.length() > 1 && "-".equals(str3.substring(str3.length()-1))
                        && !"*".equals(str3.substring(str3.length()-2,str3.length()-1))
                        && !"/".equals(str3.substring(str3.length()-2,str3.length()-1))
                        && !"(".equals(str3.substring(str3.length()-2,str3.length()-1))) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    stringBuilder.append("+");
                    editText.setText(stringBuilder.toString());
                    break;
                }
                if (stringBuilder.length() != 0 &&
                        !"+".equals(str3.substring(str3.length()-1)) &&
                        !"*".equals(str3.substring(str3.length()-1)) &&
                        !"/".equals(str3.substring(str3.length()-1)) &&
                        !"-".equals(str3.substring(str3.length()-1)) ) {
                    if (stringBuilder.charAt(stringBuilder.length()-1) == '.') {
                        stringBuilder.append(0);
                    }
                    stringBuilder.append("+");
                    editText.setText(stringBuilder.toString());
                    point = 0;
                    zero = false;
                }

                break;
            case R.id.button_subtraction:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                    stringBuilder.append("-");
                    editText.setText(stringBuilder.toString());
                    point = 0;
                    zero = false;
                    break;
                }
                if (stringBuilder.length() == 0) {
                    stringBuilder.append("-");
                    editText.setText(stringBuilder.toString());
                    point = 0;
                    break;
                }
                String str4 = stringBuilder.toString();
                if (stringBuilder.length() != 0 && "+".equals(str4.substring(str4.length()-1))) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    stringBuilder.append("-");
                    editText.setText(stringBuilder.toString());

                    break;
                }
                if (!"-".equals(str4.substring(str4.length()-1) ) &&
                        !"+".equals(str4.substring(str4.length()-1) )) {
                    if (stringBuilder.charAt(stringBuilder.length()-1) == '.') {
                        stringBuilder.append(0);
                    }
                    stringBuilder.append("-");
                    editText.setText(stringBuilder.toString());
                    point = 0;
                }
                break;
            case R.id.button_multiplication:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                    editText.setText(stringBuilder.toString());
                    point = 0;
                    zero = false;
                    break;
                }

                if (stringBuilder.length() != 0) {
                    String str5 = stringBuilder.toString();
                    if (!"+".equals(str5.substring(str5.length()-1) ) &&
                            !"-".equals(str5.substring(str5.length()-1) ) &&
                            !"*".equals(str5.substring(str5.length()-1) ) &&
                            !"/".equals(str5.substring(str5.length()-1) )) {
                        if (stringBuilder.charAt(stringBuilder.length()-1) == '.') {
                            stringBuilder.append(0);
                        }
                        stringBuilder.append("*");
                        editText.setText(stringBuilder.toString());
                        point = 0;
                        zero = false;
                    }
                }
                break;
            case R.id.button_division:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                    editText.setText(stringBuilder.toString());
                    point = 0;
                    zero = false;
                    break;
                }
                if (stringBuilder.length() != 0) {
                    String str6 = stringBuilder.toString();
                    if (!"+".equals(str6.substring(str6.length()-1) ) &&
                            !"-".equals(str6.substring(str6.length()-1) ) &&
                            !"*".equals(str6.substring(str6.length()-1) ) &&
                            !"/".equals(str6.substring(str6.length()-1) )) {
                        if (stringBuilder.charAt(stringBuilder.length()-1) == '.') {
                            stringBuilder.append(0);
                        }
                        stringBuilder.append("/");
                        editText.setText(stringBuilder.toString());
                        point = 0;
                        zero = false;
                    }
                }
                break;
            case R.id.button_left:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                    stringBuilder.append("(");
                    editText.setText(stringBuilder.toString());
                    flag1++;
                    point = 0;
                    zero = false;
                    break;
                }
                if (stringBuilder.length() == 0) {
                    stringBuilder.append("(");
                    editText.setText(stringBuilder.toString());
                    flag1++;
                    point = 0;
                    break;
                } else {
                    String str7 = stringBuilder.toString();
                    if (".".equals(str7.substring(str7.length()-1))) {
                        stringBuilder.append(0);
                        stringBuilder.append("*");
                        stringBuilder.append("(");
                        editText.setText(stringBuilder.toString());
                        point = 0;
                        zero = false;
                        flag1++;
                    } else if (stringBuilder.charAt(stringBuilder.length()-1) >= '0'
                            && stringBuilder.charAt(stringBuilder.length()-1) <= '9') {
                        stringBuilder.append("*");
                        stringBuilder.append("(");
                        editText.setText(stringBuilder.toString());
                        point = 0;
                        flag1++;
                        zero = false;
                    } else if (stringBuilder.charAt(stringBuilder.length()-1) == ')') {
                        stringBuilder.append("*");
                        stringBuilder.append("(");
                        editText.setText(stringBuilder.toString());
                        flag1++;
                        point = 0;
                        zero = false;
                    } else {
                            stringBuilder.append("(");
                            editText.setText(stringBuilder.toString());
                            point = 0;
                            flag1++;
                            zero = false;
                        }
                    }
                    break;
            case R.id.button_right:
                String str1 = stringBuilder.toString();
                if (flag1 > 0) {
                    if (!".".equals(str1.substring(str1.length()-1)) &&
                    !"(".equals(str1.substring(str1.length()-1)) &&
                            !"+".equals(str1.substring(str1.length()-1) ) &&
                            !"-".equals(str1.substring(str1.length()-1) ) &&
                            !"*".equals(str1.substring(str1.length()-1) ) &&
                            !"/".equals(str1.substring(str1.length()-1) )) {
                        stringBuilder.append(")");
                        point = 0;
                        editText.setText(stringBuilder.toString());
                        flag1--;
                        zero = false;
                    } else if (stringBuilder.charAt(stringBuilder.length()-1) == '.') {
                        stringBuilder.append(0);
                        stringBuilder.append(")");
                        point = 0;
                        editText.setText(stringBuilder.toString());
                        flag1--;
                        zero = false;
                    }
                }
                break;
            case R.id.button_point:
                if (stringBuilder.length() != 0 && stringBuilder.charAt(0) == 'E') {
                    stringBuilder.delete(0, stringBuilder.length());
                    stringBuilder.append(0);
                    stringBuilder.append(".");
                    editText.setText(stringBuilder.toString());
                    point = 1;
                    zero = true;
                    break;
                }
                String str2 = stringBuilder.toString();
                if (stringBuilder.length() != 0 &&
                        !"(".equals(str2.substring(str2.length()-1)) &&
                        !")".equals(str2.substring(str2.length()-1)) &&
                        !"+".equals(str2.substring(str2.length()-1)) &&
                        !"-".equals(str2.substring(str2.length()-1)) &&
                        !"*".equals(str2.substring(str2.length()-1)) &&
                        !"/".equals(str2.substring(str2.length()-1)) ) {
                    if (point == 0) {
                        stringBuilder.append(".");
                        editText.setText(stringBuilder.toString());
                        point = 1;
                    }
                    zero = true;
                } else {
                    if (point == 0) {
                        stringBuilder.append(0);
                        stringBuilder.append(".");
                        editText.setText(stringBuilder.toString());
                        point = 1;
                        zero = true;
                    }

                }
                break;
            default:
                break;
        }
    }

    private String countResult(ArrayList<String> list) {
        Stack<BigDecimal> myStack = new Stack<>();
        BigDecimal bigDecimal_1, bigDecimal_2;
        for (String string : list) {
            if (isNumber(string)) {
                myStack.push(new BigDecimal(string));
            } else {
                bigDecimal_1 = myStack.pop();
                bigDecimal_2 = myStack.pop();
                switch (string) {
                    case "+" :
                        myStack.push(bigDecimal_1.add(bigDecimal_2));
                        break;
                    case "-" :
                        myStack.push(bigDecimal_2.subtract(bigDecimal_1));
                        break;
                    case "*" :
                        myStack.push(bigDecimal_1.multiply(bigDecimal_2));
                        break;
                    case "/" :
                        myStack.push(bigDecimal_2.divide(bigDecimal_1,5,BigDecimal.ROUND_HALF_UP));
                        break;
                }
            }
        }

        return deleteZero(myStack.peek().toString());

    }

    private String deleteZero(String string) {
        if(string.indexOf(".") > 0){
            string = string.replaceAll("0+?$", "");
            string = string.replaceAll("[.]$", "");
        }
        return string;
    }

    private boolean isNumber(String string) {
        return !(string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/")
                 || string.equals("(") || string.equals(")"));
    }

    private ArrayList<String> change1() {

        ArrayList<String> list = new ArrayList<>();

        while (flag1 > 0) {
            stringBuilder.append(")");
            --flag1;
        }
        if (stringBuilder.charAt(stringBuilder.length()-1) == '.') {
            stringBuilder.append(0);
        }

        String str = stringBuilder.toString();
        String s = "";

        for (int i = 0; i < str.length(); ) {
            if (str.charAt(i) == '(') {
                list.add(str.substring(i, i+1));
                i++;
                continue;
            }
            if (str.charAt(i) == '+') {
                list.add(str.substring(i, i+1));
                i++;
                continue;
            }
            if (str.charAt(i) == '-') {
                if (!(i != 0 && (str.charAt(i-1) == '*' || str.charAt(i-1) == '/'))) {
                    list.add(str.substring(i, i+1));
                    i++;
                    continue;
                }

            }

            if (str.charAt(i) == '*') {
                list.add(str.substring(i, i+1));
                i++;
                continue;
            }
            if (str.charAt(i) == '/') {
                list.add(str.substring(i, i+1));
                i++;
                continue;
            }
            if (str.charAt(i) == ')') {
                list.add(str.substring(i, i+1));
                i++;
                continue;
            }
            while (i < str.length() && ((str.charAt(i) <= '9' && str.charAt(i) >= '0') ||
                    str.charAt(i) == '.' ||
                    (str.charAt(i) == '-' && (str.charAt(i-1) == '*' || str.charAt(i-1) == '/')))) {
                s = s + str.charAt(i);
                i++;

            }
            list.add(s);
            s = "";
        }

        return list;
    }

    private ArrayList<String> change2(ArrayList<String> list1) {
        ArrayList<String> list = new ArrayList<>();
        Stack<String> myStack = new Stack<>();

        String temp;
        for (int i = 0;i < list1.size();i++) {
            if (isNumber(list1.get(i))) {
                list.add(list1.get(i));
            } else if (list1.get(i).equals("(")) {
                myStack.push(list1.get(i));
            } else if (list1.get(i).equals("+") || list1.get(i).equals("-")) {
                if (list1.get(i).equals("-") && (i == 0 || list1.get(i-1).equals("("))) {
                    list.add("0");
                }
                while (!myStack.isEmpty()) {
                    temp = myStack.pop();
                    if ("(".equals(temp)) {
                        myStack.push(temp);
                        break;
                    }
                    list.add(temp);
                }
                myStack.push(list1.get(i));
            } else if (list1.get(i).equals("*") || list1.get(i).equals("/")) {
                while (!myStack.isEmpty()) {
                    temp = myStack.pop();
                    if ("(".equals(temp) || "+".equals(temp) || "-".equals(temp)) {
                        myStack.push(temp);
                        break;
                    }
                    list.add(temp);
                }
                myStack.push(list1.get(i));
            } else if (list1.get(i).equals(")")) {
                while (!"(".equals(myStack.peek())) {
                    list.add(myStack.pop());
                }
                myStack.pop();
            }
        }

        while (!myStack.isEmpty()) {
            list.add(myStack.pop());
        }
        return list;
    }



}