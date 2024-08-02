package edu.msudenver.cs3013.lab04

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.msudenver.cs3013.lab04.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.map_fragment, MapFragment())
                .replace(R.id.detail_fragment, DetailFragment())
                .commit()
        }
    }
}
