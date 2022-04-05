package com.example.aimanmuneeb.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.aimanmuneeb.R

class Login : Fragment() {

    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_login, container, false)



        view.findViewById<Button>(R.id.mybtn).setOnClickListener{

            //Navigation

           view.findNavController().navigate(R.id.action_login2_to_navActivity)
        }


        return view
    }
}