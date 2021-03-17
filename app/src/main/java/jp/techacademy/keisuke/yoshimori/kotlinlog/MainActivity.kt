package jp.techacademy.keisuke.yoshimori.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human =Human("吉森",24, hobby = "仕事")
        human.say()
        human.think()

        val human2=Human("太郎",42, hobby = "ゲーム")
        human2.say()
        human2.think()
    }
}