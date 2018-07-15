package jp.techacademy.rin.andou.javalog;

abstract class Animal {
    // メンバ変数
    String name;  // 名前
    int age;    // 年齢

    //thinkを呼ぶ。
    public abstract void think();

    //sayメソッド
    abstract public void say();
}