package com.myapp.qingqiaohu.trippple.view.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;


public class baseViewHolder extends RecyclerView.ViewHolder {
    public baseViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
