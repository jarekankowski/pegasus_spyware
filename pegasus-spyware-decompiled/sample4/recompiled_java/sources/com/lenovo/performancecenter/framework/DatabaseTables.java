package com.lenovo.performancecenter.framework;

public class DatabaseTables {
    public static final String APPLICATIONS_APP_ICON = "appIcon";
    public static final String APPLICATIONS_APP_NAME = "appName";
    public static final String APPLICATIONS_FLAG = "flag";
    public static final String APPLICATIONS_PKG_NAME = "pkgName";
    public static final String APPLICATIONS_PROC_NAME = "procName";
    public static final String APPLICATIONS_STATE = "state";
    public static final String APPLICATIONS_TABLE_NAME = "ApplicationsInfo";
    public static final String APP_ID = "App_Id";
    public static final String BOOTCOMPLETED_ITEM_APPNAME = "appName";
    public static final String BOOTCOMPLETED_ITEM_CLSNAME = "clsName";
    public static final String BOOTCOMPLETED_ITEM_CUSTOMER_STATE = "customer_state";
    public static final String BOOTCOMPLETED_ITEM_PKGNAME = "pkgName";
    public static final String BOOTCOMPLETED_ITEM_PRONAME = "proName";
    public static final String BOOTCOMPLETED_ITEM_STATE = "state";
    public static final String BOOTCOMPLETED_TABLE_NAME = "BootCom";
    public static final String Create_BootCompleted_Table = "create table BootCom(_id integer primary key autoincrement,pkgName VARCHAR,clsName VARCHAR,appName VARCHAR,proName VARCHAR,state INTEGER,customer_state INTEGER);";
    public static final String Create_Log_Table = "create table LogData(_id integer primary key autoincrement,timestamp DATETIME DEFAULT (datetime(current_timestamp,'localtime')), tag integer not null,data_type integer not null,message text not null,notification integer,action text);";
    public static final String Create_UsedAppInfo_Table = "create table UsedApplication(App_Id integer primary key autoincrement,Uid integer not null,Package_Name text unique not null,Process_Name text not null,Importance integer,Last_Running_Time text,Last_Foreground text,Exception_Num integer);";
    public static final String Create_WhiteListInfo_Table = "create table WhiteList(Package_Name_Id integer primary key autoincrement,Process_Name text unique not null,Process_Type text);";
    public static final String Create_applications_Table = "create table ApplicationsInfo(_id integer primary key autoincrement,pkgName varchar(40),appName varchar(60),appIcon integer,procName varchar(60),state integer,flag integer);";
    public static final int ERROR = 233;
    public static final String EXCEPTION_NUM = "Exception_Num";
    public static final String IMPORTANCE = "Importance";
    public static final int INFORMATION = 221;
    public static final String LAST_FOREGROUND = "Last_Foreground";
    public static final String LAST_RUNNING_TIME = "Last_Running_Time";
    public static final String LOG_ACTION = "action";
    public static final String LOG_DATA_TYPE = "data_type";
    public static final String LOG_ID = "_id";
    public static final String LOG_MESSAGE = "message";
    public static final String LOG_NOTIFICATION = "notification";
    public static final String LOG_TABLE_NAME = "LogData";
    public static final String LOG_TAG = "tag";
    public static final String LOG_TIMESTAMP = "timestamp";
    public static final String PACKAGE_NAME = "Package_Name";
    public static final String PROCESS_NAME = "Process_Name";
    public static final String SYSTEM_MARK = "1";
    public static final String UID = "Uid";
    public static final String USER_MARK = "2";
    public static final String UsedAppInfo_TABLE_NAME = "UsedApplication";
    public static final int WARNING = 234;
    public static final String WHITE_ID = "Package_Name_Id";
    public static final String WHITE_PROCESS_NAME = "Process_Name";
    public static final String WHITE_PROCESS_TYPE = "Process_Type";
    public static final String WhiteList_TABLE_NAME = "WhiteList";
}
