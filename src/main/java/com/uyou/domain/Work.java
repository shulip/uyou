package com.uyou.domain;

import javax.annotation.Generated;
import java.io.Serializable;

public class Work implements Serializable {
    private String id;
    private String name;
    private String status;
    private String feishuChatId;
    private static final long serialVersionUID = 1L;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
    public String getFeishuChatId() {
        return feishuChatId;
    }
    public void setFeishuChatId(String feishuChatId) {
        this.feishuChatId = feishuChatId == null ? null : feishuChatId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", feishuChatId=").append(feishuChatId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
