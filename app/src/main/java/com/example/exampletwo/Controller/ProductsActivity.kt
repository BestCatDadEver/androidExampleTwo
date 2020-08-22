package com.example.exampletwo.Controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.exampletwo.Adapters.ProductRecycleAdapter
import com.example.exampletwo.R
import com.example.exampletwo.Services.DataService
import com.example.exampletwo.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductRecycleAdapter(this,DataService.getProducts(categoryType))

        var spanCount = 2
        val orientation = resources.configuration.orientation

        if(orientation == Configuration.ORIENTATION_LANDSCAPE)
            spanCount = 3


        val screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720)
            spanCount = 3

        val layoutManager = GridLayoutManager(this,spanCount)

        productListView.adapter = adapter
        productListView.layoutManager = layoutManager


    }
}