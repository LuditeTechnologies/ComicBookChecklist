package com.luditetechnologies.comicbookchecklist.core;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.luditetechnologies.comicbookchecklist.R;
import com.luditetechnologies.comicbookchecklist.UI.SingleItemView;
import com.luditetechnologies.comicbookchecklist.classes.IssueTitle;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    // Declare Variables
    Context context;
    LayoutInflater inflater;
    //ImageLoader imageLoader;
    private List<IssueTitle> titleList = null;
    private ArrayList<IssueTitle> arraylist;

    public ListViewAdapter(Context context, List<IssueTitle> titleList) {
        this.context = context;
        this.titleList = titleList;
        inflater = LayoutInflater.from(context);
        //imageLoader = new ImageLoader(context);
    }

    public class ViewHolder {
        TextView title;
        TextView publisher;
        ImageView cover;
    }

    @Override
    public int getCount() {
        return titleList.size();
    }

    @Override
    public Object getItem(int position) {
        return titleList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.listview_item, null);
            holder.title = (TextView) view.findViewById(R.id.titleValue);
            holder.publisher = (TextView) view.findViewById(R.id.publisherValue);
            //holder.cover = (ImageView) view.findViewById(R.id.cover);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews
        holder.title.setText(titleList.get(position).GetTitle());
        holder.publisher.setText(titleList.get(position).GetPublisher());
        //imageLoader.DisplayImage(issueList.get(position).getFlag(), holder.flag);

        // Listen for ListView Item Click
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, SingleItemView.class);
                intent.putExtra("title", titleList.get(position).GetTitle());
                intent.putExtra("publisher",titleList.get(position).GetPublisher());
                //intent.putExtra("flag",(issueList.get(position).getFlag()));
                // Start SingleItemView Class
                context.startActivity(intent);
            }
        });
        return view;
    }
}
