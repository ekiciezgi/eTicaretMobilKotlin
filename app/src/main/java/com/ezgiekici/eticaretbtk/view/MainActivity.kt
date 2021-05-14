package com.ezgiekici.eticaretbtk.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.ezgiekici.eticaretbtk.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController=findNavController(this,
            R.id.fragment2
        )
        bottomNavigationView.setupWithNavController(navController)
    }
}