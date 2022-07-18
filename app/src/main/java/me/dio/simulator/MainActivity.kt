package me.dio.simulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.dio.simulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // [VIEWBINDING] - 2. Vincular XML ao .KT através do binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // [VIEWBINDING] - 3. Acessar elementos XML através do binding
        // binding.tvHello.text = "Hello, Android!"
    }
}
