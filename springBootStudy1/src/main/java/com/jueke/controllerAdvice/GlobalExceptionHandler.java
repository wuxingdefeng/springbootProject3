package com.jueke.controllerAdvice;

import com.jueke.entity.ErrorInfo;
import com.jueke.expection.BusinessException;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/3/8.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    public static final String DEFAULT_ERROR_VIEW = "error";
    private final static Logger log = Logger.getLogger(GlobalExceptionHandler.class);

    /**
     * modelview异常
     * @param re
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest re,Exception e){
        log.info("Exception :"+e.getMessage());
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception",e);
        mv.addObject("url",re.getRequestURL());
        mv.setViewName(DEFAULT_ERROR_VIEW);
        return mv;
    }

    /**
     * 业务异常
     * @param re
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Object handleBizExp(HttpServletRequest re,BusinessException e){
       // re.getSession(true).setAttribute();
        log.info("url"+re.getRequestURL());
        log.info("Business exception handler :"+e.getMessage());
        log.info(System.err);
        ErrorInfo r  = new ErrorInfo();
        r.setMessage(e.getMessage());
        r.setBizCode(e.getBizCode());
        r.setData("Some Data");
        r.setBizType(e.getBizType());
        return r;
    }

}
