package com.example.wittaya_week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ctnphrae.week3_2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    public final var TAG_NAME:String = "NAME"
    public final var TAG_LNAME :String  = "LNAME"
    public  final var TAG_OLD :String = "OLD"
    public final var TAG_BRITH:String = "BRITH"
    public final var TAG_PHONE:String = "PHONE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("แอพแรกของ")
        btn_sender.setOnClickListener {
            //การดึงค่าจาก EditText
            var fname = et_fname.text.toString()
            var lname = et_lname.text.toString()
            var old = et_old.text.toString()
            var brith =et_brith.text.toString()
            var phone =et_phone.text.toString()

            //ส่งข้อมูล
            sentderFun(fname,lname,old,brith,phone)

        }

        btn_clear.setOnClickListener {
            // ล้างข้อมูล
            clearFun()

        }
        btn_close.setOnClickListener {
            //ปิดแอพ
            finish()
        }
    }

    fun sentderFun(arg1 : String , arg2 : String , arg3 : String , arg4 : String , arg5 : String){
        // กำหนดค่าเริ่มต้น            (Mainactivityหรือ this , Class ปลายทาง)
        var goPageSecoud  = Intent(this,SecondActivity::class.java)
        //การฝากข้อมูล  (ชื่อของข้อมูล , ข้อมูลที่ต้องการส่ง)
        goPageSecoud.putExtra(TAG_NAME,arg1)
        goPageSecoud.putExtra(TAG_LNAME,arg2)
        goPageSecoud.putExtra(TAG_OLD,arg3)
        goPageSecoud.putExtra(TAG_BRITH,arg4)
        goPageSecoud.putExtra(TAG_PHONE,arg5)
        //เริ่มต้นเปลี่ยนหน้า
        startActivity(goPageSecoud)
    }

    fun clearFun(){
        et_fname.setText("")
        et_lname.setText("")
        et_old.setText("")
        et_brith.setText("")
        et_phone.setText("")
    }

}