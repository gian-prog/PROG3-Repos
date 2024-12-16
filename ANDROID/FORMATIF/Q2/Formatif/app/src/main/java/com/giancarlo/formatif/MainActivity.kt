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

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: VersionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        title = "formatif—Accueil"

        setupRecycler()
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
}