package in.nit.model;

import java.util.List;
import java.util.Map;

public class Contract {
	private Integer cid;
	private String code;
	private Double nilAmt;
	private List<String> mstones;
	private Map<String,String> service;
	
	public Contract() {
		super();
	}
	public Contract(Integer cid, String code, Double nilAmt, List<String> mstones, Map<String, String> service) {
		super();
		this.cid = cid;
		this.code = code;
		this.nilAmt = nilAmt;
		this.mstones = mstones;
		this.service = service;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Double getNilAmt() {
		return nilAmt;
	}
	public void setNilAmt(Double nilAmt) {
		this.nilAmt = nilAmt;
	}
	public List<String> getMstones() {
		return mstones;
	}
	public void setMstones(List<String> mstones) {
		this.mstones = mstones;
	}
	public Map<String, String> getService() {
		return service;
	}
	public void setService(Map<String, String> service) {
		this.service = service;
	}
	@Override
	public String toString() {
		return "Contract [cid=" + cid + ", code=" + code + ", nilAmt=" + nilAmt + ", mstones=" + mstones + ", service="
				+ service + "]";
	}
	
}
