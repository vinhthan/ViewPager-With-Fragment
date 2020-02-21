package com.example.viewpage1

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.layout1.view.*


class ViewPagerAdapter(val mContext: Context) : PagerAdapter(), View.OnClickListener {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(mContext)
        val layout: View = when (position) {
            0 -> inflater.inflate(R.layout.layout1, container, false)
            1 -> inflater.inflate(R.layout.layout2, container, false)
            2 -> inflater.inflate(R.layout.layout3, container, false)
            else -> inflater.inflate(R.layout.layout1, container, false)
        }
        layout.btnclose.tag = position
        layout.btnclose.setOnClickListener(this)

        container.addView(layout)
        return layout

    }

    override fun getCount(): Int {
        return 3
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
        container.removeView(`object` as View)
    }

    override fun onClick(p0: View?) {
        if (p0 != null) {
            val tag = p0.tag as Int
            Log.d("AA", "${tag + 1}")


        }
    }
}


