package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.UserMapper;
import org.example.pojo.User;
import org.example.pojo.Wallet;

import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //3. 执行sql
        // 查询用户钱包余额
        double balance = userMapper.balance(1);
        System.out.println("钱包余额为：" + balance);

        // 用户消费100元的接口
        userMapper.update100(1);
        userMapper.reduce100(1);


        // 用户退款20元接口
        userMapper.update20(1);
        userMapper.add20(1);

        // 查询用户钱包金额变动明细的接口
        List<Wallet> wallets = userMapper.selectById(1);
        System.out.println(wallets);
        System.out.println(wallets.size());

        wallets = userMapper.selectAll();
        System.out.println(wallets);
        System.out.println(wallets.size());
        sqlSession.commit();

        //4. 释放资源
        sqlSession.close();
    }
}
