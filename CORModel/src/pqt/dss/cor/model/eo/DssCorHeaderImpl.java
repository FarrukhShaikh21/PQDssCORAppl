package pqt.dss.cor.model.eo;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.SQLException;

import java.sql.Types;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 31 14:55:34 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DssCorHeaderImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CorHeaderIdPk,
        FromBranchCodeFk,
        ToBranchCodeFk,
        FromManagerNoFk,
        ToManagerNoFk,
        CorReason,
        UserIdFk,
        EnterDate,
        LastUpdatedBy,
        LastUpdatedDate,
        BranchStatus,
        DssStatus,
        BranchNotifIdFk,
        DssNotifIdFk,
        CorDocNumber,
        WorkflowNotificationId,
        WorkflowStatus,
        GisLocationIdFk,
        DssCorLine;
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


    public static final int CORHEADERIDPK = AttributesEnum.CorHeaderIdPk.index();
    public static final int FROMBRANCHCODEFK = AttributesEnum.FromBranchCodeFk.index();
    public static final int TOBRANCHCODEFK = AttributesEnum.ToBranchCodeFk.index();
    public static final int FROMMANAGERNOFK = AttributesEnum.FromManagerNoFk.index();
    public static final int TOMANAGERNOFK = AttributesEnum.ToManagerNoFk.index();
    public static final int CORREASON = AttributesEnum.CorReason.index();
    public static final int USERIDFK = AttributesEnum.UserIdFk.index();
    public static final int ENTERDATE = AttributesEnum.EnterDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int BRANCHSTATUS = AttributesEnum.BranchStatus.index();
    public static final int DSSSTATUS = AttributesEnum.DssStatus.index();
    public static final int BRANCHNOTIFIDFK = AttributesEnum.BranchNotifIdFk.index();
    public static final int DSSNOTIFIDFK = AttributesEnum.DssNotifIdFk.index();
    public static final int CORDOCNUMBER = AttributesEnum.CorDocNumber.index();
    public static final int WORKFLOWNOTIFICATIONID = AttributesEnum.WorkflowNotificationId.index();
    public static final int WORKFLOWSTATUS = AttributesEnum.WorkflowStatus.index();
    public static final int GISLOCATIONIDFK = AttributesEnum.GisLocationIdFk.index();
    public static final int DSSCORLINE = AttributesEnum.DssCorLine.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DssCorHeaderImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("pqt.dss.cor.model.eo.DssCorHeader");
    }


    /**
     * Gets the attribute value for CorHeaderIdPk, using the alias name CorHeaderIdPk.
     * @return the value of CorHeaderIdPk
     */
    public Number getCorHeaderIdPk() {
        return (Number) getAttributeInternal(CORHEADERIDPK);
    }

    /**
     * Sets <code>value</code> as the attribute value for CorHeaderIdPk.
     * @param value value to set the CorHeaderIdPk
     */
    public void setCorHeaderIdPk(Number value) {
        setAttributeInternal(CORHEADERIDPK, value);
    }

    /**
     * Gets the attribute value for FromBranchCodeFk, using the alias name FromBranchCodeFk.
     * @return the value of FromBranchCodeFk
     */
    public String getFromBranchCodeFk() {
        return (String) getAttributeInternal(FROMBRANCHCODEFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromBranchCodeFk.
     * @param value value to set the FromBranchCodeFk
     */
    public void setFromBranchCodeFk(String value) {
        setAttributeInternal(FROMBRANCHCODEFK, value);
    }

    /**
     * Gets the attribute value for ToBranchCodeFk, using the alias name ToBranchCodeFk.
     * @return the value of ToBranchCodeFk
     */
    public String getToBranchCodeFk() {
        return (String) getAttributeInternal(TOBRANCHCODEFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToBranchCodeFk.
     * @param value value to set the ToBranchCodeFk
     */
    public void setToBranchCodeFk(String value) {
        setAttributeInternal(TOBRANCHCODEFK, value);
    }

    /**
     * Gets the attribute value for FromManagerNoFk, using the alias name FromManagerNoFk.
     * @return the value of FromManagerNoFk
     */
    public Number getFromManagerNoFk() {
        return (Number) getAttributeInternal(FROMMANAGERNOFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromManagerNoFk.
     * @param value value to set the FromManagerNoFk
     */
    public void setFromManagerNoFk(Number value) {
        setAttributeInternal(FROMMANAGERNOFK, value);
    }

    /**
     * Gets the attribute value for ToManagerNoFk, using the alias name ToManagerNoFk.
     * @return the value of ToManagerNoFk
     */
    public Number getToManagerNoFk() {
        return (Number) getAttributeInternal(TOMANAGERNOFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToManagerNoFk.
     * @param value value to set the ToManagerNoFk
     */
    public void setToManagerNoFk(Number value) {
        setAttributeInternal(TOMANAGERNOFK, value);
    }

    /**
     * Gets the attribute value for CorReason, using the alias name CorReason.
     * @return the value of CorReason
     */
    public String getCorReason() {
        return (String) getAttributeInternal(CORREASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for CorReason.
     * @param value value to set the CorReason
     */
    public void setCorReason(String value) {
        setAttributeInternal(CORREASON, value);
    }

    /**
     * Gets the attribute value for UserIdFk, using the alias name UserIdFk.
     * @return the value of UserIdFk
     */
    public Number getUserIdFk() {
        return (Number) getAttributeInternal(USERIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserIdFk.
     * @param value value to set the UserIdFk
     */
    public void setUserIdFk(Number value) {
        setAttributeInternal(USERIDFK, value);
    }

    /**
     * Gets the attribute value for EnterDate, using the alias name EnterDate.
     * @return the value of EnterDate
     */
    public Date getEnterDate() {
        return (Date) getAttributeInternal(ENTERDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EnterDate.
     * @param value value to set the EnterDate
     */
    public void setEnterDate(Date value) {
        setAttributeInternal(ENTERDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the value of LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for BranchStatus, using the alias name BranchStatus.
     * @return the value of BranchStatus
     */
    public String getBranchStatus() {
        return (String) getAttributeInternal(BRANCHSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchStatus.
     * @param value value to set the BranchStatus
     */
    public void setBranchStatus(String value) {
        setAttributeInternal(BRANCHSTATUS, value);
    }

    /**
     * Gets the attribute value for DssStatus, using the alias name DssStatus.
     * @return the value of DssStatus
     */
    public String getDssStatus() {
        return (String) getAttributeInternal(DSSSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for DssStatus.
     * @param value value to set the DssStatus
     */
    public void setDssStatus(String value) {
        setAttributeInternal(DSSSTATUS, value);
    }

    /**
     * Gets the attribute value for BranchNotifIdFk, using the alias name BranchNotifIdFk.
     * @return the value of BranchNotifIdFk
     */
    public Number getBranchNotifIdFk() {
        return (Number) getAttributeInternal(BRANCHNOTIFIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchNotifIdFk.
     * @param value value to set the BranchNotifIdFk
     */
    public void setBranchNotifIdFk(Number value) {
        setAttributeInternal(BRANCHNOTIFIDFK, value);
    }

    /**
     * Gets the attribute value for DssNotifIdFk, using the alias name DssNotifIdFk.
     * @return the value of DssNotifIdFk
     */
    public Number getDssNotifIdFk() {
        return (Number) getAttributeInternal(DSSNOTIFIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for DssNotifIdFk.
     * @param value value to set the DssNotifIdFk
     */
    public void setDssNotifIdFk(Number value) {
        setAttributeInternal(DSSNOTIFIDFK, value);
    }

    /**
     * Gets the attribute value for CorDocNumber, using the alias name CorDocNumber.
     * @return the value of CorDocNumber
     */
    public String getCorDocNumber() {
        return (String) getAttributeInternal(CORDOCNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for CorDocNumber.
     * @param value value to set the CorDocNumber
     */
    public void setCorDocNumber(String value) {
        setAttributeInternal(CORDOCNUMBER, value);
    }

    /**
     * Gets the attribute value for WorkflowNotificationId, using the alias name WorkflowNotificationId.
     * @return the value of WorkflowNotificationId
     */
    public Number getWorkflowNotificationId() {
        return (Number) getAttributeInternal(WORKFLOWNOTIFICATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for WorkflowNotificationId.
     * @param value value to set the WorkflowNotificationId
     */
    public void setWorkflowNotificationId(Number value) {
        setAttributeInternal(WORKFLOWNOTIFICATIONID, value);
    }

    /**
     * Gets the attribute value for WorkflowStatus, using the alias name WorkflowStatus.
     * @return the value of WorkflowStatus
     */
    public String getWorkflowStatus() {
        return (String) getAttributeInternal(WORKFLOWSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for WorkflowStatus.
     * @param value value to set the WorkflowStatus
     */
    public void setWorkflowStatus(String value) {
        setAttributeInternal(WORKFLOWSTATUS, value);
    }

    /**
     * Gets the attribute value for GisLocationIdFk, using the alias name GisLocationIdFk.
     * @return the value of GisLocationIdFk
     */
    public Number getGisLocationIdFk() {
        return (Number) getAttributeInternal(GISLOCATIONIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for GisLocationIdFk.
     * @param value value to set the GisLocationIdFk
     */
    public void setGisLocationIdFk(Number value) {
        setAttributeInternal(GISLOCATIONIDFK, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDssCorLine() {
        return (RowIterator) getAttributeInternal(DSSCORLINE);
    }


    /**
     * @param corHeaderIdPk key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number corHeaderIdPk) {
        return new Key(new Object[] { corHeaderIdPk });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
     protected void create(AttributeList attributeList) {
         super.create(attributeList);
         Date currentDate = new Date();
         setEnterDate((Date) currentDate.getCurrentDate());
         setLastUpdatedDate((Date) currentDate.getCurrentDate());
         SequenceImpl seq = new SequenceImpl("DSS_COR_HEADER_SEQ", getDBTransaction());
         setCorHeaderIdPk(seq.getSequenceNumber());
         
         setBranchStatus("INCOMPLETE");
         setDssStatus("INCOMPLETE");

         ViewObject vo=getDBTransaction().getRootApplicationModule().findViewObject("CorHeadUserLocVO");
         if (vo!=null)
           {
                   vo.remove();
           }

         
         FacesContext fctx = FacesContext.getCurrentInstance();
         ExternalContext ectx = fctx.getExternalContext();
         HttpSession userSession = (HttpSession) ectx.getSession(false);
         try {
            
             
             setUserIdFk(new Number(userSession.getAttribute("pUserId")));
             setLastUpdatedBy(new Number(userSession.getAttribute("pUserId")));
             vo=getDBTransaction().getRootApplicationModule().createViewObjectFromQueryStmt("CorHeadUserLocVO", "select  GIS_LOCATION_ID_FK from DSS_SM_USERS WHERE USER_ID_PK="+getUserIdFk());
             vo.executeQuery();             
             setGisLocationIdFk(new Number( vo.first().getAttribute(0).toString() ) );
         } catch (SQLException ex) {
             setUserIdFk(new Number(0));
             setLastUpdatedBy(new Number(0));
         }
     }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
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
        if (operation == DML_INSERT) {
            DBTransaction txn = getDBTransaction();
            CallableStatement callableStatement =
                txn.createCallableStatement("begin ? := dss_all_pkg.GET_COR_NUMBER; end;", DBTransaction.DEFAULT);
            try {
                callableStatement.registerOutParameter(1, Types.VARCHAR);
                callableStatement.executeUpdate();
                String vCorNumber = callableStatement.getString(1);
                callableStatement.close();
                setCorDocNumber(vCorNumber);
            } catch (SQLException sqle) {
                try {
                    callableStatement.close();
                } catch (SQLException f) {
                }
            }
        }    
        Date currentDate = new Date();
        if (operation == DML_UPDATE) {
            setLastUpdatedDate((Date) currentDate.getCurrentDate());
            FacesContext fctx = FacesContext.getCurrentInstance();
            ExternalContext ectx = fctx.getExternalContext();
            HttpSession userSession = (HttpSession) ectx.getSession(false);
            try {
                setUserIdFk(new Number(userSession.getAttribute("pUserId")));
                setLastUpdatedBy(new Number(userSession.getAttribute("pUserId")));
            } catch (SQLException ex) {
                setUserIdFk(new Number(54));
                setLastUpdatedBy(new Number(0));
            }
        }
        super.doDML(operation, e);
    }
}

