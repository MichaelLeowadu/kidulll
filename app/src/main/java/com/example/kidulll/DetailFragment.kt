package com.example.kidulll

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class DetailFragment : Fragment() {
    private val childTitle: TextView?
        get() = view?.findViewById(R.id.child_list)
    private val childDesc: TextView?
        get() = view?.findViewById(R.id.child_desc)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val childId = arguments?.getInt(CHILD_ID, 0) ?: 0
        setChildData(childId)
    }
    fun setChildData(id: Int){
        when(id){
            R.id.tom -> {
                childTitle?.text = getString(R.string.tom_title)
                childDesc?.text = getString(R.string.tom_desc)
            }
            R.id.jerry -> {
                childTitle?.text = getString(R.string.jerry_title)
                childDesc?.text = getString(R.string.jerry_desc)
            }
            R.id.spike -> {
                childTitle?.text = getString(R.string.spike_title)
                childDesc?.text = getString(R.string.spike_desc)
            }
        }
    }
    companion object {
        private const val CHILD_ID = "CHILD_ID"
    }
}