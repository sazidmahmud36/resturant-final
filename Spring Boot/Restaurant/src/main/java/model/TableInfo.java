package model;

public class TableInfo {
	
	int tableId;
	int tableNumber;
	int tableSit;
	String tablePosition;
	String tableService;	
	int fph;
	String status;
	
	public TableInfo() {
		super();
	}

	public TableInfo(int tableId, int tableNumber, int tableSit, String tablePosition, String tableService, int fph,
			String status) {
		super();
		this.tableId = tableId;
		this.tableNumber = tableNumber;
		this.tableSit = tableSit;
		this.tablePosition = tablePosition;
		this.tableService = tableService;
		this.fph = fph;
		this.status = status;
	}

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public int getTableSit() {
		return tableSit;
	}

	public void setTableSit(int tableSit) {
		this.tableSit = tableSit;
	}

	public String getTablePosition() {
		return tablePosition;
	}

	public void setTablePosition(String tablePosition) {
		this.tablePosition = tablePosition;
	}

	public String getTableService() {
		return tableService;
	}

	public void setTableService(String tableService) {
		this.tableService = tableService;
	}

	public int getFph() {
		return fph;
	}

	public void setFph(int fph) {
		this.fph = fph;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TableInfo [tableId=" + tableId + ", tableNumber=" + tableNumber + ", tableSit=" + tableSit
				+ ", tablePosition=" + tablePosition + ", tableService=" + tableService + ", fph=" + fph + ", status="
				+ status + ", getTableId()=" + getTableId() + ", getTableNumber()=" + getTableNumber()
				+ ", getTableSit()=" + getTableSit() + ", getTablePosition()=" + getTablePosition()
				+ ", getTableService()=" + getTableService() + ", getFph()=" + getFph() + ", getStatus()=" + getStatus()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	

	
	
	
}
