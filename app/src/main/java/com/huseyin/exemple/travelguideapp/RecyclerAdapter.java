package com.huseyin.exemple.travelguideapp;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Huseyin on 29.03.2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private String []titles={
            "Travel 1",
            "Travel 2",
            "Travel 3",
            "Travel 4",
            "Travel 5"
    };
    private String[] description = {
            "Description 1",
            "Description 2",
            "Description 3",
            "Description 4",
            "Description 5"
    };
    private String[] tag = {
            "Tag1",
            "Tag2",
            "Tag3",
            "Tag4",
            "Tag5"
    };
    private int[] image = {
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5
    };

    class ViewHolder extends RecyclerView.ViewHolder{
        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDescription;

        public ViewHolder(View itemView){
            super(itemView);
            itemImage = (ImageView) itemView.findViewById(R.id.imageView);
            itemTitle = (TextView) itemView.findViewById(R.id.textView);
            itemDescription = (TextView) itemView.findViewById(R.id.textView2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();

                    Snackbar.make(view," Click detected on item "+ position,Snackbar.LENGTH_LONG).setAction("Action",null).show();

                }
            });
        }

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lyo_travel_cardview,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder,int i){
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemImage.setImageResource(image[i]);
    }
    @Override
    public int getItemCount(){
        return titles.length;
    }
}
