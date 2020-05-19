package com.shanemaglangit;

public class Dialog {
    private String title;
    private String message;

    // getters and setters omitted for brevity.

    public static class Builder {
        private Dialog dialog;

        public Builder() {
            this.dialog = new Dialog();
        }

        public Builder setTitle(String title) {
            dialog.setTitle(title);
            return this;
        }

        public Builder setMessage(String message) {
            dialog.setMessage(message);
            return this;
        }

        public Dialog build() {
            return dialog;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
