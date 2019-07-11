package com.chltec.module_day_6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @author Rair
 * @date 2019/7/11
 * <p>
 * desc:
 */
public class MyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<WechatMessage> datas;

    private onMyItemClickListener listener;

    public MyAdapter setListener(onMyItemClickListener listener) {
        this.listener = listener;
        return this;
    }

    public MyAdapter(Context context, ArrayList<WechatMessage> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_simple_item_2, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        WechatMessage wechatMessage = datas.get(position);
        viewHolder.ivAvatar.setImageResource(wechatMessage.getAvatar());
        viewHolder.tvName.setText(wechatMessage.getName());
        viewHolder.tvDate.setText(wechatMessage.getDate());
        viewHolder.tvMessage.setText(wechatMessage.getMessage());

        return convertView;
//        View view = LayoutInflater.from(context).inflate(R.layout.layout_simple_item_2, parent, false);
//        ImageView ivAvatar = view.findViewById(R.id.iv_avatar);
//        TextView tvName = view.findViewById(R.id.tv_name);
//        TextView tvDate = view.findViewById(R.id.tv_date);
//        TextView tvMessage = view.findViewById(R.id.tv_message);
//
//        WechatMessage wechatMessage = datas.get(position);
//        ivAvatar.setImageResource(wechatMessage.getAvatar());
//        tvName.setText(wechatMessage.getName());
//        tvDate.setText(wechatMessage.getDate());
//        tvMessage.setText(wechatMessage.getMessage());
//        return view;
    }

    class ViewHolder {

        ImageView ivAvatar;
        TextView tvName, tvDate, tvMessage;

        public ViewHolder(View view) {
            ivAvatar = view.findViewById(R.id.iv_avatar);
            tvName = view.findViewById(R.id.tv_name);
            tvDate = view.findViewById(R.id.tv_date);
            tvMessage = view.findViewById(R.id.tv_message);
        }
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public interface onMyItemClickListener {

        void onItemClicked(int position);
    }

}
