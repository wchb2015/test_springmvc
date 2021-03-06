package com.springmvc.filter;


import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestOncePerRequestFilter extends OncePerRequestFilter {

    @Override
    protected void initFilterBean() throws ServletException {
        super.initFilterBean();
        System.out.println("InitFilterBean 741");
    }

    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                    FilterChain filterChain) throws ServletException, IOException {
        System.out.println("doFilterInternal 741");
        boolean flag = false;
        if (flag) {
            filterChain.doFilter(httpServletRequest, httpServletResponse);
        } else {
            httpServletResponse.sendRedirect("/column/index");
        }
    }
}
