package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 07 12:47:08 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblItemL2Impl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ItemL2Id,
        ItemL1Id,
        Name,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        ItemL2Code,
        CompanyId,
        TblItemL1,
        TblItemL3;
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


    public static final int ITEML2ID = AttributesEnum.ItemL2Id.index();
    public static final int ITEML1ID = AttributesEnum.ItemL1Id.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int ITEML2CODE = AttributesEnum.ItemL2Code.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int TBLITEML1 = AttributesEnum.TblItemL1.index();
    public static final int TBLITEML3 = AttributesEnum.TblItemL3.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblItemL2Impl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblItemL2");
    }


    /**
     * Gets the attribute value for ItemL2Id, using the alias name ItemL2Id.
     * @return the value of ItemL2Id
     */
    public BigDecimal getItemL2Id() {
        return (BigDecimal) getAttributeInternal(ITEML2ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemL2Id.
     * @param value value to set the ItemL2Id
     */
    public void setItemL2Id(BigDecimal value) {
        setAttributeInternal(ITEML2ID, value);
    }

    /**
     * Gets the attribute value for ItemL1Id, using the alias name ItemL1Id.
     * @return the value of ItemL1Id
     */
    public BigDecimal getItemL1Id() {
        return (BigDecimal) getAttributeInternal(ITEML1ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemL1Id.
     * @param value value to set the ItemL1Id
     */
    public void setItemL1Id(BigDecimal value) {
        setAttributeInternal(ITEML1ID, value);
    }

    /**
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
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
     * Gets the attribute value for ItemL2Code, using the alias name ItemL2Code.
     * @return the value of ItemL2Code
     */
    public String getItemL2Code() {
        return (String) getAttributeInternal(ITEML2CODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemL2Code.
     * @param value value to set the ItemL2Code
     */
    public void setItemL2Code(String value) {
        setAttributeInternal(ITEML2CODE, value);
    }

    /**
     * Gets the attribute value for CompanyId, using the alias name CompanyId.
     * @return the value of CompanyId
     */
    public BigDecimal getCompanyId() {
        return (BigDecimal) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanyId.
     * @param value value to set the CompanyId
     */
    public void setCompanyId(BigDecimal value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * @return the associated entity TblItemL1Impl.
     */
    public TblItemL1Impl getTblItemL1() {
        return (TblItemL1Impl) getAttributeInternal(TBLITEML1);
    }

    /**
     * Sets <code>value</code> as the associated entity TblItemL1Impl.
     */
    public void setTblItemL1(TblItemL1Impl value) {
        setAttributeInternal(TBLITEML1, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblItemL3() {
        return (RowIterator) getAttributeInternal(TBLITEML3);
    }


    /**
     * @param itemL2Id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal itemL2Id) {
        return new Key(new Object[] { itemL2Id });
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

