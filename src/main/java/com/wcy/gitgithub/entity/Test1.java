package com.wcy.gitgithub.entity;

public class Test1
{
    private Integer id;
    private String title;
    private String content;

    public Test1()
    {
    }

    public Test1(Integer id, String title, String content)
    {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString()
    {
        return "Test1{" + "id=" + id + ", title='" + title + '\'' + ", content='" + content + '\'' + '}';
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }
}
