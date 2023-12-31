package io.web.bi.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 图表信息表
 * @TableName chart
 */
@TableName(value ="chart")
public class Chart implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 图表名称
     */
    private String name;

    /**
     * 分析目标
     */
    private String goal;

    /**
     * 图表数据
     */
    private String chartData;

    /**
     * 图表类型
     */
    private String chartType;

    /**
     * 生成的图表数据
     */
    private String genChart;

    /**
     * 分析结果
     */
    private String genResult;

    /**
     * wait,running,succeed,failed
     */
    private String status;

    /**
     * 执行信息
     */
    private String execMessage;

    /**
     * 创建用户 id
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 图表名称
     */
    public String getName() {
        return name;
    }

    /**
     * 图表名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 分析目标
     */
    public String getGoal() {
        return goal;
    }

    /**
     * 分析目标
     */
    public void setGoal(String goal) {
        this.goal = goal;
    }

    /**
     * 图表数据
     */
    public String getChartData() {
        return chartData;
    }

    /**
     * 图表数据
     */
    public void setChartData(String chartData) {
        this.chartData = chartData;
    }

    /**
     * 图表类型
     */
    public String getChartType() {
        return chartType;
    }

    /**
     * 图表类型
     */
    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    /**
     * 生成的图表数据
     */
    public String getGenChart() {
        return genChart;
    }

    /**
     * 生成的图表数据
     */
    public void setGenChart(String genChart) {
        this.genChart = genChart;
    }

    /**
     * 分析结果
     */
    public String getGenResult() {
        return genResult;
    }

    /**
     * 分析结果
     */
    public void setGenResult(String genResult) {
        this.genResult = genResult;
    }

    /**
     * wait,running,succeed,failed
     */
    public String getStatus() {
        return status;
    }

    /**
     * wait,running,succeed,failed
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 执行信息
     */
    public String getExecMessage() {
        return execMessage;
    }

    /**
     * 执行信息
     */
    public void setExecMessage(String execMessage) {
        this.execMessage = execMessage;
    }

    /**
     * 创建用户 id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 创建用户 id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 是否删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 是否删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}