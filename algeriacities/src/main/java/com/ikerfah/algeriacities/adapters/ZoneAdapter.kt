package com.ikerfah.algeriacities.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.widget.AppCompatTextView
import com.ikerfah.algeriacities.R
import com.ikerfah.algeriacities.models.Zone
import kotlinx.android.synthetic.main.item_text.view.*

class ZoneAdapter<T : Zone> : BaseAdapter {

    companion object {
        val LANG_AR: String = "arabic"
        val LANG_FR: String = "french"
    }

    private var mContext:Context
    private var mItems: ArrayList<T> = arrayListOf()
    private var lang: String = LANG_FR

    constructor(context: Context, items: ArrayList<T>, defaultLanguage: String?) : super() {
        this.mContext = context
        this.mItems = items
        this.lang = defaultLanguage?: LANG_FR
    }



    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View
        val viewHolder : ViewHolder
        if (convertView == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_text, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }
        viewHolder.name.text = if (lang == LANG_FR) mItems[position].nomFr else mItems[position].nomAr
        return view
    }

    override fun getItem(p0: Int): Any {
        return mItems[p0]

    }

    override fun getItemId(p0: Int): Long {
        return mItems[p0].id.toLong()
    }

    override fun getCount(): Int {
        return if (mItems != null) mItems.size else 0
    }

    private inner class ViewHolder{
         var name : AppCompatTextView

         constructor(row: View){
            name = row.text_name
        }

    }


}