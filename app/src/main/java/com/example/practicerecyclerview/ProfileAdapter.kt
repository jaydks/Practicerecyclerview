package com.example.practicerecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practicerecyclerview.databinding.ListItemBinding

class ProfileAdapter(val profileList: ArrayList<Profiles>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(ListItemBinding.bind(view)) // binding을 access하기 위해 ListItemBinding.bind(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.binding.ivProfile.setImageResource(profileList.get(position).gender)
        holder.binding.tvName.text = profileList.get(position).name
        holder.binding.tvAge.text = profileList.get(position).age.toString()
        holder.binding.tvJob.text = profileList.get(position).job
    }

    override fun getItemCount() = profileList.size

    class CustomViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root)

}