package com.example.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   /*     button.setOnClickListener {
            val name = firstName.text.toString()
            val last = last_name.text.toString()
            val emailid = email.text.toString()
            val city = state.text.toString()
            val number = mobile.text.toString().toInt()
            val date = birth.text.toString().toInt()
          Intent(this, SecondActivity::class.java).also {
              it.putExtra("EXTRA_NAME", name)
              it.putExtra("EXTRA_NAME", last)
              it.putExtra("EXTRA_CITY", city)
              it.putExtra("EXTRA_AGE", date)
              it.putExtra("EXTRA_EMAIL", emailid)
              it.putExtra("EXTRA_NUMBER", number)
              startActivity(it)
          }
        }*/
    }
}