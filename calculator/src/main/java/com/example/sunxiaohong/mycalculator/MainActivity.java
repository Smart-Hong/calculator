package com.example.sunxiaohong.mycalculator;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button bt0;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button bt_cheng;
    Button bt_jia;
    Button bt_;
    Button bt_chu;
    Button bt_deng;
    Button bt_ponit;
    Button bt_delect;
    TextView textv;
    String content;
    String lastSymbol = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        initView();


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


    public void initView() {

        bt0 = (Button) findViewById(R.id.bt0);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        bt_ = (Button) findViewById(R.id.bt_);
        bt_cheng = (Button) findViewById(R.id.bt_cheng);
        bt_chu = (Button) findViewById(R.id.bt_chu);
        bt_jia = (Button) findViewById(R.id.bt_jia);
        bt_deng = (Button) findViewById(R.id.bt_deng);
        bt_ponit = (Button) findViewById(R.id.bt_ponit);
        bt_delect = (Button) findViewById(R.id.bt_delect);

        textv = (TextView) findViewById(R.id.tv1);


        bt0.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt_jia.setOnClickListener(this);
        bt_.setOnClickListener(this);
        bt_cheng.setOnClickListener(this);
        bt_chu.setOnClickListener(this);
        bt_ponit.setOnClickListener(this);
        bt_deng.setOnClickListener(this);
        bt_delect.setOnClickListener(this);
        textv.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String text = "";
        switch (v.getId()) {
            case R.id.bt0:
                lastSymbol = "";
                textv.append(bt0.getText());
                break;
            case R.id.bt1:
                lastSymbol = "";
                textv.append(bt1.getText());
                break;
            case R.id.bt2:
                lastSymbol = "";
                textv.append(bt2.getText());
                break;
            case R.id.bt3:
                lastSymbol = "";
                textv.append(bt3.getText());
                break;
            case R.id.bt4:
                lastSymbol = "";
                textv.append(bt4.getText());
                break;
            case R.id.bt5:
                lastSymbol = "";
                textv.append(bt5.getText());
                break;
            case R.id.bt6:
                lastSymbol = "";
                textv.append(bt6.getText());
                break;
            case R.id.bt7:
                lastSymbol = "";
                textv.append(bt7.getText());
                break;
            case R.id.bt8:
                lastSymbol = "";
                textv.append(bt8.getText());
                break;
            case R.id.bt9:
                lastSymbol = "";
                textv.append(bt9.getText());
                break;
            case R.id.bt_:
                text = distinct("-");
                if(text.equals("-")){
                    textv.append("-");
                }else if(text.equals("")){

                }else{
                    textv.setText(text);
                }
                break;
            case R.id.bt_cheng:
                text = distinct("*");
                if(text.equals("*")){
                    textv.append("*");
                }else if(text.equals("")){

                }else{
                    textv.setText(text);
                }
                break;
            case R.id.bt_chu:
                text = distinct("/");
                if(text.equals("/")){
                    textv.append("/");
                }else if(text.equals("")){

                }else{
                    textv.setText(text);
                }
                break;
            case R.id.bt_jia:
                text = distinct("+");
                if(text.equals("+")){
                    textv.append("+");
                }else if(text.equals("")){

                }else{
                    textv.setText(text);
                }
                break;
            case R.id.bt_deng:
                String cmd = textv.getText().toString().trim();
                textv.setText(compute(cmd));
                break;
            case R.id.bt_delect:
                textv.setText("");
                break;
            case R.id.bt_ponit:
                text = distinct(".");
                if(text.equals(".")){
                    textv.append(".");
                }else if(text.equals("")){

                }else{
                    textv.setText(text);
                }
                break;
            case R.id.tv1:
                break;


        }
    }




        /**
         * 去除重复的符号
         *
         * */

        private  String distinct(String symbol){
            //如果将上次的符号默认为空，第一种情况，上次如果为空，我点击符号按钮的时候，就把当前的符号值赋值给之前的按钮，并且返回
            if(lastSymbol.equals("")){
                lastSymbol = symbol;
                return  symbol ;
            }else if(lastSymbol.equals(symbol)){
                //第二种情况，上次有符号输入，那么当再次点击次符号的时候，就返回一个空的字符串
                return "" ;
            }else {
                //第三种情况，就是上次输入的是符号，下次输入的是不同的符号，这时需要获取整个表达式的，然后把符号前的数字全部截取出来，把新的符号拼接进去，改变符号
                String content = textv.getText().toString().trim();
                content = content.substring(0,content.length() - 1);
                content = content + symbol;
                return content;
            }
        }






    private String compute(String cmd) {
        if(cmd.contains("+")){
            double  sum = 0;
            String strArray[] = cmd.split("\\+");
            for(String str : strArray) {
                sum = sum+Double.parseDouble(compute(str));
            }
            return sum +"";
        }else if(cmd.contains("-")){
            double sum = 0;
            String strArray[] = cmd.split("\\-");
            for(int i = 0 ; i < strArray.length ; i++){
                if(i==0){
                    sum = Double.parseDouble(compute(strArray[i]));
                    continue;
                }
                sum = sum - Double.parseDouble(compute(strArray[i]));
            }
            return sum+"";
        }else if(cmd.contains("*")){
            double sum = 1.0;
            String strArray[] = cmd.split("\\*");
            for(String str : strArray){
                sum = sum * Double.parseDouble(compute(str));
            }

            return sum+"";
        } else if(cmd.contains("/")){
            double sum = 0 ;
            String strArray[] = cmd.split("\\/");
            for(int i = 0 ; i < strArray.length ; i++){
                if(i == 0){
                    sum = Double.parseDouble(compute(strArray[i]));
                    continue;
                }

                sum = sum / Double.parseDouble(compute(strArray[i]));
            }

            return sum+"";

        }else{
            return cmd;
        }



    }
}
