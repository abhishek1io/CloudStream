package com.lagradost.cloudstream3.ui.library

import android.view.View
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.library_viewpager_page.view.*

class LibraryScrollTransformer : ViewPager2.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        val padding = (-position * page.width).toInt()
        page.page_recyclerview.setPadding(
            padding, 0,
            -padding, 0
        )
    }
}

