package com.example.materialdesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var list= mutableListOf<Int>()
    lateinit var myAdapter:MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.title="abc"
        for(i in 0..30){
            list.add(i)
        }
        myAdapter = MyAdapter(list)

        initRecyclerView()
       collapingToolbar.title="xin chào Việt Nam"

    }

    fun initRecyclerView(){
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.setHasFixedSize(true)
        recycler.adapter=myAdapter
    }
}
