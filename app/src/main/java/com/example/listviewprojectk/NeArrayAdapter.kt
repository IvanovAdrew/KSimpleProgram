package com.example.listviewprojectk

import android.content.Context;
import androidx.annotation.DrawableRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NeArrayAdapter : ArrayAdapter<Product> {

    private lateinit var listener: ProductAmountChangesListener

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }
    constructor(context: Context,resource: Int,products: Array<Product>) : super(context, resource, products)
    fun srtListener(listener: ProductAmountChangesListener){
        this.listener=listener
    }

    interface ProductAmountChangesListener {
        fun onChanged()
    }
}