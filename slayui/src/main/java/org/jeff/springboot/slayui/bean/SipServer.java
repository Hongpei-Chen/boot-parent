package org.jeff.springboot.slayui.bean;

import lombok.Data;

import java.util.Date;

/**
 * @author jeff
 * <p>Date 2018/6/7 16:19</p>
 */
@Data
public class SipServer {

    private String id;
    private String name;
    private String url;
    private String descript;
    private Integer port;
    private String protocol;
    private Integer keepAlive;

    private Date createDate;
    private Date modifyDate;
}
