package com.biswesh.club_card.model.repository

import com.biswesh.club_card.R
import com.biswesh.club_card.model.data.Club

class ClubRepository {
    fun getClubs(): List<Club> {
        return listOf(
            //Technology Clubs
            Club("1", "SWITCH Club", "The official coding club of SiliconTech", R.drawable.circuit),
            Club("2", "Circuit Club", "Designing electronic circuits and IoT.", R.drawable.circuit),
            Club("3", "Robotics Club", "Work on high-impact and large-scale robots", R.drawable.circuit),
            //Social & Cultural Clubs
            Club("4", "Social Media Cell", "An all-in-one destination for never-ending awesomeness.", R.drawable.circuit),
            Club("5", "Theatre Club", "Exposes students to different aspects of theatre.", R.drawable.circuit),
            Club("6", "Photography Club", "Where pixels meet passion!", R.drawable.circuit),
            Club("7", "Music Club", "Where melodies meet movement, and rhythm finds its groove!", R.drawable.circuit),
            Club("8", "Creative Club", "Where imagination takes shape and creativity knows no bounds!", R.drawable.circuit),
            Club("9", "CineMax Club", "Where stories light up the big screen, and movie magic meets!", R.drawable.circuit),
            //Sports & Fitness
            Club("10", "Yoga Club", "Leap forward in your physical and mental wellbeing.", R.drawable.circuit),
            Club("11", "Sports Club", "Master your skills in a sport of your choice.", R.drawable.circuit),
            Club("12", "Health Club & Gym", "Transform into your fittest self.", R.drawable.circuit),
            Club("13", "Cricket Club", "Where leather meets willow, and camaraderie swings for the boundary!.", R.drawable.circuit),
            //Personality Development
            Club("14", "Quiz Club", "Where knowledge becomes your secret weapon, and curiosity fuels your journey to quiz mastery!", R.drawable.circuit),
            Club("15", "Toastmasters Community Club", "Where words find wings and confidence takes the stage!", R.drawable.circuit),
            Club("16", "SAGE-W Cell", "Empowering women, one achievement at a time!", R.drawable.circuit),
            Club("17", "Meta Academics Cell", "Where ideas collide and eloquence thrives!", R.drawable.circuit),
            //Social Service
            Club("18", "ZEAL Club", "Nourishing mind, body, and spirit.", R.drawable.circuit),
            Club("19", "Green Club", "A tribe of eco-warriors to build a greener campus.", R.drawable.circuit),
            //Learning Societies
            Club("20", "ISTE Student Chapter", "Where knowledge meets camaraderie, and tech skills find their stage!", R.drawable.circuit),
            Club("21", "IEEE Student Chapter", "Where STEM passion ignites global impact!", R.drawable.circuit),
            Club("22", "Unstop (Formerly Dare2Compete)", "Connecting talent, one global opportunity at a time!", R.drawable.circuit),
            Club("23", "CSI Student Chapter", "Empowering IT enthusiasts, one byte at a time!", R.drawable.circuit),
            Club("24", "CodeChef Chapter", "Coding challenges, camaraderie, and problem-solving prowess!", R.drawable.circuit),
            Club("25", "QWERTY Club", "Mastering keystrokes, one touch at a time!", R.drawable.circuit),


        )
    }
}
