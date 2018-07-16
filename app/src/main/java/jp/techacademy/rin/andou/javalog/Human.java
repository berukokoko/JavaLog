package jp.techacademy.rin.andou.javalog;

import android.util.Log;


//抽象クラスAnimalを継承したHumanクラス
public class Human extends Animal  {

    // hobbyメンバ変数
    int hobby;

    //コンストラクタ
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

    //thinkを呼ぶ。
    public void think() {
        Log.d("javatest","私は"+hobby +"について考える");
    }

    //animalクラスからのsayメソッド。
    @Override
    public void say() {

    }
}