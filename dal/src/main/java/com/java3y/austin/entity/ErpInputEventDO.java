package com.java3y.austin.entity;

import java.util.Date;

public class ErpInputEventDO {
    /**
     * Database Column Remarks:
     *   主键
     *
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     * Database Column Remarks:
     *   租户编码
     *
     *
     * @mbg.generated
     */
    private String tenantId;

    /**
     * Database Column Remarks:
     *   商家编码
     *
     *
     * @mbg.generated
     */
    private String merchantCode;

    /**
     * Database Column Remarks:
     *   分库分表键
     *
     *
     * @mbg.generated
     */
    private String shardingKey;

    /**
     * Database Column Remarks:
     *   外部业务单号
     *
     *
     * @mbg.generated
     */
    private String outBizCode;

    /**
     * Database Column Remarks:
     *   内部事件编码
     *
     *
     * @mbg.generated
     */
    private String eventCode;

    /**
     * Database Column Remarks:
     *   唯一键（MD5(merchantCode + eventCode + out_biz_code)）
     *
     *
     * @mbg.generated
     */
    private String uniqueCode;

    /**
     * Database Column Remarks:
     *   错误编码
     *
     *
     * @mbg.generated
     */
    private String errorCode;

    /**
     * Database Column Remarks:
     *   版本
     *
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     * Database Column Remarks:
     *   是否删除
     *
     *
     * @mbg.generated
     */
    private Byte isDelete;

    /**
     * Database Column Remarks:
     *   是否测试
     *
     *
     * @mbg.generated
     */
    private Byte isTest;

    /**
     * Database Column Remarks:
     *   过程节点
     *
     *
     * @mbg.generated
     */
    private String processNode;

    /**
     * Database Column Remarks:
     *   状态
     *
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * Database Column Remarks:
     *   环境
     *
     *
     * @mbg.generated
     */
    private String env;

    /**
     * Database Column Remarks:
     *   行业单据id
     *
     *
     * @mbg.generated
     */
    private Long industryOrderId;

    /**
     * Database Column Remarks:
     *   扩展查询
     *
     *
     * @mbg.generated
     */
    private String extendQuery;

    /**
     * Database Column Remarks:
     *   业务单据编码
     *
     *
     * @mbg.generated
     */
    private String bizOrderCode;

    /**
     * Database Column Remarks:
     *   消息体(接单节点成功后即删除)
     *
     *
     * @mbg.generated
     */
    private String content;

    /**
     * Database Column Remarks:
     *   扩展字段(存储事件中心/metaQ等消息头信息)
     *
     *
     * @mbg.generated
     */
    private String inputAttributes;

    /**
     * Database Column Remarks:
     *   业务扩展字段
     *
     *
     * @mbg.generated
     */
    private String attributes;

    /**
     * Database Column Remarks:
     *   错误原因
     *
     *
     * @mbg.generated
     */
    private String errorMsg;

    /**
     *
     * @return the value of erp_input_event.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id the value for erp_input_event.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return the value of erp_input_event.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     *
     * @param gmtCreate the value for erp_input_event.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     *
     * @return the value of erp_input_event.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     *
     * @param gmtModified the value for erp_input_event.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     *
     * @return the value of erp_input_event.tenant_id
     *
     * @mbg.generated
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     *
     * @param tenantId the value for erp_input_event.tenant_id
     *
     * @mbg.generated
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     *
     * @return the value of erp_input_event.merchant_code
     *
     * @mbg.generated
     */
    public String getMerchantCode() {
        return merchantCode;
    }

    /**
     *
     * @param merchantCode the value for erp_input_event.merchant_code
     *
     * @mbg.generated
     */
    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    /**
     *
     * @return the value of erp_input_event.sharding_key
     *
     * @mbg.generated
     */
    public String getShardingKey() {
        return shardingKey;
    }

    /**
     *
     * @param shardingKey the value for erp_input_event.sharding_key
     *
     * @mbg.generated
     */
    public void setShardingKey(String shardingKey) {
        this.shardingKey = shardingKey;
    }

    /**
     *
     * @return the value of erp_input_event.out_biz_code
     *
     * @mbg.generated
     */
    public String getOutBizCode() {
        return outBizCode;
    }

    /**
     *
     * @param outBizCode the value for erp_input_event.out_biz_code
     *
     * @mbg.generated
     */
    public void setOutBizCode(String outBizCode) {
        this.outBizCode = outBizCode;
    }

    /**
     *
     * @return the value of erp_input_event.event_code
     *
     * @mbg.generated
     */
    public String getEventCode() {
        return eventCode;
    }

    /**
     *
     * @param eventCode the value for erp_input_event.event_code
     *
     * @mbg.generated
     */
    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    /**
     *
     * @return the value of erp_input_event.unique_code
     *
     * @mbg.generated
     */
    public String getUniqueCode() {
        return uniqueCode;
    }

