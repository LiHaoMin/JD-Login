package li.haomin.jd.action;

import cn.hutool.core.lang.Pair;
import cn.hutool.http.ContentType;
import cn.hutool.http.server.HttpServerRequest;
import cn.hutool.http.server.HttpServerResponse;
import cn.hutool.http.server.action.Action;
import cn.hutool.json.JSONUtil;
import li.haomin.jd.Login;

import java.io.IOException;

public class SaveAction implements Action {
    public static final String PATH = "/save";

    @Override
    public void doAction(HttpServerRequest request, HttpServerResponse response) throws IOException {
    }
}
