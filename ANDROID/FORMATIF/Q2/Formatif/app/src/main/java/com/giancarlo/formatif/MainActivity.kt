package com.giancarlo.formatif

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.giancarlo.formatif.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // Définir un OnClickListener pour le bouton
        binding.btnImg.setOnClickListener {
            // Rediriger vers SecondActivity
            val intent = Intent(this, ImagesVersActivites::class.java)
            startActivity(intent)
        }
    }
}