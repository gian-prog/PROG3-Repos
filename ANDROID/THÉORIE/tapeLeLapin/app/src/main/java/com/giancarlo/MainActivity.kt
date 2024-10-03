package com.giancarlo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.giancarlo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var listeButtons : List<Button>

    var scoreTops = 0
    var scoreFlops = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tvTops.setOnClickListener(View.OnClickListener {
            println("Coucou")
            binding.tvTops.setText("Lapin")
        })
        listeButtons = listOf(
            binding.btn1,
            binding.btn2,
            binding.btn3,
            binding.btn4,
            binding.btn5,
            binding.btn6,
            binding.btn7,
            binding.btn8,
            binding.btn9,
            )
        for(btn  in listeButtons){
            btn.setOnClickListener(View.OnClickListener {
                reactClick(it)
            })
        }
        initialiser()
        }

        fun initialiser(){
            // Mettre tous les autres à taupe
            for(btn in listeButtons)
                btn.setText("Taupe")

            // Choisir un bouton au hasard dans liste
            val boutonLapin : Button = listeButtons.random()
            boutonLapin.setText("Lapin")
            // Choisir une case pour le lapin au hasard


        }
        fun reactClick(it: View){
            //détecter si le boutton appuyé est le lapin
            val boutonClicked : Button = it as Button
            if(boutonClicked.text == "Lapin"){
                boutonClicked.setText("Taupe")
                initialiser()
                scoreTops++
            }else{
                scoreFlops++
                //sinon perdre un point

            }
            //mettre a jour l'affichage du score
            binding.tvTops.setText("Tops: $scoreTops")
            binding.tvTops.setText("Flops: $scoreFlops")

            //bouger les lapins

        }
    }
