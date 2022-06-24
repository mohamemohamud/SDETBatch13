package com.syntax.class15;

public class inter {
    class Main {
        public static void main(String[] args) {

            String word ="abrakadabra";

            String replace=word.replaceAll("[^aAeEiIoOuU]", "");

            System.out.println(replace);

        }}

}
