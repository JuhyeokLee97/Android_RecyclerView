package com.example.recyclerviewactivity

class SoccerPlayer(_name: String, _position: String, _number: String) {
    var name: String? = null
    var position: String? = null
    var number: String? = null

    init{
        name = _name
        position = _position
        number = _number
    }
}