//Program to define generic functional interface Palindrome

package com.tnif.daynineteen.vone;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}