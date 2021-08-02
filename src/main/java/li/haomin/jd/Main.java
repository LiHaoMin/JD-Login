package li.haomin.jd;

import cn.hutool.http.HttpUtil;
import li.haomin.jd.action.CheckAction;
import li.haomin.jd.action.PageAction;
import li.haomin.jd.action.ShowAction;

public class Main {
    public static void main(String[] args) {
        HttpUtil.createServer(8888)
                .addAction(PageAction.PATH, new PageAction())
                .addAction(ShowAction.PATH, new ShowAction())
                .addAction(CheckAction.PATH, new CheckAction())
                .start();
    }
}
