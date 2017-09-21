package com.bwie.text;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Desc
 * Author 程茁燕
 * Time 2017/9/18.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    private Context context;
    private MyBean bean;

    public MyAdapter(Context context, MyBean bean) {
        this.context = context;
        this.bean = bean;
    }

    @Override
    public MyAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyHolder holder = new MyHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyAdapter.MyHolder holder, final int position) {
        holder.title.setText(bean.getTop_stories().get(position).getTitle());
        Glide.with(holder.img.getContext()).load(bean.getTop_stories().get(position).getImage())
                .into(holder.img);
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap bitmap = setimage(holder.img);
                Intent intent = new Intent(context, ImageActivity.class);
                intent.putExtra("image", bitmap);
                context.startActivity(intent);
            }
        });
    }

    private Bitmap setimage(ImageView img) {
        Bitmap image = ((BitmapDrawable)img.getDrawable()).getBitmap();
        Bitmap bitmap1 = Bitmap.createBitmap(image);
        return bitmap1;
    }

    @Override
    public int getItemCount() {
        return bean.getTop_stories().size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView img;

        public MyHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            img = (ImageView) itemView.findViewById(R.id.img);
        }
    }

}
