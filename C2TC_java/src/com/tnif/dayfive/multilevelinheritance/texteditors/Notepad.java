//Program to define class Notepad 
package com.tnif.dayfive.multilevelinheritance.texteditors;

public class Notepad {
    protected String content;

    public Notepad() {
        this.content = "";
    }

    public void write(String text) {
        content += text; //content = content+text
    }

    public void displayContent() {
        System.out.println("Notepad Content: " + content);
    }
    
    
    /*
     * returntype funcName()
     * {
     * 		//statement
     * }
     * 
     * */
}