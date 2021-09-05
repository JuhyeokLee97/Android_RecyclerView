package com.example.recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var etPlayerName: EditText
    lateinit var etPlayerPosition: EditText
    lateinit var etPlayerNumber: EditText
    lateinit var btnAddPlayer: Button
    lateinit var recyclerView: RecyclerView
    // player List create
    lateinit var playerList: ArrayList<SoccerPlayer>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Init View
        etPlayerName = findViewById(R.id.et_player_name)
        etPlayerPosition = findViewById(R.id.et_player_position)
        etPlayerNumber = findViewById(R.id.et_player_number)
        btnAddPlayer = findViewById(R.id.btn_add_player)
        recyclerView = findViewById(R.id.rv_player_info)

        // Init PlayerList Item
        playerList = ArrayList<SoccerPlayer>()
        playerList.add(SoccerPlayer("Messi", "Foward", "10"))

        // Set RecyclerView Adapter
        var adapter = MyRecyclerViewAdapter(playerList)
        recyclerView.adapter = adapter

        // Button 클릭 시, 선수 정보 저장.
        btnAddPlayer.setOnClickListener {
            var name = etPlayerName.text.toString()
            var position = etPlayerPosition.text.toString()
            var number = etPlayerNumber.text.toString()

            adapter.addItem(SoccerPlayer(name, position, number))
        }

    }


}