package org.hpccsystems.ws.client.platform;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUDataColumn;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUFileDetail;

// This class wraps the generated soap ECL Workunit, providing comparable and to-string methods for end-users.
public class DFUFileDetailInfo extends DFUFileDetail 
{
    public  static enum FileType{FLAT,CSV,XML,INDEX,UNKNOWN};
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private ArrayList<DFUDataColumnInfo> columns;
    private String firstline=null;
    private boolean hasheader=false;
    public boolean hasHeader()
    {
        return hasheader;
    }

    public void setHasHeader(boolean hasheader)
    {
        this.hasheader = hasheader;
    }

    /**
     * Create a Data Column Info object from a axis-generated soap class DFUDataColumn
     * 
     * @param base
     */
    public DFUFileDetailInfo(DFUFileDetail base)
    {
        copy(base);
    }

    public DFUFileDetailInfo() {}

       public String getFirstline()
    {
        return firstline;
    }

    public void setFirstline(String firstline)
    {
        this.firstline = firstline;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("ActualSize:").append(this.getActualSize()).append("\n");
        sb.append("BrowseData:").append(this.getBrowseData()).append("\n");
        sb.append("Cluster:").append(this.getCluster()).append("\n");
        sb.append("CompressedFileSize:").append(this.getCompressedFileSize()).append("\n");
        sb.append("ContentType:").append(this.getContentType()).append("\n");
        sb.append("CsvEscape:").append(this.getCsvEscape()).append("\n");
        sb.append("CsvQuote:").append(this.getCsvQuote()).append("\n");
        sb.append("CsvSeparate:").append(this.getCsvSeparate()).append("\n");
        sb.append("CsvTerminate:").append(this.getCsvTerminate()).append("\n");
        sb.append("Description:").append(this.getDescription()).append("\n");
        sb.append("DFUFileParts:").append(this.getDFUFileParts()).append("\n");
        sb.append("DFUFilePartsOnClusters:").append(this.getDFUFilePartsOnClusters()).append("\n");
        sb.append("Dir:").append(this.getDir()).append("\n");
        sb.append("Ecl:").append(this.getEcl()).append("\n");
        sb.append("Filename:").append(this.getFilename()).append("\n");
        sb.append("Filesize:").append(this.getFilesize()).append("\n");
        sb.append("Format:").append(this.getFormat()).append("\n");
        sb.append("FromRoxieCluster:").append(this.getFromRoxieCluster()).append("\n");
        sb.append("Graphs:").append(this.getGraphs()).append("\n");
        sb.append("IsCompressed:").append(this.getIsCompressed()).append("\n");
        sb.append("IsSuperfile:").append(this.getIsSuperfile()).append("\n");
        sb.append("JobName:").append(this.getJobName()).append("\n");
        sb.append("MaxRecordSize:").append(this.getMaxRecordSize()).append("\n");
        sb.append("Modified:").append(this.getModified()).append("\n");
        sb.append("Name:").append(this.getName()).append("\n");
        sb.append("NodeGroup:").append(this.getNodeGroup()).append("\n");
        sb.append("NumParts:").append(this.getNumParts()).append("\n");
        sb.append("Owner:").append(this.getOwner()).append("\n");
        sb.append("PathMask:").append(this.getPathMask()).append("\n");
        sb.append("Persistent:").append(this.getPersistent()).append("\n");
        sb.append("Prefix:").append(this.getPrefix()).append("\n");
        sb.append("RecordCount:").append(this.getRecordCount()).append("\n");
        sb.append("RecordSize:").append(this.getRecordSize()).append("\n");
        sb.append("ShowFileContent:").append(this.getShowFileContent()).append("\n");
        sb.append("Stat:").append(this.getStat()).append("\n");
        sb.append("Subfiles:").append(this.getSubfiles()).append("\n");
        sb.append("Superfiles:").append(this.getSuperfiles()).append("\n");
        sb.append("UserPermission:").append(this.getUserPermission()).append("\n");
        sb.append("Wuid:").append(this.getWuid()).append("\n");
        sb.append("ZipFile:").append(this.getZipFile()).append("\n");  
        return sb.toString();
    }

