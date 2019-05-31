package com.wcy.gitgithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//排除对数据库的包含，不然运行时会报错数据库信息没有配置
public class GitgithubApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(GitgithubApplication.class, args);
    }

}
