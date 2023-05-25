package com.bashir.emulator.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bashir.emulator.databinding.RecyclerViewItemBinding
import java.util.zip.Inflater

class ItemAdapter(var context: Context, var list: List<RecyclerData>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(val binding: RecyclerViewItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = RecyclerViewItemBinding.inflate(LayoutInflater.from(context),parent, false)
      return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.titleText.text = list[position].title
        list[position].image

    }

    override fun getItemCount(): Int {
        return list.size
    }
}