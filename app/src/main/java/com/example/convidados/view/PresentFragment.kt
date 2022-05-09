package com.example.convidados.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.convidados.R
import com.example.convidados.databinding.FragmentPresentBinding
import com.example.convidados.viewmodel.AbsentViewModel
import com.example.convidados.viewmodel.PresentViewModel

class PresentFragment : Fragment() {

    private lateinit var presentViewModel: PresentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        presentViewModel = ViewModelProvider(this).get(PresentViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_present, container, false)

        return root
    }
}