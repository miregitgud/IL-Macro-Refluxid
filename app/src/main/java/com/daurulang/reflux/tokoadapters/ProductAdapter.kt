package com.daurulang.reflux.tokoadapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.daurulang.reflux.R
import com.daurulang.reflux.data.Product
import com.daurulang.reflux.data.ProductData.productList2

class ProductAdapter(private val productList: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textProductName1: TextView = itemView.findViewById(R.id.textProductName1)
        val textProductPrice1: TextView = itemView.findViewById(R.id.textProductPrice1)
        val productPicture1: ImageView = itemView.findViewById(R.id.productPicture1)
        val textProductName2: TextView = itemView.findViewById(R.id.textProductName2)
        val textProductPrice2: TextView = itemView.findViewById(R.id.textProductPrice2)
        val productPicture2: ImageView = itemView.findViewById(R.id.productPicture2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product, parent, false)
        return ProductViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        val product2 = productList2[position]
        holder.textProductName1.text = product.name
        holder.textProductPrice1.text = product.price
        holder.textProductName2.text = product2.name
        holder.textProductPrice2.text = product2.price
        Glide.with(holder.itemView)
            .load(product.imageResId)
            .into(holder.productPicture1)
        Glide.with(holder.itemView)
            .load(product2.imageResId)
            .into(holder.productPicture2)
    }

    override fun getItemCount(): Int = productList.size
}

