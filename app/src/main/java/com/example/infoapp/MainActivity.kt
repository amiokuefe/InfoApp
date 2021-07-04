package com.example.infoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.infoapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Newsfeed","This is newsfeed description", R.drawable.newsfeed1))
        arrayList.add(Model("Business","This is Business description", R.drawable.business))
        arrayList.add((Model("People","This is people description", R.drawable.people )))
        arrayList.add(Model("Notes","This is notes description", R.drawable.notes))
        arrayList.add(Model("FeedBack", "This is feedback description", R.drawable.feedback))

        val myAdapter = MyAdapter(arrayList, this)

//        binding.recyclerView.layoutManager = LinearLayout(this)
//        binding.recyclerView.adapter = myAdapter

//        recyclerView.layoutManager = LinearLayout(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }
}