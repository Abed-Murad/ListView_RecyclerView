package com.abdallahmurad.listview_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by AbdallahMurad on 7/13/2017.
 */

public class CustomAdapter extends BaseAdapter {
    List<Employee> employees;
    int layout;
    Context context;

    public CustomAdapter(Context context, List<Employee> employees, int layout) {
        this.employees = employees;
        this.layout = layout;
        this.context = context;
    }

    @Override
    public int getCount() {
        return employees.size();
    }

    @Override
    public Object getItem(int position) {
        return employees.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        final Employee tmpEmployee = employees.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layout, parent, false);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.profile_image);
            TextView name = (TextView) convertView.findViewById(R.id.name);
            TextView age = (TextView) convertView.findViewById(R.id.age);
            Button deleteBtn = (Button) convertView.findViewById(R.id.deleteBtn);
            //ViewHolder
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.imageView = imageView;
            viewHolder.name = name;
            viewHolder.age = age;
            deleteBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, tmpEmployee.getName(), Toast.LENGTH_SHORT).show();
                    employees.remove(position);
                    notifyDataSetChanged();
                }
            });

            convertView.setTag(viewHolder);

        }



        ViewHolder viewHolder = (ViewHolder) convertView.getTag();

        viewHolder.imageView.setImageResource(tmpEmployee.getImgId());
        viewHolder.name.setText(tmpEmployee.getName());
        viewHolder.age.setText(tmpEmployee.getAge());
        return convertView;
    }

    private class ViewHolder{
        ImageView imageView;
        TextView name ;
        TextView age;

    }
}
