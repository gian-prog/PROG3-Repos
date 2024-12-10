package com.giancarlo.formatif

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.giancarlo.formatif.databinding.ActivityImagesVersActivitesBinding

class ImagesVersActivites : AppCompatActivity() {

    private lateinit var binding: ActivityImagesVersActivitesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImagesVersActivitesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Yo Mama"
    }
}