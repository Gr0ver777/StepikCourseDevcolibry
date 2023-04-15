package com.example.stepikcoursedevcolibry.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.stepikcoursedevcolibry.R

class MainActivity : AppCompatActivity() {

    private var count = 0

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.shopList.observe(this){
            Log.d("Test", it.toString())
            if(count == 0){
                count++
                val item = it[0]
                viewModel.deleteShopItem(item)
            }

        }



    }
}