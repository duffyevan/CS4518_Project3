package com.evan.dbtutorial;

import android.provider.BaseColumns;

public class LogEntry implements BaseColumns {
    public static final String TABLE_NAME = "logEntries";
    public static final String COLUMN_NAME_ENTRY = "entry";
    public static final String COLUMN_NAME_TIMESTAMP = "timeStamp";

    private String entry;
    private String timestamp;
    private String id;

    public LogEntry(String entry, String timestamp, String id){
        this.entry = entry;
        this.timestamp = timestamp;
        this.id = id;
    }

    public String getEntry(){
        return this.entry;
    }

    public String getID(){
        return this.id;
    }

    public String getTimeStamp(){
        return this.timestamp;
    }


}
