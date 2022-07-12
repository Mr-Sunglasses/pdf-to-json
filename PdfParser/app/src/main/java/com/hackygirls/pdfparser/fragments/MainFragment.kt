package com.hackygirls.pdfparser.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hackygirls.pdfparser.R
import com.hackygirls.pdfparser.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding : FragmentMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding  = FragmentMainBinding.inflate(inflater)

        binding.upload.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_yourDocFragment)
        }

        return binding.root

    }


}