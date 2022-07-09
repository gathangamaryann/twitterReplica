package dev.maryann.mytwitterreplica

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class twitterRecyclerViewAdapter (var twitterList: List<twitter>): RecyclerView.Adapter<twitterViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): twitterViewHolder {
       var itemView=LayoutInflater.from(parent.context).inflate(R.layout.twitter_list_item,parent,false)
        return twitterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: twitterViewHolder, position: Int) {
        var currenttwitter=twitterList.get(position)
        holder.tvHandles.text=currenttwitter.Handles
        holder.tvName.text=currenttwitter.Name
        holder.tvTweet.text=currenttwitter.Tweet
        holder.tvNum1.text=currenttwitter.Num1
        holder.tvNum2.text=currenttwitter.Num2
        holder.tvNum3.text=currenttwitter.Num3








    }

    override fun getItemCount(): Int {
       return twitterList.size
    }
}
class twitterViewHolder(itemView:View):
        RecyclerView.ViewHolder(itemView){
    var tvName: TextView =itemView.findViewById<TextView>(R.id.tvName)
    var tvHandles: TextView =itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet: TextView =itemView.findViewById<TextView>(R.id.tvTweet)
    var tvNum1: TextView =itemView.findViewById<TextView>(R.id.tvNum1)
    var tvNum2: TextView =itemView.findViewById<TextView>(R.id.tvNum2)
    var tvNum3: TextView =itemView.findViewById<TextView>(R.id.tvNum3)
        }