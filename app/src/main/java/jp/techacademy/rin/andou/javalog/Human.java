package jp.techacademy.rin.andou.javalog;

import android.util.Log;


//抽象クラスAnimalを継承したHumanクラス
public class Human extends Animal  {

    // hobbyメンバ変数
    String hobby;
    String name;
    int age;


    //コンストラクタ
        public Human(String name, int age,String hobby){
            this.name = name;
            this.age = age;
            this.hobby = hobby;
        }

    //thinkを呼ぶ。
    public void think() {
        Log.d("javatest","私は"+hobby +"について考える");
    }

    //animalクラスからのsayメソッド。
    @Override
    public void say() {
        Log.d("javatest","私の名前は"+name +"です。");
        Log.d("javatest","年は"+age +"です。");
    }
}