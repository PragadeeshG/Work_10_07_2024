package com.test1;

public class CriteriaPricing {
	private Integer recordKey;
	private Integer pricingConsoleCode;
	private String pricingConsoleCodePosition;
	private String pricingConsoleCodeLength;
	private String consoleTools;
	private String cliTools;
	private boolean apiGatewayEnabled;
	private String totalLambdas;
	private String baseImage;
	private String memory;
	private String cpus;
	private String gpus;
	private String availabilityZones;
	private String multiRegionSupport;

	public CriteriaPricing() {

	}

	public CriteriaPricing(Integer recordKey, Integer pricingConsoleCode, String pricingConsoleCodePosition,
			String pricingConsoleCodeLength, String consoleTools, String cliTools, boolean apiGatewayEnabled,
			String totalLambdas, String baseImage, String memory, String cpus, String gpus, String availabilityZones,
			String multiRegionSupport) {
		super();
		this.recordKey = recordKey;
		this.pricingConsoleCode = pricingConsoleCode;
		this.pricingConsoleCodePosition = pricingConsoleCodePosition;
		this.pricingConsoleCodeLength = pricingConsoleCodeLength;
		this.consoleTools = consoleTools;
		this.cliTools = cliTools;
		this.apiGatewayEnabled = apiGatewayEnabled;
		this.totalLambdas = totalLambdas;
		this.baseImage = baseImage;
		this.memory = memory;
		this.cpus = cpus;
		this.gpus = gpus;
		this.availabilityZones = availabilityZones;
		this.multiRegionSupport = multiRegionSupport;
	}

	public Integer getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(Integer recordKey) {
		this.recordKey = recordKey;
	}

	public Integer getPricingConsoleCode() {
		return pricingConsoleCode;
	}

	public void setPricingConsoleCode(Integer pricingConsoleCode) {
		this.pricingConsoleCode = pricingConsoleCode;
	}

	public String getPricingConsoleCodePosition() {
		return pricingConsoleCodePosition;
	}

	public void setPricingConsoleCodePosition(String pricingConsoleCodePosition) {
		this.pricingConsoleCodePosition = pricingConsoleCodePosition;
	}

	public String getPricingConsoleCodeLength() {
		return pricingConsoleCodeLength;
	}

	public void setPricingConsoleCodeLength(String pricingConsoleCodeLength) {
		this.pricingConsoleCodeLength = pricingConsoleCodeLength;
	}

	public String getConsoleTools() {
		return consoleTools;
	}

	public void setConsoleTools(String consoleTools) {
		this.consoleTools = consoleTools;
	}

	public String getCliTools() {
		return cliTools;
	}

	public void setCliTools(String cliTools) {
		this.cliTools = cliTools;
	}

	public boolean isApiGatewayEnabled() {
		return apiGatewayEnabled;
	}

	public void setApiGatewayEnabled(boolean apiGatewayEnabled) {
		this.apiGatewayEnabled = apiGatewayEnabled;
	}

	public String getTotalLambdas() {
		return totalLambdas;
	}

	public void setTotalLambdas(String totalLambdas) {
		this.totalLambdas = totalLambdas;
	}

	public String getBaseImage() {
		return baseImage;
	}

	public void setBaseImage(String baseImage) {
		this.baseImage = baseImage;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getCpus() {
		return cpus;
	}

	public void setCpus(String cpus) {
		this.cpus = cpus;
	}

	public String getGpus() {
		return gpus;
	}

	public void setGpus(String gpus) {
		this.gpus = gpus;
	}

	public String getAvailabilityZones() {
		return availabilityZones;
	}

	public void setAvailabilityZones(String availabilityZones) {
		this.availabilityZones = availabilityZones;
	}

	public String getMultiRegionSupport() {
		return multiRegionSupport;
	}

	public void setMultiRegionSupport(String multiRegionSupport) {
		this.multiRegionSupport = multiRegionSupport;
	}

}
