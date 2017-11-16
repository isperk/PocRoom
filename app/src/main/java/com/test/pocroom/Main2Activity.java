package com.test.pocroom;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.test.pocroom.DataBaseRoom.AppDatabase;
import com.test.pocroom.DataBaseRoom.User;
import com.test.pocroom.DataBaseRoom.UserDao;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private UserDao userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView list;
        ArrayAdapter<String> adapt;
        ArrayList<String> values = new ArrayList<String>();

        list = findViewById(R.id.listView);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "pocroom_database").allowMainThreadQueries().build(); //Warning: is not recommend use .allowMainThreadQueries()

        userDao = db.userDao();

        //Get all users from dao.
        List<User> usersList = userDao.getAll();

        //Add the firstname - if you nedd show more values, create a custom adapter.
        for (User item : usersList) {
            values.add(item.firstName.toString());
        }

        adapt = new ArrayAdapter<String>(this,android.R.layout.activity_list_item, android.R.id.text1, values);

        list.setAdapter(adapt);
    }
}
