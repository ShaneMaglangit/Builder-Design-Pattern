package com.shanemaglangit;

public class Main {

    public static void main(String[] args) {
        // Usage of the builder class
        Dialog dialog = new Dialog.Builder()
                .setTitle("Dialog Title")
                .setMessage("Dialog Message")
                .build();
    }
}
