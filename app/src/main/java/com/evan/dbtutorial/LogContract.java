package com.evan.dbtutorial;

public class LogContract {

    protected static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + LogEntry.TABLE_NAME + " (" +
                    LogEntry._ID + " INTEGER PRIMARY KEY," +
                    LogEntry.COLUMN_NAME_ENTRY + " TEXT," +
                    LogEntry.COLUMN_NAME_TIMESTAMP + " REAL";

    protected static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + LogEntry.TABLE_NAME;

    private LogContract(){

    }
}
