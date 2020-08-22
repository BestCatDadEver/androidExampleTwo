package com.example.exampletwo.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Dataset
import android.widget.ArrayAdapter
import com.example.exampletwo.Adapters.CategoryAdapter
import com.example.exampletwo.Model.Category
import com.example.exampletwo.R
import com.example.exampletwo.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.categories)

        categoryListView.adapter = adapter
    }
}