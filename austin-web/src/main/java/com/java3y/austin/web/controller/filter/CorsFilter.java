package com.java3y.austin.web.controller.filter;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Order(0)
@Component
public class CorsFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        String[] allowDomain = {"http://11.158.204.113",
                "http://30.196.160.231:7001",
                "http://127.0.0.1:7001",
                "http://pre-dp.alibaba-inc.com",
                "https://pre-dp.alibaba-inc.com",
                "http://test.cbbs.tmall.net",
                "https://test.cbbs.tmall.net",
                "https://web.cbbs.tmall.net",
                "https://web.cbbs.tmall.com",
                "https://pre-web.cbbs.tmall.net",
                "https://pre-web.cbbs.tmall.com",
                "https://pre-console-ascp.alibaba-inc.net",
                "https://pre-console-ascp.alibaba-inc.com",
                "https://console-ascp.alibaba-inc.com",
                "https://console-ascp.alibaba-inc.net",
                "https://iop.cbbs.tmall.net",
                "https://72d8b16f-a3d9-4dd6-b11f-869bb8fdf7f2-3333.cloud-ide-router.alibaba-inc.com",
                "https://3dcdc524-c05a-48e8-b47d-e9ccb48d8fcc-3333.cloud-ide-router.alibaba-inc.com",
        };
        Set<String> allowedOrigins = new HashSet<String>(Arrays.asList(allowDomain));
        String originHeader = ((HttpServletRequest) request).getHeader("Origin");
        if (allowedOrigins.contains(originHeader)) {
        }
        res.setHeader("Access-Control-Allow-Credentials", "true");
        res.setHeader("Access-Control-Allow-Origin", originHeader);
        res.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
        res.setHeader("Access-Control-Allow-Headers", "X-Requested-With, XSRF-TOKEN, content-type,tenant-code");

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
}
