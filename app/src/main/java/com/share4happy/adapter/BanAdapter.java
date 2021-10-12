package com.share4happy.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.share4happy.R;
import com.share4happy.model.Ban;

import java.util.ArrayList;
import java.util.List;

public class BanAdapter extends ArrayAdapter<Ban> {
    Activity context;
    int resource;
    @NonNull List<Ban> objects;
    public BanAdapter(@NonNull Activity context, int resource, @NonNull List<Ban> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View row, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        row = layoutInflater.inflate(this.resource,null);

        TextView _soban = row.findViewById(R.id.txt_soban);
        ImageView _img = row.findViewById(R.id.imageView);

        Ban ban = this.objects.get(position);
        _soban.setText(ban.get_soBan());
        _img.setImageResource(ban.get_LinkAnh());

        return row;
    }
}
