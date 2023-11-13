package com.example.kidulll

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

class ListFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val childList = listOf<View>(
            view.findViewById(R.id.tom),
            view.findViewById(R.id.jerry),
            view.findViewById(R.id.spike)
        )
        childList.forEach { child ->
            val fragmentBundle = Bundle()
            fragmentBundle.putInt(CHILD_ID, child.id)
            child.setOnClickListener(
                Navigation.createNavigateOnClickListener(
                    R.id.action_listFragment_to_detailFragment,
                    fragmentBundle
                )
            )
        }
    }

    companion object {
        const val CHILD_ID = "CHILD_ID"
    }
}