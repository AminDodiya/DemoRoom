package demo.com.demoroom;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class User {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int userId;

    @ColumnInfo(name="userEmail")
    private String userEmail;

    @ColumnInfo(name="phone")
    private int phone;

    @NonNull
    public int getUserId() {
        return userId;
    }

    public void setUserId(@NonNull int userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public User() {
    }
}
 
