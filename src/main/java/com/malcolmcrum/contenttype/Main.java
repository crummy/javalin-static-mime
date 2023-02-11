package com.malcolmcrum.contenttype;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin.create(cfg -> {
                    cfg.staticFiles.add("web");
                }).get("/", ctx -> ctx.result("Hello World"))
                .start(7070);
    }
}