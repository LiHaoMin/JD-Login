package li.haomin.jd.action;

import cn.hutool.core.lang.Pair;
import cn.hutool.http.ContentType;
import cn.hutool.http.server.HttpServerRequest;
import cn.hutool.http.server.HttpServerResponse;
import cn.hutool.http.server.action.Action;
import cn.hutool.json.JSONUtil;
import li.haomin.jd.Login;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpCookie;
import java.util.List;

public class CheckAction implements Action {
    public static final String PATH = "/check";

    @Override
    public void doAction(HttpServerRequest request, HttpServerResponse response) throws IOException {
        Pair<Boolean, String> check = Login.check(request.getCookiesStr());
        response.write(JSONUtil.toJsonStr(check), ContentType.JSON.toString());
    }
}
