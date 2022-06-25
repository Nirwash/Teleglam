package com.nirwashh.android.teleglam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.nirwashh.android.teleglam.activities.RegisterActivity
import com.nirwashh.android.teleglam.databinding.ActivityMainBinding
import com.nirwashh.android.teleglam.ui.fragments.ChatsFragment
import com.nirwashh.android.teleglam.ui.objects.AppDrawer

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    private lateinit var appDrawer: AppDrawer
    private lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
        initFunc()
    }

    private fun initFunc() {
        if (false) {
            setSupportActionBar(toolbar)
            appDrawer.create()
            supportFragmentManager.beginTransaction()
                .replace(R.id.dataContainer, ChatsFragment())
                .commit()
        } else {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }


    }



    private fun initFields() {
        toolbar = b.mainToolbar
        appDrawer = AppDrawer(this, toolbar)

    }
}