    /**
     * Copy a soap ecl workunit object into the wrapper
     * 
     * @param base
     */
    private void copy(DFUFileDetail base)
    {
        if (base == null)
        {
            return;
        }
        this.setActualSize(base.getActualSize());
        this.setBrowseData(base.getBrowseData());
        this.setCluster(base.getCluster());
        this.setCompressedFileSize(base.getCompressedFileSize());
        this.setContentType(base.getContentType());
        this.setCsvEscape(base.getCsvEscape());
        this.setCsvQuote(base.getCsvQuote());
        this.setCsvSeparate(base.getCsvSeparate());
        this.setCsvTerminate(base.getCsvTerminate());
        this.setDescription(base.getDescription());
        this.setDFUFileParts(base.getDFUFileParts());
        this.setDFUFilePartsOnClusters(base.getDFUFilePartsOnClusters());
        this.setDir(base.getDir());
        this.setEcl(base.getEcl());
        this.setFilename(base.getFilename());
        this.setFilesize(base.getFilesize());
        this.setFormat(base.getFormat());
        this.setFromRoxieCluster(base.getFromRoxieCluster());
        this.setGraphs(base.getGraphs());
        this.setIsCompressed(base.getIsCompressed());
        this.setIsSuperfile(base.getIsSuperfile());
        this.setJobName(base.getJobName());
        this.setMaxRecordSize(base.getMaxRecordSize());
        this.setModified(base.getModified());
        this.setName(base.getName());
        this.setNodeGroup(base.getNodeGroup());
        this.setNumParts(base.getNumParts());
        this.setOwner(base.getOwner());
        this.setPathMask(base.getPathMask());
        this.setPersistent(base.getPersistent());
        this.setPrefix(base.getPrefix());
        this.setRecordCount(base.getRecordCount());
        this.setRecordSize(base.getRecordSize());
        this.setShowFileContent(base.getShowFileContent());
        this.setStat(base.getStat());
        this.setSubfiles(base.getSubfiles());
        this.setSuperfiles(base.getSuperfiles());
        this.setUserPermission(base.getUserPermission());
        this.setWuid(base.getWuid());
        this.setZipFile(base.getZipFile());
     }

    public ArrayList<DFUDataColumnInfo> getColumns()
    {
        if (columns==null) {
            return new ArrayList<DFUDataColumnInfo>();
        }
        return columns;
    }

    public void setColumns(List<DFUDataColumn> childColumns)
    {
        if (childColumns==null) {
            columns=null;
            return;
        }
        columns=new ArrayList<DFUDataColumnInfo>();
        for (int i=0; i < childColumns.size();i++) {
            if (childColumns.get(i) instanceof DFUDataColumnInfo) {
                columns.add((DFUDataColumnInfo) childColumns.get(i));
            } else {
                columns.add(new DFUDataColumnInfo(childColumns.get(i)));
            }
        }

    }
    public void setColumns(DFUDataColumn[] childColumns)
    {
        if (childColumns==null) {
            columns=null;
            return;
        }
        columns=new ArrayList<DFUDataColumnInfo>();
        for (int i=0; i < childColumns.length;i++) {
            columns.add(new DFUDataColumnInfo(childColumns[i]));
        }
    }

