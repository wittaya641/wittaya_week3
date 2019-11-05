package com.example.wittaya_week3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ctnphrae.week3_2.R
import kotlinx.android.synthetic.main.acitivity_second.*

class SecondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_second)
        setTitle("แอพแรกของ")

        // ดึงข้อมูลจาก intent
        var fname = intent.extras?.getString(MainActivity().TAG_NAME)
        var lname = intent.extras?.getString(MainActivity().TAG_LNAME)
        var old = intent.extras?.getString(MainActivity().TAG_OLD)
        var brith = intent.extras?.getString(MainActivity().TAG_BRITH)
        var phone = intent.extras?.getString(MainActivity().TAG_PHONE)

        tv_res_fname.setText(fname)
        tv_res_lname.setText(lname)
        tv_res_old.setText(old)
        tv_res_birth.setText(brith)
        tv_res_phone.setText(phone)

        btn_back.setOnClickListener {
            finish()
        }

    }
}