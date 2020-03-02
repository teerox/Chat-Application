package com.example.whatsappclone.screens.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.whatsappclone.R
import com.example.whatsappclone.databinding.FragmentSignUpBinding

/**
 * A simple [Fragment] subclass.
 */
class SignUpFragment : Fragment() {
    lateinit var binding: FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =DataBindingUtil.inflate(inflater,R.layout.fragment_sign_up,container,false)
        binding.signInText.setOnClickListener {
            val action = SignUpFragmentDirections.actionSignUpFragmentToLoginFragment()
            findNavController().navigate(action)
            Toast.makeText(context,"You Clicked", Toast.LENGTH_LONG).show()
        }

        return binding.root
        }
    }

