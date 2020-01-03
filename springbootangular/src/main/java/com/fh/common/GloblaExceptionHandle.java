package com.fh.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@ControllerAdvice
@RestControllerAdvice
public class GloblaExceptionHandle {
    //定义要捕捉的异常
    @ExceptionHandler(AjaxException.class)
    //@ResponseBody
    public CommonServeer handException3(AjaxException ex){
        ex.printStackTrace();
        return CommonServeer.error(ex.getMessage());

    }
   /* //定义要捕捉的异常
    @ExceptionHandler(AjaxException.class)
    //@ResponseBody
    public CommonServeer handException2(AjaxException ex){
        ex.printStackTrace();
        return CommonServeer.error();

    }*/
    @ExceptionHandler(Exception.class)
   // @ResponseBody
    public CommonServeer handException(Exception ex){
        return CommonServeer.error();

    }


}
