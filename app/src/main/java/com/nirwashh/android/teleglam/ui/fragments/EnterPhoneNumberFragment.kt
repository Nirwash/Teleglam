package com.nirwashh.android.teleglam.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.nirwashh.android.teleglam.R
import com.nirwashh.android.teleglam.databinding.FragmentEnterPhoneNumberBinding

class EnterPhoneNumberFragment : Fragment(R.layout.fragment_enter_phone_number) {
    private var _binding: FragmentEnterPhoneNumberBinding? = null
    private val b get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEnterPhoneNumberBinding.inflate(inflater, container, false)
        return b.root
    }
    override fun onStart() {
        super.onStart()
        b.registerBtnNext.setOnClickListener {
            sendCode()
        }
    }

    private fun sendCode() {
        if (b.registerInputPhoneNumber.text.toString().isEmpty()) {
            Toast.makeText(activity, getString(R.string.register_toast_enter_phone), Toast.LENGTH_SHORT).show()
        } else {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.registerDataContainer, EnterCodeFragment())
                ?.addToBackStack(null)
                ?.commit()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}