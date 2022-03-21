package com.moon.booklove_android.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.moon.booklove_android.R
import com.moon.booklove_android.activity.CollectActivity
import com.moon.booklove_android.databinding.FragmentCollectAgeBinding

class CollectAgeFragment  : Fragment(){
    private lateinit var binding: FragmentCollectAgeBinding
    private lateinit var nextButton: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCollectAgeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nextButton = (activity as CollectActivity).findViewById(R.id.nextStepButton)
        nextButton.setBackgroundResource(R.drawable.dark_box_rectangle)
        binding.teenagerButton.setOnClickListener {
            clickButton(binding.teenagerButton)
        }
        binding.twentiesButton.setOnClickListener {
            clickButton(binding.twentiesButton)
        }
        binding.thirtiesButton.setOnClickListener {
            clickButton(binding.thirtiesButton)
        }
        binding.fourtiesButton.setOnClickListener {
            clickButton(binding.fourtiesButton)
        }
        binding.fiftiesButton.setOnClickListener {
            clickButton(binding.fiftiesButton)
        }

        nextButton.setOnClickListener {
            (activity as CollectActivity).openFragment(3)
        }

    }

    private fun clickButton(clickedButton: AppCompatButton){
        binding.teenagerButton.setBackgroundResource(R.drawable.light_box_rectangle)
        binding.twentiesButton.setBackgroundResource(R.drawable.light_box_rectangle)
        binding.thirtiesButton.setBackgroundResource(R.drawable.light_box_rectangle)
        binding.fourtiesButton.setBackgroundResource(R.drawable.light_box_rectangle)
        binding.fiftiesButton.setBackgroundResource(R.drawable.light_box_rectangle)
        clickedButton.setBackgroundResource(R.drawable.dark_box_rectangle)
        nextButton.setBackgroundResource(R.drawable.complete_rectangle)
    }


}