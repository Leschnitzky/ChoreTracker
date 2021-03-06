package com.example.choretracker.ui.fragments.chore

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.choretracker.R
import com.example.choretracker.viewmodels.ChoreViewModel

class ChoreFragment : Fragment() {

    companion object {
        fun newInstance() = ChoreFragment()
    }

    private lateinit var viewModel: ChoreViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.chore_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChoreViewModel::class.java)
        // TODO: Use the ViewModel
    }

}