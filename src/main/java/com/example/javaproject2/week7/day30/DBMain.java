package com.example.javaproject2.week7.day30;

import com.example.javaproject2.week7.day30.model.BaseDAO;
import java.sql.SQLException;

public class DBMain extends BaseDAO {
    public static void main(String[] args) {
        DBMain dbMain = new DBMain();
        dbMain.initPerson();
        dbMain.insertPerson("leo");
        dbMain.insertPerson("yui");
        dbMain.insertPerson("wow");
    }

    private int insertPerson(String name) {
        int cnt = 0;
        String sql = "insert into person(name) values(?)";
        try {
            getConn();
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, name);
            cnt = psmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close();
        }
        return cnt;
    }

    private void initPerson() {
        String sql = """
                create table person (
                id integer primary key autoincrement,
                name string
                )
                """;
        try {
            // create a database connection
            getConn();
            smt = conn.createStatement();
            smt.executeUpdate("drop table if exists person");
            smt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    private void getCodeName() {
        String sql = "select code, name from country order by code, name";

        try {
            getConn();
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            while( rs.next() ) {
                System.out.print(rs.getString("code") + "\t");
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }
}
