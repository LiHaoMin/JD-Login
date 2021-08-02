package li.haomin.jd;

import cn.hutool.cron.CronUtil;
import cn.hutool.http.HttpUtil;
import li.haomin.jd.action.CheckAction;
import li.haomin.jd.action.PageAction;
import li.haomin.jd.action.SaveAction;
import li.haomin.jd.action.ShowAction;
import li.haomin.jd.util.DingDing;

public class Main {
    public static void main(String[] args) {
        DingDing.send("CK检查通知\n 【京东账号1】 test 过期时间 2021-01-01\n");
        CronUtil.start();
        HttpUtil.createServer(8888)
                .addAction(PageAction.PATH, new PageAction())
                .addAction(ShowAction.PATH, new ShowAction())
                .addAction(CheckAction.PATH, new CheckAction())
                .addAction(SaveAction.PATH, new SaveAction())
                .start();
    }
}
