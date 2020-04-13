package com.yongche.yopsaas.db.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class YopsaasRideOrderTransactionHistory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.ride_order_transaction_history_id
     *
     * @mbg.generated
     */
    private Long rideOrderTransactionHistoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.account_id
     *
     * @mbg.generated
     */
    private Long accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.ride_order_id
     *
     * @mbg.generated
     */
    private Long rideOrderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.recharge_transaction_id
     *
     * @mbg.generated
     */
    private Long rechargeTransactionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.consumer_id
     *
     * @mbg.generated
     */
    private Long consumerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.operation
     *
     * @mbg.generated
     */
    private Byte operation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.pay_type
     *
     * @mbg.generated
     */
    private Byte payType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.pay_source
     *
     * @mbg.generated
     */
    private Short paySource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.transaction_type
     *
     * @mbg.generated
     */
    private Byte transactionType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.amount
     *
     * @mbg.generated
     */
    private Integer amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.paid_amount
     *
     * @mbg.generated
     */
    private Integer paidAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.operator
     *
     * @mbg.generated
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.comment
     *
     * @mbg.generated
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.create_time
     *
     * @mbg.generated
     */
    private Integer createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yopsaas_ride_order_transaction_history.update_time
     *
     * @mbg.generated
     */
    private Integer updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.ride_order_transaction_history_id
     *
     * @return the value of yopsaas_ride_order_transaction_history.ride_order_transaction_history_id
     *
     * @mbg.generated
     */
    public Long getRideOrderTransactionHistoryId() {
        return rideOrderTransactionHistoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.ride_order_transaction_history_id
     *
     * @param rideOrderTransactionHistoryId the value for yopsaas_ride_order_transaction_history.ride_order_transaction_history_id
     *
     * @mbg.generated
     */
    public void setRideOrderTransactionHistoryId(Long rideOrderTransactionHistoryId) {
        this.rideOrderTransactionHistoryId = rideOrderTransactionHistoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.account_id
     *
     * @return the value of yopsaas_ride_order_transaction_history.account_id
     *
     * @mbg.generated
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.account_id
     *
     * @param accountId the value for yopsaas_ride_order_transaction_history.account_id
     *
     * @mbg.generated
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.ride_order_id
     *
     * @return the value of yopsaas_ride_order_transaction_history.ride_order_id
     *
     * @mbg.generated
     */
    public Long getRideOrderId() {
        return rideOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.ride_order_id
     *
     * @param rideOrderId the value for yopsaas_ride_order_transaction_history.ride_order_id
     *
     * @mbg.generated
     */
    public void setRideOrderId(Long rideOrderId) {
        this.rideOrderId = rideOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.recharge_transaction_id
     *
     * @return the value of yopsaas_ride_order_transaction_history.recharge_transaction_id
     *
     * @mbg.generated
     */
    public Long getRechargeTransactionId() {
        return rechargeTransactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.recharge_transaction_id
     *
     * @param rechargeTransactionId the value for yopsaas_ride_order_transaction_history.recharge_transaction_id
     *
     * @mbg.generated
     */
    public void setRechargeTransactionId(Long rechargeTransactionId) {
        this.rechargeTransactionId = rechargeTransactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.consumer_id
     *
     * @return the value of yopsaas_ride_order_transaction_history.consumer_id
     *
     * @mbg.generated
     */
    public Long getConsumerId() {
        return consumerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.consumer_id
     *
     * @param consumerId the value for yopsaas_ride_order_transaction_history.consumer_id
     *
     * @mbg.generated
     */
    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.operation
     *
     * @return the value of yopsaas_ride_order_transaction_history.operation
     *
     * @mbg.generated
     */
    public Byte getOperation() {
        return operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.operation
     *
     * @param operation the value for yopsaas_ride_order_transaction_history.operation
     *
     * @mbg.generated
     */
    public void setOperation(Byte operation) {
        this.operation = operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.pay_type
     *
     * @return the value of yopsaas_ride_order_transaction_history.pay_type
     *
     * @mbg.generated
     */
    public Byte getPayType() {
        return payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.pay_type
     *
     * @param payType the value for yopsaas_ride_order_transaction_history.pay_type
     *
     * @mbg.generated
     */
    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.pay_source
     *
     * @return the value of yopsaas_ride_order_transaction_history.pay_source
     *
     * @mbg.generated
     */
    public Short getPaySource() {
        return paySource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.pay_source
     *
     * @param paySource the value for yopsaas_ride_order_transaction_history.pay_source
     *
     * @mbg.generated
     */
    public void setPaySource(Short paySource) {
        this.paySource = paySource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.transaction_type
     *
     * @return the value of yopsaas_ride_order_transaction_history.transaction_type
     *
     * @mbg.generated
     */
    public Byte getTransactionType() {
        return transactionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.transaction_type
     *
     * @param transactionType the value for yopsaas_ride_order_transaction_history.transaction_type
     *
     * @mbg.generated
     */
    public void setTransactionType(Byte transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.status
     *
     * @return the value of yopsaas_ride_order_transaction_history.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.status
     *
     * @param status the value for yopsaas_ride_order_transaction_history.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.amount
     *
     * @return the value of yopsaas_ride_order_transaction_history.amount
     *
     * @mbg.generated
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.amount
     *
     * @param amount the value for yopsaas_ride_order_transaction_history.amount
     *
     * @mbg.generated
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.paid_amount
     *
     * @return the value of yopsaas_ride_order_transaction_history.paid_amount
     *
     * @mbg.generated
     */
    public Integer getPaidAmount() {
        return paidAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.paid_amount
     *
     * @param paidAmount the value for yopsaas_ride_order_transaction_history.paid_amount
     *
     * @mbg.generated
     */
    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.operator
     *
     * @return the value of yopsaas_ride_order_transaction_history.operator
     *
     * @mbg.generated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.operator
     *
     * @param operator the value for yopsaas_ride_order_transaction_history.operator
     *
     * @mbg.generated
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.comment
     *
     * @return the value of yopsaas_ride_order_transaction_history.comment
     *
     * @mbg.generated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.comment
     *
     * @param comment the value for yopsaas_ride_order_transaction_history.comment
     *
     * @mbg.generated
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.create_time
     *
     * @return the value of yopsaas_ride_order_transaction_history.create_time
     *
     * @mbg.generated
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.create_time
     *
     * @param createTime the value for yopsaas_ride_order_transaction_history.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yopsaas_ride_order_transaction_history.update_time
     *
     * @return the value of yopsaas_ride_order_transaction_history.update_time
     *
     * @mbg.generated
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yopsaas_ride_order_transaction_history.update_time
     *
     * @param updateTime the value for yopsaas_ride_order_transaction_history.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_ride_order_transaction_history
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rideOrderTransactionHistoryId=").append(rideOrderTransactionHistoryId);
        sb.append(", accountId=").append(accountId);
        sb.append(", rideOrderId=").append(rideOrderId);
        sb.append(", rechargeTransactionId=").append(rechargeTransactionId);
        sb.append(", consumerId=").append(consumerId);
        sb.append(", operation=").append(operation);
        sb.append(", payType=").append(payType);
        sb.append(", paySource=").append(paySource);
        sb.append(", transactionType=").append(transactionType);
        sb.append(", status=").append(status);
        sb.append(", amount=").append(amount);
        sb.append(", paidAmount=").append(paidAmount);
        sb.append(", operator=").append(operator);
        sb.append(", comment=").append(comment);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_ride_order_transaction_history
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        YopsaasRideOrderTransactionHistory other = (YopsaasRideOrderTransactionHistory) that;
        return (this.getRideOrderTransactionHistoryId() == null ? other.getRideOrderTransactionHistoryId() == null : this.getRideOrderTransactionHistoryId().equals(other.getRideOrderTransactionHistoryId()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getRideOrderId() == null ? other.getRideOrderId() == null : this.getRideOrderId().equals(other.getRideOrderId()))
            && (this.getRechargeTransactionId() == null ? other.getRechargeTransactionId() == null : this.getRechargeTransactionId().equals(other.getRechargeTransactionId()))
            && (this.getConsumerId() == null ? other.getConsumerId() == null : this.getConsumerId().equals(other.getConsumerId()))
            && (this.getOperation() == null ? other.getOperation() == null : this.getOperation().equals(other.getOperation()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getPaySource() == null ? other.getPaySource() == null : this.getPaySource().equals(other.getPaySource()))
            && (this.getTransactionType() == null ? other.getTransactionType() == null : this.getTransactionType().equals(other.getTransactionType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPaidAmount() == null ? other.getPaidAmount() == null : this.getPaidAmount().equals(other.getPaidAmount()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_ride_order_transaction_history
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRideOrderTransactionHistoryId() == null) ? 0 : getRideOrderTransactionHistoryId().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getRideOrderId() == null) ? 0 : getRideOrderId().hashCode());
        result = prime * result + ((getRechargeTransactionId() == null) ? 0 : getRechargeTransactionId().hashCode());
        result = prime * result + ((getConsumerId() == null) ? 0 : getConsumerId().hashCode());
        result = prime * result + ((getOperation() == null) ? 0 : getOperation().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getPaySource() == null) ? 0 : getPaySource().hashCode());
        result = prime * result + ((getTransactionType() == null) ? 0 : getTransactionType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPaidAmount() == null) ? 0 : getPaidAmount().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table yopsaas_ride_order_transaction_history
     *
     * @mbg.generated
     */
    public enum Column {
        rideOrderTransactionHistoryId("ride_order_transaction_history_id", "rideOrderTransactionHistoryId", "BIGINT", false),
        accountId("account_id", "accountId", "BIGINT", false),
        rideOrderId("ride_order_id", "rideOrderId", "BIGINT", false),
        rechargeTransactionId("recharge_transaction_id", "rechargeTransactionId", "BIGINT", false),
        consumerId("consumer_id", "consumerId", "BIGINT", false),
        operation("operation", "operation", "TINYINT", true),
        payType("pay_type", "payType", "TINYINT", false),
        paySource("pay_source", "paySource", "SMALLINT", false),
        transactionType("transaction_type", "transactionType", "TINYINT", false),
        status("status", "status", "TINYINT", true),
        amount("amount", "amount", "INTEGER", false),
        paidAmount("paid_amount", "paidAmount", "INTEGER", false),
        operator("operator", "operator", "VARCHAR", true),
        comment("comment", "comment", "VARCHAR", true),
        createTime("create_time", "createTime", "INTEGER", false),
        updateTime("update_time", "updateTime", "INTEGER", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yopsaas_ride_order_transaction_history
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}