    public FileType getFileType() {
    
        if (this.getName()==null) {
            return FileType.UNKNOWN;
        }
    
        // thor files store filetype in content type
        boolean hasxpath=hasEcl() && getEcl().toLowerCase().contains("xpath");
    
        if ("flat".equalsIgnoreCase(getContentType())) {
    
            // CSVs created by HPCC have file data; sprayed csvs return only
            // "line" from this call, and have their fields defined
            // in the record definition in the ecl attribute of dfu file info.
            if (!hasEcl() && this.isSprayedCsv())
            {
                return FileType.CSV;
            }
    
            return FileType.FLAT;
        }
        else if ("key".equalsIgnoreCase(getContentType())) {
            return FileType.INDEX;
        }
        else if (getContentType() == null || getContentType().equals(""))
        {
            if (getFormat() != null && getFormat().equalsIgnoreCase("csv")) {
                return FileType.CSV;
            }
            else if (getFormat() != null && getFormat().equalsIgnoreCase("xml")) {
                return FileType.XML;
            }
            // csvs loaded as ascii get a format of "csv", csvs loaded as
            // utf-8 get a format of "utf8"
            if (getFormat().toLowerCase().startsWith("utf"))
            {
                if (hasxpath) {
                    return FileType.XML;
                }
                else {
                    return FileType.CSV;
                }
            }
            else if ((getFormat() == null || getFormat().equals("")) && hasxpath)
            {
                // some HPCC-generated xml files use neither, check ecl
                // record for xpath
                    return FileType.XML;
            }
            else if (hasEcl())
            {
                return FileType.FLAT;
            }
            else
            {
                return FileType.UNKNOWN;
            }
        } else {
            return FileType.UNKNOWN;
        }
    }

