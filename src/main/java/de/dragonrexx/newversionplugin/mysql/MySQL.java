package de.dragonrexx.newversionplugin.mysql;

import de.dragonrexx.newversionplugin.NewVersionPlugin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {

    private Connection con;

    private static String host = NewVersionPlugin.mysqlConfig.getString("MySQL.Host");
    private static int port = NewVersionPlugin.mysqlConfig.getInt("MySQL.Port");
    private static String database = NewVersionPlugin.mysqlConfig.getString("MySQL.DataBase");
    private static String user = NewVersionPlugin.mysqlConfig.getString("MySQL.User");
    private static String password = NewVersionPlugin.mysqlConfig.getString("MySQL.Password");

    public MySQL(String host, int port, String database, String user, String password) {
        this.host = host;
        this.port = port;
        this.database = database;
        this.user = user;
        this.password = password;

        connect();
    }

    public void connect() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database + "?autoReconnect=true", user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("MySQL disconnected");
        }
    }

    public void disconnect() {
        try {
            if(this.hasConnection()) {
                this.con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean hasConnection() {
        if(this.con !=null) {
            return true;
        }
        return false;
    }

    public Connection getConnection() {
        return con;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getPassword() {
        return password;
    }

    public String getDatabase() {
        return database;
    }

    public String getUser() {
        return user;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
