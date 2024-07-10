package com.test1;

public class DesignCriteriaData {
	private String criteriaCode;
	private String criteriaName;
	private String localInfra;
	private String tradeInfra;
	private String shortDescription;
	private String multiCriteriaOption;
	private String criteriaParams;
	private Integer uploadVersion;
	private String launchInfra;
	private String manageInfra;
	private String status;

	public DesignCriteriaData() {

	}

	public DesignCriteriaData(String criteriaCode, String criteriaName, String localInfra, String tradeInfra,
			String shortDescription, String multiCriteriaOption, String criteriaParams, Integer uploadVersion,
			String launchInfra, String manageInfra, String status) {
		super();
		this.criteriaCode = criteriaCode;
		this.criteriaName = criteriaName;
		this.localInfra = localInfra;
		this.tradeInfra = tradeInfra;
		this.shortDescription = shortDescription;
		this.multiCriteriaOption = multiCriteriaOption;
		this.criteriaParams = criteriaParams;
		this.uploadVersion = uploadVersion;
		this.launchInfra = launchInfra;
		this.manageInfra = manageInfra;
		this.status = status;
	}

	public String getCriteriaCode() {
		return criteriaCode;
	}

	public void setCriteriaCode(String criteriaCode) {
		this.criteriaCode = criteriaCode;
	}

	public String getCriteriaName() {
		return criteriaName;
	}

	public void setCriteriaName(String criteriaName) {
		this.criteriaName = criteriaName;
	}

	public String getLocalInfra() {
		return localInfra;
	}

	public void setLocalInfra(String localInfra) {
		this.localInfra = localInfra;
	}

	public String getTradeInfra() {
		return tradeInfra;
	}

	public void setTradeInfra(String tradeInfra) {
		this.tradeInfra = tradeInfra;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getMultiCriteriaOption() {
		return multiCriteriaOption;
	}

	public void setMultiCriteriaOption(String multiCriteriaOption) {
		this.multiCriteriaOption = multiCriteriaOption;
	}

	public String getCriteriaParams() {
		return criteriaParams;
	}

	public void setCriteriaParams(String criteriaParams) {
		this.criteriaParams = criteriaParams;
	}

	public Integer getUploadVersion() {
		return uploadVersion;
	}

	public void setUploadVersion(Integer uploadVersion) {
		this.uploadVersion = uploadVersion;
	}

	public String getLaunchInfra() {
		return launchInfra;
	}

	public void setLaunchInfra(String launchInfra) {
		this.launchInfra = launchInfra;
	}

	public String getManageInfra() {
		return manageInfra;
	}

	public void setManageInfra(String manageInfra) {
		this.manageInfra = manageInfra;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
