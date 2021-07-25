package cn.shangChen.tofu.core;

import cn.shangChen.tofu.core.annotation.SysValue;
import cn.shangChen.tofu.utils.SysValueInject;

/**
 * 描述数据库信息的对象
 * @author yudi
 */
public final class TofuConfig {

    private static TofuConfig tofuConfig = null;

    @SysValue("${tofu.db.dbName}")
    private String dbName;
    @SysValue("${tofu.db.driverName}")
    private String driveName;
    @SysValue("tofu.db.url")
    private String url;
    @SysValue("${tofu.db.username}")
    private String username;
    @SysValue("${tofu.db.password}")
    private String password;

    private static boolean changeDataSource;
    private static boolean alreadyPrintDbName;

    private TofuConfig(){

    }

    public static TofuConfig getTofuConfig(){
        return tofuConfig;
    }

    public static void init(){
        SysValueInject.inject(tofuConfig);
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDriveName() {
        return driveName;
    }

    public void setDriveName(String driveName) {
        this.driveName = driveName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static{
        tofuConfig = new TofuConfig();
        init();
        changeDataSource = false;
        alreadyPrintDbName = false;
    }
}
