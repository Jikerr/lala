package com.lala.owners.entity;

import com.lala.common.entity.base.BaseEntity;
import com.lala.customer.entity.LeaseBill;

import javax.persistence.*;
import java.util.List;

@Table(name = "wc_owner")
@Entity
public class Owner extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键生成 自增长
    private Integer id;
    private String nickName;//用户名
    private String wechatNum;//微信号码
    private String weId;//we ID
    private String telephoneNum;//手机号码
    private String weChatAccessToken;//微信授权token
    private String faceImage;//头像图片Url 可能不准确不及时
    private String password;//密码 , 冗余
    private String realName;//真实姓名
    private String signatureCAToken;//法大大签章CA证书
    private String idCardNum;//身份证号码
    private String bankName;//开户行 银行名称 <----退款或者转账要用到
    private String bankCardNum;//银行卡号
    private String accountName;//开户人 账户姓名
    private String bankCode;//开户行代码
    private Integer locked;//锁住 0未加锁 1限制登录
    private String lastLoginSuccessIP;//最后登录成功IP
    private String lastLoginFailIP;//最后登录失败IP
    private Integer errorPasswordCount;//累计错误密码次数 冗余暂时


    /****************************关联表 GET AND SET ---->START<------******************************/
    //此处暂时不关联表,比如关联租赁表 , 一个房东发布的租赁会有很多 , 影响数据的加载速度



    /****************************关联表 GET AND SET ---->END<------******************************/



    /****************************固定字段GET AND SET ---->START<------******************************/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getWechatNum() {
        return wechatNum;
    }

    public void setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum;
    }

    public String getWeId() {
        return weId;
    }

    public void setWeId(String weId) {
        this.weId = weId;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public String getWeChatAccessToken() {
        return weChatAccessToken;
    }

    public void setWeChatAccessToken(String weChatAccessToken) {
        this.weChatAccessToken = weChatAccessToken;
    }

    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSignatureCAToken() {
        return signatureCAToken;
    }

    public void setSignatureCAToken(String signatureCAToken) {
        this.signatureCAToken = signatureCAToken;
    }

    public String getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCardNum() {
        return bankCardNum;
    }

    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public String getLastLoginSuccessIP() {
        return lastLoginSuccessIP;
    }

    public void setLastLoginSuccessIP(String lastLoginSuccessIP) {
        this.lastLoginSuccessIP = lastLoginSuccessIP;
    }

    public String getLastLoginFailIP() {
        return lastLoginFailIP;
    }

    public void setLastLoginFailIP(String lastLoginFailIP) {
        this.lastLoginFailIP = lastLoginFailIP;
    }

    public Integer getErrorPasswordCount() {
        return errorPasswordCount;
    }

    public void setErrorPasswordCount(Integer errorPasswordCount) {
        this.errorPasswordCount = errorPasswordCount;
    }

/****************************固定字段GET AND SET ---->END<------******************************/
}
