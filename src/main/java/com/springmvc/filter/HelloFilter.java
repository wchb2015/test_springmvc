package com.springmvc.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wangchongbei on 16-1-13.
 */
public class HelloFilter implements Filter {
    private static final Log LOG = LogFactory.getLog(HelloFilter.class);

    public void init(FilterConfig filterConfig) throws ServletException {
        filterConfig.getFilterName();
        filterConfig.getServletContext();
        filterConfig.getInitParameterNames();
        LOG.info("###################__HelloFilter_init()!");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        LOG.info("###################__HelloFilter_doFilter()_start!");
        chain.doFilter(request, response);
        LOG.info("###################__HelloFilter_doFilter()_end!");
    }

    public void destroy() {
        LOG.info("###################__HelloFilter_destroy()!");
    }
}