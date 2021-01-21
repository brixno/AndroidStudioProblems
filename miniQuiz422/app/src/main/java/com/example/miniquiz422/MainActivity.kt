package com.example.miniquiz422

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        checkApple.setOnCheckedChangeListener{ buttonView, isChecked ->
            if(isChecked) {
                if(checkOrange.isChecked && checkBanana.isChecked)
                Log.d("CheckBox", "사과와 바나나와 오렌지가 선택되었습니다.")
                else if(checkBanana.isChecked)
                    Log.d("CheckBox", "사과와 바나나가 선택되었습니다.")
                else if(checkOrange.isChecked)
                    Log.d("CheckBox", "사과와 오렌지가 선택되었습니다.")
                else
                    Log.d("CheckBox","사과가 선택되었습니다.")
            }
            else {
                if(checkOrange.isChecked && checkBanana.isChecked)
                    Log.d("CheckBox", "바나나와 오렌지가 선택되었습니다.")
                else if(checkBanana.isChecked)
                    Log.d("CheckBox","바나나가 선택되었습니다.")
                else if(checkOrange.isChecked)
                    Log.d("CheckBox","오렌지가 선택되었습니다.")
            }
        }
        checkBanana.setOnCheckedChangeListener{ buttonView, isChecked ->
            if(isChecked) {
                if(checkOrange.isChecked && checkApple.isChecked)
                    Log.d("CheckBox", "사과와 바나나와 오렌지가 선택되었습니다.")
                else if(checkApple.isChecked)
                    Log.d("CheckBox", "사과와 바나나가 선택되었습니다.")
                else if(checkOrange.isChecked)
                    Log.d("CheckBox", "바나나와 오렌지가 선택되었습니다.")
                else
                    Log.d("CheckBox","바나나가 선택되었습니다.")
            }
            else {
                if(checkOrange.isChecked && checkApple.isChecked)
                    Log.d("CheckBox", "사과와 오렌지가 선택되었습니다.")
                else if (checkApple.isChecked)
                    Log.d("CheckBox","사과가 선택되었습니다.")
                else if(checkOrange.isChecked)
                    Log.d("CheckBox","오렌지가 선택되었습니다.")
            }
        }
        checkOrange.setOnCheckedChangeListener{ buttonView, isChecked ->
            if(isChecked) {
                if(checkApple.isChecked && checkBanana.isChecked)
                Log.d("CheckBox", "사과와 바나나와 오렌지가 선택되었습니다.")
                else if(checkBanana.isChecked)
                    Log.d("CheckBox", "바나나와 오렌지가 선택되었습니다.")
                else if(checkApple.isChecked)
                    Log.d("CheckBox", "사과와 오렌지가 선택되었습니다.")
                else
                    Log.d("CheckBox","오렌지가 선택되었습니다.")
            }
            else {
                if(checkApple.isChecked && checkBanana.isChecked)
                    Log.d("CheckBox", "사과와 바나나가 선택되었습니다.")
                else if(checkBanana.isChecked)
                    Log.d("CheckBox","바나나가 선택되었습니다.")
                else if(checkApple.isChecked)
                    Log.d("CheckBox","사과가 선택되었습니다.")
            }
        }
    }
}