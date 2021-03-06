package com.jogger.beautifulapp.function.adapter;


import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jogger.beautifulapp.R;
import com.jogger.beautifulapp.entity.RecentAppData;

import java.util.List;

public class UserCommandAdapter extends BaseQuickAdapter<RecentAppData, BaseViewHolder> {
    public UserCommandAdapter(@Nullable List<RecentAppData> data) {
        super(R.layout.rv_find_recent_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, RecentAppData item) {
        Glide.with(mContext)
                .load(item.getIcon_image())
                .into((ImageView) helper.getView(R.id.iv_title));
        helper.setText(R.id.tv_title, item.getTitle());
        helper.setText(R.id.tv_sub_title, item.getSub_title());
        helper.setText(R.id.tv_show_times, String.valueOf(item.getShow_times()));
        helper.setText(R.id.tv_up_times, String.valueOf(item.getUp_times()));
        helper.setText(R.id.tv_common_times, String.valueOf(item.getComment_times()));
        helper.setText(R.id.tv_author_name, item.getAuthor_name());
        helper.setVisible(R.id.tv_author_name, false);
        helper.setVisible(R.id.iv_author_avatar, false);
        Glide.with(mContext)
                .load(item.getCover_image())
                .into((ImageView) helper.getView(R.id.iv_content));
    }
}
