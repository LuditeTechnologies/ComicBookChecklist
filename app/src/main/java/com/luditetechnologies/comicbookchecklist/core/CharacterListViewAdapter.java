package com.luditetechnologies.comicbookchecklist.core;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.luditetechnologies.comicbookchecklist.R;
import com.luditetechnologies.comicbookchecklist.UI.SingleItemView_Marvel_Character;
import com.luditetechnologies.comicbookchecklist.classes.MarvelCharacter;

import java.util.List;

public class CharacterListViewAdapter extends BaseAdapter {

    // Declare Variables
    Context context;
    LayoutInflater inflater;
    //ImageLoader imageLoader;
    private List<MarvelCharacter> characterList = null;

    public CharacterListViewAdapter(Context context, List<MarvelCharacter> characterList) {
        this.context = context;
        this.characterList = characterList;
        inflater = LayoutInflater.from(context);
        //imageLoader = new ImageLoader(context);
    }

    public class ViewHolder {
        TextView name;
    }

    @Override
    public int getCount() {
        return characterList.size();
    }

    @Override
    public Object getItem(int position) {
        return characterList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.listview_item_marvel_character, null);
            holder.name = (TextView) view.findViewById(R.id.nameValue);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews
        holder.name.setText(characterList.get(position).GetName());

        // Listen for ListView Item Click
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, SingleItemView_Marvel_Character.class);
                intent.putExtra("name", characterList.get(position).GetName());

                // Start SingleItemView Class
                context.startActivity(intent);
            }
        });
        return view;
    }
}
