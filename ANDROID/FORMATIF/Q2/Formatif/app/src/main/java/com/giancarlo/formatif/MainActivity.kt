package com.giancarlo.formatif

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ListAdapter
import com.giancarlo.formatif.adapters.VersionAdapter
import com.giancarlo.formatif.databinding.ActivityMainBinding
import com.giancarlo.formatif.models.Version

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: VersionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        title = "formatif—Accueil et Versions d'Android"

        setupRecycler()
        fillRecycler()
        // Définir un OnClickListener pour le bouton
        binding.btnImg.setOnClickListener {
            // Rediriger vers SecondActivity
            val intent = Intent(this, ImagesVersActivites::class.java)
            startActivity(intent)
        }
    }



    private fun setupRecycler() {
        adapter = VersionAdapter() // Créer l'adapteur
        binding.rvVersionAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvVersionAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvVersionAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvVersionAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecycler() {
        //Retourne la liste de tous les versions d'android tel que demandé
        val items: MutableList<Version> = mutableListOf()
        items.add(Version("Android 1.0", "Alpha"))
        items.add(Version("Android 1.1", "Petit Four"))
        items.add(Version("Android 1.5", "Cupcake"))
        items.add(Version("Android 1.6", "Donut"))
        items.add(Version("Android 2.0", "Eclair"))
        items.add(Version("Android 2.2", "Froyo"))
        items.add(Version("Android 2.3", "Gingerbread"))
        items.add(Version("Android 3.0", "Honeycomb"))
        items.add(Version("Android 4.0", "Ice Cream Sandwich"))
        items.add(Version("Android 4.1", "Jelly Bean"))
        items.add(Version("Android 4.4", "KitKat"))
        items.add(Version("Android 5.0", "Lollipop"))
        items.add(Version("Android 6.0", "Marshmallow"))
        items.add(Version("Android 7.0", "Nougat"))
        items.add(Version("Android 8.0", "Oreo"))
        items.add(Version("Android 9.0", "Pie"))
        items.add(Version("Android 10", "Android 10"))
        items.add(Version("Android 11", "Android 11"))
        items.add(Version("Android 12", "Android 12"))
        items.add(Version("Android 13", "Android 13"))
        adapter.submitList(items)
    }
}