    public boolean hasChildDatasets() {
        if (this.getColumns().size()==0) {
            return false;
        }
        for (DFUDataColumnInfo info:this.getColumns()) {
            if ("table".equalsIgnoreCase(info.getColumnEclType())) {
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<DFUDataColumnInfo> deduceFields() throws Exception {

            if (FileType.FLAT.equals(getFileType()) || FileType.INDEX.equals(getFileType()))
            {
                //until dfu metadata returns child dataset record structure, 
                //need to parse it from the ecl
                if (hasChildDatasets()) {
                    return DFUFileDetailInfo.GetRecordFromECL(getEcl());
                }
                //return the columns populated from DFUGetMetadata (or DFUGetDataColumns from servers that don't have the Metadata 
                //service yet
                return getColumns();                
            }
            else if (FileType.XML.equals(getFileType())) {
                if (hasEcl() && getColumns().size()==0)
                {
                    return GetRecordFromECL(getEcl());
                } 
                return getColumns();                
            }
            else if (FileType.CSV.equals(getFileType())) {                
                //for csvs generated by thor, return columns retrieved from getDFUMetadata if they exist
                if (getColumns().size()>0 && !isSprayedCsv()) {
                    return getColumns();   
                }
                //if there is no column information for a thor-generated csv, try to get the record from ecl
                else if (hasEcl() && !isSprayedCsv()) {
                    return DFUFileDetailInfo.GetRecordFromECL(getEcl());
                } 
                //for sprayed csvs or csvs with no ecl, try and figure this out from the first line of data
                else if (getFirstline() != null && !getFirstline().isEmpty()) {
                    ArrayList<DFUDataColumnInfo> fields=new ArrayList<DFUDataColumnInfo>();
                    String[] flds = getFirstline().split(this.getCsvSeparate());
                    for (int i = 0; i < flds.length; i++)
                    {
                        DFUDataColumn du = new DFUDataColumn();
                        if (hasHeader() && isFirstRowValidFieldNames()) {
                            String fldval=flds[i].trim();
                            if (this.getCsvQuote() != null && !this.getCsvQuote().isEmpty()
                                    && fldval.startsWith(this.getCsvQuote())
                                    && fldval.endsWith(this.getCsvQuote())) {
                                fldval=fldval.substring(1, fldval.length()-1);
                            }
                            du.setColumnLabel(fldval);
                        } else {
                            du.setColumnLabel("Field" + String.valueOf(i + 1));
                        }
                        du.setColumnType("STRING");                       
                        fields.add(new DFUDataColumnInfo(du));
                    }
                    return fields;
                }
                else {
                    return getColumns();                        
                }
            }
            return getColumns();                        
    }

    /**
     * @param eclRecordDefinition
     *            - a RECORD definition, either in RECORD\nSTRING1\nEND; format, or in {STRING1 field} inline format,.
     *            currently handles XPATH recordsets but doesn't save XPATH info. A few issues with child dataset
     *            records
     * @return An ArrayList of DFUDataColumns
     * @throws Exception
     */
    public static ArrayList<DFUDataColumnInfo> GetRecordFromECL(String eclRecordDefinition) throws Exception
    {
        String tempdef=null;
        ArrayList<DFUDataColumnInfo> cols = new ArrayList<DFUDataColumnInfo>();
        eclRecordDefinition = eclRecordDefinition.replaceAll("(;|,|RECORD|\\{|\\})", "\n");
        eclRecordDefinition = eclRecordDefinition.replaceAll("RECORD", "RECORD\n");
        eclRecordDefinition = eclRecordDefinition.replaceAll("\n\n", "\n");
        String[] lines = eclRecordDefinition.split("\n");
        for (int i = 0; i < lines.length; i++)
        {
            String thisline = lines[i].trim();
            if (thisline.equals(""))
            {
                continue;
            }
            if (thisline.matches("(RECORD|END|\\{|\\})"))
            {
                continue;
            }
            else if (thisline.endsWith(":=")) {
                tempdef=thisline.replace(":=", "");
                continue;
            }
            // TODO: handle xml field definitions
            if (thisline.toLowerCase().contains("xpath"))
            {
                continue;
            }
            String[] fieldargs = thisline.split(" ");
            if (fieldargs.length < 2)
            {
                throw new Exception("Invalid record field definition " + thisline);
            }
            if (!fieldargs[0].toUpperCase().matches(
                    "(STRING|INTEGER|QSTRING|UTF|UNSIGNED|INTEGER|UNICODE|DATA|VARSTRING|VARUNICODE|DECIMAL|UDECIMAL|SET OF|DATASET|TYPEOF|RECORDOF|ENUM|REAL|BOOLEAN).*"))
            {
                throw new Exception("Invalid record field type " + fieldargs[0]);
            }
            DFUDataColumnInfo col = new DFUDataColumnInfo();
            col.setColumnType(fieldargs[0].toUpperCase());
            col.setColumnEclType(fieldargs[0].toUpperCase());
            col.setColumnLabel(fieldargs[1]);
            cols.add(col);
        }
        return cols;
    }

    public boolean isSprayedCsv() {
       if ("line".equals(getColumns().get(0).getColumnLabel())
               && getColumns().size() != 2) {
           int i=0;
       }
        return  getColumns() != null
                && getColumns().size()==2
                && "line".equals(getColumns().get(0).getColumnLabel());
    }
    
    public boolean hasEcl() {
        return (getEcl() != null && !getEcl().isEmpty());
    }
    
    public boolean isFirstRowValidFieldNames() {
        if (!FileType.CSV.equals(getFileType())) {
            return false;
        }
        if (this.getFirstline()==null || this.getFirstline().isEmpty())
        {
            return false;
        }
        String[] flds = getFirstline().split(this.getCsvSeparate());
        if (!this.isSprayedCsv() && flds.length!=getColumns().size()) {
            return false;
        }
        for (int i = 0; i < flds.length; i++)
        {
            String fldval=flds[i].trim();
            if (this.getCsvQuote() != null && !this.getCsvQuote().isEmpty()
                    && fldval.startsWith(this.getCsvQuote())
                    && fldval.endsWith(this.getCsvQuote())) {
                fldval=fldval.substring(1, fldval.length()-1);
            }
            String fld=fldval.replaceAll("[^A-Za-z0-9_]", "");
            if (!fld.equals(fldval)) {
                return false;
            }
        }
        return true;
    }
    
}
