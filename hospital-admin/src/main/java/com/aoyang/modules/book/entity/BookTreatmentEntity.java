package com.aoyang.modules.book.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 就诊表
 *
 * @author daixiongyan
 * @email daixy@aoyang.com
 * @date 2019-11-27 10:06:14
 */
@Data
@TableName("book_treatment")
public class BookTreatmentEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    private Long id;
    /**
     * 就诊号
     */
    private String admNo;
    /**
     * 患者ID
     */
    private Long memberId;
    /**
     * 患者类型
     */
    private String treatmentCategory;
    /**
     * 患者性质
     */
    private String payCategory;

    /**
     * 病区id
     */
    private Long inpatientAreaId;

    /**
     * 开单科室id
     */
    private Long depId;

    /**
     * 创建人
     */
    private Long createBy;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 最后修改人
     */
    private Long lastModifyBy;
    /**
     * 最后修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date lastModifyTime;
    /**
     * 已删除
     */
    @TableLogic
    @TableField
    @JsonIgnore
    private Boolean deleted = false;

}
