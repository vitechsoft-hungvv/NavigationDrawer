package com.vohung.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataBaseHelper extends SQLiteOpenHelper {

	static final String DATABASE_CREATE = "CREATE TABLE [User] ([user_id] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,AVATAR TEXT  NULL,ID TEXT  NULL,IID TEXT  NOT NULL,LNAME TEXT  NULL,NAME TEXT  NULL,MAIL TEXT  NOT NULL,STATUS TEXT  NULL,UHASH TEXT  NULL,TOKEN TEXT  NULL)";

	public DataBaseHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DATABASE_CREATE);

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

		// Log the version upgrade.
		Log.w("TaskDBAdapter", "Upgrading from version " + oldVersion + " to "
				+ newVersion + ", which will destroy all old data");

		// Upgrade the existing database to conform to the new version. Multiple
		// previous versions can be handled by comparing _oldVersion and
		// _newVersion
		// values.
		// The simplest case is to drop the old table and create a new one.
		db.execSQL("DROP TABLE IF EXISTS " + "TEMPLATE");

		// Create a new one.
		onCreate(db);

	}

}
