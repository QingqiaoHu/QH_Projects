package com.myapp.qingqiaohu.trippple.view.bucket_list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.myapp.qingqiaohu.trippple.R;
import com.myapp.qingqiaohu.trippple.view.base.baseViewHolder;

import butterknife.BindView;


public class BucketViewHolder extends baseViewHolder {
    @BindView(R.id.bucket_layout) View bucketLayout;
    @BindView(R.id.bucket_name) TextView bucketName;
    @BindView(R.id.bucket_shot_count) TextView bucketCount;
    @BindView(R.id.bucket_shot_chosen) ImageView bucketChosen;

    public BucketViewHolder(View itemView) {
        super(itemView);
    }
}
