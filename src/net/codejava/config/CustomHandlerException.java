package net.codejava.config;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

public class CustomHandlerException extends DefaultHandlerExceptionResolver {
//    private static final Logger logger= (Logger) LoggerFactory.getLogger(CustomHandlerException.class);

    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        return new ModelAndView("error");
    }
}
