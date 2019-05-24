/**
 * @author Arcry
 * @date 2019年4月25日
 * @time 下午10:10:07
 */
package com.dada.common.pojo;

import java.util.List;

public class EUDataGridResult {

	private long total;
	private List<?> rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
