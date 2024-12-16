package com.giancarlo.formatif.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.giancarlo.formatif.DetailsActivity
import com.giancarlo.formatif.databinding.VersionItemBinding
import com.giancarlo.formatif.models.Version

class VersionAdapter : ListAdapter<Version, VersionAdapter.VersionItemViewHolder>(VersionItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout Version_item.xml
    inner class VersionItemViewHolder(private val binding: VersionItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(version: Version) {
            binding.version.text = version.version
            binding.nomVersion.text = version.nomVersion
            binding.root.setOnClickListener {
                val myIntent = Intent(binding.root.context, DetailsActivity::class.java)
                // On ajoute le nom de l'élément(la question) à l'intent
                myIntent.putExtra("version", version.version)
                myIntent.putExtra("nomVersion", version.nomVersion)
                binding.root.context.startActivity(myIntent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VersionItemViewHolder {
        val binding: VersionItemBinding = VersionItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VersionItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VersionItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

object VersionItemDiffCallback : DiffUtil.ItemCallback<Version>() {
    override fun areItemsTheSame(oldItem: Version, newItem: Version): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Version, newItem: Version): Boolean {
        return oldItem.nomVersion == newItem.nomVersion &&
                oldItem.version == newItem.version
    }
}