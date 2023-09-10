package com.codingwithmitch.googlemaps2018;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


    public class imageadapter extends BaseAdapter {
        private Context mContext;

        // Constructor
        public imageadapter(Context c) {
            mContext = c;
        }

        public int getCount() {
            return mThumbIds.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        // create a new ImageView for each item referenced by the Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;

            if (convertView == null) {
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(8, 8, 8,8);
            }
            else
            {
                imageView = (ImageView) convertView;
            }
            imageView.setImageResource(mThumbIds[position]);
            return imageView;
        }

        // Keep all Images in array
        public Integer[] mThumbIds = {
                R.drawable.baseline_bookmark_24, R.drawable.baseline_bookmark_24,
                R.drawable.baseline_bookmark_24, R.drawable.baseline_bookmark_24,
                R.drawable.baseline_bookmark_24, R.drawable.baseline_bookmark_24,
                R.drawable.baseline_bookmark_24, R.drawable.baseline_bookmark_24
        };
    }
