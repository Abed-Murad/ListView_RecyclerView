package com.abdallahmurad.listview_recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView1);

        // Simple List View
        final List<String> names = new ArrayList<>();
        names.add("Abdallah");
        names.add("Murad");
        names.add("Ali");
        names.add("Amjed");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.listview_layout,R.id.textView1, names);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });
        //listView.setAdapter(adapter);

        //Advance List View
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Abdallah", "22", R.drawable.avatar1));
        employees.add(new Employee("Murad", "25", R.drawable.avatar2));
        employees.add(new Employee("Amjed", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed2d", "35", R.drawable.avatar3));
        employees.add(new Employee("Amjed1", "55", R.drawable.avatar3));
        employees.add(new Employee("Amjed3", "45", R.drawable.avatar3));

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), employees, R.layout.list_view_advance);
        listView.setAdapter(customAdapter);
        

    }
}
