/*
Copyright 2010-2021 Gephi
Authors : DingQiang Liu <dingqiangliu@gmail.com>
 */

package com.vertica.gephi.database.drivers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openide.util.lookup.ServiceProvider;
import org.gephi.io.database.drivers.SQLDriver;

@ServiceProvider(service = SQLDriver.class, position = 30)
public class VerticaDriver implements SQLDriver {

    public VerticaDriver() {
        try {
            Class.forName("com.vertica.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VerticaDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Connection getConnection(String connectionUrl, String username, String passwd) throws SQLException {
        return DriverManager.getConnection(connectionUrl, username, passwd);
    }

    @Override
    public String getPrefix() {
        return "vertica";
    }

    @Override
    public String toString() {
        return "Vertica Database";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VerticaDriver) {
            return ((VerticaDriver) obj).getPrefix().equals(getPrefix());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrefix().hashCode();
    }
}
