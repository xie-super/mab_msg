package com.java3y.austin.web.controller.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
@Order(1)
@Component
public class SelfAuthFilter implements Filter {
    private static final Set<String> WHITE_LIST = new HashSet<>();
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        if (WHITE_LIST.contains(req.getRequestURI())) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }else{
            res.setContentType("text/html;charset=UTF-8");
            res.setCharacterEncoding("UTF-8");
            res.getWriter().write("没有权限");
        }

    }

    @Override
    public void destroy() {

    }
}
