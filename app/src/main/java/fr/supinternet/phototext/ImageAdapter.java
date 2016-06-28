package fr.supinternet.phototext;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ImageAdapter extends BaseAdapter {


    Context context;

    private List<String> image;

    private LayoutInflater inflater;

    public ImageAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return image != null ? image.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return image != null ? image.get(position) : 0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void add(String s) {
        if (image == null) {
            image = new ArrayList<>();
        }

        image.add(s);
        notifyDataSetChanged();
    }

    private class ViewHolder{
        ImageView imageView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null){
            holder = new ViewHolder();

            convertView = inflater.inflate(R.layout.image_layout, parent, false);

            holder.imageView = (ImageView) convertView.findViewById(R.id.picture);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        String image = (String) getItem(position);

        Picasso.with(convertView.getContext()).load(image)
                .resize(300, 300)
                .centerCrop()
                .into(holder.imageView);
        return convertView;
    }
}