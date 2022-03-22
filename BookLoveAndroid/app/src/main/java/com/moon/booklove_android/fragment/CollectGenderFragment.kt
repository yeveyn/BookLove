package com.moon.booklove_android.fragment

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.moon.booklove_android.R
import com.moon.booklove_android.activity.CollectActivity
import com.moon.booklove_android.databinding.FragmentCollectGenderBinding

class CollectGenderFragment  : Fragment(){
    private lateinit var binding: FragmentCollectGenderBinding
    private lateinit var nextButton: AppCompatButton
    var isClicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCollectGenderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nextButton = (activity as CollectActivity).findViewById(R.id.nextStepButton)
        binding.maleButton.apply {
            setOnClickListener {
                isClicked = true
                setBackgroundResource(R.drawable.dark_box_rectangle)
                binding.femaleButton.setBackgroundResource(R.drawable.light_box_rectangle)
                nextButton.setBackgroundResource(R.drawable.complete_rectangle)
            }
        }
        binding.femaleButton.apply {
            setOnClickListener {
                isClicked = true
                setBackgroundResource(R.drawable.dark_box_rectangle)
                binding.maleButton.setBackgroundResource(R.drawable.light_box_rectangle)
                nextButton.setBackgroundResource(R.drawable.complete_rectangle)
            }
        }

        nextButton.setOnClickListener {
            //companion object에 gender 저장

            if(isClicked){
                (activity as CollectActivity).openFragment(2)
            }else{
                Toast.makeText(context, "성별을 선택해주세요", Toast.LENGTH_SHORT).show()
            }
        }

    }
}