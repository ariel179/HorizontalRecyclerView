package com.example.ariel.horizontalrecyclerview;

/**
 * Created by Ariel on 3/25/2016.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder> {


    ArrayList<String> array = new ArrayList<>();

    public CustomRecyclerAdapter(ArrayList<String> array){

        this.array = array;

    }

    @Override
    public CustomRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        //Called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent an item.

        //inflating the row layout we created earlier
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.image_row, parent, false);

        //making a ViewHolder object with the view we just inflated
        ViewHolder vh = new ViewHolder(v);


        return vh;
    }



    @Override
    public void onBindViewHolder(final CustomRecyclerAdapter.ViewHolder holder, final int position) {

        //setting the imageview with an image from my drawable resource folder
        holder.imageView.setImageResource(R.drawable.android_image);

        //retrieving the string from the array at the right position and setting the textview under the imageview
        holder.imageNumberView.setText(array.get(position));



    }

    @Override
    public int getItemCount(){



        return array.size();

    }



    public static class ViewHolder extends RecyclerView.ViewHolder {

        //reference to the row view
        public View view;

        //reference to a ImageView and textview in our row
        ImageView imageView;

        TextView imageNumberView;

        //constructing the viewHolder
        public ViewHolder(View v) {
            super(v);
            view = v;
            imageView = (ImageView) v.findViewById(R.id.imageView);
            imageNumberView = (TextView) v.findViewById(R.id.textView);

        }
    }

}
