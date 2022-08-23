package com.example.practicerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practicerecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val rvAdapter = ProfileAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        rvAdapter.addData(R.drawable.man, "홍드로이드", 23, "안드로이드 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "안드로이드", 27, "아이폰 앱 개발자")
        rvAdapter.addData(R.drawable.man, "김드로이드", 24, "리액트 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "신드로이드", 28, "유니티 앱 개발자")
        rvAdapter.addData(R.drawable.man, "이드로이드", 20, "알고리즘 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "최드로이드", 22, "웹 앱 개발자")
        rvAdapter.addData(R.drawable.man, "문드로이드", 26, "그냥 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "민드로이드", 21, "배고픈 앱 개발자")
        rvAdapter.addData(R.drawable.man, "공드로이드", 25, "틀린 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "정드로이드", 29, "자바 앱 개발자")
        rvAdapter.addData(R.drawable.man, "고드로이드", 30, "하이브리드 앱 개발자")
        rvAdapter.addData(R.drawable.man, "홍드로이드", 23, "안드로이드 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "안드로이드", 27, "아이폰 앱 개발자")
        rvAdapter.addData(R.drawable.man, "김드로이드", 24, "리액트 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "신드로이드", 28, "유니티 앱 개발자")
        rvAdapter.addData(R.drawable.man, "이드로이드", 20, "알고리즘 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "최드로이드", 22, "웹 앱 개발자")
        rvAdapter.addData(R.drawable.man, "문드로이드", 26, "그냥 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "민드로이드", 21, "배고픈 앱 개발자")
        rvAdapter.addData(R.drawable.man, "공드로이드", 25, "틀린 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "정드로이드", 29, "자바 앱 개발자")
        rvAdapter.addData(R.drawable.man, "고드로이드", 30, "하이브리드 앱 개발자")
        rvAdapter.addData(R.drawable.man, "홍드로이드", 23, "안드로이드 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "안드로이드", 27, "아이폰 앱 개발자")
        rvAdapter.addData(R.drawable.man, "김드로이드", 24, "리액트 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "신드로이드", 28, "유니티 앱 개발자")
        rvAdapter.addData(R.drawable.man, "이드로이드", 20, "알고리즘 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "최드로이드", 22, "웹 앱 개발자")
        rvAdapter.addData(R.drawable.man, "문드로이드", 26, "그냥 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "민드로이드", 21, "배고픈 앱 개발자")
        rvAdapter.addData(R.drawable.man, "공드로이드", 25, "틀린 앱 개발자")
        rvAdapter.addData(R.drawable.woman, "정드로이드", 29, "자바 앱 개발자")
        rvAdapter.addData(R.drawable.man, "고드로이드", 30, "하이브리드 앱 개발자")


        binding.rvProfile.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvProfile.setHasFixedSize(true)

        binding.rvProfile.adapter = rvAdapter

    }
}