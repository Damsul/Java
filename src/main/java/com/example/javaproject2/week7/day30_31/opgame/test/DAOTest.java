package com.example.javaproject2.week7.day30_31.opgame.test;

import static org.junit.jupiter.api.Assertions.*;

import com.example.javaproject2.week7.day30_31.opgame.model.Member;
import com.example.javaproject2.week7.day30_31.opgame.model.MemberDAO;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class DAOTest {

    @Test
    public void testLoginAndLogout() {
        String id = "tester";
        String pw = "1234";

        MemberDAO dao = new MemberDAO();
        dao.initMember();
        Optional<Member> user = dao.login(id, pw);
        if (user.isEmpty()) {
            dao.join(id, pw);
            user = dao.login(id, pw);
        }

        assertEquals(id, user.get().getId());
        assertTrue(user.get().isLogined());

        user = dao.logout(id);
        assertFalse(user.get().isLogined());
    }
}
