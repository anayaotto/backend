/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.intellicom.utils;

/**
 *
 * @author Otto
 */
public class Response<T> {
    private int code;
    private T body;
    private String message;

    public Response() {
    }

    public Response(int code, T body, String message) {
        this.code = code;
        this.body = body;
        this.message = message;
    }
    
    

    public Response(T body) {
        this.body = body;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
