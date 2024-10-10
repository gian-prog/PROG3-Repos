package com.example.recycledview.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recycledview.databinding.AlbumItemBinding
import com.example.recycledview.models.Album

class AlbumAdapter : ListAdapter<Album, AlbumAdapter.AlbumItemViewHolder>(AlbumItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout personne_item.xml
    inner class AlbumItemViewHolder(private val binding: AlbumItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(album: Album) {
            binding.tvName.text = album.name
            binding.tvArtistName.text = album.artistName
//            binding.tvId.text = album.id.toString() // Attention! Il faut toujours s'assurer qu'on assigne une String.
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumItemViewHolder {
        val binding: AlbumItemBinding = AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AlbumItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlbumItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
object AlbumItemDiffCallback : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem.id == newItem.id &&
                oldItem.name == newItem.name &&
                oldItem.artistName == newItem.artistName
    }
}