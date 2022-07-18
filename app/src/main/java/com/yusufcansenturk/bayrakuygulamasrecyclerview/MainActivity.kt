package com.yusufcansenturk.bayrakuygulamasrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.yusufcansenturk.bayrakuygulamasrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bayraklarList : ArrayList<bayraklar>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        bayraklarList = ArrayList<bayraklar>()

        val turkiye = bayraklar("Türkiye", "Ankara", R.drawable.turkey)
        val amerika = bayraklar("Amerika", "Washington, DC", R.drawable.amerika)
        val arjantin = bayraklar("Arjantin", "Buenos Aires" , R.drawable.arjantin)
        val azerbaycan = bayraklar("Azerbaycan", "Bakü", R.drawable.azerbaycan)
        val rusya = bayraklar("Rusya", "Moskova", R.drawable.rusya)
        val iran = bayraklar("İran", "Tahran", R.drawable.iran)
        val portekiz = bayraklar("Portekiz", "Lizbon", R.drawable.portekiz)



        bayraklarList.add(turkiye)
        bayraklarList.add(amerika)
        bayraklarList.add(arjantin)
        bayraklarList.add(azerbaycan)
        bayraklarList.add(rusya)
        bayraklarList.add(iran)
        bayraklarList.add(portekiz)

        binding.recyclerView.layoutManager = GridLayoutManager(this, 2)

        val bayraklarAdapter  = Adapter(bayraklarList)
        binding.recyclerView.adapter = bayraklarAdapter

    }
}