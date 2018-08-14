package demo.com.demoroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;



@Dao
public interface DaoAccess {

    @Query("SELECT * FROM user")
    List<User> getAll();

    @Insert
    void insertOnlySingleMovie(User movies);

    @Insert
    void insertMultipleUser(List<User> moviesList);

    @Query("SELECT * FROM User WHERE userId = :userDataId")
    User fetchOneUserbyMovieId(int userDataId);

    @Update
    void updateMovie(User movies);

    @Delete
    void deleteMovie(User movies);

}