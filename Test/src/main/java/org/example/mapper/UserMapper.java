package org.example.mapper;

import org.example.pojo.User;
import org.example.pojo.Wallet;

import java.util.List;

public interface UserMapper {

    double balance(int id);

    void reduce100(int id);
    void update100(int id);

    void update20(int id);
    void add20(int id);

    List<Wallet> selectById(int id);

    List<Wallet> selectAll();
}
