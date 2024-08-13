package com.java3y.austin.web.controller.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SelfAuthFilter implements Filter {
    private static final Set<String> WHITE_LIST = new HashSet<>();
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
