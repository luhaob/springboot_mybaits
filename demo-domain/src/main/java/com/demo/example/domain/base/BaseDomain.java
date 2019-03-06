package com.demo.example.domain.base;

import com.demo.example.common.util.DateUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by wangwei on 2017/7/10.
 */
@MappedSuperclass
public class BaseDomain implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8870504230827463383L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    @Column(nullable = false, columnDefinition = "BIGINT(20) default 0")
    protected Long version;

    @Column(nullable = false, columnDefinition = "BIT default 0")
    protected boolean deleted;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = DateUtils.PATTERN_DATE_TIME)
    @JsonFormat(pattern = DateUtils.PATTERN_DATE_TIME, timezone = "GMT+08:00")
    @Column(updatable = false)
    private Date createTime;

    @Column(length = 50, updatable = false)
    private String createUser;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = DateUtils.PATTERN_DATE_TIME)
    @JsonFormat(pattern = DateUtils.PATTERN_DATE_TIME, timezone = "GMT+08:00")
    private Date updateTime;

    @Column(length = 50)
    private String updateUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}