package com.example.exampletwo.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exampletwo.Model.Product
import com.example.exampletwo.R

class ProductRecycleAdapter(val context : Context, val products : List<Product>) :
    RecyclerView.Adapter<ProductRecycleAdapter.ProductHolder>() {

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView.findViewById<ImageView>(R.id.productImageItem)
        val productName = itemView.findViewById<TextView>(R.id.productNameTextView)
        val productPrice = itemView.findViewById<TextView>(R.id.productPriceTextView)

        fun bindProducts(product: Product, context: Context){
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage.setImageResource(resourceId)
            productName.text = (product.title)
            productPrice.text = (product.price)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_list_item, parent,false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProducts(products[position], context)
    }
}