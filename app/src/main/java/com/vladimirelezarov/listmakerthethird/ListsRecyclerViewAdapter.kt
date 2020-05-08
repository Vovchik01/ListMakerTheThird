package com.vladimirelezarov.listmakerthethird

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListsRecyclerViewAdapter : RecyclerView.Adapter<ListsViewHolder>() {

    var topNames = listOf("Vovchik", "Nikiton", "Petruha", "Slavka")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.lists_view_holder, parent, false)

        return ListsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return topNames.size
    }

    override fun onBindViewHolder(holder: ListsViewHolder, position: Int) {
        holder.namePosition.text = (position + 1).toString()
        holder.topName.text = topNames[position]
    }
}