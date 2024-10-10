package com.example.recycledview

import com.example.recycledview.adapters.AlbumAdapter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.recycledview.databinding.ActivityMainBinding
import com.example.recycledview.models.Album

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: AlbumAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecycler()
        fillRecycler()
    }

    private fun setupRecycler() {
        adapter = AlbumAdapter() // Créer l'adapteur
        binding.rvAlbumAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvAlbumAdapter.setHasFixedSize(true) // Option pour améliorer les performances
//        binding.rvAlbumAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
//            DividerItemDecoration(
//                binding.rvAlbumAdapter.context, DividerItemDecoration.VERTICAL
//            )
//        ) //(CTRL + / pour commenter ou décommenter)
    }

    private fun fillRecycler() {

        val items: MutableList<Album> = mutableListOf(
            Album(1, "Antigéographiquement", "Jérome 50"),
            Album(2, "J'ai Bu", "Québec Redneck Bluegrass Project"),
            Album(3, "Comment Debord", "Comment Debord"),
            Album(4, "Darlène", "Hubert Lenoir"),
            Album(5, "La Nuit Est Un Panthère", "Les louanges"),
            Album(6, "Jaune", "Jean-Pierre Forland")
        )
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}