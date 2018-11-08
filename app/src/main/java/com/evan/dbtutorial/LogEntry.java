package com.evan.dbtutorial;

import android.provider.BaseColumns;

public class LogEntry implements BaseColumns {
    public static final String TABLE_NAME = "logEntries";

    public static final String COLUMN_NAME_ENTRY = "entry";

    public static final String COLUMN_NAME_TIMESTAMP = "timeStamp";
}
