package com.luditetechnologies.comicbookchecklist.core;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.luditetechnologies.comicbookchecklist.R;
import com.luditetechnologies.comicbookchecklist.UI.SingleItemView_Marvel_Character;
import com.luditetechnologies.comicbookchecklist.classes.MarvelCharacter;

import java.io.InputStream;
import java.util.List;

public class CharacterListViewAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    ImageLoader imageLoader;
    private List<MarvelCharacter> _characters = null;

    public CharacterListViewAdapter(Context context, List<MarvelCharacter> characterList) {
        this.context = context;
        _characters = characterList;
        inflater = LayoutInflater.from(context);
        imageLoader = new ImageLoader(context);
    }

    public class ViewHolder {
        TextView name;
        ImageView thumbnail;
    }

    @Override
    public int getCount() {
        return _characters.size();
    }

    @Override
    public Object getItem(int position) {
        return _characters.get(position);
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
            holder.thumbnail = (ImageView) view.findViewById(R.id.thumbNail);

            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }


        holder.name.setText(_characters.get(position).GetName());

        if(_characters.get(position).GetThumbnailPath_xlarge() != null && _characters.get(position).GetThumbnailExtension() != null) {
            //String fullImagePath = _characters.get(position).GetThumbnailPath() + "/portrait_xlarge." + _characters.get(position).GetThumbnailExtension();
            //Log.i("image_path_for " + _characters.get(position).GetName(), fullImagePath);

            //new DownloadImageTask(holder.thumbnail).execute(fullImagePath);
            try {
                holder.thumbnail.setImageBitmap(_characters.get(position).GetThumbnail_xlarge());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            Log.i("image_path_for " + _characters.get(position).GetName(), "was skipped because of null");
        }


        // Listen for ListView Item Click
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, SingleItemView_Marvel_Character.class);
                intent.putExtra("name", _characters.get(position).GetName());
                intent.putExtra("imagePath", _characters.get(position).GetThumbnailPath_xlarge());

                // Start SingleItemView Class
                context.startActivity(intent);
            }
        });
        return view;
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}
