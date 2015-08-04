package org.hpccsystems.ws.client.platform;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUDataColumn;

// This class wraps the generated soap ECL Workunit, providing comparable and to-string methods for end-users.
public class DFUDataColumnInfo extends DFUDataColumn
{
    /**
     * 
     */
    private static final long       serialVersionUID = 1L;
    private List<DFUDataColumnInfo> childColumns     = null;

    /**
     * Create a Data Column Info object from a axis-generated soap class DFUDataColumn
     * 
     * @param base
     */
    public DFUDataColumnInfo(DFUDataColumn base)
    {
        copy(base);
    }

    public DFUDataColumnInfo()
    {
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\tColumnEclType:").append(this.getColumnEclType()).append("\n");
        sb.append("\tColumnID:").append(this.getColumnID()).append("\n");
        sb.append("\tColumnLabel:").append(this.getColumnLabel()).append("\n");
        sb.append("\tColumnRawSize:").append(this.getColumnRawSize()).append("\n");
        sb.append("\tColumnSize:").append(this.getColumnSize()).append("\n");
        sb.append("\tColumnType:").append(this.getColumnType()).append("\n");
        sb.append("\tColumnValue:").append(this.getColumnValue()).append("\n");
        sb.append("\tIsKeyedColumn:").append(this.getIsKeyedColumn()).append("\n");
        sb.append("\tIsNaturalColumn:").append(this.getIsNaturalColumn()).append("\n");
        sb.append("\tMaxSize:").append(this.getMaxSize()).append("\n");
        for (DFUDataColumnInfo col:this.getChildColumns()) {
            sb.append("\t").append(col.getColumnLabel()).append(":").append(col.toString());
        }
        return sb.toString();
    }

    /**
     * Copy a soap DFU Data Column object into the wrapper
     * 
     * @param base
     */
    private void copy(DFUDataColumn base)
    {
        if (base == null)
        {
            return;
        }
        this.setColumnEclType(base.getColumnEclType());
        this.setColumnID(base.getColumnID());
        this.setColumnLabel(base.getColumnLabel());
        this.setColumnRawSize(base.getColumnRawSize());
        this.setColumnSize(base.getColumnSize());
        this.setColumnType(base.getColumnType());
        this.setColumnValue(base.getColumnValue());
        this.setIsKeyedColumn(base.getIsKeyedColumn());
        this.setIsNaturalColumn(base.getIsNaturalColumn());
        this.setMaxSize(base.getMaxSize());
    }

    
    /**
     * @return list of child columns if this column is a dataset type column
     */
    public List<DFUDataColumnInfo> getChildColumns()
    {
        if (childColumns==null) {
            return new ArrayList<DFUDataColumnInfo>();
        }
        return childColumns;
    }

    /**
     * @param childColumns - List of DFUDataColumnInfo objects
     */
    public void setChildColumns(List<DFUDataColumnInfo> childColumns)
    {
        this.childColumns = childColumns;
    }
    
    /**
     * @param childColumns - Array of DFUDataColumn objects
     */
    public void setColumns(DFUDataColumn[] childColumns)
    {
        if (childColumns==null) 
        {
            this.childColumns=null;
            return;
        }
        this.childColumns=new ArrayList<DFUDataColumnInfo>();
        for (int i=0; i < childColumns.length;i++) 
        {
            this.childColumns.add(new DFUDataColumnInfo(childColumns[i]));
        }
    }



}