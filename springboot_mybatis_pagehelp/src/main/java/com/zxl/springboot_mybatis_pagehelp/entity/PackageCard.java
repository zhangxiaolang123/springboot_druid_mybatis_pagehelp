package com.zxl.springboot_mybatis_pagehelp.entity;



import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 套餐卡Entity
 *
 * @Description
 * @Author zxl
 * @Date 2019-03-26 14:08
 */

public class PackageCard implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 编码
     */
    private String packageCardCode;

    /**
     * 名称
     */
    private String packageCardName;

    /**
     * 产品主图
     */
    private String pictureUrl;

    /**
     * 销售价格
     */
    private BigDecimal salePrice;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 卡密总数
     */
    private Integer cardCount;

    /**
     * 卡密绑定总数
     */
    private Integer bondedCount;

    /**
     * 操作员
     */
    private String operator;

    /**
     * 创建时间
     */
    private Date createDatetime;

    /**
     * 更新时间
     */
    private Date updateDatetime;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 删除标记，1为删除，0为正常
     */
    private Integer delFlag;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPackageCardCode() {
        return packageCardCode;
    }

    public void setPackageCardCode(String packageCardCode) {
        this.packageCardCode = packageCardCode;
    }

    public String getPackageCardName() {
        return packageCardName;
    }

    public void setPackageCardName(String packageCardName) {
        this.packageCardName = packageCardName;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCardCount() {
        return cardCount;
    }

    public void setCardCount(Integer cardCount) {
        this.cardCount = cardCount;
    }

    public Integer getBondedCount() {
        return bondedCount;
    }

    public void setBondedCount(Integer bondedCount) {
        this.bondedCount = bondedCount;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}