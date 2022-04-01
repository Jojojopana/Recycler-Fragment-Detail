package com.binar.recyclerdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class Fragment2 : Fragment() {
    private val arguments: Fragment2Args by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val namaTextView = view.findViewById<TextView>(R.id.nama_fragment2)
        val nomorTextView = view.findViewById<TextView>(R.id.nomor_fragment2)
        val genderTextView = view.findViewById<TextView>(R.id.gender_fragment2)

        namaTextView.text = arguments.person.name
        nomorTextView.text = arguments.person.number
        genderTextView.text = arguments.person.gender


    }
}