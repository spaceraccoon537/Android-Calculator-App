package com.example.mycalculatorkot

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_1:Button=findViewById(R.id.btn_1)
        val btn_2:Button=findViewById(R.id.btn_2)
        val btn_3:Button=findViewById(R.id.btn_3)
        val btn_4:Button=findViewById(R.id.btn_4)
        val btn_5:Button=findViewById(R.id.btn_5)
        val btn_6:Button=findViewById(R.id.btn_6)
        val btn_7:Button=findViewById(R.id.btn_7)
        val btn_8:Button=findViewById(R.id.btn_8)
        val btn_9:Button=findViewById(R.id.btn_9)
        val btn_0:Button=findViewById(R.id.btn_0)
        val btn_plus:Button=findViewById(R.id.btn_plus)
        val btn_minus:Button=findViewById(R.id.btn_minus)
        val btn_multiply:Button=findViewById(R.id.btn_multiply)
        val btn_divide:Button=findViewById(R.id.btn_divide)
        val btn_equals:Button=findViewById(R.id.btn_equals)
        val btn_clear:Button=findViewById(R.id.btn_clear)
        val btn_delete:Button=findViewById(R.id.btn_delete)
        val btn_back:Button=findViewById(R.id.btn_back)
        val tv_result:TextView=findViewById(R.id.tv_result)

        btn_0.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"0"
        }
        btn_1.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"1"
        }
        btn_2.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"2"
        }
        btn_3.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"3"
        }
        btn_4.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"4"
        }
        btn_5.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"5"
        }
        btn_6.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"6"
        }
        btn_7.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"7"
        }
        btn_8.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"8"
        }
        btn_9.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"9"
        }
        btn_plus.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"+"
        }
        btn_minus.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"-"
        }
        btn_multiply.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"*"
        }
        btn_divide.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.toString()+"/"
            }

        btn_equals.setOnClickListener(){
            try {
                btn_back.visibility = View.VISIBLE
                var exp: String = tv_result.text.toString()
                var res: String = Expression(tv_result.text.toString()).calculate().toString()
                tv_result.text = res
                btn_back.setOnClickListener() {
                    tv_result.text = exp
                    btn_back.visibility = View.GONE
                }
            }
            catch (e: Exception){
                tv_result.text="ERROR"
            }
        }

        btn_clear.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=""
        }
        btn_delete.setOnClickListener(){
            btn_back.visibility=View.GONE
            tv_result.text=tv_result.text.dropLast(1)
        }
    }
}