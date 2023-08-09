package com.example.securez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"Welcome to SecureZ",Toast.LENGTH_SHORT).show()

        var bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottomBar.setOnItemSelectedListener {
           if(it.itemId==R.id.nav_guard){
               inflatefragment()
           }else if (it.itemId==R.id.nav_home){
               inflateHomefragment()
           }else if(it.itemId==R.id.nav_dashboard)
               inflateDashfragment()
            else if (it.itemId==R.id.nav_help)
               inflateHelpfragment()
            true

        }


    }

    private fun inflateHelpfragment() {
        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,DashboardFragment.newInstance("value1", "value2"))
        transaction.commit()
    }

    private fun inflateDashfragment() {
        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,DashboardFragment.newInstance("value1", "value2"))
        transaction.commit()

    }

    private fun inflateHomefragment() {
        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,HomeFragment.newInstance())
        transaction.commit()


    }
    private fun inflatefragment() {
        var transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,GuardFragment.newInstance())
        transaction.commit()


    }


    /* fun add(view: View) {
         var num1 = findViewById<EditText>(R.id.text1)
         var num2 = findViewById<EditText>(R.id.text2)

         var valueA = num1.text.toString().toInt()
         var value2 = num2.text.toString().toInt()

         var sum = valueA + value2

         Toast.makeText(this,"$sum",Toast.LENGTH_SHORT).show()*/



}



