package com.benedetti

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.benedetti.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Accueil"
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnArticle.setOnClickListener {
            // On crée l'intent, qui a besoin :
            // 1. Du contexte actuel
            // 2. De la classe d'activité à démarrer.
            val intent = Intent(this, ArticleActivity::class.java)

            // On démarre l'activité en lui passant l'intent qu'on vient de créer.
            startActivity(intent)
        }
        }
    }