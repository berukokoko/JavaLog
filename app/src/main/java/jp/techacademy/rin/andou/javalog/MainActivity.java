package jp.techacademy.rin.andou.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int age;
        String name;

        //コンストラクタ
        public MainActivity(String name, int age){
            this.name = name;
            this.age = age;
        }

        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        dog.move();

        dog.say();
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

        //Humanをインスタンス化する。
        Human human = new Human (1);
        //sayメソッドを呼ぶ。
        Human.say();
        //thineメソッドを呼ぶ。
        Human.think();
    }

}