package adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recycledview.databinding.MonItemBinding

class MyAdapter : ListAdapter<String, MyAdapter.MyItemViewHolder>(MyItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout mon_item.xml

    inner class MyItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            binding.Line.text = item // On affiche l'élément dans le TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyItemViewHolder {
        val binding = MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val holder : MyItemViewHolder = MyItemViewHolder(binding)
        return holder
    }

    override fun onBindViewHolder(holder: MyItemViewHolder, position: Int) {
        val item: String = getItem(position)
        holder.bind(item)
    }

}

object MyItemDiffCallback : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}
