package com.uhubai.goodweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uhubai.goodweather.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(this.layoutInflater)
        setContentView(viewBinding.root)
    }
}