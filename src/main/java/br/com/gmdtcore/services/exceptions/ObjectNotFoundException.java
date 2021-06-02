/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmdtcore.services.exceptions;

/**
 *
 * @author luiz
 */
public class ObjectNotFoundException extends BusinessException {
    
    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String message) {
       super(message);
    }

    public ObjectNotFoundException(String message, Throwable cause) {
       super(message, cause);
    }
    
}
