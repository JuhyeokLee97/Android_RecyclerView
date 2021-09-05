package com.example.recyclerviewactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(var playerList: ArrayList<SoccerPlayer>): RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvPlayerName: TextView = itemView.findViewById(R.id.tv_player_name)
        var tvPlayerPosition: TextView = itemView.findViewById(R.id.tv_player_position)
        var tvPlayerNumber: TextView = itemView.findViewById(R.id.tv_player_number)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var player: SoccerPlayer = playerList.get(position)

        holder.tvPlayerName.text = player.name
        holder.tvPlayerPosition.text = player.position
        holder.tvPlayerNumber.text = player.number
    }

    override fun getItemCount(): Int {
        return playerList.size
    }

    fun addItem(player: SoccerPlayer){
        playerList.add(player)
        notifyDataSetChanged()
    }
}