package com.nirwashh.android.teleglam.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.nirwashh.android.teleglam.R
import com.nirwashh.android.teleglam.databinding.ActivityRegisterBinding
import com.nirwashh.android.teleglam.ui.fragments.EnterPhoneNumberFragment

class RegisterActivity : AppCompatActivity() {
    private lateinit var b: ActivityRegisterBinding
    private lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(b.root)
    }

    override fun onStart() {
        super.onStart()
        toolbar = b.registerToolbar
        setSupportActionBar(toolbar)
        title = getString(R.string.register_title_your_phone)
        supportFragmentManager.beginTransaction()
            .add(R.id.registerDataContainer, EnterPhoneNumberFragment())
            .commit()
    }
}