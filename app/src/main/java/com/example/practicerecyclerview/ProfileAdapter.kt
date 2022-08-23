package com.example.practicerecyclerview

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.practicerecyclerview.databinding.ListItemBinding
import java.util.*
import kotlin.collections.ArrayList

class ProfileAdapter : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>() {
    private val profileList= arrayListOf<Profiles>()
    private val userCheckBoxStatus = arrayListOf<UserCheckStatus>()

    fun removeData(position: Int){
        profileList.removeAt(position)
        notifyItemRemoved(position)
    }

    fun swapData(fromPos: Int, toPos: Int){
        Collections.swap(profileList, fromPos, toPos)
        notifyItemMoved(fromPos, toPos)
    }


    fun addData(gender: Int, name: String, age: Int, job: String) {
        profileList.add(Profiles(gender, name, age, job))
        userCheckBoxStatus.add(UserCheckStatus((profileList.size - 1), false))
        notifyItemInserted(profileList.size-1)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(ListItemBinding.bind(view))
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bind(profileList[position], userCheckBoxStatus[position])
    }

    override fun getItemCount() = profileList.size

    class CustomViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(profile: Profiles, userStatus: UserCheckStatus) = with(binding){
            ivProfile.setImageResource(profile.gender)
            tvName.text = profile.name
            tvAge.text = profile.age.toString()
            tvJob.text = profile.job
            tvNum.text = "${layoutPosition}번째"

            checkBox.isChecked = userStatus.isChecked

            itemlayout.setOnClickListener {
                Toast.makeText(it.context,"이름 : ${profile.name}\n나이 : ${profile.age}\n직업 : ${profile.job}", Toast.LENGTH_SHORT).show()
            }

            checkBox.setOnClickListener {
                userStatus.isChecked = checkBox.isChecked
            }
        }
    }

}