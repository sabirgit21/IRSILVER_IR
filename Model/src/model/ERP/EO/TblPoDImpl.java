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
// ---    Sat Nov 07 13:04:46 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblPoDImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        PoMId,
        ItemL4Id,
        UomId,
        Description,
        DoQty,
        Qty,
        BalQty,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        Amount,
        Rate,
        TaxParc,
        TaxAmount,
        NetAmount,
        TaxId,
        TblPoM;
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
    public static final int POMID = AttributesEnum.PoMId.index();
    public static final int ITEML4ID = AttributesEnum.ItemL4Id.index();
    public static final int UOMID = AttributesEnum.UomId.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int DOQTY = AttributesEnum.DoQty.index();
    public static final int QTY = AttributesEnum.Qty.index();
    public static final int BALQTY = AttributesEnum.BalQty.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int RATE = AttributesEnum.Rate.index();
    public static final int TAXPARC = AttributesEnum.TaxParc.index();
    public static final int TAXAMOUNT = AttributesEnum.TaxAmount.index();
    public static final int NETAMOUNT = AttributesEnum.NetAmount.index();
    public static final int TAXID = AttributesEnum.TaxId.index();
    public static final int TBLPOM = AttributesEnum.TblPoM.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblPoDImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblPoD");
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
     * Gets the attribute value for ItemL4Id, using the alias name ItemL4Id.
     * @return the value of ItemL4Id
     */
    public BigDecimal getItemL4Id() {
        return (BigDecimal) getAttributeInternal(ITEML4ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemL4Id.
     * @param value value to set the ItemL4Id
     */
    public void setItemL4Id(BigDecimal value) {
        setAttributeInternal(ITEML4ID, value);
    }

    /**
     * Gets the attribute value for UomId, using the alias name UomId.
     * @return the value of UomId
     */
    public BigDecimal getUomId() {
        return (BigDecimal) getAttributeInternal(UOMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UomId.
     * @param value value to set the UomId
     */
    public void setUomId(BigDecimal value) {
        setAttributeInternal(UOMID, value);
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
     * Gets the attribute value for DoQty, using the alias name DoQty.
     * @return the value of DoQty
     */
    public BigDecimal getDoQty() {
        return (BigDecimal) getAttributeInternal(DOQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for DoQty.
     * @param value value to set the DoQty
     */
    public void setDoQty(BigDecimal value) {
        setAttributeInternal(DOQTY, value);
    }

    /**
     * Gets the attribute value for Qty, using the alias name Qty.
     * @return the value of Qty
     */
    public BigDecimal getQty() {
        return (BigDecimal) getAttributeInternal(QTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Qty.
     * @param value value to set the Qty
     */
    public void setQty(BigDecimal value) {
        setAttributeInternal(QTY, value);
    }

    /**
     * Gets the attribute value for BalQty, using the alias name BalQty.
     * @return the value of BalQty
     */
    public BigDecimal getBalQty() {
        return (BigDecimal) getAttributeInternal(BALQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BalQty.
     * @param value value to set the BalQty
     */
    public void setBalQty(BigDecimal value) {
        setAttributeInternal(BALQTY, value);
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
     * Gets the attribute value for Rate, using the alias name Rate.
     * @return the value of Rate
     */
    public BigDecimal getRate() {
        return (BigDecimal) getAttributeInternal(RATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rate.
     * @param value value to set the Rate
     */
    public void setRate(BigDecimal value) {
        setAttributeInternal(RATE, value);
    }

    /**
     * Gets the attribute value for TaxParc, using the alias name TaxParc.
     * @return the value of TaxParc
     */
    public BigDecimal getTaxParc() {
        return (BigDecimal) getAttributeInternal(TAXPARC);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxParc.
     * @param value value to set the TaxParc
     */
    public void setTaxParc(BigDecimal value) {
        setAttributeInternal(TAXPARC, value);
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
     * Gets the attribute value for TaxId, using the alias name TaxId.
     * @return the value of TaxId
     */
    public BigDecimal getTaxId() {
        return (BigDecimal) getAttributeInternal(TAXID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxId.
     * @param value value to set the TaxId
     */
    public void setTaxId(BigDecimal value) {
        setAttributeInternal(TAXID, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblPoMImpl getTblPoM() {
        return (TblPoMImpl) getAttributeInternal(TBLPOM);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblPoM(TblPoMImpl value) {
        setAttributeInternal(TBLPOM, value);
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

