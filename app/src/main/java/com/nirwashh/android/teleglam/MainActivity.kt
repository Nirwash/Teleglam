package com.nirwashh.android.teleglam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.nirwashh.android.teleglam.activities.RegisterActivity
import com.nirwashh.android.teleglam.databinding.ActivityMainBinding
import com.nirwashh.android.teleglam.ui.fragments.ChatsFragment
import com.nirwashh.android.teleglam.ui.objects.AppDrawer
import com.nirwashh.android.teleglam.utilits.replaceActivity
import com.nirwashh.android.teleglam.utilits.replaceFragment

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
        if (true) {
            setSupportActionBar(toolbar)
            appDrawer.create()
            replaceFragment(ChatsFragment())
        } else {
            replaceActivity(RegisterActivity())

        }


    }



    private fun initFields() {
        toolbar = b.mainToolbar
        appDrawer = AppDrawer(this, toolbar)

    }
}