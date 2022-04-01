package com.binar.recyclerdetail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import androidx.navigation.fragment.findNavController

data class UserAdapter(private val user: List<User>):RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val usernameTextView: TextView = view.findViewById(R.id.username_text_view)
        val jeniskelamin: TextView = view.findViewById(R.id.jeniskelamin_text_view)
        val nomorTextView: TextView = view.findViewById(R.id.nomor_text_view)
        val keterangan: Button = view.findViewById(R.id.keterangan_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.usernameTextView.text = user[position].username
        holder.jeniskelamin.text = user[position].jeniskelamin
        holder.nomorTextView.text = user[position].nomor.toString()

        holder.keterangan.setOnClickListener{

            val person = Person(
                name = user[position].username,
                gender = user[position].jeniskelamin,
                number = user[position].nomor.toString()
            )

            it.findNavController().navigate(Fragment1Directions.actionFragment1ToFragment2(person))
        }
    }

    override fun getItemCount(): Int {
        return user.size
    }
}
