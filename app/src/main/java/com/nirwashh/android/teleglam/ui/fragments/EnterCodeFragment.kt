package com.nirwashh.android.teleglam.ui.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.nirwashh.android.teleglam.R
import com.nirwashh.android.teleglam.databinding.FragmentEnterCodeBinding
import com.nirwashh.android.teleglam.databinding.FragmentEnterPhoneNumberBinding

class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {
    private var _binding: FragmentEnterCodeBinding? = null
    private val b get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEnterCodeBinding.inflate(inflater, container, false)
        return b.root
    }
    override fun onStart() {
        super.onStart()
        b.registerInputCode.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                val string = b.registerInputCode.text.toString()
                if (string.length == 6) {
                    verifyCode()
                }
            }

        })
    }

    private fun verifyCode() {
        Toast.makeText(activity, "Ok", Toast.LENGTH_SHORT).show()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}