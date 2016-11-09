/**
 * ==============================================================================
 * Copyright (c) 2016 by www.2dfire.com, All rights reserved.
 * ==============================================================================
 * This software is the confidential and proprietary information of
 * 2dfire.com, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with 2dfire.com, Inc.
 * ------------------------------------------------------------------------------
 * File name:  HelloAbstractControoler.java
 * Author: qiezi
 * Date: 2016/11/9 11:01
 * Description:
 * Nothing.
 * Function List:
 * 1. Nothing.
 * History:
 * 1. Nothing.
 * ==============================================================================
 */
package com.qiezi.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * User: qiezi
 * Date: 2016/11/9
 * Time: 11:01
 */
public class HelloAbstractController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","Hello Abstract");
        modelAndView.setViewName("hello_abstract");
        return modelAndView;
    }
}
