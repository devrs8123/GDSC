package com.internshala.gdsc_hackathon.ChatActivity

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.internshala.gdsc_hackathon.R

class UserAdapter: RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
    }

    override fun getItemCount(): Int {
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
    }

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textName = itemView.findViewById<TextView>( R.id.txt_name)
    }
}