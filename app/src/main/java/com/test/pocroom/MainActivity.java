package com.test.pocroom;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.test.pocroom.DataBaseRoom.AppDatabase;
import com.test.pocroom.DataBaseRoom.User;
import com.test.pocroom.DataBaseRoom.UserDao;


public class MainActivity extends AppCompatActivity {

    Button btnSave;
    Button btnShowAll;
    EditText txtId;
    EditText txtName;
    EditText txtLastName;
    EditText txtUserName;

    private UserDao userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "pocroom_database").allowMainThreadQueries().build(); //Warning: is not recommend use .allowMainThreadQueries()

        userDao = db.userDao();

        btnSave = (Button)findViewById(R.id.btnAdd);
        btnShowAll = (Button) findViewById(R.id.btnShowAll);
        txtId = (EditText) findViewById(R.id.txtId);
        txtName = (EditText) findViewById(R.id.txtFirstName);
        txtLastName = (EditText) findViewById(R.id.txtLastName);
        txtUserName = (EditText) findViewById(R.id.txtUserName);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddUser();
            }
        });

        btnShowAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main2Activity.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    private void AddUser() {
        User user = new User();
        user.uid  = Integer.parseInt(txtId.getText().toString());
        user.firstName= txtName.getText().toString();
        user.lastName=txtLastName.getText().toString();
        user.username=txtUserName.getText().toString();

        try
        {
            //Insert into users tables.
            userDao.insertAll(user);

            txtId.setText("");
            txtName.setText("");
            txtLastName.setText("");
            txtUserName.setText("");
        }
        catch (Exception ex)
        {
            String error = ex.getMessage();
        }

    }
}
