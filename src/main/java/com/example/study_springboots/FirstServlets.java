package com.example.study_springboots;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/firstservlet")
public class FirstServlets extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("성공");
    }
        
}
