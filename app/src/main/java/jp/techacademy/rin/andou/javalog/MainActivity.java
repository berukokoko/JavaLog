package jp.techacademy.rin.andou.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String name;
        int age;

            public MainActivity(String name, int age){
            this.name = name;
            this.age = age;
        }

        //Humanをインスタンス化する。
       Human human = new Human("name",age);
        //sayメソッドを呼ぶ。
        Human.say();
        Log.d("javatest", "私の名前は" + Human.name + "です。");
        Log.d("javatest", "年は" + Human.age + "です。");
        //thineメソッドを呼ぶ。
        Human.think();
    }

}