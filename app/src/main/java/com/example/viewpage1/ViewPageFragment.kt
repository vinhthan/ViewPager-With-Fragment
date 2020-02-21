package com.example.viewpage1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager

/**
 * A simple [Fragment] subclass.
 */
class ViewPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_view_page, container, false)

        val viewPager = view.findViewById<ViewPager>(R.id.viewpager)
        viewPager.offscreenPageLimit = 3
        if (viewPager != null) {
            val adapter = fragmentManager?.let { ViewPagerAdapter(context!!) }
            viewPager.adapter = adapter
        }

        return view
    }
}
