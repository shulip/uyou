package com.uyou.domain;

import javax.annotation.Generated;
import java.io.Serializable;
import java.time.LocalDateTime;

public class WorkNode implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.work_id")
    private String workId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.node_name")
    private String nodeName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.node_type")
    private String nodeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.create_at")
    private LocalDateTime createAt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.status")
    private String status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.unfinished_stuff")
    private String unfinishedStuff;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: work_node")
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.work_id")
    public String getWorkId() {
        return workId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.work_id")
    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.node_name")
    public String getNodeName() {
        return nodeName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.node_name")
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.node_type")
    public String getNodeType() {
        return nodeType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.node_type")
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType == null ? null : nodeType.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.create_at")
    public LocalDateTime getCreateAt() {
        return createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.create_at")
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.status")
    public String getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.status")
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.unfinished_stuff")
    public String getUnfinishedStuff() {
        return unfinishedStuff;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: work_node.unfinished_stuff")
    public void setUnfinishedStuff(String unfinishedStuff) {
        this.unfinishedStuff = unfinishedStuff == null ? null : unfinishedStuff.trim();
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: work_node")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", workId=").append(workId);
        sb.append(", nodeName=").append(nodeName);
        sb.append(", nodeType=").append(nodeType);
        sb.append(", createAt=").append(createAt);
        sb.append(", status=").append(status);
        sb.append(", unfinishedStuff=").append(unfinishedStuff);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
