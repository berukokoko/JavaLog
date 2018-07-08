package jp.techacademy.rin.andou.javalog;

import android.util.Log;

public class Human extends Animal  {

    // メンバ関数
    @Override
    public void say() {
        Log.d("javatest", "私の名前は"+ this.name +"です。" + "年は"+this.age+"歳です");
    }
}