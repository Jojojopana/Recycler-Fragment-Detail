package com.binar.recyclerdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fragment1 : Fragment() {
    lateinit var userRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        userRecyclerView = view.findViewById(R.id.user_recycler_view)

        val userList = listOf(
            User("Juan Tanandi", "pria",1111112),
            User("Leonardo", "pria",+628963312),
            User("Sergio", "pria",+629182923),
            User("Nelson", "pria",+628193831),
            User("Devina", "wanita",+629381210)
        )

        val userAdapter = UserAdapter(userList)
        val layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        userRecyclerView.layoutManager = layoutManager
        userRecyclerView.adapter = userAdapter

//        val button = view.findViewById<Button>(R.id.keterangan_button)
//        button.setOnClickListener{
//            findNavController().navigate(R.id.action_fragment1_to_fragment2)
//        }
    }
}