package me.dio.simulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.dio.simulator.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
