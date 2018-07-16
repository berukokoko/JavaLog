package jp.techacademy.rin.andou.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {

    String name;
    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Humanをインスタンス化する。
    Human human = new Human("安藤", 25, "料理");
    //sayメソッドを呼ぶ
        human.say();
        Log.d("javatest","私の名前は"+human.name +"です。");
        Log.d("javatest","年は"+human.age +"です。");

    //thineメソッドを呼ぶ。
        human.think();
    }

}