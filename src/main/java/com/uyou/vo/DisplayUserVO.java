package com.uyou.vo;

import com.uyou.domain.User;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DisplayUserVO {
    private String userName;
    private String nickName;
    private String createdAt;
    private String role;
    private String openId;
    private String employeeId;
    private String enrollYear;
    private String type;

    private DisplayUserVO(String userName, String nickName, LocalDateTime createdAt, String role, String openId, String employeeId, String enrollYear, String type) {
        this.userName = userName;
        this.nickName = nickName;
        this.createdAt = createdAt.toString();
        this.role = role;
        this.openId = openId;
        this.employeeId = employeeId;
        this.enrollYear = enrollYear;
        this.type = type;
    }

    public static DisplayUserVO fromUser(User user) {
        if (user == null) {
            return null;
        }

        return new DisplayUserVO(user.getId(), user.getName(), user.getCreatedAt(), user.getRole(), user.getOpenId(), user.getEmployeeId(), user.getEnrollYear(), user.getType());
    }
}
