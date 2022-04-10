package com.uyou.enumeration;

public enum FeishuChatFlag {
    NO_FEISHU_CHAT("NO_FEISHU_CHAT");


    private String text;

    FeishuChatFlag(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public static FeishuChatFlag fromString(String value) {
        for (FeishuChatFlag status : FeishuChatFlag.values()) {
            if (status.text.equals(value)) {
                return status;
            }
        }
        return null;
    }

}
