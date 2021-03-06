package com.even.sell.dataobject;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

import java.util.Date;

/**
 * @author EVEN
 * 2018/5/1 19:33
 */
@Data
@Entity
public class SellerInfo {
    @Id
    private String id;

    private String username;

    private String password;

    private String openid;

    private String state;

    private String email;
    private String tel;
    private Date createTime;
    private Date updateTime;
}
