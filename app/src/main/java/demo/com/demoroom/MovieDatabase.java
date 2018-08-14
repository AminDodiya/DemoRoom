package demo.com.demoroom;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {User.class}, version = 1, exportSchema = false)
 public abstract class MovieDatabase extends RoomDatabase {
 public abstract DaoAccess daoAccess() ;
 }