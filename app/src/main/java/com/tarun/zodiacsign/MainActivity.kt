package com.tarun.zodiacsign

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var btnFind: Button? = null
    var dateText: EditText? = null
    var btnReset: Button? = null
    var monthText: EditText? = null
    var result: TextView? = null
    var str: String? = null
    var arrStr = arrayOfNulls<String>(5)
    var date = 0
    var month = 0
    var zodiac = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        result = findViewById<View>(R.id.result) as TextView
        btnFind = findViewById<View>(R.id.btnFind) as Button
        btnReset = findViewById<View>(R.id.btnReset) as Button
        monthText = findViewById<View>(R.id.monthText) as EditText
        dateText = findViewById<View>(R.id.dateText) as EditText
        btnReset!!.setOnClickListener {
            result!!.text = null
            monthText!!.text = null
            dateText!!.text = null
        }

        btnFind!!.setOnClickListener {
            month = monthText!!.text.toString().toInt()
            date = dateText!!.text.toString().toInt()
            zodiac = if (month == 1 && date >= 20 || month == 2 && date <= 19)
            {
                "Aquaris"
            }
            else if (month == 2 && date >= 20 || month == 3 && date <= 20)
            {
                "Pisces"
            } else if (month == 12 && date >= 22 || month == 1 && date <= 19) {
                "Capricon"
            } else if (month == 11 && date >= 23 || month == 12 && date <= 21) {
                "Sagittarius"
            } else if (month == 10 && date >= 23 || month == 11 && date <= 22) {
                "Scorpio"
            } else if (month == 9 && date >= 23 || month == 10 && date <= 22) {
                "Libra"
            } else if (month == 8 && date >= 23 || month == 9 && date <= 22) {
                "virgo"
            } else if (month == 7 && date >= 23 || month == 8 && date <= 22) {
                "Leo"
            } else if (month == 6 && date >= 21 || month == 7 && date <= 22) {
                "Cancer"
            } else if (month == 5 && date >= 21 || month == 6 && date <= 20) {
                "Gemini"
            } else if (month == 4 && date >= 21 || month == 5 && date <= 20) {
                "Taurus"
            } else if (month == 3 && date >= 21 || month == 4 && date <= 20) {
                "Aries"
            } else {
                "Invalid input"
            }
            result!!.text = zodiac
        }
    }
}

