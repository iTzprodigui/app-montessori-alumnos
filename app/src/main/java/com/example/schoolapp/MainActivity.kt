package com.example.schoolapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView3.setOnClickListener{
            val intent:Intent = Intent(this, DatosActivity::class.java)
            startActivity(intent)
        }

        textView2.setOnClickListener{
            val intent:Intent = Intent(this, PagosActivity::class.java)
            startActivity(intent)
        }

        textView4.setOnClickListener{
            val intent:Intent = Intent(this, BitacoraActivity::class.java)
            startActivity(intent)
        }
    }
}