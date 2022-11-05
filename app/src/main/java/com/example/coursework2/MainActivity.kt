package com.example.coursework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ed_image_url.addTextChangedListener {

            if (ed_image_url.text!!.isEmpty()){

                return@addTextChangedListener
            }
            Picasso.get().load(ed_image_url.text.toString()).into(imageView);
        }
    }
}