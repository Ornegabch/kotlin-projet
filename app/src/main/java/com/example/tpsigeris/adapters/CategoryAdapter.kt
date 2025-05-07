/*package com.example.tpsigeris.adapters
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tpsigeris.databinding.LayoutCatBinding
import com.example.tpsigeris.model.Categories
import coil.api.load

class CategoryAdapter(private val catList: Categories, val clickListener: (Categories.CategoriesItem) -> Unit) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding = LayoutCatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val currentItem = catList[position]
        holder.viewBinding.catName.text = currentItem.name
        holder.viewBinding.catImage.load("https://dummyjson.com/image/400x200/282828?fontFamily=pacifico&text=${currentItem.name}")
        holder.viewBinding.catRow.setOnClickListener { clickListener(currentItem) }
    }

    override fun getItemCount(): Int {
        return catList.size
    }

    class CategoryViewHolder(var viewBinding: LayoutCatBinding) : RecyclerView.ViewHolder(viewBinding.root)
}*/