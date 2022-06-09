package com.nirwashh.android.teleglam.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nirwashh.android.teleglam.R
import com.nirwashh.android.teleglam.databinding.FragmentChatsBinding

class ChatsFragment : Fragment() {
    private lateinit var b: FragmentChatsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        b = FragmentChatsBinding.inflate(layoutInflater)
        return b.root
    }

    override fun onResume() {
        super.onResume()
    }

}