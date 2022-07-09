package dev.maryann.mytwitterreplica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.maryann.mytwitterreplica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }
    fun displayTweets(){
        var twitter1=twitter("ian South","i love reading poem #poetry","@iansouth","300","600","800","","","")
        var twitter2=twitter("david West","Heya folks!#greeetings","@davii","300","600","800","","","")
        var twitter3=twitter("jacki Love","Its my birthday#birthdaytings","@jackiloves","300","600","800","","","")
        var twitter4=twitter("Nana Sunshine","i love reading poem #poetry","@nanasuns","300","600","800","","","")
        var twitter5=twitter("Purity Kind"," glad you are alive#gratefull","@puri","300","600","800","","","")
        var twitter6=twitter("Agnes Star","i love reading poem #poetry","@agiii","300","600","800","","","")
        var twitter7=twitter("Richard Nile","i love reading poem #poetry","@RichirdNile","300","600","800","","","")
        var twitter8=twitter("Max Icy","i love reading poem #poetry","@icy","300","600","800","","","")
        var twitter9=twitter("Kanye Nick","i love reading poem #poetry","@kanyee","300","600","800","","","")
        var twitter10=twitter("Smith Rocks","i love reading poem #poetry","@rockyy","300","600","800","","","")

        var twitterList= listOf(twitter1,twitter2,twitter3,twitter4,twitter5,twitter6,twitter7,twitter8,twitter9,twitter10)
        var twitterAdapter=twitterRecyclerViewAdapter(twitterList)
        binding.rvTwitter.layoutManager=LinearLayoutManager(this)
        binding.rvTwitter.adapter=twitterAdapter
    }
}