package com.example.choretracker.ui.fragments.house

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.choretracker.R
import com.example.choretracker.viewmodels.HouseViewModel

class AddHouseFragment : Fragment() {

    companion object {
        fun newInstance() = AddHouseFragment()
    }

    private lateinit var viewModel: HouseViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_house_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HouseViewModel::class.java)
        // TODO: Use the ViewModel
    }

}