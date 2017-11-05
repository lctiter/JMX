package cn.icodelife.jmx.standbean;

/**
 * Created by lichunting on 2017/11/4.
 */
public interface HelloMBean {

    public String getName();

    public void setName(String name);

    public void printHello();

    public void printHello(String name);
}
