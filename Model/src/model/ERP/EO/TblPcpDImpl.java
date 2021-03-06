package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 07 13:03:31 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblPcpDImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        PcpMId,
        Description,
        Dr,
        Cr,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        PoMId,
        Amount,
        BankCashId,
        TaxAmount,
        NetAmount,
        GrnMId,
        TblPcpM,
        TblBankCash;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ID = AttributesEnum.Id.index();
    public static final int PCPMID = AttributesEnum.PcpMId.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int DR = AttributesEnum.Dr.index();
    public static final int CR = AttributesEnum.Cr.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int POMID = AttributesEnum.PoMId.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int BANKCASHID = AttributesEnum.BankCashId.index();
    public static final int TAXAMOUNT = AttributesEnum.TaxAmount.index();
    public static final int NETAMOUNT = AttributesEnum.NetAmount.index();
    public static final int GRNMID = AttributesEnum.GrnMId.index();
    public static final int TBLPCPM = AttributesEnum.TblPcpM.index();
    public static final int TBLBANKCASH = AttributesEnum.TblBankCash.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblPcpDImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblPcpD");
    }


    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public BigDecimal getId() {
        return (BigDecimal) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(BigDecimal value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for PcpMId, using the alias name PcpMId.
     * @return the value of PcpMId
     */
    public BigDecimal getPcpMId() {
        return (BigDecimal) getAttributeInternal(PCPMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PcpMId.
     * @param value value to set the PcpMId
     */
    public void setPcpMId(BigDecimal value) {
        setAttributeInternal(PCPMID, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the value of Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for Dr, using the alias name Dr.
     * @return the value of Dr
     */
    public BigDecimal getDr() {
        return (BigDecimal) getAttributeInternal(DR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dr.
     * @param value value to set the Dr
     */
    public void setDr(BigDecimal value) {
        setAttributeInternal(DR, value);
    }

    /**
     * Gets the attribute value for Cr, using the alias name Cr.
     * @return the value of Cr
     */
    public BigDecimal getCr() {
        return (BigDecimal) getAttributeInternal(CR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cr.
     * @param value value to set the Cr
     */
    public void setCr(BigDecimal value) {
        setAttributeInternal(CR, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for PoMId, using the alias name PoMId.
     * @return the value of PoMId
     */
    public BigDecimal getPoMId() {
        return (BigDecimal) getAttributeInternal(POMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoMId.
     * @param value value to set the PoMId
     */
    public void setPoMId(BigDecimal value) {
        setAttributeInternal(POMID, value);
    }

    /**
     * Gets the attribute value for Amount, using the alias name Amount.
     * @return the value of Amount
     */
    public BigDecimal getAmount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Amount.
     * @param value value to set the Amount
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for BankCashId, using the alias name BankCashId.
     * @return the value of BankCashId
     */
    public BigDecimal getBankCashId() {
        return (BigDecimal) getAttributeInternal(BANKCASHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BankCashId.
     * @param value value to set the BankCashId
     */
    public void setBankCashId(BigDecimal value) {
        setAttributeInternal(BANKCASHID, value);
    }

    /**
     * Gets the attribute value for TaxAmount, using the alias name TaxAmount.
     * @return the value of TaxAmount
     */
    public BigDecimal getTaxAmount() {
        return (BigDecimal) getAttributeInternal(TAXAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxAmount.
     * @param value value to set the TaxAmount
     */
    public void setTaxAmount(BigDecimal value) {
        setAttributeInternal(TAXAMOUNT, value);
    }

    /**
     * Gets the attribute value for NetAmount, using the alias name NetAmount.
     * @return the value of NetAmount
     */
    public BigDecimal getNetAmount() {
        return (BigDecimal) getAttributeInternal(NETAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for NetAmount.
     * @param value value to set the NetAmount
     */
    public void setNetAmount(BigDecimal value) {
        setAttributeInternal(NETAMOUNT, value);
    }

    /**
     * Gets the attribute value for GrnMId, using the alias name GrnMId.
     * @return the value of GrnMId
     */
    public BigDecimal getGrnMId() {
        return (BigDecimal) getAttributeInternal(GRNMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrnMId.
     * @param value value to set the GrnMId
     */
    public void setGrnMId(BigDecimal value) {
        setAttributeInternal(GRNMID, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblPcpMImpl getTblPcpM() {
        return (TblPcpMImpl) getAttributeInternal(TBLPCPM);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblPcpM(TblPcpMImpl value) {
        setAttributeInternal(TBLPCPM, value);
    }

    /**
     * @return the associated entity TblBankCashImpl.
     */
    public TblBankCashImpl getTblBankCash() {
        return (TblBankCashImpl) getAttributeInternal(TBLBANKCASH);
    }

    /**
     * Sets <code>value</code> as the associated entity TblBankCashImpl.
     */
    public void setTblBankCash(TblBankCashImpl value) {
        setAttributeInternal(TBLBANKCASH, value);
    }


    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number loginId = null;
                        try {
                            loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessUMID"));
                        } catch(Exception ex) {
                            ex.printStackTrace();
                        }
                        
                        if (operation == DML_INSERT) {
                            setCreatedBy(loginId);
                            setUpdatedBy(loginId);
                            } else if(operation == DML_UPDATE) {
                            setUpdatedBy(loginId);
                        }
        super.doDML(operation, e);
    }
}

