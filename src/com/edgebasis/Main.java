package com.edgebasis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(isValid("(({{[]}}))"));
    }

    public static boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<Character, Character>();
        Stack<Character> stack = new Stack<Character>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(char ch : s.toCharArray() ){
            if(map.containsKey(ch)){
                if(stack.isEmpty()|| stack.pop()!=map.get(ch)){
                    return false;
                }
            }else if(map.values().contains(ch) ){
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