    /**
     *
     * @param uniqueCode the value for erp_input_event.unique_code
     *
     * @mbg.generated
     */
    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    /**
     *
     * @return the value of erp_input_event.error_code
     *
     * @mbg.generated
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     *
     * @param errorCode the value for erp_input_event.error_code
     *
     * @mbg.generated
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     *
     * @return the value of erp_input_event.version
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     *
     * @param version the value for erp_input_event.version
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     *
     * @return the value of erp_input_event.is_delete
     *
     * @mbg.generated
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     *
     * @param isDelete the value for erp_input_event.is_delete
     *
     * @mbg.generated
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     *
     * @return the value of erp_input_event.is_test
     *
     * @mbg.generated
     */
    public Byte getIsTest() {
        return isTest;
    }

    /**
     *
     * @param isTest the value for erp_input_event.is_test
     *
     * @mbg.generated
     */
    public void setIsTest(Byte isTest) {
        this.isTest = isTest;
    }

    /**
     *
     * @return the value of erp_input_event.process_node
     *
     * @mbg.generated
     */
    public String getProcessNode() {
        return processNode;
    }

    /**
     *
     * @param processNode the value for erp_input_event.process_node
     *
     * @mbg.generated
     */
    public void setProcessNode(String processNode) {
        this.processNode = processNode;
    }

    /**
     *
     * @return the value of erp_input_event.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     *
     * @param status the value for erp_input_event.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     *
     * @return the value of erp_input_event.env
     *
     * @mbg.generated
     */
    public String getEnv() {
        return env;
    }

    /**
     *
     * @param env the value for erp_input_event.env
     *
     * @mbg.generated
     */
    public void setEnv(String env) {
        this.env = env;
    }

    /**
     *
     * @return the value of erp_input_event.industry_order_id
     *
     * @mbg.generated
     */
    public Long getIndustryOrderId() {
        return industryOrderId;
    }

    /**
     *
     * @param industryOrderId the value for erp_input_event.industry_order_id
     *
     * @mbg.generated
     */
    public void setIndustryOrderId(Long industryOrderId) {
        this.industryOrderId = industryOrderId;
    }

    /**
     *
     * @return the value of erp_input_event.extend_query
     *
     * @mbg.generated
     */
    public String getExtendQuery() {
        return extendQuery;
    }

    /**
     *
     * @param extendQuery the value for erp_input_event.extend_query
     *
     * @mbg.generated
     */
    public void setExtendQuery(String extendQuery) {
        this.extendQuery = extendQuery;
    }

    /**
     *
     * @return the value of erp_input_event.biz_order_code
     *
     * @mbg.generated
     */
    public String getBizOrderCode() {
        return bizOrderCode;
    }

    /**
     *
     * @param bizOrderCode the value for erp_input_event.biz_order_code
     *
     * @mbg.generated
     */
    public void setBizOrderCode(String bizOrderCode) {
        this.bizOrderCode = bizOrderCode;
    }

    /**
     *
     * @return the value of erp_input_event.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * @param content the value for erp_input_event.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     *
     * @return the value of erp_input_event.input_attributes
     *
     * @mbg.generated
     */
    public String getInputAttributes() {
        return inputAttributes;
    }

    /**
     *
     * @param inputAttributes the value for erp_input_event.input_attributes
     *
     * @mbg.generated
     */
    public void setInputAttributes(String inputAttributes) {
        this.inputAttributes = inputAttributes;
    }

    /**
     *
     * @return the value of erp_input_event.attributes
     *
     * @mbg.generated
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     *
     * @param attributes the value for erp_input_event.attributes
     *
     * @mbg.generated
     */
    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    /**
     *
     * @return the value of erp_input_event.error_msg
     *
     * @mbg.generated
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     *
     * @param errorMsg the value for erp_input_event.error_msg
     *
     * @mbg.generated
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * @return
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", merchantCode=").append(merchantCode);
        sb.append(", shardingKey=").append(shardingKey);
        sb.append(", outBizCode=").append(outBizCode);
        sb.append(", eventCode=").append(eventCode);
        sb.append(", uniqueCode=").append(uniqueCode);
        sb.append(", errorCode=").append(errorCode);
        sb.append(", version=").append(version);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", isTest=").append(isTest);
        sb.append(", processNode=").append(processNode);
        sb.append(", status=").append(status);
        sb.append(", env=").append(env);
        sb.append(", industryOrderId=").append(industryOrderId);
        sb.append(", extendQuery=").append(extendQuery);
        sb.append(", bizOrderCode=").append(bizOrderCode);
        sb.append(", content=").append(content);
        sb.append(", inputAttributes=").append(inputAttributes);
        sb.append(", attributes=").append(attributes);
        sb.append(", errorMsg=").append(errorMsg);
        sb.append("]");
        return sb.toString();
    }
}
