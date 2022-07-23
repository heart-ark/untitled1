package com.HEART.pojo;

public class Brand {

    public Integer getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getOrdered() {
        return ordered;
    }

    public String getDescription() {
        return description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setOrdered(String ordered) {
        this.ordered = ordered;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brand_name='" + brandName + '\'' +
                ", company_name='" + companyName + '\'' +
                ", ordered='" + ordered + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }

    private Integer id;//品牌id
    private String brandName;//品牌名称
    private String companyName;//品牌图片地址
    private String ordered;//品牌的首字母
    private String description;
    private Integer status;//排序
}
