package com.nirwashh.android.teleglam.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nirwashh.android.teleglam.R
import com.nirwashh.android.teleglam.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {
    private lateinit var b: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        b = FragmentSettingsBinding.inflate(layoutInflater)
        return b.root
    }

}