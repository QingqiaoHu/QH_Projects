package com.myapp.qingqiaohu.trippple.view.shot_list;

import android.view.View;
import android.widget.TextView;

import com.myapp.qingqiaohu.trippple.R;
import com.myapp.qingqiaohu.trippple.view.base.baseViewHolder;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;


class ShotViewHolder extends baseViewHolder {

    @BindView(R.id.shot_clickable_cover) public View cover;
    @BindView(R.id.shot_like_count) public TextView likeCount;
    @BindView(R.id.shot_bucket_count) public TextView bucketCount;
    @BindView(R.id.shot_view_count) public TextView viewCount;
    @BindView(R.id.shot_image) public SimpleDraweeView image;
//    @BindView(R.id.shot_image) public ImageView image;

    public ShotViewHolder(View itemView) {
        super(itemView);
    }
}