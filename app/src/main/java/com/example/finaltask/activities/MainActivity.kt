package com.example.finaltask.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.finaltask.R
import com.example.finaltask.databinding.ActivityMainBinding
import com.example.finaltask.fragments.ProductsList
import com.example.finaltask.fragments.SignInFragment


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportFragmentManager.commit {
            add(R.id.fragmentContainer, SignInFragment())
        }

    }

    override fun onBackPressed() {
        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainer)
        navHost?.let { navFragment ->
            navFragment.childFragmentManager.primaryNavigationFragment?.let { fragment ->
                if(fragment is ProductsList){
                    finish()
                }
                else{
                    super.onBackPressed()
                }
            }
        }
        super.onBackPressed()
    }
}