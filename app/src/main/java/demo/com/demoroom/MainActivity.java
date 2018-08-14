package demo.com.demoroom;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText etEmail;
    EditText etPhone;
    Button btnSubmit;


    private MovieDatabase movieDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etEmail = findViewById(R.id.et_email);
        etPhone = findViewById(R.id.et_phone);
        btnSubmit = findViewById(R.id.btnsubmit);


        movieDatabase = Room.databaseBuilder(getApplicationContext(),
                MovieDatabase.class, "user-database")

                .build();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        User user = new User();
                        user.setUserEmail("dodiyaamin@gmail.comn");
                        user.setPhone(888888888);

                        movieDatabase.daoAccess ().insertOnlySingleMovie (user);

                        List<User> userList = movieDatabase.daoAccess().getAll();
                    }
                }) .start();


            }
        });
    }
}
