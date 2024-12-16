package com.giancarlo.formatif
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.giancarlo.formatif.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.version.text = intent.getStringExtra("version")
        binding.nomVersion.text = intent.getStringExtra("nomVersion")


    }
}