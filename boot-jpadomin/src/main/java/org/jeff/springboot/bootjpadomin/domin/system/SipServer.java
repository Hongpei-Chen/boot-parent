package org.jeff.springboot.bootjpadomin.domin.system;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * sip服务器
 * @author jeff
 * <p>Date 2018/6/8 10:12</p>
 */
@Entity
@Table(name = "sip_server")
@Data
public class SipServer {

    @Id
    private String id;

    /**
     * 名称
     */
    private String name;
    /**
     * 地址
     */
    private String url;
    /**
     * 端口
     */
    private Integer port;
    /**
     * 协议
     */
    private String protocol;
    /**
     * 过期时间
     */
    private Integer keepAlive;
    /**
     * 描述
     */
    private String descript;

    @Column(insertable = true, updatable = false)
    private Date createDate;
    @Column(insertable = true, updatable = false)
    private String createUser;

    @Column(insertable = false, updatable = true)
    private Date modifyDate;
    @Column(insertable = false, updatable = true)
    private String modifyUser;

}
