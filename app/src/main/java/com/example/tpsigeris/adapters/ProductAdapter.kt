/*package com.example.tpsigeris.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cm.sigeris.roomdatabase.databinding.LayoutProductBinding
import cm.sigeris.roomdatabase.model.Products
import coil.api.load

class ProductAdapter(private val prodList: Products, val clickListener: (Products.Product) -> Unit) : RecyclerView.Adapter<ProductAdapter.ProductsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
        val binding = LayoutProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        val currentItem = prodList.products.elementAt(position)
        holder.viewBinding.prodTitle.text = currentItem.title
        holder.viewBinding.prodSubtitle.text = currentItem.description
        holder.viewBinding.prodPrice.text = "Prix: FCFA " + currentItem.price.toString()
        holder.viewBinding.prodQty.text = currentItem.stock.toString()
        holder.viewBinding.prodImg.load(currentItem.thumbnail)
        holder.viewBinding.ratingPurchases.rating = currentItem.rating.toFloat()
        holder.viewBinding.prodLayout.setOnClickListener { clickListener(currentItem) }
    }

    override fun getItemCount(): Int {
        return prodList.products.size
    }

    class ProductsViewHolder(var viewBinding: LayoutProductBinding) : RecyclerView.ViewHolder(viewBinding.root)
}*/