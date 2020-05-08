package com.vladimirelezarov.listmakerthethird

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val namePosition = itemView.findViewById(R.id.lvh_tv_position) as TextView
    val topName = itemView.findViewById(R.id.lvh_tv_top_name) as TextView
}