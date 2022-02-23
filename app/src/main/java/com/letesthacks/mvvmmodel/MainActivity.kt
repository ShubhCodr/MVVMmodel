package com.letesthacks.mvvmmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.letesthacks.mvvmmodel.databinding.ActivityABinding

class MainActivity : AppCompatActivity() {
      lateinit var binding: ActivityABinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityABinding.inflate(layoutInflater)
        val view = binding.
        setContentView(view)
        startActivity(Intent(this, A::class.java).putExtra("name","Sonu"))

        btnsubmit.seto
    }
}